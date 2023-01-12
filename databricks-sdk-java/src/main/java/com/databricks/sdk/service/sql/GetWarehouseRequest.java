// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get warehouse info
 */
@Generated("databricks-sdk-generator")
public class GetWarehouseRequest {
    /**
     * Required. Id of the SQL warehouse.
     */
    
    private String id;
    
    public GetWarehouseRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
}
