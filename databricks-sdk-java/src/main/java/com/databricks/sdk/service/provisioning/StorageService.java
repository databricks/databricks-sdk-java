// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import java.util.Collection;

/**
 * These APIs manage storage configurations for this workspace. A root storage S3 bucket in your
 * account is required to store objects like cluster logs, notebook revisions, and job results. You
 * can also use the root storage S3 bucket for storage of non-production DBFS data. A storage
 * configuration encapsulates this bucket information, and its ID is used when creating a new
 * workspace.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface StorageService {
  /** Creates a Databricks storage configuration for an account. */
  StorageConfiguration create(CreateStorageConfigurationRequest createStorageConfigurationRequest);

  /**
   * Deletes a Databricks storage configuration. You cannot delete a storage configuration that is
   * associated with any workspace.
   */
  StorageConfiguration delete(DeleteStorageRequest deleteStorageRequest);

  /** Gets a Databricks storage configuration for an account, both specified by ID. */
  StorageConfiguration get(GetStorageRequest getStorageRequest);

  /** Lists Databricks storage configurations for an account, specified by ID. */
  Collection<StorageConfiguration> list();
}
