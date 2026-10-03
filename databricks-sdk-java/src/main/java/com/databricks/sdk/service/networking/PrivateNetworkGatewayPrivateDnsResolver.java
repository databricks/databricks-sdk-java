// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A private DNS resolver used by the gateway. */
@Generated
public class PrivateNetworkGatewayPrivateDnsResolver {
  /** The resolver type. */
  @JsonProperty("resolver_type")
  private PrivateNetworkGatewayPrivateDnsResolverResolverType resolverType;

  /** The resolver value. */
  @JsonProperty("value")
  private String value;

  public PrivateNetworkGatewayPrivateDnsResolver setResolverType(
      PrivateNetworkGatewayPrivateDnsResolverResolverType resolverType) {
    this.resolverType = resolverType;
    return this;
  }

  public PrivateNetworkGatewayPrivateDnsResolverResolverType getResolverType() {
    return resolverType;
  }

  public PrivateNetworkGatewayPrivateDnsResolver setValue(String value) {
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
    PrivateNetworkGatewayPrivateDnsResolver that = (PrivateNetworkGatewayPrivateDnsResolver) o;
    return Objects.equals(resolverType, that.resolverType) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolverType, value);
  }

  @Override
  public String toString() {
    return new ToStringer(PrivateNetworkGatewayPrivateDnsResolver.class)
        .add("resolverType", resolverType)
        .add("value", value)
        .toString();
  }
}
