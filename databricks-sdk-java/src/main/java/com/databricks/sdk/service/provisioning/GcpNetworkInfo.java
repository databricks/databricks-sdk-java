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

/**
 * The Google Cloud specific information for this network (for example, the VPC ID, subnet ID, and
 * secondary IP ranges).
 */
@Generated
@JsonSerialize(using = GcpNetworkInfo.GcpNetworkInfoSerializer.class)
@JsonDeserialize(using = GcpNetworkInfo.GcpNetworkInfoDeserializer.class)
public class GcpNetworkInfo {
  /** The Google Cloud project ID of the VPC network. */
  private String networkProjectId;

  /**
   * The name of the secondary IP range for pods. A Databricks-managed GKE cluster uses this IP
   * range for its pods. This secondary IP range can be used by only one workspace.
   */
  private String podIpRangeName;

  /**
   * The name of the secondary IP range for services. A Databricks-managed GKE cluster uses this IP
   * range for its services. This secondary IP range can be used by only one workspace.
   */
  private String serviceIpRangeName;

  /** The ID of the subnet associated with this network. */
  private String subnetId;

  /** The Google Cloud region of the workspace data plane (for example, `us-east4`). */
  private String subnetRegion;

  /**
   * The ID of the VPC associated with this network. VPC IDs can be used in multiple network
   * configurations.
   */
  private String vpcId;

  public GcpNetworkInfo setNetworkProjectId(String networkProjectId) {
    this.networkProjectId = networkProjectId;
    return this;
  }

  public String getNetworkProjectId() {
    return networkProjectId;
  }

  public GcpNetworkInfo setPodIpRangeName(String podIpRangeName) {
    this.podIpRangeName = podIpRangeName;
    return this;
  }

  public String getPodIpRangeName() {
    return podIpRangeName;
  }

  public GcpNetworkInfo setServiceIpRangeName(String serviceIpRangeName) {
    this.serviceIpRangeName = serviceIpRangeName;
    return this;
  }

  public String getServiceIpRangeName() {
    return serviceIpRangeName;
  }

  public GcpNetworkInfo setSubnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

  public String getSubnetId() {
    return subnetId;
  }

  public GcpNetworkInfo setSubnetRegion(String subnetRegion) {
    this.subnetRegion = subnetRegion;
    return this;
  }

  public String getSubnetRegion() {
    return subnetRegion;
  }

  public GcpNetworkInfo setVpcId(String vpcId) {
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
    GcpNetworkInfo that = (GcpNetworkInfo) o;
    return Objects.equals(networkProjectId, that.networkProjectId)
        && Objects.equals(podIpRangeName, that.podIpRangeName)
        && Objects.equals(serviceIpRangeName, that.serviceIpRangeName)
        && Objects.equals(subnetId, that.subnetId)
        && Objects.equals(subnetRegion, that.subnetRegion)
        && Objects.equals(vpcId, that.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        networkProjectId, podIpRangeName, serviceIpRangeName, subnetId, subnetRegion, vpcId);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpNetworkInfo.class)
        .add("networkProjectId", networkProjectId)
        .add("podIpRangeName", podIpRangeName)
        .add("serviceIpRangeName", serviceIpRangeName)
        .add("subnetId", subnetId)
        .add("subnetRegion", subnetRegion)
        .add("vpcId", vpcId)
        .toString();
  }

  GcpNetworkInfoPb toPb() {
    GcpNetworkInfoPb pb = new GcpNetworkInfoPb();
    pb.setNetworkProjectId(networkProjectId);
    pb.setPodIpRangeName(podIpRangeName);
    pb.setServiceIpRangeName(serviceIpRangeName);
    pb.setSubnetId(subnetId);
    pb.setSubnetRegion(subnetRegion);
    pb.setVpcId(vpcId);

    return pb;
  }

  static GcpNetworkInfo fromPb(GcpNetworkInfoPb pb) {
    GcpNetworkInfo model = new GcpNetworkInfo();
    model.setNetworkProjectId(pb.getNetworkProjectId());
    model.setPodIpRangeName(pb.getPodIpRangeName());
    model.setServiceIpRangeName(pb.getServiceIpRangeName());
    model.setSubnetId(pb.getSubnetId());
    model.setSubnetRegion(pb.getSubnetRegion());
    model.setVpcId(pb.getVpcId());

    return model;
  }

  public static class GcpNetworkInfoSerializer extends JsonSerializer<GcpNetworkInfo> {
    @Override
    public void serialize(GcpNetworkInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GcpNetworkInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GcpNetworkInfoDeserializer extends JsonDeserializer<GcpNetworkInfo> {
    @Override
    public GcpNetworkInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GcpNetworkInfoPb pb = mapper.readValue(p, GcpNetworkInfoPb.class);
      return GcpNetworkInfo.fromPb(pb);
    }
  }
}
