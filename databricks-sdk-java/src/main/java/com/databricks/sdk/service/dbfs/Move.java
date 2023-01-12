// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class Move {
    /**
     * The destination path of the file or directory. The path should be the
     * absolute DBFS path.
     */
    @JsonProperty("destination_path")
    private String destinationPath;
    
    /**
     * The source path of the file or directory. The path should be the absolute
     * DBFS path.
     */
    @JsonProperty("source_path")
    private String sourcePath;
    
    public Move setDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
        return this;
    }

    public String getDestinationPath() {
        return destinationPath;
    }
    
    public Move setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }

    public String getSourcePath() {
        return sourcePath;
    }
    
}
