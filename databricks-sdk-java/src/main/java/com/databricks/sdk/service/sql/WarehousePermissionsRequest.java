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
@JsonSerialize(using = WarehousePermissionsRequest.WarehousePermissionsRequestSerializer.class)
@JsonDeserialize(using = WarehousePermissionsRequest.WarehousePermissionsRequestDeserializer.class)
public class WarehousePermissionsRequest {
  /** */
  private Collection<WarehouseAccessControlRequest> accessControlList;

  /** The SQL warehouse for which to get or manage permissions. */
  private String warehouseId;

  public WarehousePermissionsRequest setAccessControlList(
      Collection<WarehouseAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<WarehouseAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public WarehousePermissionsRequest setWarehouseId(String warehouseId) {
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
    WarehousePermissionsRequest that = (WarehousePermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(WarehousePermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("warehouseId", warehouseId)
        .toString();
  }

  WarehousePermissionsRequestPb toPb() {
    WarehousePermissionsRequestPb pb = new WarehousePermissionsRequestPb();
    pb.setAccessControlList(accessControlList);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static WarehousePermissionsRequest fromPb(WarehousePermissionsRequestPb pb) {
    WarehousePermissionsRequest model = new WarehousePermissionsRequest();
    model.setAccessControlList(pb.getAccessControlList());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class WarehousePermissionsRequestSerializer
      extends JsonSerializer<WarehousePermissionsRequest> {
    @Override
    public void serialize(
        WarehousePermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WarehousePermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WarehousePermissionsRequestDeserializer
      extends JsonDeserializer<WarehousePermissionsRequest> {
    @Override
    public WarehousePermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WarehousePermissionsRequestPb pb = mapper.readValue(p, WarehousePermissionsRequestPb.class);
      return WarehousePermissionsRequest.fromPb(pb);
    }
  }
}
