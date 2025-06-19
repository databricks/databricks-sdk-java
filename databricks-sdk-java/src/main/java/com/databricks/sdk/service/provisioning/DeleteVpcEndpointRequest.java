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

/** Delete VPC endpoint configuration */
@Generated
@JsonSerialize(using = DeleteVpcEndpointRequest.DeleteVpcEndpointRequestSerializer.class)
@JsonDeserialize(using = DeleteVpcEndpointRequest.DeleteVpcEndpointRequestDeserializer.class)
public class DeleteVpcEndpointRequest {
  /** Databricks VPC endpoint ID. */
  private String vpcEndpointId;

  public DeleteVpcEndpointRequest setVpcEndpointId(String vpcEndpointId) {
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
    DeleteVpcEndpointRequest that = (DeleteVpcEndpointRequest) o;
    return Objects.equals(vpcEndpointId, that.vpcEndpointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcEndpointId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteVpcEndpointRequest.class)
        .add("vpcEndpointId", vpcEndpointId)
        .toString();
  }

  DeleteVpcEndpointRequestPb toPb() {
    DeleteVpcEndpointRequestPb pb = new DeleteVpcEndpointRequestPb();
    pb.setVpcEndpointId(vpcEndpointId);

    return pb;
  }

  static DeleteVpcEndpointRequest fromPb(DeleteVpcEndpointRequestPb pb) {
    DeleteVpcEndpointRequest model = new DeleteVpcEndpointRequest();
    model.setVpcEndpointId(pb.getVpcEndpointId());

    return model;
  }

  public static class DeleteVpcEndpointRequestSerializer
      extends JsonSerializer<DeleteVpcEndpointRequest> {
    @Override
    public void serialize(
        DeleteVpcEndpointRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteVpcEndpointRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteVpcEndpointRequestDeserializer
      extends JsonDeserializer<DeleteVpcEndpointRequest> {
    @Override
    public DeleteVpcEndpointRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteVpcEndpointRequestPb pb = mapper.readValue(p, DeleteVpcEndpointRequestPb.class);
      return DeleteVpcEndpointRequest.fromPb(pb);
    }
  }
}
