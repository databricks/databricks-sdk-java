// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreatePrivateEndpointRuleRequest {
  /**
   * The sub-resource type (group ID) of the target resource. Note that to connect to workspace root
   * storage (root DBFS), you need two endpoints, one for `blob` and one for `dfs`.
   */
  @JsonProperty("group_id")
  private CreatePrivateEndpointRuleRequestGroupId groupId;

  /** Your Network Connectvity Configuration ID. */
  private String networkConnectivityConfigId;

  /** The Azure resource ID of the target resource. */
  @JsonProperty("resource_id")
  private String resourceId;

  public CreatePrivateEndpointRuleRequest setGroupId(
      CreatePrivateEndpointRuleRequestGroupId groupId) {
    this.groupId = groupId;
    return this;
  }

  public CreatePrivateEndpointRuleRequestGroupId getGroupId() {
    return groupId;
  }

  public CreatePrivateEndpointRuleRequest setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public CreatePrivateEndpointRuleRequest setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreatePrivateEndpointRuleRequest that = (CreatePrivateEndpointRuleRequest) o;
    return Objects.equals(groupId, that.groupId)
        && Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(resourceId, that.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, networkConnectivityConfigId, resourceId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePrivateEndpointRuleRequest.class)
        .add("groupId", groupId)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("resourceId", resourceId)
        .toString();
  }
}
