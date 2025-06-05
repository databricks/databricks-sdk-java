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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using = GetAppPermissionLevelsResponse.GetAppPermissionLevelsResponseSerializer.class)
@JsonDeserialize(
    using = GetAppPermissionLevelsResponse.GetAppPermissionLevelsResponseDeserializer.class)
public class GetAppPermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<AppPermissionsDescription> permissionLevels;

  public GetAppPermissionLevelsResponse setPermissionLevels(
      Collection<AppPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<AppPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAppPermissionLevelsResponse that = (GetAppPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAppPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetAppPermissionLevelsResponsePb toPb() {
    GetAppPermissionLevelsResponsePb pb = new GetAppPermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetAppPermissionLevelsResponse fromPb(GetAppPermissionLevelsResponsePb pb) {
    GetAppPermissionLevelsResponse model = new GetAppPermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetAppPermissionLevelsResponseSerializer
      extends JsonSerializer<GetAppPermissionLevelsResponse> {
    @Override
    public void serialize(
        GetAppPermissionLevelsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAppPermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAppPermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetAppPermissionLevelsResponse> {
    @Override
    public GetAppPermissionLevelsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAppPermissionLevelsResponsePb pb =
          mapper.readValue(p, GetAppPermissionLevelsResponsePb.class);
      return GetAppPermissionLevelsResponse.fromPb(pb);
    }
  }
}
