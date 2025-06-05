// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
    using = GetJobPermissionLevelsResponse.GetJobPermissionLevelsResponseSerializer.class)
@JsonDeserialize(
    using = GetJobPermissionLevelsResponse.GetJobPermissionLevelsResponseDeserializer.class)
public class GetJobPermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<JobPermissionsDescription> permissionLevels;

  public GetJobPermissionLevelsResponse setPermissionLevels(
      Collection<JobPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<JobPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetJobPermissionLevelsResponse that = (GetJobPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetJobPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetJobPermissionLevelsResponsePb toPb() {
    GetJobPermissionLevelsResponsePb pb = new GetJobPermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetJobPermissionLevelsResponse fromPb(GetJobPermissionLevelsResponsePb pb) {
    GetJobPermissionLevelsResponse model = new GetJobPermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetJobPermissionLevelsResponseSerializer
      extends JsonSerializer<GetJobPermissionLevelsResponse> {
    @Override
    public void serialize(
        GetJobPermissionLevelsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetJobPermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetJobPermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetJobPermissionLevelsResponse> {
    @Override
    public GetJobPermissionLevelsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetJobPermissionLevelsResponsePb pb =
          mapper.readValue(p, GetJobPermissionLevelsResponsePb.class);
      return GetJobPermissionLevelsResponse.fromPb(pb);
    }
  }
}
