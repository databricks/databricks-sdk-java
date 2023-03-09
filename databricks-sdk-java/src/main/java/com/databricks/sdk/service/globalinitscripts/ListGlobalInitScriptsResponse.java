// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.globalinitscripts;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



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
