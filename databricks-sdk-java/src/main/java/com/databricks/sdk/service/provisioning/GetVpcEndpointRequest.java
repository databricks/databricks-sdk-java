// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

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

/** Get a VPC endpoint configuration */
@Generated
@JsonSerialize(using = GetVpcEndpointRequest.GetVpcEndpointRequestSerializer.class)
@JsonDeserialize(using = GetVpcEndpointRequest.GetVpcEndpointRequestDeserializer.class)
public class GetVpcEndpointRequest {
  /** Databricks VPC endpoint ID. */
  private String vpcEndpointId;

  public GetVpcEndpointRequest setVpcEndpointId(String vpcEndpointId) {
    this.vpcEndpointId = vpcEndpointId;
    return this;
  }

  public String getVpcEndpointId() {
    return vpcEndpointId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetVpcEndpointRequest that = (GetVpcEndpointRequest) o;
    return Objects.equals(vpcEndpointId, that.vpcEndpointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcEndpointId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetVpcEndpointRequest.class)
        .add("vpcEndpointId", vpcEndpointId)
        .toString();
  }

  GetVpcEndpointRequestPb toPb() {
    GetVpcEndpointRequestPb pb = new GetVpcEndpointRequestPb();
    pb.setVpcEndpointId(vpcEndpointId);

    return pb;
  }

  static GetVpcEndpointRequest fromPb(GetVpcEndpointRequestPb pb) {
    GetVpcEndpointRequest model = new GetVpcEndpointRequest();
    model.setVpcEndpointId(pb.getVpcEndpointId());

    return model;
  }

  public static class GetVpcEndpointRequestSerializer
      extends JsonSerializer<GetVpcEndpointRequest> {
    @Override
    public void serialize(
        GetVpcEndpointRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetVpcEndpointRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetVpcEndpointRequestDeserializer
      extends JsonDeserializer<GetVpcEndpointRequest> {
    @Override
    public GetVpcEndpointRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetVpcEndpointRequestPb pb = mapper.readValue(p, GetVpcEndpointRequestPb.class);
      return GetVpcEndpointRequest.fromPb(pb);
    }
  }
}
