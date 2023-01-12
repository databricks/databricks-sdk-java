// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class FileInfo {
    /**
     * The length of the file in bytes or zero if the path is a directory.
     */
    @JsonProperty("file_size")
    private Long fileSize;
    
    /**
     * True if the path is a directory.
     */
    @JsonProperty("is_dir")
    private Boolean isDir;
    
    /**
     * Last modification time of given file/dir in milliseconds since Epoch.
     */
    @JsonProperty("modification_time")
    private Long modificationTime;
    
    /**
     * The path of the file or directory.
     */
    @JsonProperty("path")
    private String path;
    
    public FileInfo setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    public Long getFileSize() {
        return fileSize;
    }
    
    public FileInfo setIsDir(Boolean isDir) {
        this.isDir = isDir;
        return this;
    }

    public Boolean getIsDir() {
        return isDir;
    }
    
    public FileInfo setModificationTime(Long modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }

    public Long getModificationTime() {
        return modificationTime;
    }
    
    public FileInfo setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return path;
    }
    
}
