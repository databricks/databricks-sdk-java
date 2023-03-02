// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List shares by Provider
 */
@Generated("databricks-sdk-generator")
public class ListSharesRequest {
    /**
     * Name of the provider in which to list shares.
     */
    
    private String name;
    
    public ListSharesRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
