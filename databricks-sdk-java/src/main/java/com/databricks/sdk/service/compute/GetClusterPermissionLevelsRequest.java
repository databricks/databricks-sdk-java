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

/** Get cluster permission levels */
@Generated
@JsonSerialize(
    using = GetClusterPermissionLevelsRequest.GetClusterPermissionLevelsRequestSerializer.class)
@JsonDeserialize(
    using = GetClusterPermissionLevelsRequest.GetClusterPermissionLevelsRequestDeserializer.class)
public class GetClusterPermissionLevelsRequest {
  /** The cluster for which to get or manage permissions. */
  private String clusterId;

  public GetClusterPermissionLevelsRequest setClusterId(String clusterId) {
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
    GetClusterPermissionLevelsRequest that = (GetClusterPermissionLevelsRequest) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterPermissionLevelsRequest.class)
        .add("clusterId", clusterId)
        .toString();
  }

  GetClusterPermissionLevelsRequestPb toPb() {
    GetClusterPermissionLevelsRequestPb pb = new GetClusterPermissionLevelsRequestPb();
    pb.setClusterId(clusterId);

    return pb;
  }

  static GetClusterPermissionLevelsRequest fromPb(GetClusterPermissionLevelsRequestPb pb) {
    GetClusterPermissionLevelsRequest model = new GetClusterPermissionLevelsRequest();
    model.setClusterId(pb.getClusterId());

    return model;
  }

  public static class GetClusterPermissionLevelsRequestSerializer
      extends JsonSerializer<GetClusterPermissionLevelsRequest> {
    @Override
    public void serialize(
        GetClusterPermissionLevelsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetClusterPermissionLevelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetClusterPermissionLevelsRequestDeserializer
      extends JsonDeserializer<GetClusterPermissionLevelsRequest> {
    @Override
    public GetClusterPermissionLevelsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetClusterPermissionLevelsRequestPb pb =
          mapper.readValue(p, GetClusterPermissionLevelsRequestPb.class);
      return GetClusterPermissionLevelsRequest.fromPb(pb);
    }
  }
}
