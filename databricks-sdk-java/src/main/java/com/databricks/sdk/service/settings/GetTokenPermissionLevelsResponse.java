// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
    using = GetTokenPermissionLevelsResponse.GetTokenPermissionLevelsResponseSerializer.class)
@JsonDeserialize(
    using = GetTokenPermissionLevelsResponse.GetTokenPermissionLevelsResponseDeserializer.class)
public class GetTokenPermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<TokenPermissionsDescription> permissionLevels;

  public GetTokenPermissionLevelsResponse setPermissionLevels(
      Collection<TokenPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<TokenPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetTokenPermissionLevelsResponse that = (GetTokenPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetTokenPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetTokenPermissionLevelsResponsePb toPb() {
    GetTokenPermissionLevelsResponsePb pb = new GetTokenPermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetTokenPermissionLevelsResponse fromPb(GetTokenPermissionLevelsResponsePb pb) {
    GetTokenPermissionLevelsResponse model = new GetTokenPermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetTokenPermissionLevelsResponseSerializer
      extends JsonSerializer<GetTokenPermissionLevelsResponse> {
    @Override
    public void serialize(
        GetTokenPermissionLevelsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetTokenPermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetTokenPermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetTokenPermissionLevelsResponse> {
    @Override
    public GetTokenPermissionLevelsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetTokenPermissionLevelsResponsePb pb =
          mapper.readValue(p, GetTokenPermissionLevelsResponsePb.class);
      return GetTokenPermissionLevelsResponse.fromPb(pb);
    }
  }
}
