// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SparkNode {
  /** The private IP address of the host instance. */
  @JsonProperty("host_private_ip")
  private String hostPrivateIp;

  /** Globally unique identifier for the host instance from the cloud provider. */
  @JsonProperty("instance_id")
  private String instanceId;

  /** Attributes specific to AWS for a Spark node. */
  @JsonProperty("node_aws_attributes")
  private SparkNodeAwsAttributes nodeAwsAttributes;

  /** Globally unique identifier for this node. */
  @JsonProperty("node_id")
  private String nodeId;

  /**
   * Private IP address (typically a 10.x.x.x address) of the Spark node. Note that this is
   * different from the private IP address of the host instance.
   */
  @JsonProperty("private_ip")
  private String privateIp;

  /**
   * Public DNS address of this node. This address can be used to access the Spark JDBC server on
   * the driver node. To communicate with the JDBC server, traffic must be manually authorized by
   * adding security group rules to the "worker-unmanaged" security group via the AWS console.
   *
   * <p>Actually it's the public DNS address of the host instance.
   */
  @JsonProperty("public_dns")
  private String publicDns;

  /**
   * The timestamp (in millisecond) when the Spark node is launched.
   *
   * <p>The start_timestamp is set right before the container is being launched. The timestamp when
   * the container is placed on the ResourceManager, before its launch and setup by the NodeDaemon.
   * This timestamp is the same as the creation timestamp in the database.
   */
  @JsonProperty("start_timestamp")
  private Long startTimestamp;

  public SparkNode setHostPrivateIp(String hostPrivateIp) {
    this.hostPrivateIp = hostPrivateIp;
    return this;
  }

  public String getHostPrivateIp() {
    return hostPrivateIp;
  }

  public SparkNode setInstanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  public String getInstanceId() {
    return instanceId;
  }

  public SparkNode setNodeAwsAttributes(SparkNodeAwsAttributes nodeAwsAttributes) {
    this.nodeAwsAttributes = nodeAwsAttributes;
    return this;
  }

  public SparkNodeAwsAttributes getNodeAwsAttributes() {
    return nodeAwsAttributes;
  }

  public SparkNode setNodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  public String getNodeId() {
    return nodeId;
  }

  public SparkNode setPrivateIp(String privateIp) {
    this.privateIp = privateIp;
    return this;
  }

  public String getPrivateIp() {
    return privateIp;
  }

  public SparkNode setPublicDns(String publicDns) {
    this.publicDns = publicDns;
    return this;
  }

  public String getPublicDns() {
    return publicDns;
  }

  public SparkNode setStartTimestamp(Long startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  public Long getStartTimestamp() {
    return startTimestamp;
  }
}
