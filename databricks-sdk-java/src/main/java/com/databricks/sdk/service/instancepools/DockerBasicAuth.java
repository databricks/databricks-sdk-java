// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class DockerBasicAuth {
    /**
     
     */
    @JsonProperty("password")
    private String password;
    
    /**
     
     */
    @JsonProperty("username")
    private String username;
    
    public DockerBasicAuth setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return password;
    }
    
    public DockerBasicAuth setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getUsername() {
        return username;
    }
    
}
