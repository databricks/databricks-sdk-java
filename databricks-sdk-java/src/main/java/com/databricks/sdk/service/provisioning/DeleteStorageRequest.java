// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete storage configuration
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteStorageRequest {
  /** Databricks Account API storage configuration ID. */
  private String storageConfigurationId;

  /**
   * <p>Setter for the field <code>storageConfigurationId</code>.</p>
   *
   * @param storageConfigurationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.DeleteStorageRequest} object
   */
  public DeleteStorageRequest setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageConfigurationId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteStorageRequest that = (DeleteStorageRequest) o;
    return Objects.equals(storageConfigurationId, that.storageConfigurationId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(storageConfigurationId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteStorageRequest.class)
        .add("storageConfigurationId", storageConfigurationId)
        .toString();
  }
}
