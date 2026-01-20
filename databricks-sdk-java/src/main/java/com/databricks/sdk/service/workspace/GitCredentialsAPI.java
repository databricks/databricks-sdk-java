// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Registers personal access token for Databricks to do operations on behalf of the user.
 *
 * <p>See [more info].
 *
 * <p>[more info]: https://docs.databricks.com/repos/get-access-tokens-from-git-provider.html
 */
@Generated
public class GitCredentialsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(GitCredentialsAPI.class);

  private final GitCredentialsService impl;

  /** Regular-use constructor */
  public GitCredentialsAPI(ApiClient apiClient) {
    impl = new GitCredentialsImpl(apiClient);
  }

  /** Constructor for mocks */
  public GitCredentialsAPI(GitCredentialsService mock) {
    impl = mock;
  }

  /**
   * Creates a Git credential entry for the user. Only one Git credential per user is supported, so
   * any attempts to create credentials if an entry already exists will fail. Use the PATCH endpoint
   * to update existing credentials, or the DELETE endpoint to delete existing credentials.
   */
  public CreateCredentialsResponse create(CreateCredentialsRequest request) {
    return impl.create(request);
  }

  public void delete(long credentialId) {
    delete(new DeleteCredentialsRequest().setCredentialId(credentialId));
  }

  /** Deletes the specified Git credential. */
  public void delete(DeleteCredentialsRequest request) {
    impl.delete(request);
  }

  public GetCredentialsResponse get(long credentialId) {
    return get(new GetCredentialsRequest().setCredentialId(credentialId));
  }

  /** Gets the Git credential with the specified credential ID. */
  public GetCredentialsResponse get(GetCredentialsRequest request) {
    return impl.get(request);
  }

  /** Lists the calling user's Git credentials. */
  public Iterable<CredentialInfo> list(ListCredentialsRequest request) {
    return new Paginator<>(
        request, impl::list, ListCredentialsResponse::getCredentials, response -> null);
  }

  /** Updates the specified Git credential. */
  public void update(UpdateCredentialsRequest request) {
    impl.update(request);
  }

  public GitCredentialsService impl() {
    return impl;
  }
}
