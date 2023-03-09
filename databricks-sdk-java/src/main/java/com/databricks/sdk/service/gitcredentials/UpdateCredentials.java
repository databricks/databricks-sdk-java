// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.gitcredentials;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class UpdateCredentials {
    /**
     * The ID for the corresponding credential to access.
     */
    
    private Long credentialId;
    
    /**
     * Git provider. This field is case-insensitive. The available Git providers
     * are awsCodeCommit, azureDevOpsServices,
     */
    @JsonProperty("git_provider")
    private String gitProvider;
    
    /**
     * Git username.
     */
    @JsonProperty("git_username")
    private String gitUsername;
    
    /**
     * The personal access token used to authenticate to the corresponding Git
     * provider.
     */
    @JsonProperty("personal_access_token")
    private String personalAccessToken;
    
    public UpdateCredentials setCredentialId(Long credentialId) {
        this.credentialId = credentialId;
        return this;
    }

    public Long getCredentialId() {
        return credentialId;
    }
    
    public UpdateCredentials setGitProvider(String gitProvider) {
        this.gitProvider = gitProvider;
        return this;
    }

    public String getGitProvider() {
        return gitProvider;
    }
    
    public UpdateCredentials setGitUsername(String gitUsername) {
        this.gitUsername = gitUsername;
        return this;
    }

    public String getGitUsername() {
        return gitUsername;
    }
    
    public UpdateCredentials setPersonalAccessToken(String personalAccessToken) {
        this.personalAccessToken = personalAccessToken;
        return this;
    }

    public String getPersonalAccessToken() {
        return personalAccessToken;
    }
    
}
