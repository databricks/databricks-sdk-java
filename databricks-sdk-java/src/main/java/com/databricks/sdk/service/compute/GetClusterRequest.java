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

/** Get cluster info */
@Generated
@JsonSerialize(using = GetClusterRequest.GetClusterRequestSerializer.class)
@JsonDeserialize(using = GetClusterRequest.GetClusterRequestDeserializer.class)
public class GetClusterRequest {
  /** The cluster about which to retrieve information. */
  private String clusterId;

  public GetClusterRequest setClusterId(String clusterId) {
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
    GetClusterRequest that = (GetClusterRequest) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterRequest.class).add("clusterId", clusterId).toString();
  }

  GetClusterRequestPb toPb() {
    GetClusterRequestPb pb = new GetClusterRequestPb();
    pb.setClusterId(clusterId);

    return pb;
  }

  static GetClusterRequest fromPb(GetClusterRequestPb pb) {
    GetClusterRequest model = new GetClusterRequest();
    model.setClusterId(pb.getClusterId());

    return model;
  }

  public static class GetClusterRequestSerializer extends JsonSerializer<GetClusterRequest> {
    @Override
    public void serialize(GetClusterRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetClusterRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetClusterRequestDeserializer extends JsonDeserializer<GetClusterRequest> {
    @Override
    public GetClusterRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetClusterRequestPb pb = mapper.readValue(p, GetClusterRequestPb.class);
      return GetClusterRequest.fromPb(pb);
    }
  }
}
