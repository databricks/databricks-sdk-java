// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Users can specify accessible internet destinations when outbound access is restricted. We only
 * support DNS_NAME (FQDN format) destinations for the time being. Going forward we may extend
 * support to host names and IP addresses.
 */
@Generated
class EgressNetworkPolicyNetworkAccessPolicyInternetDestinationPb {
  @JsonProperty("destination")
  private String destination;

  @JsonProperty("internet_destination_type")
  private EgressNetworkPolicyNetworkAccessPolicyInternetDestinationInternetDestinationType
      internetDestinationType;

  public EgressNetworkPolicyNetworkAccessPolicyInternetDestinationPb setDestination(
      String destination) {
    this.destination = destination;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  public EgressNetworkPolicyNetworkAccessPolicyInternetDestinationPb setInternetDestinationType(
      EgressNetworkPolicyNetworkAccessPolicyInternetDestinationInternetDestinationType
          internetDestinationType) {
    this.internetDestinationType = internetDestinationType;
    return this;
  }

  public EgressNetworkPolicyNetworkAccessPolicyInternetDestinationInternetDestinationType
      getInternetDestinationType() {
    return internetDestinationType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicyNetworkAccessPolicyInternetDestinationPb that =
        (EgressNetworkPolicyNetworkAccessPolicyInternetDestinationPb) o;
    return Objects.equals(destination, that.destination)
        && Objects.equals(internetDestinationType, that.internetDestinationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, internetDestinationType);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyNetworkAccessPolicyInternetDestinationPb.class)
        .add("destination", destination)
        .add("internetDestinationType", internetDestinationType)
        .toString();
  }
}
