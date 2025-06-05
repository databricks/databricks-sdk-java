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
@JsonSerialize(
    using =
        GetWarehousePermissionLevelsResponse.GetWarehousePermissionLevelsResponseSerializer.class)
@JsonDeserialize(
    using =
        GetWarehousePermissionLevelsResponse.GetWarehousePermissionLevelsResponseDeserializer.class)
public class GetWarehousePermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<WarehousePermissionsDescription> permissionLevels;

  public GetWarehousePermissionLevelsResponse setPermissionLevels(
      Collection<WarehousePermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<WarehousePermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetWarehousePermissionLevelsResponse that = (GetWarehousePermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWarehousePermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetWarehousePermissionLevelsResponsePb toPb() {
    GetWarehousePermissionLevelsResponsePb pb = new GetWarehousePermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetWarehousePermissionLevelsResponse fromPb(GetWarehousePermissionLevelsResponsePb pb) {
    GetWarehousePermissionLevelsResponse model = new GetWarehousePermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetWarehousePermissionLevelsResponseSerializer
      extends JsonSerializer<GetWarehousePermissionLevelsResponse> {
    @Override
    public void serialize(
        GetWarehousePermissionLevelsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetWarehousePermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetWarehousePermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetWarehousePermissionLevelsResponse> {
    @Override
    public GetWarehousePermissionLevelsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetWarehousePermissionLevelsResponsePb pb =
          mapper.readValue(p, GetWarehousePermissionLevelsResponsePb.class);
      return GetWarehousePermissionLevelsResponse.fromPb(pb);
    }
  }
}
