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

/** Get SQL warehouse permissions */
@Generated
@JsonSerialize(
    using = GetWarehousePermissionsRequest.GetWarehousePermissionsRequestSerializer.class)
@JsonDeserialize(
    using = GetWarehousePermissionsRequest.GetWarehousePermissionsRequestDeserializer.class)
public class GetWarehousePermissionsRequest {
  /** The SQL warehouse for which to get or manage permissions. */
  private String warehouseId;

  public GetWarehousePermissionsRequest setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetWarehousePermissionsRequest that = (GetWarehousePermissionsRequest) o;
    return Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWarehousePermissionsRequest.class)
        .add("warehouseId", warehouseId)
        .toString();
  }

  GetWarehousePermissionsRequestPb toPb() {
    GetWarehousePermissionsRequestPb pb = new GetWarehousePermissionsRequestPb();
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static GetWarehousePermissionsRequest fromPb(GetWarehousePermissionsRequestPb pb) {
    GetWarehousePermissionsRequest model = new GetWarehousePermissionsRequest();
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class GetWarehousePermissionsRequestSerializer
      extends JsonSerializer<GetWarehousePermissionsRequest> {
    @Override
    public void serialize(
        GetWarehousePermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetWarehousePermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetWarehousePermissionsRequestDeserializer
      extends JsonDeserializer<GetWarehousePermissionsRequest> {
    @Override
    public GetWarehousePermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetWarehousePermissionsRequestPb pb =
          mapper.readValue(p, GetWarehousePermissionsRequestPb.class);
      return GetWarehousePermissionsRequest.fromPb(pb);
    }
  }
}
