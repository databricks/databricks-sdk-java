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

/** Get SQL warehouse permission levels */
@Generated
@JsonSerialize(
    using = GetWarehousePermissionLevelsRequest.GetWarehousePermissionLevelsRequestSerializer.class)
@JsonDeserialize(
    using =
        GetWarehousePermissionLevelsRequest.GetWarehousePermissionLevelsRequestDeserializer.class)
public class GetWarehousePermissionLevelsRequest {
  /** The SQL warehouse for which to get or manage permissions. */
  private String warehouseId;

  public GetWarehousePermissionLevelsRequest setWarehouseId(String warehouseId) {
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
    GetWarehousePermissionLevelsRequest that = (GetWarehousePermissionLevelsRequest) o;
    return Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWarehousePermissionLevelsRequest.class)
        .add("warehouseId", warehouseId)
        .toString();
  }

  GetWarehousePermissionLevelsRequestPb toPb() {
    GetWarehousePermissionLevelsRequestPb pb = new GetWarehousePermissionLevelsRequestPb();
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static GetWarehousePermissionLevelsRequest fromPb(GetWarehousePermissionLevelsRequestPb pb) {
    GetWarehousePermissionLevelsRequest model = new GetWarehousePermissionLevelsRequest();
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class GetWarehousePermissionLevelsRequestSerializer
      extends JsonSerializer<GetWarehousePermissionLevelsRequest> {
    @Override
    public void serialize(
        GetWarehousePermissionLevelsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetWarehousePermissionLevelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetWarehousePermissionLevelsRequestDeserializer
      extends JsonDeserializer<GetWarehousePermissionLevelsRequest> {
    @Override
    public GetWarehousePermissionLevelsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetWarehousePermissionLevelsRequestPb pb =
          mapper.readValue(p, GetWarehousePermissionLevelsRequestPb.class);
      return GetWarehousePermissionLevelsRequest.fromPb(pb);
    }
  }
}
