// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AwsSqsQueuePb {
  @JsonProperty("managed_resource_id")
  private String managedResourceId;

  @JsonProperty("queue_url")
  private String queueUrl;

  public AwsSqsQueuePb setManagedResourceId(String managedResourceId) {
    this.managedResourceId = managedResourceId;
    return this;
  }

  public String getManagedResourceId() {
    return managedResourceId;
  }

  public AwsSqsQueuePb setQueueUrl(String queueUrl) {
    this.queueUrl = queueUrl;
    return this;
  }

  public String getQueueUrl() {
    return queueUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsSqsQueuePb that = (AwsSqsQueuePb) o;
    return Objects.equals(managedResourceId, that.managedResourceId)
        && Objects.equals(queueUrl, that.queueUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedResourceId, queueUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsSqsQueuePb.class)
        .add("managedResourceId", managedResourceId)
        .add("queueUrl", queueUrl)
        .toString();
  }
}
