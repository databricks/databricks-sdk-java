// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
@JsonSerialize(using = TrafficConfig.TrafficConfigSerializer.class)
@JsonDeserialize(using = TrafficConfig.TrafficConfigDeserializer.class)
public class TrafficConfig {
  /** The list of routes that define traffic to each served entity. */
  private Collection<Route> routes;

  public TrafficConfig setRoutes(Collection<Route> routes) {
    this.routes = routes;
    return this;
  }

  public Collection<Route> getRoutes() {
    return routes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TrafficConfig that = (TrafficConfig) o;
    return Objects.equals(routes, that.routes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routes);
  }

  @Override
  public String toString() {
    return new ToStringer(TrafficConfig.class).add("routes", routes).toString();
  }

  TrafficConfigPb toPb() {
    TrafficConfigPb pb = new TrafficConfigPb();
    pb.setRoutes(routes);

    return pb;
  }

  static TrafficConfig fromPb(TrafficConfigPb pb) {
    TrafficConfig model = new TrafficConfig();
    model.setRoutes(pb.getRoutes());

    return model;
  }

  public static class TrafficConfigSerializer extends JsonSerializer<TrafficConfig> {
    @Override
    public void serialize(TrafficConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TrafficConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TrafficConfigDeserializer extends JsonDeserializer<TrafficConfig> {
    @Override
    public TrafficConfig deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TrafficConfigPb pb = mapper.readValue(p, TrafficConfigPb.class);
      return TrafficConfig.fromPb(pb);
    }
  }
}
