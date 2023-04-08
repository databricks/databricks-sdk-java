// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.gitcredentials;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateCredentialsResponse {
    /**
     * ID of the credential object in the workspace.
     */
    @JsonProperty("credential_id")
    private Long credentialId;
    
    /**
     * Git provider. This field is case-insensitive. The available Git providers
     * are gitHub, bitbucketCloud, gitLab, azureDevOpsServices,
     * gitHubEnterprise, bitbucketServer, gitLabEnterpriseEdition and
     * awsCodeCommit.
     */
    @JsonProperty("git_provider")
    private String gitProvider;
    
    /**
     * Git username.
     */
    @JsonProperty("git_username")
    private String gitUsername;
    
    public CreateCredentialsResponse setCredentialId(Long credentialId) {
        this.credentialId = credentialId;
        return this;
    }

    public Long getCredentialId() {
        return credentialId;
    }
    
    public CreateCredentialsResponse setGitProvider(String gitProvider) {
        this.gitProvider = gitProvider;
        return this;
    }

    public String getGitProvider() {
        return gitProvider;
    }
    
    public CreateCredentialsResponse setGitUsername(String gitUsername) {
        this.gitUsername = gitUsername;
        return this;
    }

    public String getGitUsername() {
        return gitUsername;
    }
    
}
