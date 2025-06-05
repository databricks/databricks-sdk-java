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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = CreateNetworkRequest.CreateNetworkRequestSerializer.class)
@JsonDeserialize(using = CreateNetworkRequest.CreateNetworkRequestDeserializer.class)
public class CreateNetworkRequest {
  /**
   * The Google Cloud specific information for this network (for example, the VPC ID, subnet ID, and
   * secondary IP ranges).
   */
  private GcpNetworkInfo gcpNetworkInfo;

  /** The human-readable name of the network configuration. */
  private String networkName;

  /**
   * IDs of one to five security groups associated with this network. Security group IDs **cannot**
   * be used in multiple network configurations.
   */
  private Collection<String> securityGroupIds;

  /**
   * IDs of at least two subnets associated with this network. Subnet IDs **cannot** be used in
   * multiple network configurations.
   */
  private Collection<String> subnetIds;

  /**
   * If specified, contains the VPC endpoints used to allow cluster communication from this VPC over
   * [AWS PrivateLink].
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink/
   */
  private NetworkVpcEndpoints vpcEndpoints;

  /**
   * The ID of the VPC associated with this network. VPC IDs can be used in multiple network
   * configurations.
   */
  private String vpcId;

  public CreateNetworkRequest setGcpNetworkInfo(GcpNetworkInfo gcpNetworkInfo) {
    this.gcpNetworkInfo = gcpNetworkInfo;
    return this;
  }

  public GcpNetworkInfo getGcpNetworkInfo() {
    return gcpNetworkInfo;
  }

  public CreateNetworkRequest setNetworkName(String networkName) {
    this.networkName = networkName;
    return this;
  }

  public String getNetworkName() {
    return networkName;
  }

  public CreateNetworkRequest setSecurityGroupIds(Collection<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public Collection<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  public CreateNetworkRequest setSubnetIds(Collection<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public Collection<String> getSubnetIds() {
    return subnetIds;
  }

  public CreateNetworkRequest setVpcEndpoints(NetworkVpcEndpoints vpcEndpoints) {
    this.vpcEndpoints = vpcEndpoints;
    return this;
  }

  public NetworkVpcEndpoints getVpcEndpoints() {
    return vpcEndpoints;
  }

  public CreateNetworkRequest setVpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  public String getVpcId() {
    return vpcId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateNetworkRequest that = (CreateNetworkRequest) o;
    return Objects.equals(gcpNetworkInfo, that.gcpNetworkInfo)
        && Objects.equals(networkName, that.networkName)
        && Objects.equals(securityGroupIds, that.securityGroupIds)
        && Objects.equals(subnetIds, that.subnetIds)
        && Objects.equals(vpcEndpoints, that.vpcEndpoints)
        && Objects.equals(vpcId, that.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        gcpNetworkInfo, networkName, securityGroupIds, subnetIds, vpcEndpoints, vpcId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateNetworkRequest.class)
        .add("gcpNetworkInfo", gcpNetworkInfo)
        .add("networkName", networkName)
        .add("securityGroupIds", securityGroupIds)
        .add("subnetIds", subnetIds)
        .add("vpcEndpoints", vpcEndpoints)
        .add("vpcId", vpcId)
        .toString();
  }

  CreateNetworkRequestPb toPb() {
    CreateNetworkRequestPb pb = new CreateNetworkRequestPb();
    pb.setGcpNetworkInfo(gcpNetworkInfo);
    pb.setNetworkName(networkName);
    pb.setSecurityGroupIds(securityGroupIds);
    pb.setSubnetIds(subnetIds);
    pb.setVpcEndpoints(vpcEndpoints);
    pb.setVpcId(vpcId);

    return pb;
  }

  static CreateNetworkRequest fromPb(CreateNetworkRequestPb pb) {
    CreateNetworkRequest model = new CreateNetworkRequest();
    model.setGcpNetworkInfo(pb.getGcpNetworkInfo());
    model.setNetworkName(pb.getNetworkName());
    model.setSecurityGroupIds(pb.getSecurityGroupIds());
    model.setSubnetIds(pb.getSubnetIds());
    model.setVpcEndpoints(pb.getVpcEndpoints());
    model.setVpcId(pb.getVpcId());

    return model;
  }

  public static class CreateNetworkRequestSerializer extends JsonSerializer<CreateNetworkRequest> {
    @Override
    public void serialize(
        CreateNetworkRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateNetworkRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateNetworkRequestDeserializer
      extends JsonDeserializer<CreateNetworkRequest> {
    @Override
    public CreateNetworkRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateNetworkRequestPb pb = mapper.readValue(p, CreateNetworkRequestPb.class);
      return CreateNetworkRequest.fromPb(pb);
    }
  }
}
