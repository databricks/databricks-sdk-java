// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;

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
 */
@Generated
public interface ReposService {
  /**
   * Create a repo.
   *
   * <p>Creates a repo in the workspace and links it to the remote Git repo specified. Note that
   * repos created programmatically must be linked to a remote Git repo, unlike repos created in the
   * browser.
   */
  RepoInfo create(CreateRepo createRepo);

  /**
   * Delete a repo.
   *
   * <p>Deletes the specified repo.
   */
  void delete(DeleteRepoRequest deleteRepoRequest);

  /**
   * Get a repo.
   *
   * <p>Returns the repo with the given repo ID.
   */
  RepoInfo get(GetRepoRequest getRepoRequest);

  /**
   * Get repo permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  GetRepoPermissionLevelsResponse getRepoPermissionLevels(
      GetRepoPermissionLevelsRequest getRepoPermissionLevelsRequest);

  /**
   * Get repo permissions.
   *
   * <p>Gets the permissions of a repo. Repos can inherit permissions from their root object.
   */
  RepoPermissions getRepoPermissions(GetRepoPermissionsRequest getRepoPermissionsRequest);

  /**
   * Get repos.
   *
   * <p>Returns repos that the calling user has Manage permissions on. Results are paginated with
   * each page containing twenty repos.
   */
  ListReposResponse list(ListReposRequest listReposRequest);

  /**
   * Set repo permissions.
   *
   * <p>Sets permissions on a repo. Repos can inherit permissions from their root object.
   */
  RepoPermissions setRepoPermissions(RepoPermissionsRequest repoPermissionsRequest);

  /**
   * Update a repo.
   *
   * <p>Updates the repo to a different branch or tag, or updates the repo to the latest commit on
   * the same branch.
   */
  void update(UpdateRepo updateRepo);

  /**
   * Update repo permissions.
   *
   * <p>Updates the permissions on a repo. Repos can inherit permissions from their root object.
   */
  RepoPermissions updateRepoPermissions(RepoPermissionsRequest repoPermissionsRequest);
}
