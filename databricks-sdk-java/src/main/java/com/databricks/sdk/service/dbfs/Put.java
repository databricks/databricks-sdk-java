// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Put {
    /**
     * This parameter might be absent, and instead a posted file will be used.
     */
    @JsonProperty("contents")
    private String contents;
    
    /**
     * The flag that specifies whether to overwrite existing file/files.
     */
    @JsonProperty("overwrite")
    private Boolean overwrite;
    
    /**
     * The path of the new file. The path should be the absolute DBFS path.
     */
    @JsonProperty("path")
    private String path;
    
    public Put setContents(String contents) {
        this.contents = contents;
        return this;
    }

    public String getContents() {
        return contents;
    }
    
    public Put setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    public Boolean getOverwrite() {
        return overwrite;
    }
    
    public Put setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return path;
    }
    
}
