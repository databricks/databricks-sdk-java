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

/** Get cluster permissions */
@Generated
@JsonSerialize(using = GetClusterPermissionsRequest.GetClusterPermissionsRequestSerializer.class)
@JsonDeserialize(
    using = GetClusterPermissionsRequest.GetClusterPermissionsRequestDeserializer.class)
public class GetClusterPermissionsRequest {
  /** The cluster for which to get or manage permissions. */
  private String clusterId;

  public GetClusterPermissionsRequest setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetClusterPermissionsRequest that = (GetClusterPermissionsRequest) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterPermissionsRequest.class)
        .add("clusterId", clusterId)
        .toString();
  }

  GetClusterPermissionsRequestPb toPb() {
    GetClusterPermissionsRequestPb pb = new GetClusterPermissionsRequestPb();
    pb.setClusterId(clusterId);

    return pb;
  }

  static GetClusterPermissionsRequest fromPb(GetClusterPermissionsRequestPb pb) {
    GetClusterPermissionsRequest model = new GetClusterPermissionsRequest();
    model.setClusterId(pb.getClusterId());

    return model;
  }

  public static class GetClusterPermissionsRequestSerializer
      extends JsonSerializer<GetClusterPermissionsRequest> {
    @Override
    public void serialize(
        GetClusterPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetClusterPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetClusterPermissionsRequestDeserializer
      extends JsonDeserializer<GetClusterPermissionsRequest> {
    @Override
    public GetClusterPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetClusterPermissionsRequestPb pb = mapper.readValue(p, GetClusterPermissionsRequestPb.class);
      return GetClusterPermissionsRequest.fromPb(pb);
    }
  }
}
