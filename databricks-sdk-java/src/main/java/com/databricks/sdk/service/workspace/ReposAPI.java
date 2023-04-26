// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.client.ApiClient;
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
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ReposAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ReposAPI.class);

  private final ReposService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public ReposAPI(ApiClient apiClient) {
    impl = new ReposImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.workspace.ReposService} object
   */
  public ReposAPI(ReposService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param url a {@link java.lang.String} object
   * @param provider a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.RepoInfo} object
   */
  public RepoInfo create(String url, String provider) {
    return create(new CreateRepo().setUrl(url).setProvider(provider));
  }

  /**
   * Create a repo.
   *
   * <p>Creates a repo in the workspace and links it to the remote Git repo specified. Note that
   * repos created programmatically must be linked to a remote Git repo, unlike repos created in the
   * browser.
   *
   * @param request a {@link com.databricks.sdk.service.workspace.CreateRepo} object
   * @return a {@link com.databricks.sdk.service.workspace.RepoInfo} object
   */
  public RepoInfo create(CreateRepo request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param repoId a long
   */
  public void delete(long repoId) {
    delete(new DeleteRepoRequest().setRepoId(repoId));
  }

  /**
   * Delete a repo.
   *
   * <p>Deletes the specified repo.
   *
   * @param request a {@link com.databricks.sdk.service.workspace.DeleteRepoRequest} object
   */
  public void delete(DeleteRepoRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param repoId a long
   * @return a {@link com.databricks.sdk.service.workspace.RepoInfo} object
   */
  public RepoInfo get(long repoId) {
    return get(new GetRepoRequest().setRepoId(repoId));
  }

  /**
   * Get a repo.
   *
   * <p>Returns the repo with the given repo ID.
   *
   * @param request a {@link com.databricks.sdk.service.workspace.GetRepoRequest} object
   * @return a {@link com.databricks.sdk.service.workspace.RepoInfo} object
   */
  public RepoInfo get(GetRepoRequest request) {
    return impl.get(request);
  }

  /**
   * Get repos.
   *
   * <p>Returns repos that the calling user has Manage permissions on. Results are paginated with
   * each page containing twenty repos.
   *
   * @param request a {@link com.databricks.sdk.service.workspace.ListReposRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<RepoInfo> list(ListReposRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListReposResponse::getRepos,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setNextPageToken(token);
        });
  }

  /**
   * <p>update.</p>
   *
   * @param repoId a long
   */
  public void update(long repoId) {
    update(new UpdateRepo().setRepoId(repoId));
  }

  /**
   * Update a repo.
   *
   * <p>Updates the repo to a different branch or tag, or updates the repo to the latest commit on
   * the same branch.
   *
   * @param request a {@link com.databricks.sdk.service.workspace.UpdateRepo} object
   */
  public void update(UpdateRepo request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.workspace.ReposService} object
   */
  public ReposService impl() {
    return impl;
  }
}
