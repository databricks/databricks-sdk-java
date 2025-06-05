// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Describes a specific Spark driver or executor. */
@Generated
class SparkNodePb {
  @JsonProperty("host_private_ip")
  private String hostPrivateIp;

  @JsonProperty("instance_id")
  private String instanceId;

  @JsonProperty("node_aws_attributes")
  private SparkNodeAwsAttributes nodeAwsAttributes;

  @JsonProperty("node_id")
  private String nodeId;

  @JsonProperty("private_ip")
  private String privateIp;

  @JsonProperty("public_dns")
  private String publicDns;

  @JsonProperty("start_timestamp")
  private Long startTimestamp;

  public SparkNodePb setHostPrivateIp(String hostPrivateIp) {
    this.hostPrivateIp = hostPrivateIp;
    return this;
  }

  public String getHostPrivateIp() {
    return hostPrivateIp;
  }

  public SparkNodePb setInstanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  public String getInstanceId() {
    return instanceId;
  }

  public SparkNodePb setNodeAwsAttributes(SparkNodeAwsAttributes nodeAwsAttributes) {
    this.nodeAwsAttributes = nodeAwsAttributes;
    return this;
  }

  public SparkNodeAwsAttributes getNodeAwsAttributes() {
    return nodeAwsAttributes;
  }

  public SparkNodePb setNodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  public String getNodeId() {
    return nodeId;
  }

  public SparkNodePb setPrivateIp(String privateIp) {
    this.privateIp = privateIp;
    return this;
  }

  public String getPrivateIp() {
    return privateIp;
  }

  public SparkNodePb setPublicDns(String publicDns) {
    this.publicDns = publicDns;
    return this;
  }

  public String getPublicDns() {
    return publicDns;
  }

  public SparkNodePb setStartTimestamp(Long startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  public Long getStartTimestamp() {
    return startTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkNodePb that = (SparkNodePb) o;
    return Objects.equals(hostPrivateIp, that.hostPrivateIp)
        && Objects.equals(instanceId, that.instanceId)
        && Objects.equals(nodeAwsAttributes, that.nodeAwsAttributes)
        && Objects.equals(nodeId, that.nodeId)
        && Objects.equals(privateIp, that.privateIp)
        && Objects.equals(publicDns, that.publicDns)
        && Objects.equals(startTimestamp, that.startTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        hostPrivateIp, instanceId, nodeAwsAttributes, nodeId, privateIp, publicDns, startTimestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(SparkNodePb.class)
        .add("hostPrivateIp", hostPrivateIp)
        .add("instanceId", instanceId)
        .add("nodeAwsAttributes", nodeAwsAttributes)
        .add("nodeId", nodeId)
        .add("privateIp", privateIp)
        .add("publicDns", publicDns)
        .add("startTimestamp", startTimestamp)
        .toString();
  }
}
