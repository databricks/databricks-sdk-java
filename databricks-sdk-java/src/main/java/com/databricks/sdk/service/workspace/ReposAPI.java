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

  /**
   * Creates a repo in the workspace and links it to the remote Git repo specified. Note that repos
   * created programmatically must be linked to a remote Git repo, unlike repos created in the
   * browser.
   */
  public CreateRepoResponse create(CreateRepoRequest request) {
    return impl.create(request);
  }

  public void delete(long repoId) {
    delete(new DeleteRepoRequest().setRepoId(repoId));
  }

  /** Deletes the specified repo. */
  public void delete(DeleteRepoRequest request) {
    impl.delete(request);
  }

  public GetRepoResponse get(long repoId) {
    return get(new GetRepoRequest().setRepoId(repoId));
  }

  /** Returns the repo with the given repo ID. */
  public GetRepoResponse get(GetRepoRequest request) {
    return impl.get(request);
  }

  public GetRepoPermissionLevelsResponse getPermissionLevels(String repoId) {
    return getPermissionLevels(new GetRepoPermissionLevelsRequest().setRepoId(repoId));
  }

  /** Gets the permission levels that a user can have on an object. */
  public GetRepoPermissionLevelsResponse getPermissionLevels(
      GetRepoPermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }

  public RepoPermissions getPermissions(String repoId) {
    return getPermissions(new GetRepoPermissionsRequest().setRepoId(repoId));
  }

  /** Gets the permissions of a repo. Repos can inherit permissions from their root object. */
  public RepoPermissions getPermissions(GetRepoPermissionsRequest request) {
    return impl.getPermissions(request);
  }

  /**
   * Returns repos that the calling user has Manage permissions on. Use `next_page_token` to iterate
   * through additional pages.
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

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  public RepoPermissions setPermissions(RepoPermissionsRequest request) {
    return impl.setPermissions(request);
  }

  /**
   * Updates the repo to a different branch or tag, or updates the repo to the latest commit on the
   * same branch.
   */
  public void update(UpdateRepoRequest request) {
    impl.update(request);
  }

  /** Updates the permissions on a repo. Repos can inherit permissions from their root object. */
  public RepoPermissions updatePermissions(RepoPermissionsRequest request) {
    return impl.updatePermissions(request);
  }

  public ReposService impl() {
    return impl;
  }
}
