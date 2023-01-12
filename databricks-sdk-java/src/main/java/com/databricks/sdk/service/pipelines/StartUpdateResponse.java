// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class StartUpdateResponse {
    /**
     
     */
    @JsonProperty("update_id")
    private String updateId;
    
    public StartUpdateResponse setUpdateId(String updateId) {
        this.updateId = updateId;
        return this;
    }

    public String getUpdateId() {
        return updateId;
    }
    
}
