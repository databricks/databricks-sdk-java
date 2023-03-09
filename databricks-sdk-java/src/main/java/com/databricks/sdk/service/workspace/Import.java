// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Import {
    /**
     * The base64-encoded content. This has a limit of 10 MB.
     * 
     * If the limit (10MB) is exceeded, exception with error code
     * **MAX_NOTEBOOK_SIZE_EXCEEDED** will be thrown. This parameter might be
     * absent, and instead a posted file will be used.
     */
    @JsonProperty("content")
    private String content;
    
    /**
     * This specifies the format of the file to be imported. By default, this is
     * `SOURCE`. However it may be one of: `SOURCE`, `HTML`, `JUPYTER`, `DBC`.
     * The value is case sensitive.
     */
    @JsonProperty("format")
    private ExportFormat format;
    
    /**
     * The language of the object. This value is set only if the object type is
     * `NOTEBOOK`.
     */
    @JsonProperty("language")
    private Language language;
    
    /**
     * The flag that specifies whether to overwrite existing object. It is
     * `false` by default. For `DBC` format, `overwrite` is not supported since
     * it may contain a directory.
     */
    @JsonProperty("overwrite")
    private Boolean overwrite;
    
    /**
     * The absolute path of the notebook or directory. Importing directory is
     * only support for `DBC` format.
     */
    @JsonProperty("path")
    private String path;
    
    public Import setContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return content;
    }
    
    public Import setFormat(ExportFormat format) {
        this.format = format;
        return this;
    }

    public ExportFormat getFormat() {
        return format;
    }
    
    public Import setLanguage(Language language) {
        this.language = language;
        return this;
    }

    public Language getLanguage() {
        return language;
    }
    
    public Import setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    public Boolean getOverwrite() {
        return overwrite;
    }
    
    public Import setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return path;
    }
    
}
