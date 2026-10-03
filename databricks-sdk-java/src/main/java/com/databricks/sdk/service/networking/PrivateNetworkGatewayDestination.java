// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A destination routed through the gateway. */
@Generated
public class PrivateNetworkGatewayDestination {
  /** The destination type. */
  @JsonProperty("destination_type")
  private PrivateNetworkGatewayDestinationDestinationType destinationType;

  /** The destination value. */
  @JsonProperty("value")
  private String value;

  public PrivateNetworkGatewayDestination setDestinationType(
      PrivateNetworkGatewayDestinationDestinationType destinationType) {
    this.destinationType = destinationType;
    return this;
  }

  public PrivateNetworkGatewayDestinationDestinationType getDestinationType() {
    return destinationType;
  }

  public PrivateNetworkGatewayDestination setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateNetworkGatewayDestination that = (PrivateNetworkGatewayDestination) o;
    return Objects.equals(destinationType, that.destinationType)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationType, value);
  }

  @Override
  public String toString() {
    return new ToStringer(PrivateNetworkGatewayDestination.class)
        .add("destinationType", destinationType)
        .add("value", value)
        .toString();
  }
}
