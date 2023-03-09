// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ListStatusResponse {
    /**
     * A list of FileInfo's that describe contents of directory or file. See
     * example above.
     */
    @JsonProperty("files")
    private java.util.List<FileInfo> files;
    
    public ListStatusResponse setFiles(java.util.List<FileInfo> files) {
        this.files = files;
        return this;
    }

    public java.util.List<FileInfo> getFiles() {
        return files;
    }
    
}
