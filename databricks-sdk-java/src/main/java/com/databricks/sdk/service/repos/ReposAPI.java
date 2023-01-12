// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.repos;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * The Repos API allows users to manage their git repos. Users can use the API
 * to access all repos that they have manage permissions on.
 * 
 * Databricks Repos is a visual Git client in Databricks. It supports common Git
 * operations such a cloning a repository, committing and pushing, pulling,
 * branch management, and visual comparison of diffs when committing.
 * 
 * Within Repos you can develop code in notebooks or other files and follow data
 * science and engineering code development best practices using Git for version
 * control, collaboration, and CI/CD.
 */
@Generated("databricks-sdk-generator")
public class ReposAPI implements ReposService {
    private final ApiClient apiClient;

    public ReposAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a repo.
     * 
     * Creates a repo in the workspace and links it to the remote Git repo
     * specified. Note that repos created programmatically must be linked to a
     * remote Git repo, unlike repos created in the browser.
     */
    @Override
    public RepoInfo create(CreateRepo request) {
        String path = "/api/2.0/repos";
        return apiClient.POST(path, request, RepoInfo.class);
    }
    
	/**
     * Delete a repo.
     * 
     * Deletes the specified repo.
     */
    @Override
    public void delete(Delete request) {
        String path = String.format("/api/2.0/repos/%s", request.getRepoId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a repo.
     * 
     * Returns the repo with the given repo ID.
     */
    @Override
    public RepoInfo get(Get request) {
        String path = String.format("/api/2.0/repos/%s", request.getRepoId());
        return apiClient.GET(path, request, RepoInfo.class);
    }
    
	/**
     * Get repos.
     * 
     * Returns repos that the calling user has Manage permissions on. Results
     * are paginated with each page containing twenty repos.
     */
    @Override
    public ListReposResponse list(List request) {
        String path = "/api/2.0/repos";
        return apiClient.GET(path, request, ListReposResponse.class);
    }
    
	/**
     * Update a repo.
     * 
     * Updates the repo to a different branch or tag, or updates the repo to the
     * latest commit on the same branch.
     */
    @Override
    public void update(UpdateRepo request) {
        String path = String.format("/api/2.0/repos/%s", request.getRepoId());
        apiClient.PATCH(path, request, Void.class);
    }
    
}