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
 */
public interface GitCredentialsService {
  /**
   * Create a credential entry.
   *
   * <p>Creates a Git credential entry for the user. Only one Git credential per user is supported,
   * so any attempts to create credentials if an entry already exists will fail. Use the PATCH
   * endpoint to update existing credentials, or the DELETE endpoint to delete existing credentials.
   */
  CreateCredentialsResponse create(CreateCredentials createCredentials);

  /**
   * Delete a credential.
   *
   * <p>Deletes the specified Git credential.
   */
  void delete(DeleteGitCredentialRequest deleteGitCredentialRequest);

  /**
   * Get a credential entry.
   *
   * <p>Gets the Git credential with the specified credential ID.
   */
  CredentialInfo get(GetGitCredentialRequest getGitCredentialRequest);

  /**
   * Get Git credentials.
   *
   * <p>Lists the calling user's Git credentials. One credential per user is supported.
   */
  GetCredentialsResponse list();

  /**
   * Update a credential.
   *
   * <p>Updates the specified Git credential.
   */
  void update(UpdateCredentials updateCredentials);
}
