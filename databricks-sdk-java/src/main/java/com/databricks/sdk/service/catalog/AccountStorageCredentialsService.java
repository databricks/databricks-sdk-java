// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * These APIs manage storage credentials for a particular metastore.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AccountStorageCredentialsService {
  /**
   * Creates a new storage credential. The request object is specific to the cloud:
   *
   * <ul>
   *   <li><b>AwsIamRole</b> for AWS credentials
   *   <li><b>AzureServicePrincipal</b> for Azure credentials
   *   <li><b>GcpServiceAccountKey</b> for GCP credentials
   * </ul>
   *
   * <p>The caller must be a metastore admin and have the {@code CREATE_STORAGE_CREDENTIAL}
   * privilege on the metastore.
   */
  AccountsCreateStorageCredentialInfo create(
      AccountsCreateStorageCredential accountsCreateStorageCredential);

  /**
   * Deletes a storage credential from the metastore. The caller must be an owner of the storage
   * credential.
   */
  AccountsDeleteStorageCredentialResponse delete(
      DeleteAccountStorageCredentialRequest deleteAccountStorageCredentialRequest);

  /**
   * Gets a storage credential from the metastore. The caller must be a metastore admin, the owner
   * of the storage credential, or have a level of privilege on the storage credential.
   */
  AccountsStorageCredentialInfo get(
      GetAccountStorageCredentialRequest getAccountStorageCredentialRequest);

  /** Gets a list of all storage credentials that have been assigned to given metastore. */
  ListAccountStorageCredentialsResponse list(
      ListAccountStorageCredentialsRequest listAccountStorageCredentialsRequest);

  /**
   * Updates a storage credential on the metastore. The caller must be the owner of the storage
   * credential. If the caller is a metastore admin, only the <b>owner</b> credential can be
   * changed.
   */
  AccountsUpdateStorageCredentialResponse update(
      AccountsUpdateStorageCredential accountsUpdateStorageCredential);
}
