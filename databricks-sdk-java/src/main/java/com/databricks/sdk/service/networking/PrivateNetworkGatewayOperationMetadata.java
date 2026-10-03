// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PrivateNetworkGatewayOperationMetadata {
  /** The operation performed on the gateway. */
  @JsonProperty("operation_type")
  private PrivateNetworkGatewayOperationMetadataOperationType operationType;

  public PrivateNetworkGatewayOperationMetadata setOperationType(
      PrivateNetworkGatewayOperationMetadataOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  public PrivateNetworkGatewayOperationMetadataOperationType getOperationType() {
    return operationType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateNetworkGatewayOperationMetadata that = (PrivateNetworkGatewayOperationMetadata) o;
    return Objects.equals(operationType, that.operationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationType);
  }

  @Override
  public String toString() {
    return new ToStringer(PrivateNetworkGatewayOperationMetadata.class)
        .add("operationType", operationType)
        .toString();
  }
}
