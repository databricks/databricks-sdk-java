// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get all log delivery configurations */
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

  public ListLogDeliveryRequest setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  public ListLogDeliveryRequest setStatus(LogDeliveryConfigStatus status) {
    this.status = status;
    return this;
  }

  public LogDeliveryConfigStatus getStatus() {
    return status;
  }

  public ListLogDeliveryRequest setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListLogDeliveryRequest that = (ListLogDeliveryRequest) o;
    return Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(status, that.status)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialsId, status, storageConfigurationId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListLogDeliveryRequest.class)
        .add("credentialsId", credentialsId)
        .add("status", status)
        .add("storageConfigurationId", storageConfigurationId)
        .toString();
  }
}
