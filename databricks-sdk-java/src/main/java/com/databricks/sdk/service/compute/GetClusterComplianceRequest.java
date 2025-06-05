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

/** Get cluster policy compliance */
@Generated
@JsonSerialize(using = GetClusterComplianceRequest.GetClusterComplianceRequestSerializer.class)
@JsonDeserialize(using = GetClusterComplianceRequest.GetClusterComplianceRequestDeserializer.class)
public class GetClusterComplianceRequest {
  /** The ID of the cluster to get the compliance status */
  private String clusterId;

  public GetClusterComplianceRequest setClusterId(String clusterId) {
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
    GetClusterComplianceRequest that = (GetClusterComplianceRequest) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterComplianceRequest.class).add("clusterId", clusterId).toString();
  }

  GetClusterComplianceRequestPb toPb() {
    GetClusterComplianceRequestPb pb = new GetClusterComplianceRequestPb();
    pb.setClusterId(clusterId);

    return pb;
  }

  static GetClusterComplianceRequest fromPb(GetClusterComplianceRequestPb pb) {
    GetClusterComplianceRequest model = new GetClusterComplianceRequest();
    model.setClusterId(pb.getClusterId());

    return model;
  }

  public static class GetClusterComplianceRequestSerializer
      extends JsonSerializer<GetClusterComplianceRequest> {
    @Override
    public void serialize(
        GetClusterComplianceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetClusterComplianceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetClusterComplianceRequestDeserializer
      extends JsonDeserializer<GetClusterComplianceRequest> {
    @Override
    public GetClusterComplianceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetClusterComplianceRequestPb pb = mapper.readValue(p, GetClusterComplianceRequestPb.class);
      return GetClusterComplianceRequest.fromPb(pb);
    }
  }
}
