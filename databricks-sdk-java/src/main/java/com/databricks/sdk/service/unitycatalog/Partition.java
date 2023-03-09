// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Partition {
    /**
     * An array of partition values.
     */
    @JsonProperty("values")
    private java.util.List<PartitionValue> values;
    
    public Partition setValues(java.util.List<PartitionValue> values) {
        this.values = values;
        return this;
    }

    public java.util.List<PartitionValue> getValues() {
        return values;
    }
    
}
