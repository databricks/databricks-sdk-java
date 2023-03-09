// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class OdbcParams {
    /**
     
     */
    @JsonProperty("hostname")
    private String hostname;
    
    /**
     
     */
    @JsonProperty("path")
    private String path;
    
    /**
     
     */
    @JsonProperty("port")
    private Long port;
    
    /**
     
     */
    @JsonProperty("protocol")
    private String protocol;
    
    public OdbcParams setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public String getHostname() {
        return hostname;
    }
    
    public OdbcParams setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return path;
    }
    
    public OdbcParams setPort(Long port) {
        this.port = port;
        return this;
    }

    public Long getPort() {
        return port;
    }
    
    public OdbcParams setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }
    
}
