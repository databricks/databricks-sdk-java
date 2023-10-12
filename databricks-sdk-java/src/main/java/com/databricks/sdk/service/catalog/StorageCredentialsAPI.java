// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 */
@Generated
public class StorageCredentialsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(StorageCredentialsAPI.class);

  private final StorageCredentialsService impl;

  /** Regular-use constructor */
  public StorageCredentialsAPI(ApiClient apiClient) {
    impl = new StorageCredentialsImpl(apiClient);
  }

  /** Constructor for mocks */
  public StorageCredentialsAPI(StorageCredentialsService mock) {
    impl = mock;
  }

  public StorageCredentialInfo create(String name) {
    return create(new CreateStorageCredential().setName(name));
  }

  /**
   * Create a storage credential.
   *
   * <p>Creates a new storage credential.
   */
  public StorageCredentialInfo create(CreateStorageCredential request) {
    return impl.create(request);
  }

  public void delete(String name) {
    delete(new DeleteStorageCredentialRequest().setName(name));
  }

  /**
   * Delete a credential.
   *
   * <p>Deletes a storage credential from the metastore. The caller must be an owner of the storage
   * credential.
   */
  public void delete(DeleteStorageCredentialRequest request) {
    impl.delete(request);
  }

  public StorageCredentialInfo get(String name) {
    return get(new GetStorageCredentialRequest().setName(name));
  }

  /**
   * Get a credential.
   *
   * <p>Gets a storage credential from the metastore. The caller must be a metastore admin, the
   * owner of the storage credential, or have some permission on the storage credential.
   */
  public StorageCredentialInfo get(GetStorageCredentialRequest request) {
    return impl.get(request);
  }

  /**
   * List credentials.
   *
   * <p>Gets an array of storage credentials (as __StorageCredentialInfo__ objects). The array is
   * limited to only those storage credentials the caller has permission to access. If the caller is
   * a metastore admin, all storage credentials will be retrieved. There is no guarantee of a
   * specific ordering of the elements in the array.
   */
  public Iterable<StorageCredentialInfo> list() {
    return impl.list().getStorageCredentials();
  }

  public StorageCredentialInfo update(String name) {
    return update(new UpdateStorageCredential().setName(name));
  }

  /**
   * Update a credential.
   *
   * <p>Updates a storage credential on the metastore.
   */
  public StorageCredentialInfo update(UpdateStorageCredential request) {
    return impl.update(request);
  }

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
  public ValidateStorageCredentialResponse validate(ValidateStorageCredential request) {
    return impl.validate(request);
  }

  public StorageCredentialsService impl() {
    return impl;
  }
}
