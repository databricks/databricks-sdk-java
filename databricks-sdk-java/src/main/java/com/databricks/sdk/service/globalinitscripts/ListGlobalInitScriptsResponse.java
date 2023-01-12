// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.globalinitscripts;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListGlobalInitScriptsResponse {
    /**
     
     */
    @JsonProperty("scripts")
    private java.util.List<GlobalInitScriptDetails> scripts;
    
    public ListGlobalInitScriptsResponse setScripts(java.util.List<GlobalInitScriptDetails> scripts) {
        this.scripts = scripts;
        return this;
    }

    public java.util.List<GlobalInitScriptDetails> getScripts() {
        return scripts;
    }
    
}
