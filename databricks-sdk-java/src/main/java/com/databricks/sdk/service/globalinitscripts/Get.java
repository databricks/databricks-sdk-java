// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.globalinitscripts;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get an init script
 */
@Generated("databricks-sdk-generator")
public class Get {
    /**
     * The ID of the global init script.
     */
    
    private String scriptId;
    
    public Get setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    public String getScriptId() {
        return scriptId;
    }
    
}
