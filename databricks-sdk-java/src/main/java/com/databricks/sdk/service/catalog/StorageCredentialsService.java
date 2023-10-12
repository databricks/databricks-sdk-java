// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * A storage credential represents an authentication and authorization mechanism for accessing data
 * stored on your cloud tenant. Each storage credential is subject to Unity Catalog access-control
 * policies that control which users and groups can access the credential. If a user does not have
 * access to a storage credential in Unity Catalog, the request fails and Unity Catalog does not
 * attempt to authenticate to your cloud tenant on the user’s behalf.
 *
 * <p>Databricks recommends using external locations rather than using storage credentials directly.
 *
 * <p>To create storage credentials, you must be a Databricks account admin. The account admin who
 * creates the storage credential can delegate ownership to another user or group to manage
 * permissions on it.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface StorageCredentialsService {
  /**
   * Create a storage credential.
   *
   * <p>Creates a new storage credential.
   */
  StorageCredentialInfo create(CreateStorageCredential createStorageCredential);

  /**
   * Delete a credential.
   *
   * <p>Deletes a storage credential from the metastore. The caller must be an owner of the storage
   * credential.
   */
  void delete(DeleteStorageCredentialRequest deleteStorageCredentialRequest);

  /**
   * Get a credential.
   *
   * <p>Gets a storage credential from the metastore. The caller must be a metastore admin, the
   * owner of the storage credential, or have some permission on the storage credential.
   */
  StorageCredentialInfo get(GetStorageCredentialRequest getStorageCredentialRequest);

  /**
   * List credentials.
   *
   * <p>Gets an array of storage credentials (as __StorageCredentialInfo__ objects). The array is
   * limited to only those storage credentials the caller has permission to access. If the caller is
   * a metastore admin, all storage credentials will be retrieved. There is no guarantee of a
   * specific ordering of the elements in the array.
   */
  ListStorageCredentialsResponse list();

  /**
   * Update a credential.
   *
   * <p>Updates a storage credential on the metastore.
   */
  StorageCredentialInfo update(UpdateStorageCredential updateStorageCredential);

  /**
   * Validate a storage credential.
   *
   * <p>Validates a storage credential. At least one of __external_location_name__ and __url__ need
   * to be provided. If only one of them is provided, it will be used for validation. And if both
   * are provided, the __url__ will be used for validation, and __external_location_name__ will be
   * ignored when checking overlapping urls.
   *
   * <p>Either the __storage_credential_name__ or the cloud-specific credential must be provided.
   *
   * <p>The caller must be a metastore admin or the storage credential owner or have the
   * **CREATE_EXTERNAL_LOCATION** privilege on the metastore and the storage credential.
   */
  ValidateStorageCredentialResponse validate(ValidateStorageCredential validateStorageCredential);
}
