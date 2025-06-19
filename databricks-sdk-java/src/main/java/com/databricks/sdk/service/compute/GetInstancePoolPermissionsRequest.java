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

/** Get instance pool permissions */
@Generated
@JsonSerialize(
    using = GetInstancePoolPermissionsRequest.GetInstancePoolPermissionsRequestSerializer.class)
@JsonDeserialize(
    using = GetInstancePoolPermissionsRequest.GetInstancePoolPermissionsRequestDeserializer.class)
public class GetInstancePoolPermissionsRequest {
  /** The instance pool for which to get or manage permissions. */
  private String instancePoolId;

  public GetInstancePoolPermissionsRequest setInstancePoolId(String instancePoolId) {
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
    GetInstancePoolPermissionsRequest that = (GetInstancePoolPermissionsRequest) o;
    return Objects.equals(instancePoolId, that.instancePoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instancePoolId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetInstancePoolPermissionsRequest.class)
        .add("instancePoolId", instancePoolId)
        .toString();
  }

  GetInstancePoolPermissionsRequestPb toPb() {
    GetInstancePoolPermissionsRequestPb pb = new GetInstancePoolPermissionsRequestPb();
    pb.setInstancePoolId(instancePoolId);

    return pb;
  }

  static GetInstancePoolPermissionsRequest fromPb(GetInstancePoolPermissionsRequestPb pb) {
    GetInstancePoolPermissionsRequest model = new GetInstancePoolPermissionsRequest();
    model.setInstancePoolId(pb.getInstancePoolId());

    return model;
  }

  public static class GetInstancePoolPermissionsRequestSerializer
      extends JsonSerializer<GetInstancePoolPermissionsRequest> {
    @Override
    public void serialize(
        GetInstancePoolPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetInstancePoolPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetInstancePoolPermissionsRequestDeserializer
      extends JsonDeserializer<GetInstancePoolPermissionsRequest> {
    @Override
    public GetInstancePoolPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetInstancePoolPermissionsRequestPb pb =
          mapper.readValue(p, GetInstancePoolPermissionsRequestPb.class);
      return GetInstancePoolPermissionsRequest.fromPb(pb);
    }
  }
}
