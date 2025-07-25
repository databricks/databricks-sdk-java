// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage storage configurations for this workspace. A root storage S3 bucket in your
 * account is required to store objects like cluster logs, notebook revisions, and job results. You
 * can also use the root storage S3 bucket for storage of non-production DBFS data. A storage
 * configuration encapsulates this bucket information, and its ID is used when creating a new
 * workspace.
 */
@Generated
public class StorageAPI {
  private static final Logger LOG = LoggerFactory.getLogger(StorageAPI.class);

  private final StorageService impl;

  /** Regular-use constructor */
  public StorageAPI(ApiClient apiClient) {
    impl = new StorageImpl(apiClient);
  }

  /** Constructor for mocks */
  public StorageAPI(StorageService mock) {
    impl = mock;
  }

  /**
   * Creates new storage configuration for an account, specified by ID. Uploads a storage
   * configuration object that represents the root AWS S3 bucket in your account. Databricks stores
   * related workspace assets including DBFS, cluster logs, and job results. For the AWS S3 bucket,
   * you need to configure the required bucket policy.
   *
   * <p>For information about how to create a new workspace with this API, see [Create a new
   * workspace using the Account API]
   *
   * <p>[Create a new workspace using the Account API]:
   * http://docs.databricks.com/administration-guide/account-api/new-workspace.html
   */
  public StorageConfiguration create(CreateStorageConfigurationRequest request) {
    return impl.create(request);
  }

  public void delete(String storageConfigurationId) {
    delete(new DeleteStorageRequest().setStorageConfigurationId(storageConfigurationId));
  }

  /**
   * Deletes a Databricks storage configuration. You cannot delete a storage configuration that is
   * associated with any workspace.
   */
  public void delete(DeleteStorageRequest request) {
    impl.delete(request);
  }

  public StorageConfiguration get(String storageConfigurationId) {
    return get(new GetStorageRequest().setStorageConfigurationId(storageConfigurationId));
  }

  /** Gets a Databricks storage configuration for an account, both specified by ID. */
  public StorageConfiguration get(GetStorageRequest request) {
    return impl.get(request);
  }

  /** Gets a list of all Databricks storage configurations for your account, specified by ID. */
  public Iterable<StorageConfiguration> list() {
    return impl.list();
  }

  public StorageService impl() {
    return impl;
  }
}
