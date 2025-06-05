// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AzureQueueStoragePb {
  @JsonProperty("managed_resource_id")
  private String managedResourceId;

  @JsonProperty("queue_url")
  private String queueUrl;

  @JsonProperty("resource_group")
  private String resourceGroup;

  @JsonProperty("subscription_id")
  private String subscriptionId;

  public AzureQueueStoragePb setManagedResourceId(String managedResourceId) {
    this.managedResourceId = managedResourceId;
    return this;
  }

  public String getManagedResourceId() {
    return managedResourceId;
  }

  public AzureQueueStoragePb setQueueUrl(String queueUrl) {
    this.queueUrl = queueUrl;
    return this;
  }

  public String getQueueUrl() {
    return queueUrl;
  }

  public AzureQueueStoragePb setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
    return this;
  }

  public String getResourceGroup() {
    return resourceGroup;
  }

  public AzureQueueStoragePb setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  public String getSubscriptionId() {
    return subscriptionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureQueueStoragePb that = (AzureQueueStoragePb) o;
    return Objects.equals(managedResourceId, that.managedResourceId)
        && Objects.equals(queueUrl, that.queueUrl)
        && Objects.equals(resourceGroup, that.resourceGroup)
        && Objects.equals(subscriptionId, that.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedResourceId, queueUrl, resourceGroup, subscriptionId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureQueueStoragePb.class)
        .add("managedResourceId", managedResourceId)
        .add("queueUrl", queueUrl)
        .add("resourceGroup", resourceGroup)
        .add("subscriptionId", subscriptionId)
        .toString();
  }
}
