// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateCredentialRequest {
    /**
     
     */
    @JsonProperty("aws_credentials")
    private AwsCredentials awsCredentials;
    
    /**
     * The human-readable name of the credential configuration object.
     */
    @JsonProperty("credentials_name")
    private String credentialsName;
    
    public CreateCredentialRequest setAwsCredentials(AwsCredentials awsCredentials) {
        this.awsCredentials = awsCredentials;
        return this;
    }

    public AwsCredentials getAwsCredentials() {
        return awsCredentials;
    }
    
    public CreateCredentialRequest setCredentialsName(String credentialsName) {
        this.credentialsName = credentialsName;
        return this;
    }

    public String getCredentialsName() {
        return credentialsName;
    }
    
}
