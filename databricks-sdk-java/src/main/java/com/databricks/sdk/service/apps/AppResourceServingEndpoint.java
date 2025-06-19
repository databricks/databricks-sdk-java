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
@JsonSerialize(using = AppResourceServingEndpoint.AppResourceServingEndpointSerializer.class)
@JsonDeserialize(using = AppResourceServingEndpoint.AppResourceServingEndpointDeserializer.class)
public class AppResourceServingEndpoint {
  /** Name of the serving endpoint to grant permission on. */
  private String name;

  /**
   * Permission to grant on the serving endpoint. Supported permissions are: "CAN_MANAGE",
   * "CAN_QUERY", "CAN_VIEW".
   */
  private AppResourceServingEndpointServingEndpointPermission permission;

  public AppResourceServingEndpoint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AppResourceServingEndpoint setPermission(
      AppResourceServingEndpointServingEndpointPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceServingEndpointServingEndpointPermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceServingEndpoint that = (AppResourceServingEndpoint) o;
    return Objects.equals(name, that.name) && Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceServingEndpoint.class)
        .add("name", name)
        .add("permission", permission)
        .toString();
  }

  AppResourceServingEndpointPb toPb() {
    AppResourceServingEndpointPb pb = new AppResourceServingEndpointPb();
    pb.setName(name);
    pb.setPermission(permission);

    return pb;
  }

  static AppResourceServingEndpoint fromPb(AppResourceServingEndpointPb pb) {
    AppResourceServingEndpoint model = new AppResourceServingEndpoint();
    model.setName(pb.getName());
    model.setPermission(pb.getPermission());

    return model;
  }

  public static class AppResourceServingEndpointSerializer
      extends JsonSerializer<AppResourceServingEndpoint> {
    @Override
    public void serialize(
        AppResourceServingEndpoint value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AppResourceServingEndpointPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AppResourceServingEndpointDeserializer
      extends JsonDeserializer<AppResourceServingEndpoint> {
    @Override
    public AppResourceServingEndpoint deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AppResourceServingEndpointPb pb = mapper.readValue(p, AppResourceServingEndpointPb.class);
      return AppResourceServingEndpoint.fromPb(pb);
    }
  }
}
