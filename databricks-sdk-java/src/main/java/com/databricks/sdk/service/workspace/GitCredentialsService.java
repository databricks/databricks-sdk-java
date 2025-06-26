// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;

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
@Generated
public interface GitCredentialsService {
  /**
   * Creates a Git credential entry for the user. Only one Git credential per user is supported, so
   * any attempts to create credentials if an entry already exists will fail. Use the PATCH endpoint
   * to update existing credentials, or the DELETE endpoint to delete existing credentials.
   */
  CreateCredentialsResponse create(CreateCredentialsRequest createCredentialsRequest);

  /** Deletes the specified Git credential. */
  void delete(DeleteCredentialsRequest deleteCredentialsRequest);

  /** Gets the Git credential with the specified credential ID. */
  GetCredentialsResponse get(GetCredentialsRequest getCredentialsRequest);

  /** Lists the calling user's Git credentials. One credential per user is supported. */
  ListCredentialsResponse list();

  /** Updates the specified Git credential. */
  void update(UpdateCredentialsRequest updateCredentialsRequest);
}
