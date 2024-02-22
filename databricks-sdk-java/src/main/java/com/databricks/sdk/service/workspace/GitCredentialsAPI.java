// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
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

  public CreateCredentialsResponse create(String gitProvider) {
    return create(new CreateCredentials().setGitProvider(gitProvider));
  }

  /**
   * Create a credential entry.
   *
   * <p>Creates a Git credential entry for the user. Only one Git credential per user is supported,
   * so any attempts to create credentials if an entry already exists will fail. Use the PATCH
   * endpoint to update existing credentials, or the DELETE endpoint to delete existing credentials.
   */
  public CreateCredentialsResponse create(CreateCredentials request) {
    return impl.create(request);
  }

  public DeleteResponse delete(long credentialId) {
    return delete(new DeleteGitCredentialRequest().setCredentialId(credentialId));
  }

  /**
   * Delete a credential.
   *
   * <p>Deletes the specified Git credential.
   */
  public DeleteResponse delete(DeleteGitCredentialRequest request) {
    return impl.delete(request);
  }

  public CredentialInfo get(long credentialId) {
    return get(new GetGitCredentialRequest().setCredentialId(credentialId));
  }

  /**
   * Get a credential entry.
   *
   * <p>Gets the Git credential with the specified credential ID.
   */
  public CredentialInfo get(GetGitCredentialRequest request) {
    return impl.get(request);
  }

  /**
   * Get Git credentials.
   *
   * <p>Lists the calling user's Git credentials. One credential per user is supported.
   */
  public Iterable<CredentialInfo> list() {
    return impl.list().getCredentials();
  }

  public UpdateResponse update(long credentialId) {
    return update(new UpdateCredentials().setCredentialId(credentialId));
  }

  /**
   * Update a credential.
   *
   * <p>Updates the specified Git credential.
   */
  public UpdateResponse update(UpdateCredentials request) {
    return impl.update(request);
  }

  public GitCredentialsService impl() {
    return impl;
  }
}
