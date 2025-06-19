// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** Get instance pool permission levels */
@Generated
@JsonSerialize(
    using =
        GetInstancePoolPermissionLevelsRequest.GetInstancePoolPermissionLevelsRequestSerializer
            .class)
@JsonDeserialize(
    using =
        GetInstancePoolPermissionLevelsRequest.GetInstancePoolPermissionLevelsRequestDeserializer
            .class)
public class GetInstancePoolPermissionLevelsRequest {
  /** The instance pool for which to get or manage permissions. */
  private String instancePoolId;

  public GetInstancePoolPermissionLevelsRequest setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetInstancePoolPermissionLevelsRequest that = (GetInstancePoolPermissionLevelsRequest) o;
    return Objects.equals(instancePoolId, that.instancePoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instancePoolId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetInstancePoolPermissionLevelsRequest.class)
        .add("instancePoolId", instancePoolId)
        .toString();
  }

  GetInstancePoolPermissionLevelsRequestPb toPb() {
    GetInstancePoolPermissionLevelsRequestPb pb = new GetInstancePoolPermissionLevelsRequestPb();
    pb.setInstancePoolId(instancePoolId);

    return pb;
  }

  static GetInstancePoolPermissionLevelsRequest fromPb(
      GetInstancePoolPermissionLevelsRequestPb pb) {
    GetInstancePoolPermissionLevelsRequest model = new GetInstancePoolPermissionLevelsRequest();
    model.setInstancePoolId(pb.getInstancePoolId());

    return model;
  }

  public static class GetInstancePoolPermissionLevelsRequestSerializer
      extends JsonSerializer<GetInstancePoolPermissionLevelsRequest> {
    @Override
    public void serialize(
        GetInstancePoolPermissionLevelsRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GetInstancePoolPermissionLevelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetInstancePoolPermissionLevelsRequestDeserializer
      extends JsonDeserializer<GetInstancePoolPermissionLevelsRequest> {
    @Override
    public GetInstancePoolPermissionLevelsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetInstancePoolPermissionLevelsRequestPb pb =
          mapper.readValue(p, GetInstancePoolPermissionLevelsRequestPb.class);
      return GetInstancePoolPermissionLevelsRequest.fromPb(pb);
    }
  }
}
