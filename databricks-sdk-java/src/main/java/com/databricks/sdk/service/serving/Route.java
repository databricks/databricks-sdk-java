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
import java.util.Objects;

@Generated
@JsonSerialize(using = Route.RouteSerializer.class)
@JsonDeserialize(using = Route.RouteDeserializer.class)
public class Route {
  /** The name of the served model this route configures traffic for. */
  private String servedModelName;

  /**
   * The percentage of endpoint traffic to send to this route. It must be an integer between 0 and
   * 100 inclusive.
   */
  private Long trafficPercentage;

  public Route setServedModelName(String servedModelName) {
    this.servedModelName = servedModelName;
    return this;
  }

  public String getServedModelName() {
    return servedModelName;
  }

  public Route setTrafficPercentage(Long trafficPercentage) {
    this.trafficPercentage = trafficPercentage;
    return this;
  }

  public Long getTrafficPercentage() {
    return trafficPercentage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Route that = (Route) o;
    return Objects.equals(servedModelName, that.servedModelName)
        && Objects.equals(trafficPercentage, that.trafficPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servedModelName, trafficPercentage);
  }

  @Override
  public String toString() {
    return new ToStringer(Route.class)
        .add("servedModelName", servedModelName)
        .add("trafficPercentage", trafficPercentage)
        .toString();
  }

  RoutePb toPb() {
    RoutePb pb = new RoutePb();
    pb.setServedModelName(servedModelName);
    pb.setTrafficPercentage(trafficPercentage);

    return pb;
  }

  static Route fromPb(RoutePb pb) {
    Route model = new Route();
    model.setServedModelName(pb.getServedModelName());
    model.setTrafficPercentage(pb.getTrafficPercentage());

    return model;
  }

  public static class RouteSerializer extends JsonSerializer<Route> {
    @Override
    public void serialize(Route value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RoutePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RouteDeserializer extends JsonDeserializer<Route> {
    @Override
    public Route deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RoutePb pb = mapper.readValue(p, RoutePb.class);
      return Route.fromPb(pb);
    }
  }
}
