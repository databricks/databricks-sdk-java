// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = RepeatedEndpointConfPairs.RepeatedEndpointConfPairsSerializer.class)
@JsonDeserialize(using = RepeatedEndpointConfPairs.RepeatedEndpointConfPairsDeserializer.class)
public class RepeatedEndpointConfPairs {
  /** Deprecated: Use configuration_pairs */
  private Collection<EndpointConfPair> configPair;

  /** */
  private Collection<EndpointConfPair> configurationPairs;

  public RepeatedEndpointConfPairs setConfigPair(Collection<EndpointConfPair> configPair) {
    this.configPair = configPair;
    return this;
  }

  public Collection<EndpointConfPair> getConfigPair() {
    return configPair;
  }

  public RepeatedEndpointConfPairs setConfigurationPairs(
      Collection<EndpointConfPair> configurationPairs) {
    this.configurationPairs = configurationPairs;
    return this;
  }

  public Collection<EndpointConfPair> getConfigurationPairs() {
    return configurationPairs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepeatedEndpointConfPairs that = (RepeatedEndpointConfPairs) o;
    return Objects.equals(configPair, that.configPair)
        && Objects.equals(configurationPairs, that.configurationPairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configPair, configurationPairs);
  }

  @Override
  public String toString() {
    return new ToStringer(RepeatedEndpointConfPairs.class)
        .add("configPair", configPair)
        .add("configurationPairs", configurationPairs)
        .toString();
  }

  RepeatedEndpointConfPairsPb toPb() {
    RepeatedEndpointConfPairsPb pb = new RepeatedEndpointConfPairsPb();
    pb.setConfigPair(configPair);
    pb.setConfigurationPairs(configurationPairs);

    return pb;
  }

  static RepeatedEndpointConfPairs fromPb(RepeatedEndpointConfPairsPb pb) {
    RepeatedEndpointConfPairs model = new RepeatedEndpointConfPairs();
    model.setConfigPair(pb.getConfigPair());
    model.setConfigurationPairs(pb.getConfigurationPairs());

    return model;
  }

  public static class RepeatedEndpointConfPairsSerializer
      extends JsonSerializer<RepeatedEndpointConfPairs> {
    @Override
    public void serialize(
        RepeatedEndpointConfPairs value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RepeatedEndpointConfPairsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RepeatedEndpointConfPairsDeserializer
      extends JsonDeserializer<RepeatedEndpointConfPairs> {
    @Override
    public RepeatedEndpointConfPairs deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RepeatedEndpointConfPairsPb pb = mapper.readValue(p, RepeatedEndpointConfPairsPb.class);
      return RepeatedEndpointConfPairs.fromPb(pb);
    }
  }
}
