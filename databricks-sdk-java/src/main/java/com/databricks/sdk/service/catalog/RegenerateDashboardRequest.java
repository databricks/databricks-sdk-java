// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = RegenerateDashboardRequest.RegenerateDashboardRequestSerializer.class)
@JsonDeserialize(using = RegenerateDashboardRequest.RegenerateDashboardRequestDeserializer.class)
public class RegenerateDashboardRequest {
  /** Full name of the table. */
  private String tableName;

  /**
   * Optional argument to specify the warehouse for dashboard regeneration. If not specified, the
   * first running warehouse will be used.
   */
  private String warehouseId;

  public RegenerateDashboardRequest setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  public RegenerateDashboardRequest setWarehouseId(String warehouseId) {
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
    RegenerateDashboardRequest that = (RegenerateDashboardRequest) o;
    return Objects.equals(tableName, that.tableName)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(RegenerateDashboardRequest.class)
        .add("tableName", tableName)
        .add("warehouseId", warehouseId)
        .toString();
  }

  RegenerateDashboardRequestPb toPb() {
    RegenerateDashboardRequestPb pb = new RegenerateDashboardRequestPb();
    pb.setTableName(tableName);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static RegenerateDashboardRequest fromPb(RegenerateDashboardRequestPb pb) {
    RegenerateDashboardRequest model = new RegenerateDashboardRequest();
    model.setTableName(pb.getTableName());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class RegenerateDashboardRequestSerializer
      extends JsonSerializer<RegenerateDashboardRequest> {
    @Override
    public void serialize(
        RegenerateDashboardRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RegenerateDashboardRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RegenerateDashboardRequestDeserializer
      extends JsonDeserializer<RegenerateDashboardRequest> {
    @Override
    public RegenerateDashboardRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RegenerateDashboardRequestPb pb = mapper.readValue(p, RegenerateDashboardRequestPb.class);
      return RegenerateDashboardRequest.fromPb(pb);
    }
  }
}
