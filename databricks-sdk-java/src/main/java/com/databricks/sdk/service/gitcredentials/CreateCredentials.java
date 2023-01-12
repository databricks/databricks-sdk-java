// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.gitcredentials;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateCredentials {
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
    
    public CreateCredentials setGitProvider(String gitProvider) {
        this.gitProvider = gitProvider;
        return this;
    }

    public String getGitProvider() {
        return gitProvider;
    }
    
    public CreateCredentials setGitUsername(String gitUsername) {
        this.gitUsername = gitUsername;
        return this;
    }

    public String getGitUsername() {
        return gitUsername;
    }
    
    public CreateCredentials setPersonalAccessToken(String personalAccessToken) {
        this.personalAccessToken = personalAccessToken;
        return this;
    }

    public String getPersonalAccessToken() {
        return personalAccessToken;
    }
    
}
