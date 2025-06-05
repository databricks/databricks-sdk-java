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
@JsonSerialize(using = ListWarehousesResponse.ListWarehousesResponseSerializer.class)
@JsonDeserialize(using = ListWarehousesResponse.ListWarehousesResponseDeserializer.class)
public class ListWarehousesResponse {
  /** A list of warehouses and their configurations. */
  private Collection<EndpointInfo> warehouses;

  public ListWarehousesResponse setWarehouses(Collection<EndpointInfo> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  public Collection<EndpointInfo> getWarehouses() {
    return warehouses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWarehousesResponse that = (ListWarehousesResponse) o;
    return Objects.equals(warehouses, that.warehouses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouses);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWarehousesResponse.class).add("warehouses", warehouses).toString();
  }

  ListWarehousesResponsePb toPb() {
    ListWarehousesResponsePb pb = new ListWarehousesResponsePb();
    pb.setWarehouses(warehouses);

    return pb;
  }

  static ListWarehousesResponse fromPb(ListWarehousesResponsePb pb) {
    ListWarehousesResponse model = new ListWarehousesResponse();
    model.setWarehouses(pb.getWarehouses());

    return model;
  }

  public static class ListWarehousesResponseSerializer
      extends JsonSerializer<ListWarehousesResponse> {
    @Override
    public void serialize(
        ListWarehousesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListWarehousesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListWarehousesResponseDeserializer
      extends JsonDeserializer<ListWarehousesResponse> {
    @Override
    public ListWarehousesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListWarehousesResponsePb pb = mapper.readValue(p, ListWarehousesResponsePb.class);
      return ListWarehousesResponse.fromPb(pb);
    }
  }
}
