// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AzureQueueStorage {
  /** Unique identifier included in the name of file events managed cloud resources. */
  @JsonProperty("managed_resource_id")
  private String managedResourceId;

  /**
   * The AQS queue url in the format https://{storage account}.queue.core.windows.net/{queue name}
   * Required for provided_aqs.
   */
  @JsonProperty("queue_url")
  private String queueUrl;

  /**
   * The resource group for the queue, event grid subscription, and external location storage
   * account. Only required for locations with a service principal storage credential
   */
  @JsonProperty("resource_group")
  private String resourceGroup;

  /**
   * Optional subscription id for the queue, event grid subscription, and external location storage
   * account. Required for locations with a service principal storage credential
   */
  @JsonProperty("subscription_id")
  private String subscriptionId;

  public AzureQueueStorage setManagedResourceId(String managedResourceId) {
    this.managedResourceId = managedResourceId;
    return this;
  }

  public String getManagedResourceId() {
    return managedResourceId;
  }

  public AzureQueueStorage setQueueUrl(String queueUrl) {
    this.queueUrl = queueUrl;
    return this;
  }

  public String getQueueUrl() {
    return queueUrl;
  }

  public AzureQueueStorage setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
    return this;
  }

  public String getResourceGroup() {
    return resourceGroup;
  }

  public AzureQueueStorage setSubscriptionId(String subscriptionId) {
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
    AzureQueueStorage that = (AzureQueueStorage) o;
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
    return new ToStringer(AzureQueueStorage.class)
        .add("managedResourceId", managedResourceId)
        .add("queueUrl", queueUrl)
        .add("resourceGroup", resourceGroup)
        .add("subscriptionId", subscriptionId)
        .toString();
  }
}
