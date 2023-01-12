// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GetUpdateResponse {
    /**
     * The current update info.
     */
    @JsonProperty("update")
    private UpdateInfo update;
    
    public GetUpdateResponse setUpdate(UpdateInfo update) {
        this.update = update;
        return this;
    }

    public UpdateInfo getUpdate() {
        return update;
    }
    
}
