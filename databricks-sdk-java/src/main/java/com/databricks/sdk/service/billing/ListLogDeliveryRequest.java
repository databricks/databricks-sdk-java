// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get all log delivery configurations
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListLogDeliveryRequest {
  /** Filter by credential configuration ID. */
  @QueryParam("credentials_id")
  private String credentialsId;

  /** Filter by status `ENABLED` or `DISABLED`. */
  @QueryParam("status")
  private LogDeliveryConfigStatus status;

  /** Filter by storage configuration ID. */
  @QueryParam("storage_configuration_id")
  private String storageConfigurationId;

  /**
   * <p>Setter for the field <code>credentialsId</code>.</p>
   *
   * @param credentialsId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.ListLogDeliveryRequest} object
   */
  public ListLogDeliveryRequest setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  /**
   * <p>Getter for the field <code>credentialsId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCredentialsId() {
    return credentialsId;
  }

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.databricks.sdk.service.billing.LogDeliveryConfigStatus} object
   * @return a {@link com.databricks.sdk.service.billing.ListLogDeliveryRequest} object
   */
  public ListLogDeliveryRequest setStatus(LogDeliveryConfigStatus status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfigStatus} object
   */
  public LogDeliveryConfigStatus getStatus() {
    return status;
  }

  /**
   * <p>Setter for the field <code>storageConfigurationId</code>.</p>
   *
   * @param storageConfigurationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.ListLogDeliveryRequest} object
   */
  public ListLogDeliveryRequest setStorageConfigurationId(String storageConfigurationId) {
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
    ListLogDeliveryRequest that = (ListLogDeliveryRequest) o;
    return Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(status, that.status)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(credentialsId, status, storageConfigurationId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListLogDeliveryRequest.class)
        .add("credentialsId", credentialsId)
        .add("status", status)
        .add("storageConfigurationId", storageConfigurationId)
        .toString();
  }
}
