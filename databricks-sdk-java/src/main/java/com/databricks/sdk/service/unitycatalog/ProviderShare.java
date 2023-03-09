// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ProviderShare {
    /**
     * The name of the Provider Share.
     */
    @JsonProperty("name")
    private String name;
    
    public ProviderShare setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
