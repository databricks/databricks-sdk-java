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
 * support domain name (FQDN) destinations for the time being, though going forwards we want to
 * support host names and IP addresses.
 */
@Generated
@JsonSerialize(
    using =
        EgressNetworkPolicyInternetAccessPolicyInternetDestination
            .EgressNetworkPolicyInternetAccessPolicyInternetDestinationSerializer.class)
@JsonDeserialize(
    using =
        EgressNetworkPolicyInternetAccessPolicyInternetDestination
            .EgressNetworkPolicyInternetAccessPolicyInternetDestinationDeserializer.class)
public class EgressNetworkPolicyInternetAccessPolicyInternetDestination {
  /** */
  private String destination;

  /**
   * The filtering protocol used by the DP. For private and public preview, SEG will only support
   * TCP filtering (i.e. DNS based filtering, filtering by destination IP address), so protocol will
   * be set to TCP by default and hidden from the user. In the future, users may be able to select
   * HTTP filtering (i.e. SNI based filtering, filtering by FQDN).
   */
  private
  EgressNetworkPolicyInternetAccessPolicyInternetDestinationInternetDestinationFilteringProtocol
      protocol;

  /** */
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

  EgressNetworkPolicyInternetAccessPolicyInternetDestinationPb toPb() {
    EgressNetworkPolicyInternetAccessPolicyInternetDestinationPb pb =
        new EgressNetworkPolicyInternetAccessPolicyInternetDestinationPb();
    pb.setDestination(destination);
    pb.setProtocol(protocol);
    pb.setType(typeValue);

    return pb;
  }

  static EgressNetworkPolicyInternetAccessPolicyInternetDestination fromPb(
      EgressNetworkPolicyInternetAccessPolicyInternetDestinationPb pb) {
    EgressNetworkPolicyInternetAccessPolicyInternetDestination model =
        new EgressNetworkPolicyInternetAccessPolicyInternetDestination();
    model.setDestination(pb.getDestination());
    model.setProtocol(pb.getProtocol());
    model.setType(pb.getType());

    return model;
  }

  public static class EgressNetworkPolicyInternetAccessPolicyInternetDestinationSerializer
      extends JsonSerializer<EgressNetworkPolicyInternetAccessPolicyInternetDestination> {
    @Override
    public void serialize(
        EgressNetworkPolicyInternetAccessPolicyInternetDestination value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      EgressNetworkPolicyInternetAccessPolicyInternetDestinationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EgressNetworkPolicyInternetAccessPolicyInternetDestinationDeserializer
      extends JsonDeserializer<EgressNetworkPolicyInternetAccessPolicyInternetDestination> {
    @Override
    public EgressNetworkPolicyInternetAccessPolicyInternetDestination deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EgressNetworkPolicyInternetAccessPolicyInternetDestinationPb pb =
          mapper.readValue(p, EgressNetworkPolicyInternetAccessPolicyInternetDestinationPb.class);
      return EgressNetworkPolicyInternetAccessPolicyInternetDestination.fromPb(pb);
    }
  }
}
