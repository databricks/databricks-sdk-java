// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListLogDeliveryRequest {
  /** The Credentials id to filter the search results with */
  @JsonIgnore
  @QueryParam("credentials_id")
  private String credentialsId;

  /**
   * A page token received from a previous get all budget configurations call. This token can be
   * used to retrieve the subsequent page. Requests first page if absent.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** The log delivery status to filter the search results with */
  @JsonIgnore
  @QueryParam("status")
  private LogDeliveryConfigStatus status;

  /** The Storage Configuration id to filter the search results with */
  @JsonIgnore
  @QueryParam("storage_configuration_id")
  private String storageConfigurationId;

  public ListLogDeliveryRequest setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  public ListLogDeliveryRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
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
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(status, that.status)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialsId, pageToken, status, storageConfigurationId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListLogDeliveryRequest.class)
        .add("credentialsId", credentialsId)
        .add("pageToken", pageToken)
        .add("status", status)
        .add("storageConfigurationId", storageConfigurationId)
        .toString();
  }
}
