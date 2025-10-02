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

  /** Creates a Databricks storage configuration for an account. */
  public StorageConfiguration create(CreateStorageConfigurationRequest request) {
    return impl.create(request);
  }

  public StorageConfiguration delete(String storageConfigurationId) {
    return delete(new DeleteStorageRequest().setStorageConfigurationId(storageConfigurationId));
  }

  /**
   * Deletes a Databricks storage configuration. You cannot delete a storage configuration that is
   * associated with any workspace.
   */
  public StorageConfiguration delete(DeleteStorageRequest request) {
    return impl.delete(request);
  }

  public StorageConfiguration get(String storageConfigurationId) {
    return get(new GetStorageRequest().setStorageConfigurationId(storageConfigurationId));
  }

  /** Gets a Databricks storage configuration for an account, both specified by ID. */
  public StorageConfiguration get(GetStorageRequest request) {
    return impl.get(request);
  }

  /** Lists Databricks storage configurations for an account, specified by ID. */
  public Iterable<StorageConfiguration> list() {
    return impl.list();
  }

  public StorageService impl() {
    return impl;
  }
}
