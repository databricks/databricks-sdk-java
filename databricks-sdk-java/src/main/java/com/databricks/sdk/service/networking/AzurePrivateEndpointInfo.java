// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AzurePrivateEndpointInfo {
  /** The name of the Private Endpoint in the Azure subscription. */
  @JsonProperty("private_endpoint_name")
  private String privateEndpointName;

  /**
   * The GUID of the Private Endpoint resource in the Azure subscription. This is assigned by Azure
   * when the user sets up the Private Endpoint.
   */
  @JsonProperty("private_endpoint_resource_guid")
  private String privateEndpointResourceGuid;

  /** The full resource ID of the Private Endpoint. */
  @JsonProperty("private_endpoint_resource_id")
  private String privateEndpointResourceId;

  /**
   * The resource ID of the Databricks Private Link Service that this Private Endpoint connects to.
   */
  @JsonProperty("private_link_service_id")
  private String privateLinkServiceId;

  public AzurePrivateEndpointInfo setPrivateEndpointName(String privateEndpointName) {
    this.privateEndpointName = privateEndpointName;
    return this;
  }

  public String getPrivateEndpointName() {
    return privateEndpointName;
  }

  public AzurePrivateEndpointInfo setPrivateEndpointResourceGuid(
      String privateEndpointResourceGuid) {
    this.privateEndpointResourceGuid = privateEndpointResourceGuid;
    return this;
  }

  public String getPrivateEndpointResourceGuid() {
    return privateEndpointResourceGuid;
  }

  public AzurePrivateEndpointInfo setPrivateEndpointResourceId(String privateEndpointResourceId) {
    this.privateEndpointResourceId = privateEndpointResourceId;
    return this;
  }

  public String getPrivateEndpointResourceId() {
    return privateEndpointResourceId;
  }

  public AzurePrivateEndpointInfo setPrivateLinkServiceId(String privateLinkServiceId) {
    this.privateLinkServiceId = privateLinkServiceId;
    return this;
  }

  public String getPrivateLinkServiceId() {
    return privateLinkServiceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzurePrivateEndpointInfo that = (AzurePrivateEndpointInfo) o;
    return Objects.equals(privateEndpointName, that.privateEndpointName)
        && Objects.equals(privateEndpointResourceGuid, that.privateEndpointResourceGuid)
        && Objects.equals(privateEndpointResourceId, that.privateEndpointResourceId)
        && Objects.equals(privateLinkServiceId, that.privateLinkServiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        privateEndpointName,
        privateEndpointResourceGuid,
        privateEndpointResourceId,
        privateLinkServiceId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzurePrivateEndpointInfo.class)
        .add("privateEndpointName", privateEndpointName)
        .add("privateEndpointResourceGuid", privateEndpointResourceGuid)
        .add("privateEndpointResourceId", privateEndpointResourceId)
        .add("privateLinkServiceId", privateLinkServiceId)
        .toString();
  }
}
