// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

/**
 * Users can specify accessible internet destinations when outbound access is restricted. We only
 * support DNS_NAME (FQDN format) destinations for the time being. Going forward we may extend
 * support to host names and IP addresses.
 */
@Generated
@JsonSerialize(
    using =
        EgressNetworkPolicyNetworkAccessPolicyInternetDestination
            .EgressNetworkPolicyNetworkAccessPolicyInternetDestinationSerializer.class)
@JsonDeserialize(
    using =
        EgressNetworkPolicyNetworkAccessPolicyInternetDestination
            .EgressNetworkPolicyNetworkAccessPolicyInternetDestinationDeserializer.class)
public class EgressNetworkPolicyNetworkAccessPolicyInternetDestination {
  /**
   * The internet destination to which access will be allowed. Format dependent on the destination
   * type.
   */
  private String destination;

  /** The type of internet destination. Currently only DNS_NAME is supported. */
  private EgressNetworkPolicyNetworkAccessPolicyInternetDestinationInternetDestinationType
      internetDestinationType;

  public EgressNetworkPolicyNetworkAccessPolicyInternetDestination setDestination(
      String destination) {
    this.destination = destination;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  public EgressNetworkPolicyNetworkAccessPolicyInternetDestination setInternetDestinationType(
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
    EgressNetworkPolicyNetworkAccessPolicyInternetDestination that =
        (EgressNetworkPolicyNetworkAccessPolicyInternetDestination) o;
    return Objects.equals(destination, that.destination)
        && Objects.equals(internetDestinationType, that.internetDestinationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, internetDestinationType);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyNetworkAccessPolicyInternetDestination.class)
        .add("destination", destination)
        .add("internetDestinationType", internetDestinationType)
        .toString();
  }

  EgressNetworkPolicyNetworkAccessPolicyInternetDestinationPb toPb() {
    EgressNetworkPolicyNetworkAccessPolicyInternetDestinationPb pb =
        new EgressNetworkPolicyNetworkAccessPolicyInternetDestinationPb();
    pb.setDestination(destination);
    pb.setInternetDestinationType(internetDestinationType);

    return pb;
  }

  static EgressNetworkPolicyNetworkAccessPolicyInternetDestination fromPb(
      EgressNetworkPolicyNetworkAccessPolicyInternetDestinationPb pb) {
    EgressNetworkPolicyNetworkAccessPolicyInternetDestination model =
        new EgressNetworkPolicyNetworkAccessPolicyInternetDestination();
    model.setDestination(pb.getDestination());
    model.setInternetDestinationType(pb.getInternetDestinationType());

    return model;
  }

  public static class EgressNetworkPolicyNetworkAccessPolicyInternetDestinationSerializer
      extends JsonSerializer<EgressNetworkPolicyNetworkAccessPolicyInternetDestination> {
    @Override
    public void serialize(
        EgressNetworkPolicyNetworkAccessPolicyInternetDestination value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      EgressNetworkPolicyNetworkAccessPolicyInternetDestinationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EgressNetworkPolicyNetworkAccessPolicyInternetDestinationDeserializer
      extends JsonDeserializer<EgressNetworkPolicyNetworkAccessPolicyInternetDestination> {
    @Override
    public EgressNetworkPolicyNetworkAccessPolicyInternetDestination deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EgressNetworkPolicyNetworkAccessPolicyInternetDestinationPb pb =
          mapper.readValue(p, EgressNetworkPolicyNetworkAccessPolicyInternetDestinationPb.class);
      return EgressNetworkPolicyNetworkAccessPolicyInternetDestination.fromPb(pb);
    }
  }
}
