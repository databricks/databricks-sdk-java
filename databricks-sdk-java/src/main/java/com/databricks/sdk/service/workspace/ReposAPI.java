// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 */
@Generated
public class ReposAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ReposAPI.class);

  private final ReposService impl;

  /** Regular-use constructor */
  public ReposAPI(ApiClient apiClient) {
    impl = new ReposImpl(apiClient);
  }

  /** Constructor for mocks */
  public ReposAPI(ReposService mock) {
    impl = mock;
  }

  public RepoInfo create(String url, String provider) {
    return create(new CreateRepo().setUrl(url).setProvider(provider));
  }

  /**
   * Create a repo.
   *
   * <p>Creates a repo in the workspace and links it to the remote Git repo specified. Note that
   * repos created programmatically must be linked to a remote Git repo, unlike repos created in the
   * browser.
   */
  public RepoInfo create(CreateRepo request) {
    return impl.create(request);
  }

  public void delete(long repoId) {
    delete(new DeleteRepoRequest().setRepoId(repoId));
  }

  /**
   * Delete a repo.
   *
   * <p>Deletes the specified repo.
   */
  public void delete(DeleteRepoRequest request) {
    impl.delete(request);
  }

  public RepoInfo get(long repoId) {
    return get(new GetRepoRequest().setRepoId(repoId));
  }

  /**
   * Get a repo.
   *
   * <p>Returns the repo with the given repo ID.
   */
  public RepoInfo get(GetRepoRequest request) {
    return impl.get(request);
  }

  public GetRepoPermissionLevelsResponse getPermissionLevels(String repoId) {
    return getPermissionLevels(new GetRepoPermissionLevelsRequest().setRepoId(repoId));
  }

  /**
   * Get repo permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  public GetRepoPermissionLevelsResponse getPermissionLevels(
      GetRepoPermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }

  public RepoPermissions getPermissions(String repoId) {
    return getPermissions(new GetRepoPermissionsRequest().setRepoId(repoId));
  }

  /**
   * Get repo permissions.
   *
   * <p>Gets the permissions of a repo. Repos can inherit permissions from their root object.
   */
  public RepoPermissions getPermissions(GetRepoPermissionsRequest request) {
    return impl.getPermissions(request);
  }

  /**
   * Get repos.
   *
   * <p>Returns repos that the calling user has Manage permissions on. Results are paginated with
   * each page containing twenty repos.
   */
  public Iterable<RepoInfo> list(ListReposRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListReposResponse::getRepos,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setNextPageToken(token);
        });
  }

  public RepoPermissions setPermissions(String repoId) {
    return setPermissions(new RepoPermissionsRequest().setRepoId(repoId));
  }

  /**
   * Set repo permissions.
   *
   * <p>Sets permissions on a repo. Repos can inherit permissions from their root object.
   */
  public RepoPermissions setPermissions(RepoPermissionsRequest request) {
    return impl.setPermissions(request);
  }

  public void update(long repoId) {
    update(new UpdateRepo().setRepoId(repoId));
  }

  /**
   * Update a repo.
   *
   * <p>Updates the repo to a different branch or tag, or updates the repo to the latest commit on
   * the same branch.
   */
  public void update(UpdateRepo request) {
    impl.update(request);
  }

  public RepoPermissions updatePermissions(String repoId) {
    return updatePermissions(new RepoPermissionsRequest().setRepoId(repoId));
  }

  /**
   * Update repo permissions.
   *
   * <p>Updates the permissions on a repo. Repos can inherit permissions from their root object.
   */
  public RepoPermissions updatePermissions(RepoPermissionsRequest request) {
    return impl.updatePermissions(request);
  }

  public ReposService impl() {
    return impl;
  }
}
