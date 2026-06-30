// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateNccPrivateEndpointRuleRequest {
  /**
   * The ID of a network connectivity configuration, which is the parent resource of this private
   * endpoint rule object.
   */
  @JsonIgnore private String networkConnectivityConfigId;

  /** */
  @JsonProperty("private_endpoint_rule")
  private UpdatePrivateEndpointRule privateEndpointRule;

  /** Your private endpoint rule ID. */
  @JsonIgnore private String privateEndpointRuleId;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateNccPrivateEndpointRuleRequest setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public UpdateNccPrivateEndpointRuleRequest setPrivateEndpointRule(
      UpdatePrivateEndpointRule privateEndpointRule) {
    this.privateEndpointRule = privateEndpointRule;
    return this;
  }

  public UpdatePrivateEndpointRule getPrivateEndpointRule() {
    return privateEndpointRule;
  }

  public UpdateNccPrivateEndpointRuleRequest setPrivateEndpointRuleId(
      String privateEndpointRuleId) {
    this.privateEndpointRuleId = privateEndpointRuleId;
    return this;
  }

  public String getPrivateEndpointRuleId() {
    return privateEndpointRuleId;
  }

  public UpdateNccPrivateEndpointRuleRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateNccPrivateEndpointRuleRequest that = (UpdateNccPrivateEndpointRuleRequest) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(privateEndpointRule, that.privateEndpointRule)
        && Objects.equals(privateEndpointRuleId, that.privateEndpointRuleId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        networkConnectivityConfigId, privateEndpointRule, privateEndpointRuleId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateNccPrivateEndpointRuleRequest.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("privateEndpointRule", privateEndpointRule)
        .add("privateEndpointRuleId", privateEndpointRuleId)
        .add("updateMask", updateMask)
        .toString();
  }
}
