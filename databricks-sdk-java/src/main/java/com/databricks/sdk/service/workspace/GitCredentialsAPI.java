// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Registers personal access token for Databricks to do operations on behalf of the user.
 *
 * <p>See [more info].
 *
 * <p>[more info]: https://docs.databricks.com/repos/get-access-tokens-from-git-provider.html
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GitCredentialsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(GitCredentialsAPI.class);

  private final GitCredentialsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public GitCredentialsAPI(ApiClient apiClient) {
    impl = new GitCredentialsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.workspace.GitCredentialsService} object
   */
  public GitCredentialsAPI(GitCredentialsService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param gitProvider a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.CreateCredentialsResponse} object
   */
  public CreateCredentialsResponse create(String gitProvider) {
    return create(new CreateCredentials().setGitProvider(gitProvider));
  }

  /**
   * Create a credential entry.
   *
   * <p>Creates a Git credential entry for the user. Only one Git credential per user is supported,
   * so any attempts to create credentials if an entry already exists will fail. Use the PATCH
   * endpoint to update existing credentials, or the DELETE endpoint to delete existing credentials.
   *
   * @param request a {@link com.databricks.sdk.service.workspace.CreateCredentials} object
   * @return a {@link com.databricks.sdk.service.workspace.CreateCredentialsResponse} object
   */
  public CreateCredentialsResponse create(CreateCredentials request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param credentialId a long
   */
  public void delete(long credentialId) {
    delete(new DeleteGitCredentialRequest().setCredentialId(credentialId));
  }

  /**
   * Delete a credential.
   *
   * <p>Deletes the specified Git credential.
   *
   * @param request a {@link com.databricks.sdk.service.workspace.DeleteGitCredentialRequest} object
   */
  public void delete(DeleteGitCredentialRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param credentialId a long
   * @return a {@link com.databricks.sdk.service.workspace.CredentialInfo} object
   */
  public CredentialInfo get(long credentialId) {
    return get(new GetGitCredentialRequest().setCredentialId(credentialId));
  }

  /**
   * Get a credential entry.
   *
   * <p>Gets the Git credential with the specified credential ID.
   *
   * @param request a {@link com.databricks.sdk.service.workspace.GetGitCredentialRequest} object
   * @return a {@link com.databricks.sdk.service.workspace.CredentialInfo} object
   */
  public CredentialInfo get(GetGitCredentialRequest request) {
    return impl.get(request);
  }

  /**
   * Get Git credentials.
   *
   * <p>Lists the calling user's Git credentials. One credential per user is supported.
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<CredentialInfo> list() {
    return impl.list().getCredentials();
  }

  /**
   * <p>update.</p>
   *
   * @param credentialId a long
   */
  public void update(long credentialId) {
    update(new UpdateCredentials().setCredentialId(credentialId));
  }

  /**
   * Update a credential.
   *
   * <p>Updates the specified Git credential.
   *
   * @param request a {@link com.databricks.sdk.service.workspace.UpdateCredentials} object
   */
  public void update(UpdateCredentials request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.workspace.GitCredentialsService} object
   */
  public GitCredentialsService impl() {
    return impl;
  }
}
