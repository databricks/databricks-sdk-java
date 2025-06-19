// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
@JsonSerialize(using = GetPermissionLevelsResponse.GetPermissionLevelsResponseSerializer.class)
@JsonDeserialize(using = GetPermissionLevelsResponse.GetPermissionLevelsResponseDeserializer.class)
public class GetPermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<PermissionsDescription> permissionLevels;

  public GetPermissionLevelsResponse setPermissionLevels(
      Collection<PermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<PermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPermissionLevelsResponse that = (GetPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetPermissionLevelsResponsePb toPb() {
    GetPermissionLevelsResponsePb pb = new GetPermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetPermissionLevelsResponse fromPb(GetPermissionLevelsResponsePb pb) {
    GetPermissionLevelsResponse model = new GetPermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetPermissionLevelsResponseSerializer
      extends JsonSerializer<GetPermissionLevelsResponse> {
    @Override
    public void serialize(
        GetPermissionLevelsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetPermissionLevelsResponse> {
    @Override
    public GetPermissionLevelsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPermissionLevelsResponsePb pb = mapper.readValue(p, GetPermissionLevelsResponsePb.class);
      return GetPermissionLevelsResponse.fromPb(pb);
    }
  }
}
