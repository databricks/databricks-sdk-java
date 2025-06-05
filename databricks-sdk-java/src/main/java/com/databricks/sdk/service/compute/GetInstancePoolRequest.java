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

/** Get instance pool information */
@Generated
@JsonSerialize(using = GetInstancePoolRequest.GetInstancePoolRequestSerializer.class)
@JsonDeserialize(using = GetInstancePoolRequest.GetInstancePoolRequestDeserializer.class)
public class GetInstancePoolRequest {
  /** The canonical unique identifier for the instance pool. */
  private String instancePoolId;

  public GetInstancePoolRequest setInstancePoolId(String instancePoolId) {
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
    GetInstancePoolRequest that = (GetInstancePoolRequest) o;
    return Objects.equals(instancePoolId, that.instancePoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instancePoolId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetInstancePoolRequest.class)
        .add("instancePoolId", instancePoolId)
        .toString();
  }

  GetInstancePoolRequestPb toPb() {
    GetInstancePoolRequestPb pb = new GetInstancePoolRequestPb();
    pb.setInstancePoolId(instancePoolId);

    return pb;
  }

  static GetInstancePoolRequest fromPb(GetInstancePoolRequestPb pb) {
    GetInstancePoolRequest model = new GetInstancePoolRequest();
    model.setInstancePoolId(pb.getInstancePoolId());

    return model;
  }

  public static class GetInstancePoolRequestSerializer
      extends JsonSerializer<GetInstancePoolRequest> {
    @Override
    public void serialize(
        GetInstancePoolRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetInstancePoolRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetInstancePoolRequestDeserializer
      extends JsonDeserializer<GetInstancePoolRequest> {
    @Override
    public GetInstancePoolRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetInstancePoolRequestPb pb = mapper.readValue(p, GetInstancePoolRequestPb.class);
      return GetInstancePoolRequest.fromPb(pb);
    }
  }
}
