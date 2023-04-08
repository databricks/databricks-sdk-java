// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.repos;

import com.databricks.sdk.client.ApiClient;
import java.util.List;
import org.apache.http.client.methods.*;

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
public class ReposAPI {
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
   * Create a repo.
   *
   * <p>Creates a repo in the workspace and links it to the remote Git repo specified. Note that
   * repos created programmatically must be linked to a remote Git repo, unlike repos created in the
   * browser.
   */
  public RepoInfo create(CreateRepo request) {
    return impl.create(request);
  }

  /**
   * Delete a repo.
   *
   * <p>Deletes the specified repo.
   */
  public void delete(Delete request) {
    impl.delete(request);
  }

  /**
   * Get a repo.
   *
   * <p>Returns the repo with the given repo ID.
   */
  public RepoInfo get(Get request) {
    return impl.get(request);
  }

  /**
   * Get repos.
   *
   * <p>Returns repos that the calling user has Manage permissions on. Results are paginated with
   * each page containing twenty repos.
   */
  public ListReposResponse list(List request) {
    return impl.list(request);
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

  public ReposService impl() {
    return impl;
  }
}
