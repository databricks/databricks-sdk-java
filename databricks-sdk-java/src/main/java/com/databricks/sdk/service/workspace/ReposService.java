// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

/**
 * The Repos API allows users to manage their git repos. Users can use the API to access all repos
 * that they have manage permissions on.
 *
 * <p>Databricks Repos is a visual Git client in Databricks. It supports common Git operations such
 * a cloning a repository, committing and pushing, pulling, branch management, and visual comparison
 * of diffs when committing.
 *
 * <p>Within Repos you can develop code in notebooks or other files and follow data science and
 * engineering code development best practices using Git for version control, collaboration, and
 * CI/CD.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface ReposService {
  /**
   * Create a repo.
   *
   * <p>Creates a repo in the workspace and links it to the remote Git repo specified. Note that
   * repos created programmatically must be linked to a remote Git repo, unlike repos created in the
   * browser.
   *
   * @param createRepo a {@link com.databricks.sdk.service.workspace.CreateRepo} object
   * @return a {@link com.databricks.sdk.service.workspace.RepoInfo} object
   */
  RepoInfo create(CreateRepo createRepo);

  /**
   * Delete a repo.
   *
   * <p>Deletes the specified repo.
   *
   * @param deleteRepoRequest a {@link com.databricks.sdk.service.workspace.DeleteRepoRequest} object
   */
  void delete(DeleteRepoRequest deleteRepoRequest);

  /**
   * Get a repo.
   *
   * <p>Returns the repo with the given repo ID.
   *
   * @param getRepoRequest a {@link com.databricks.sdk.service.workspace.GetRepoRequest} object
   * @return a {@link com.databricks.sdk.service.workspace.RepoInfo} object
   */
  RepoInfo get(GetRepoRequest getRepoRequest);

  /**
   * Get repos.
   *
   * <p>Returns repos that the calling user has Manage permissions on. Results are paginated with
   * each page containing twenty repos.
   *
   * @param listReposRequest a {@link com.databricks.sdk.service.workspace.ListReposRequest} object
   * @return a {@link com.databricks.sdk.service.workspace.ListReposResponse} object
   */
  ListReposResponse list(ListReposRequest listReposRequest);

  /**
   * Update a repo.
   *
   * <p>Updates the repo to a different branch or tag, or updates the repo to the latest commit on
   * the same branch.
   *
   * @param updateRepo a {@link com.databricks.sdk.service.workspace.UpdateRepo} object
   */
  void update(UpdateRepo updateRepo);
}
