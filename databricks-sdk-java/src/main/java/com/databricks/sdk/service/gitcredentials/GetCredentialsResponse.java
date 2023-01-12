// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.gitcredentials;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GetCredentialsResponse {
    /**
     
     */
    @JsonProperty("credentials")
    private java.util.List<CredentialInfo> credentials;
    
    public GetCredentialsResponse setCredentials(java.util.List<CredentialInfo> credentials) {
        this.credentials = credentials;
        return this;
    }

    public java.util.List<CredentialInfo> getCredentials() {
        return credentials;
    }
    
}
