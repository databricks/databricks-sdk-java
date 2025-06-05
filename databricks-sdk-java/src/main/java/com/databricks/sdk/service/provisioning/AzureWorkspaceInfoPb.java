// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AzureWorkspaceInfoPb {
  @JsonProperty("resource_group")
  private String resourceGroup;

  @JsonProperty("subscription_id")
  private String subscriptionId;

  public AzureWorkspaceInfoPb setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
    return this;
  }

  public String getResourceGroup() {
    return resourceGroup;
  }

  public AzureWorkspaceInfoPb setSubscriptionId(String subscriptionId) {
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
    AzureWorkspaceInfoPb that = (AzureWorkspaceInfoPb) o;
    return Objects.equals(resourceGroup, that.resourceGroup)
        && Objects.equals(subscriptionId, that.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceGroup, subscriptionId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureWorkspaceInfoPb.class)
        .add("resourceGroup", resourceGroup)
        .add("subscriptionId", subscriptionId)
        .toString();
  }
}
