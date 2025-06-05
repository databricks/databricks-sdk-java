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
@JsonSerialize(using = Network.NetworkSerializer.class)
@JsonDeserialize(using = Network.NetworkDeserializer.class)
public class Network {
  /** The Databricks account ID associated with this network configuration. */
  private String accountId;

  /** Time in epoch milliseconds when the network was created. */
  private Long creationTime;

  /** Array of error messages about the network configuration. */
  private Collection<NetworkHealth> errorMessages;

  /**
   * The Google Cloud specific information for this network (for example, the VPC ID, subnet ID, and
   * secondary IP ranges).
   */
  private GcpNetworkInfo gcpNetworkInfo;

  /** The Databricks network configuration ID. */
  private String networkId;

  /** The human-readable name of the network configuration. */
  private String networkName;

  /** */
  private Collection<String> securityGroupIds;

  /** */
  private Collection<String> subnetIds;

  /**
   * If specified, contains the VPC endpoints used to allow cluster communication from this VPC over
   * [AWS PrivateLink].
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink/
   */
  private NetworkVpcEndpoints vpcEndpoints;

  /**
   * The ID of the VPC associated with this network configuration. VPC IDs can be used in multiple
   * networks.
   */
  private String vpcId;

  /**
   * The status of this network configuration object in terms of its use in a workspace: *
   * `UNATTACHED`: Unattached. * `VALID`: Valid. * `BROKEN`: Broken. * `WARNED`: Warned.
   */
  private VpcStatus vpcStatus;

  /** Array of warning messages about the network configuration. */
  private Collection<NetworkWarning> warningMessages;

  /** Workspace ID associated with this network configuration. */
  private Long workspaceId;

  public Network setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public Network setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public Network setErrorMessages(Collection<NetworkHealth> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public Collection<NetworkHealth> getErrorMessages() {
    return errorMessages;
  }

  public Network setGcpNetworkInfo(GcpNetworkInfo gcpNetworkInfo) {
    this.gcpNetworkInfo = gcpNetworkInfo;
    return this;
  }

  public GcpNetworkInfo getGcpNetworkInfo() {
    return gcpNetworkInfo;
  }

  public Network setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  public String getNetworkId() {
    return networkId;
  }

  public Network setNetworkName(String networkName) {
    this.networkName = networkName;
    return this;
  }

  public String getNetworkName() {
    return networkName;
  }

  public Network setSecurityGroupIds(Collection<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public Collection<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  public Network setSubnetIds(Collection<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public Collection<String> getSubnetIds() {
    return subnetIds;
  }

  public Network setVpcEndpoints(NetworkVpcEndpoints vpcEndpoints) {
    this.vpcEndpoints = vpcEndpoints;
    return this;
  }

  public NetworkVpcEndpoints getVpcEndpoints() {
    return vpcEndpoints;
  }

  public Network setVpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  public String getVpcId() {
    return vpcId;
  }

  public Network setVpcStatus(VpcStatus vpcStatus) {
    this.vpcStatus = vpcStatus;
    return this;
  }

  public VpcStatus getVpcStatus() {
    return vpcStatus;
  }

  public Network setWarningMessages(Collection<NetworkWarning> warningMessages) {
    this.warningMessages = warningMessages;
    return this;
  }

  public Collection<NetworkWarning> getWarningMessages() {
    return warningMessages;
  }

  public Network setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Network that = (Network) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(errorMessages, that.errorMessages)
        && Objects.equals(gcpNetworkInfo, that.gcpNetworkInfo)
        && Objects.equals(networkId, that.networkId)
        && Objects.equals(networkName, that.networkName)
        && Objects.equals(securityGroupIds, that.securityGroupIds)
        && Objects.equals(subnetIds, that.subnetIds)
        && Objects.equals(vpcEndpoints, that.vpcEndpoints)
        && Objects.equals(vpcId, that.vpcId)
        && Objects.equals(vpcStatus, that.vpcStatus)
        && Objects.equals(warningMessages, that.warningMessages)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        creationTime,
        errorMessages,
        gcpNetworkInfo,
        networkId,
        networkName,
        securityGroupIds,
        subnetIds,
        vpcEndpoints,
        vpcId,
        vpcStatus,
        warningMessages,
        workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(Network.class)
        .add("accountId", accountId)
        .add("creationTime", creationTime)
        .add("errorMessages", errorMessages)
        .add("gcpNetworkInfo", gcpNetworkInfo)
        .add("networkId", networkId)
        .add("networkName", networkName)
        .add("securityGroupIds", securityGroupIds)
        .add("subnetIds", subnetIds)
        .add("vpcEndpoints", vpcEndpoints)
        .add("vpcId", vpcId)
        .add("vpcStatus", vpcStatus)
        .add("warningMessages", warningMessages)
        .add("workspaceId", workspaceId)
        .toString();
  }

  NetworkPb toPb() {
    NetworkPb pb = new NetworkPb();
    pb.setAccountId(accountId);
    pb.setCreationTime(creationTime);
    pb.setErrorMessages(errorMessages);
    pb.setGcpNetworkInfo(gcpNetworkInfo);
    pb.setNetworkId(networkId);
    pb.setNetworkName(networkName);
    pb.setSecurityGroupIds(securityGroupIds);
    pb.setSubnetIds(subnetIds);
    pb.setVpcEndpoints(vpcEndpoints);
    pb.setVpcId(vpcId);
    pb.setVpcStatus(vpcStatus);
    pb.setWarningMessages(warningMessages);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static Network fromPb(NetworkPb pb) {
    Network model = new Network();
    model.setAccountId(pb.getAccountId());
    model.setCreationTime(pb.getCreationTime());
    model.setErrorMessages(pb.getErrorMessages());
    model.setGcpNetworkInfo(pb.getGcpNetworkInfo());
    model.setNetworkId(pb.getNetworkId());
    model.setNetworkName(pb.getNetworkName());
    model.setSecurityGroupIds(pb.getSecurityGroupIds());
    model.setSubnetIds(pb.getSubnetIds());
    model.setVpcEndpoints(pb.getVpcEndpoints());
    model.setVpcId(pb.getVpcId());
    model.setVpcStatus(pb.getVpcStatus());
    model.setWarningMessages(pb.getWarningMessages());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class NetworkSerializer extends JsonSerializer<Network> {
    @Override
    public void serialize(Network value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NetworkPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NetworkDeserializer extends JsonDeserializer<Network> {
    @Override
    public Network deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NetworkPb pb = mapper.readValue(p, NetworkPb.class);
      return Network.fromPb(pb);
    }
  }
}
