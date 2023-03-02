// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.commands;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class Results {
    /**
     * The cause of the error
     */
    @JsonProperty("cause")
    private String cause;
    
    /**
     
     */
    @JsonProperty("data")
    private Object /* MISSING TYPE */ data;
    
    /**
     * The image filename
     */
    @JsonProperty("fileName")
    private String fileName;
    
    /**
     
     */
    @JsonProperty("fileNames")
    private java.util.List<String> fileNames;
    
    /**
     * true if a JSON schema is returned instead of a string representation of
     * the Hive type.
     */
    @JsonProperty("isJsonSchema")
    private Boolean isJsonSchema;
    
    /**
     * internal field used by SDK
     */
    @JsonProperty("pos")
    private Long pos;
    
    /**
     
     */
    @JsonProperty("resultType")
    private ResultType resultType;
    
    /**
     * The table schema
     */
    @JsonProperty("schema")
    private java.util.List<Map<String,Object /* MISSING TYPE */>> schema;
    
    /**
     * The summary of the error
     */
    @JsonProperty("summary")
    private String summary;
    
    /**
     * true if partial results are returned.
     */
    @JsonProperty("truncated")
    private Boolean truncated;
    
    public Results setCause(String cause) {
        this.cause = cause;
        return this;
    }

    public String getCause() {
        return cause;
    }
    
    public Results setData(Object /* MISSING TYPE */ data) {
        this.data = data;
        return this;
    }

    public Object /* MISSING TYPE */ getData() {
        return data;
    }
    
    public Results setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getFileName() {
        return fileName;
    }
    
    public Results setFileNames(java.util.List<String> fileNames) {
        this.fileNames = fileNames;
        return this;
    }

    public java.util.List<String> getFileNames() {
        return fileNames;
    }
    
    public Results setIsJsonSchema(Boolean isJsonSchema) {
        this.isJsonSchema = isJsonSchema;
        return this;
    }

    public Boolean getIsJsonSchema() {
        return isJsonSchema;
    }
    
    public Results setPos(Long pos) {
        this.pos = pos;
        return this;
    }

    public Long getPos() {
        return pos;
    }
    
    public Results setResultType(ResultType resultType) {
        this.resultType = resultType;
        return this;
    }

    public ResultType getResultType() {
        return resultType;
    }
    
    public Results setSchema(java.util.List<Map<String,Object /* MISSING TYPE */>> schema) {
        this.schema = schema;
        return this;
    }

    public java.util.List<Map<String,Object /* MISSING TYPE */>> getSchema() {
        return schema;
    }
    
    public Results setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getSummary() {
        return summary;
    }
    
    public Results setTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    public Boolean getTruncated() {
        return truncated;
    }
    
}
