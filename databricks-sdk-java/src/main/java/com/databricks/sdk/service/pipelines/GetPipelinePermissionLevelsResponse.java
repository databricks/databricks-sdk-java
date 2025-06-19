// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
    using = GetPipelinePermissionLevelsResponse.GetPipelinePermissionLevelsResponseSerializer.class)
@JsonDeserialize(
    using =
        GetPipelinePermissionLevelsResponse.GetPipelinePermissionLevelsResponseDeserializer.class)
public class GetPipelinePermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<PipelinePermissionsDescription> permissionLevels;

  public GetPipelinePermissionLevelsResponse setPermissionLevels(
      Collection<PipelinePermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<PipelinePermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPipelinePermissionLevelsResponse that = (GetPipelinePermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPipelinePermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetPipelinePermissionLevelsResponsePb toPb() {
    GetPipelinePermissionLevelsResponsePb pb = new GetPipelinePermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetPipelinePermissionLevelsResponse fromPb(GetPipelinePermissionLevelsResponsePb pb) {
    GetPipelinePermissionLevelsResponse model = new GetPipelinePermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetPipelinePermissionLevelsResponseSerializer
      extends JsonSerializer<GetPipelinePermissionLevelsResponse> {
    @Override
    public void serialize(
        GetPipelinePermissionLevelsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPipelinePermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPipelinePermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetPipelinePermissionLevelsResponse> {
    @Override
    public GetPipelinePermissionLevelsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPipelinePermissionLevelsResponsePb pb =
          mapper.readValue(p, GetPipelinePermissionLevelsResponsePb.class);
      return GetPipelinePermissionLevelsResponse.fromPb(pb);
    }
  }
}
