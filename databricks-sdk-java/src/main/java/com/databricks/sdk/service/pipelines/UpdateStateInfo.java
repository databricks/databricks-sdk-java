// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateStateInfo {
    /**
     
     */
    @JsonProperty("creation_time")
    private String creationTime;
    
    /**
     
     */
    @JsonProperty("state")
    private UpdateStateInfoState state;
    
    /**
     
     */
    @JsonProperty("update_id")
    private String updateId;
    
    public UpdateStateInfo setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public String getCreationTime() {
        return creationTime;
    }
    
    public UpdateStateInfo setState(UpdateStateInfoState state) {
        this.state = state;
        return this;
    }

    public UpdateStateInfoState getState() {
        return state;
    }
    
    public UpdateStateInfo setUpdateId(String updateId) {
        this.updateId = updateId;
        return this;
    }

    public String getUpdateId() {
        return updateId;
    }
    
}
