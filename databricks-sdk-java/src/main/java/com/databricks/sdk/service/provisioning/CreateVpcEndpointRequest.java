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

@Generated
@JsonSerialize(using = CreateVpcEndpointRequest.CreateVpcEndpointRequestSerializer.class)
@JsonDeserialize(using = CreateVpcEndpointRequest.CreateVpcEndpointRequestDeserializer.class)
public class CreateVpcEndpointRequest {
  /** The ID of the VPC endpoint object in AWS. */
  private String awsVpcEndpointId;

  /** The Google Cloud specific information for this Private Service Connect endpoint. */
  private GcpVpcEndpointInfo gcpVpcEndpointInfo;

  /** The AWS region in which this VPC endpoint object exists. */
  private String region;

  /** The human-readable name of the storage configuration. */
  private String vpcEndpointName;

  public CreateVpcEndpointRequest setAwsVpcEndpointId(String awsVpcEndpointId) {
    this.awsVpcEndpointId = awsVpcEndpointId;
    return this;
  }

  public String getAwsVpcEndpointId() {
    return awsVpcEndpointId;
  }

  public CreateVpcEndpointRequest setGcpVpcEndpointInfo(GcpVpcEndpointInfo gcpVpcEndpointInfo) {
    this.gcpVpcEndpointInfo = gcpVpcEndpointInfo;
    return this;
  }

  public GcpVpcEndpointInfo getGcpVpcEndpointInfo() {
    return gcpVpcEndpointInfo;
  }

  public CreateVpcEndpointRequest setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public CreateVpcEndpointRequest setVpcEndpointName(String vpcEndpointName) {
    this.vpcEndpointName = vpcEndpointName;
    return this;
  }

  public String getVpcEndpointName() {
    return vpcEndpointName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateVpcEndpointRequest that = (CreateVpcEndpointRequest) o;
    return Objects.equals(awsVpcEndpointId, that.awsVpcEndpointId)
        && Objects.equals(gcpVpcEndpointInfo, that.gcpVpcEndpointInfo)
        && Objects.equals(region, that.region)
        && Objects.equals(vpcEndpointName, that.vpcEndpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsVpcEndpointId, gcpVpcEndpointInfo, region, vpcEndpointName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateVpcEndpointRequest.class)
        .add("awsVpcEndpointId", awsVpcEndpointId)
        .add("gcpVpcEndpointInfo", gcpVpcEndpointInfo)
        .add("region", region)
        .add("vpcEndpointName", vpcEndpointName)
        .toString();
  }

  CreateVpcEndpointRequestPb toPb() {
    CreateVpcEndpointRequestPb pb = new CreateVpcEndpointRequestPb();
    pb.setAwsVpcEndpointId(awsVpcEndpointId);
    pb.setGcpVpcEndpointInfo(gcpVpcEndpointInfo);
    pb.setRegion(region);
    pb.setVpcEndpointName(vpcEndpointName);

    return pb;
  }

  static CreateVpcEndpointRequest fromPb(CreateVpcEndpointRequestPb pb) {
    CreateVpcEndpointRequest model = new CreateVpcEndpointRequest();
    model.setAwsVpcEndpointId(pb.getAwsVpcEndpointId());
    model.setGcpVpcEndpointInfo(pb.getGcpVpcEndpointInfo());
    model.setRegion(pb.getRegion());
    model.setVpcEndpointName(pb.getVpcEndpointName());

    return model;
  }

  public static class CreateVpcEndpointRequestSerializer
      extends JsonSerializer<CreateVpcEndpointRequest> {
    @Override
    public void serialize(
        CreateVpcEndpointRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateVpcEndpointRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateVpcEndpointRequestDeserializer
      extends JsonDeserializer<CreateVpcEndpointRequest> {
    @Override
    public CreateVpcEndpointRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateVpcEndpointRequestPb pb = mapper.readValue(p, CreateVpcEndpointRequestPb.class);
      return CreateVpcEndpointRequest.fromPb(pb);
    }
  }
}
