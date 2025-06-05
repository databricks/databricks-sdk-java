// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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
@JsonSerialize(using = AppResourceSqlWarehouse.AppResourceSqlWarehouseSerializer.class)
@JsonDeserialize(using = AppResourceSqlWarehouse.AppResourceSqlWarehouseDeserializer.class)
public class AppResourceSqlWarehouse {
  /** Id of the SQL warehouse to grant permission on. */
  private String id;

  /**
   * Permission to grant on the SQL warehouse. Supported permissions are: "CAN_MANAGE", "CAN_USE",
   * "IS_OWNER".
   */
  private AppResourceSqlWarehouseSqlWarehousePermission permission;

  public AppResourceSqlWarehouse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public AppResourceSqlWarehouse setPermission(
      AppResourceSqlWarehouseSqlWarehousePermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceSqlWarehouseSqlWarehousePermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceSqlWarehouse that = (AppResourceSqlWarehouse) o;
    return Objects.equals(id, that.id) && Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceSqlWarehouse.class)
        .add("id", id)
        .add("permission", permission)
        .toString();
  }

  AppResourceSqlWarehousePb toPb() {
    AppResourceSqlWarehousePb pb = new AppResourceSqlWarehousePb();
    pb.setId(id);
    pb.setPermission(permission);

    return pb;
  }

  static AppResourceSqlWarehouse fromPb(AppResourceSqlWarehousePb pb) {
    AppResourceSqlWarehouse model = new AppResourceSqlWarehouse();
    model.setId(pb.getId());
    model.setPermission(pb.getPermission());

    return model;
  }

  public static class AppResourceSqlWarehouseSerializer
      extends JsonSerializer<AppResourceSqlWarehouse> {
    @Override
    public void serialize(
        AppResourceSqlWarehouse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AppResourceSqlWarehousePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AppResourceSqlWarehouseDeserializer
      extends JsonDeserializer<AppResourceSqlWarehouse> {
    @Override
    public AppResourceSqlWarehouse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AppResourceSqlWarehousePb pb = mapper.readValue(p, AppResourceSqlWarehousePb.class);
      return AppResourceSqlWarehouse.fromPb(pb);
    }
  }
}
