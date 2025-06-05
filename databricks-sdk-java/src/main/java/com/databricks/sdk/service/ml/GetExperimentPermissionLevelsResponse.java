// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
        GetExperimentPermissionLevelsResponse.GetExperimentPermissionLevelsResponseSerializer.class)
@JsonDeserialize(
    using =
        GetExperimentPermissionLevelsResponse.GetExperimentPermissionLevelsResponseDeserializer
            .class)
public class GetExperimentPermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<ExperimentPermissionsDescription> permissionLevels;

  public GetExperimentPermissionLevelsResponse setPermissionLevels(
      Collection<ExperimentPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<ExperimentPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetExperimentPermissionLevelsResponse that = (GetExperimentPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExperimentPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetExperimentPermissionLevelsResponsePb toPb() {
    GetExperimentPermissionLevelsResponsePb pb = new GetExperimentPermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetExperimentPermissionLevelsResponse fromPb(GetExperimentPermissionLevelsResponsePb pb) {
    GetExperimentPermissionLevelsResponse model = new GetExperimentPermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetExperimentPermissionLevelsResponseSerializer
      extends JsonSerializer<GetExperimentPermissionLevelsResponse> {
    @Override
    public void serialize(
        GetExperimentPermissionLevelsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetExperimentPermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetExperimentPermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetExperimentPermissionLevelsResponse> {
    @Override
    public GetExperimentPermissionLevelsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetExperimentPermissionLevelsResponsePb pb =
          mapper.readValue(p, GetExperimentPermissionLevelsResponsePb.class);
      return GetExperimentPermissionLevelsResponse.fromPb(pb);
    }
  }
}
