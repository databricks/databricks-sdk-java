// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ReadResponse {
    /**
     * The number of bytes read (could be less than `length` if we hit end of
     * file). This refers to number of bytes read in unencoded version (response
     * data is base64-encoded).
     */
    @JsonProperty("bytes_read")
    private Long bytesRead;
    
    /**
     * The base64-encoded contents of the file read.
     */
    @JsonProperty("data")
    private String data;
    
    public ReadResponse setBytesRead(Long bytesRead) {
        this.bytesRead = bytesRead;
        return this;
    }

    public Long getBytesRead() {
        return bytesRead;
    }
    
    public ReadResponse setData(String data) {
        this.data = data;
        return this;
    }

    public String getData() {
        return data;
    }
    
}
