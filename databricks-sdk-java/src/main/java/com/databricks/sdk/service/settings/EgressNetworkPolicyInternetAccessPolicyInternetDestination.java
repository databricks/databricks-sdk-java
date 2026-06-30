// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Users can specify accessible internet destinations when outbound access is restricted. We only
 * support domain name (FQDN) destinations for the time being, though going forwards we want to
 * support host names and IP addresses.
 */
@Generated
public class EgressNetworkPolicyInternetAccessPolicyInternetDestination {
  /** */
  @JsonProperty("destination")
  private String destination;

  /** */
  @JsonProperty("protocol")
  private
  EgressNetworkPolicyInternetAccessPolicyInternetDestinationInternetDestinationFilteringProtocol
      protocol;

  /** */
  @JsonProperty("type")
  private EgressNetworkPolicyInternetAccessPolicyInternetDestinationInternetDestinationType
      typeValue;

  public EgressNetworkPolicyInternetAccessPolicyInternetDestination setDestination(
      String destination) {
    this.destination = destination;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  public EgressNetworkPolicyInternetAccessPolicyInternetDestination setProtocol(
      EgressNetworkPolicyInternetAccessPolicyInternetDestinationInternetDestinationFilteringProtocol
          protocol) {
    this.protocol = protocol;
    return this;
  }

  public
  EgressNetworkPolicyInternetAccessPolicyInternetDestinationInternetDestinationFilteringProtocol
      getProtocol() {
    return protocol;
  }

  public EgressNetworkPolicyInternetAccessPolicyInternetDestination setType(
      EgressNetworkPolicyInternetAccessPolicyInternetDestinationInternetDestinationType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public EgressNetworkPolicyInternetAccessPolicyInternetDestinationInternetDestinationType
      getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicyInternetAccessPolicyInternetDestination that =
        (EgressNetworkPolicyInternetAccessPolicyInternetDestination) o;
    return Objects.equals(destination, that.destination)
        && Objects.equals(protocol, that.protocol)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, protocol, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyInternetAccessPolicyInternetDestination.class)
        .add("destination", destination)
        .add("protocol", protocol)
        .add("typeValue", typeValue)
        .toString();
  }
}
