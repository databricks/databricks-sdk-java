// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class DockerImage {
    /**
     
     */
    @JsonProperty("basic_auth")
    private DockerBasicAuth basicAuth;
    
    /**
     * URL of the docker image.
     */
    @JsonProperty("url")
    private String url;
    
    public DockerImage setBasicAuth(DockerBasicAuth basicAuth) {
        this.basicAuth = basicAuth;
        return this;
    }

    public DockerBasicAuth getBasicAuth() {
        return basicAuth;
    }
    
    public DockerImage setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }
    
}
