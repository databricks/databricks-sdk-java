// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.repos;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

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
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface ReposService {
	/**
     * Create a repo.
     * 
     * Creates a repo in the workspace and links it to the remote Git repo
     * specified. Note that repos created programmatically must be linked to a
     * remote Git repo, unlike repos created in the browser.
     */
    RepoInfo create(CreateRepo createRepo);
    
	/**
     * Delete a repo.
     * 
     * Deletes the specified repo.
     */
    void delete(Delete delete);
    
	/**
     * Get a repo.
     * 
     * Returns the repo with the given repo ID.
     */
    RepoInfo get(Get get);
    
	/**
     * Get repos.
     * 
     * Returns repos that the calling user has Manage permissions on. Results
     * are paginated with each page containing twenty repos.
     */
    ListReposResponse list(List list);
    
	/**
     * Update a repo.
     * 
     * Updates the repo to a different branch or tag, or updates the repo to the
     * latest commit on the same branch.
     */
    void update(UpdateRepo updateRepo);
    
}