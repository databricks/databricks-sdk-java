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
import java.util.Objects;

/** List warehouses */
@Generated
@JsonSerialize(using = ListWarehousesRequest.ListWarehousesRequestSerializer.class)
@JsonDeserialize(using = ListWarehousesRequest.ListWarehousesRequestDeserializer.class)
public class ListWarehousesRequest {
  /**
   * Service Principal which will be used to fetch the list of warehouses. If not specified, the
   * user from the session header is used.
   */
  private Long runAsUserId;

  public ListWarehousesRequest setRunAsUserId(Long runAsUserId) {
    this.runAsUserId = runAsUserId;
    return this;
  }

  public Long getRunAsUserId() {
    return runAsUserId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWarehousesRequest that = (ListWarehousesRequest) o;
    return Objects.equals(runAsUserId, that.runAsUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runAsUserId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWarehousesRequest.class).add("runAsUserId", runAsUserId).toString();
  }

  ListWarehousesRequestPb toPb() {
    ListWarehousesRequestPb pb = new ListWarehousesRequestPb();
    pb.setRunAsUserId(runAsUserId);

    return pb;
  }

  static ListWarehousesRequest fromPb(ListWarehousesRequestPb pb) {
    ListWarehousesRequest model = new ListWarehousesRequest();
    model.setRunAsUserId(pb.getRunAsUserId());

    return model;
  }

  public static class ListWarehousesRequestSerializer
      extends JsonSerializer<ListWarehousesRequest> {
    @Override
    public void serialize(
        ListWarehousesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListWarehousesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListWarehousesRequestDeserializer
      extends JsonDeserializer<ListWarehousesRequest> {
    @Override
    public ListWarehousesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListWarehousesRequestPb pb = mapper.readValue(p, ListWarehousesRequestPb.class);
      return ListWarehousesRequest.fromPb(pb);
    }
  }
}
