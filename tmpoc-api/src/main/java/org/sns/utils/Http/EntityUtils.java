package org.sns.utils.Http;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.text.ParseException;

import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;

public class EntityUtils {


    /**
     * Get the entity content as a String, using the provided default character set
     * if none is found in the entity.
     * If defaultCharset is null, the default "ISO-8859-1" is used.
     *
     * @param entity must not be null
     * @param defaultCharset character set to be applied if none found in the entity
     * @return the entity content as a String. May be null if
     *   {@link HttpEntity#getContent()} is null.
     * @throws ParseException if header elements cannot be parsed
     * @throws IllegalArgumentException if entity is null or if content length &gt; Integer.MAX_VALUE
     * @throws IOException if an error occurs reading the input stream
     * @throws UnsupportedCharsetException Thrown when the named charset is not available in
     * this instance of the Java virtual machine
     */
    public static String toString(
            final HttpEntity entity, final String defaultCharset) throws IOException, ParseException {
        return toString(entity, defaultCharset != null ? Charset.forName(defaultCharset) : null);
    }  
    
    
    /**
     * Get the entity content as a String, using the provided default character set
     * if none is found in the entity.
     * If defaultCharset is null, the default "ISO-8859-1" is used.
     *
     * @param entity must not be null
     * @param defaultCharset character set to be applied if none found in the entity,
     * or if the entity provided charset is invalid or not available.
     * @return the entity content as a String. May be null if
     *   {@link HttpEntity#getContent()} is null.
     * @throws ParseException if header elements cannot be parsed
     * @throws IllegalArgumentException if entity is null or if content length &gt; Integer.MAX_VALUE
     * @throws IOException if an error occurs reading the input stream
     * @throws UnsupportedCharsetException Thrown when the named entity's charset is not available in
     * this instance of the Java virtual machine and no defaultCharset is provided.
     */
    public static String toString(
            final HttpEntity entity, final Charset defaultCharset) throws IOException, ParseException {
        
    	String responseBody = null;
    	InputStream instream =  null;
        
    	if (entity == null)
    		throw new ParseException("incoming entity was missing!!", 0);
    	
    	instream = entity.getContent();
        if (instream == null) {
            return null;
        }
        try {
            if (entity.getContentLength() > Integer.MAX_VALUE)
            	throw new ParseException("HTTP entity too large to be buffered in memory", Integer.MAX_VALUE);
            
            int i = (int)entity.getContentLength();
            if (i < 0) {
                i = 4096;
            }
            Charset charset = null;
            try {
                final ContentType contentType = ContentType.get(entity);
                if (contentType != null) {
                    charset = contentType.getCharset();
                }
            } catch (final UnsupportedCharsetException ex) {
                if (defaultCharset == null) {
                    throw new UnsupportedEncodingException(ex.getMessage());
                }
            }
            
            if (charset == null) {
                charset = Charset.forName("UTF-8");
            }
            
            final Reader reader = new InputStreamReader(instream, charset);
            final StringBuffer buffer = new StringBuffer(i);
            final char[] tmp = new char[1024];
            int len;
            do {
            	len = reader.read(tmp);
            	if (len == -1) 
            		break;
            	
            	buffer.append(tmp, 0, len);
            } while (len != -1);
            
            responseBody = buffer.toString();
            System.out.println("Http Response Body from the Socket: " + responseBody);
        } finally {
            instream.close();
        }

        return responseBody;
    }
    
}
