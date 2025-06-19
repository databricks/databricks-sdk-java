// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = ListAvailableZonesResponse.ListAvailableZonesResponseSerializer.class)
@JsonDeserialize(using = ListAvailableZonesResponse.ListAvailableZonesResponseDeserializer.class)
public class ListAvailableZonesResponse {
  /** The availability zone if no ``zone_id`` is provided in the cluster creation request. */
  private String defaultZone;

  /** The list of available zones (e.g., ['us-west-2c', 'us-east-2']). */
  private Collection<String> zones;

  public ListAvailableZonesResponse setDefaultZone(String defaultZone) {
    this.defaultZone = defaultZone;
    return this;
  }

  public String getDefaultZone() {
    return defaultZone;
  }

  public ListAvailableZonesResponse setZones(Collection<String> zones) {
    this.zones = zones;
    return this;
  }

  public Collection<String> getZones() {
    return zones;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAvailableZonesResponse that = (ListAvailableZonesResponse) o;
    return Objects.equals(defaultZone, that.defaultZone) && Objects.equals(zones, that.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultZone, zones);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAvailableZonesResponse.class)
        .add("defaultZone", defaultZone)
        .add("zones", zones)
        .toString();
  }

  ListAvailableZonesResponsePb toPb() {
    ListAvailableZonesResponsePb pb = new ListAvailableZonesResponsePb();
    pb.setDefaultZone(defaultZone);
    pb.setZones(zones);

    return pb;
  }

  static ListAvailableZonesResponse fromPb(ListAvailableZonesResponsePb pb) {
    ListAvailableZonesResponse model = new ListAvailableZonesResponse();
    model.setDefaultZone(pb.getDefaultZone());
    model.setZones(pb.getZones());

    return model;
  }

  public static class ListAvailableZonesResponseSerializer
      extends JsonSerializer<ListAvailableZonesResponse> {
    @Override
    public void serialize(
        ListAvailableZonesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAvailableZonesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAvailableZonesResponseDeserializer
      extends JsonDeserializer<ListAvailableZonesResponse> {
    @Override
    public ListAvailableZonesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAvailableZonesResponsePb pb = mapper.readValue(p, ListAvailableZonesResponsePb.class);
      return ListAvailableZonesResponse.fromPb(pb);
    }
  }
}
