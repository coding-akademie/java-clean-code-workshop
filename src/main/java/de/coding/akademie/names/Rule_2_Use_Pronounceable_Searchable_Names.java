package de.coding.akademie.names;

import java.util.Date;

public class Rule_2_Use_Pronounceable_Searchable_Names {

    // Bad
    private Date genymdhms;
    private Date modymdhms;
    private final String rid = "105";

    // Clean
    private Date generationTimestamp;
    private Date modificationTimestamp;
    private final String recordId = "105";



}
