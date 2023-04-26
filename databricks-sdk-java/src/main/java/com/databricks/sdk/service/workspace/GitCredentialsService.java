// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

/**
 * Registers personal access token for Databricks to do operations on behalf of the user.
 *
 * <p>See [more info].
 *
 * <p>[more info]: https://docs.databricks.com/repos/get-access-tokens-from-git-provider.html
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface GitCredentialsService {
  /**
   * Create a credential entry.
   *
   * <p>Creates a Git credential entry for the user. Only one Git credential per user is supported,
   * so any attempts to create credentials if an entry already exists will fail. Use the PATCH
   * endpoint to update existing credentials, or the DELETE endpoint to delete existing credentials.
   *
   * @param createCredentials a {@link com.databricks.sdk.service.workspace.CreateCredentials} object
   * @return a {@link com.databricks.sdk.service.workspace.CreateCredentialsResponse} object
   */
  CreateCredentialsResponse create(CreateCredentials createCredentials);

  /**
   * Delete a credential.
   *
   * <p>Deletes the specified Git credential.
   *
   * @param deleteGitCredentialRequest a {@link com.databricks.sdk.service.workspace.DeleteGitCredentialRequest} object
   */
  void delete(DeleteGitCredentialRequest deleteGitCredentialRequest);

  /**
   * Get a credential entry.
   *
   * <p>Gets the Git credential with the specified credential ID.
   *
   * @param getGitCredentialRequest a {@link com.databricks.sdk.service.workspace.GetGitCredentialRequest} object
   * @return a {@link com.databricks.sdk.service.workspace.CredentialInfo} object
   */
  CredentialInfo get(GetGitCredentialRequest getGitCredentialRequest);

  /**
   * Get Git credentials.
   *
   * <p>Lists the calling user's Git credentials. One credential per user is supported.
   *
   * @return a {@link com.databricks.sdk.service.workspace.GetCredentialsResponse} object
   */
  GetCredentialsResponse list();

  /**
   * Update a credential.
   *
   * <p>Updates the specified Git credential.
   *
   * @param updateCredentials a {@link com.databricks.sdk.service.workspace.UpdateCredentials} object
   */
  void update(UpdateCredentials updateCredentials);
}
