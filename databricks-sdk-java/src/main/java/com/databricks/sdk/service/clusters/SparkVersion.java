// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SparkVersion {
    /**
     * Spark version key, for example "2.1.x-scala2.11". This is the value which
     * should be provided as the "spark_version" when creating a new cluster.
     * Note that the exact Spark version may change over time for a "wildcard"
     * version (i.e., "2.1.x-scala2.11" is a "wildcard" version) with minor bug
     * fixes.
     */
    @JsonProperty("key")
    private String key;
    
    /**
     * A descriptive name for this Spark version, for example "Spark 2.1".
     */
    @JsonProperty("name")
    private String name;
    
    public SparkVersion setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return key;
    }
    
    public SparkVersion setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
