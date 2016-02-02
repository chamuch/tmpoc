package com.ericsson.tm.prodcat.ecm.entities.msdp;

import java.util.List;

public class ResourceFacingSpecifications {

    private String                     id                     = null; // M
    private String                     name                   = null; // M
    private String                     description            = null; // M
    private CharacteristicsType        characteristics        = null; // O
    private ResourceSpecificationsType resourceSpecifications = null; // O
    private List<ExtensionType>             extensions             = null; // O
    private List<CommentaryType>           commentaries           = null; // O

}
