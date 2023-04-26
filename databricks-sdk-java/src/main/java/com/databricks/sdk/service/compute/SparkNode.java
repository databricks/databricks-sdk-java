// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SparkNode class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>hostPrivateIp</code>.</p>
   *
   * @param hostPrivateIp a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.SparkNode} object
   */
  public SparkNode setHostPrivateIp(String hostPrivateIp) {
    this.hostPrivateIp = hostPrivateIp;
    return this;
  }

  /**
   * <p>Getter for the field <code>hostPrivateIp</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getHostPrivateIp() {
    return hostPrivateIp;
  }

  /**
   * <p>Setter for the field <code>instanceId</code>.</p>
   *
   * @param instanceId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.SparkNode} object
   */
  public SparkNode setInstanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * <p>Getter for the field <code>instanceId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * <p>Setter for the field <code>nodeAwsAttributes</code>.</p>
   *
   * @param nodeAwsAttributes a {@link com.databricks.sdk.service.compute.SparkNodeAwsAttributes} object
   * @return a {@link com.databricks.sdk.service.compute.SparkNode} object
   */
  public SparkNode setNodeAwsAttributes(SparkNodeAwsAttributes nodeAwsAttributes) {
    this.nodeAwsAttributes = nodeAwsAttributes;
    return this;
  }

  /**
   * <p>Getter for the field <code>nodeAwsAttributes</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.SparkNodeAwsAttributes} object
   */
  public SparkNodeAwsAttributes getNodeAwsAttributes() {
    return nodeAwsAttributes;
  }

  /**
   * <p>Setter for the field <code>nodeId</code>.</p>
   *
   * @param nodeId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.SparkNode} object
   */
  public SparkNode setNodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  /**
   * <p>Getter for the field <code>nodeId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNodeId() {
    return nodeId;
  }

  /**
   * <p>Setter for the field <code>privateIp</code>.</p>
   *
   * @param privateIp a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.SparkNode} object
   */
  public SparkNode setPrivateIp(String privateIp) {
    this.privateIp = privateIp;
    return this;
  }

  /**
   * <p>Getter for the field <code>privateIp</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPrivateIp() {
    return privateIp;
  }

  /**
   * <p>Setter for the field <code>publicDns</code>.</p>
   *
   * @param publicDns a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.SparkNode} object
   */
  public SparkNode setPublicDns(String publicDns) {
    this.publicDns = publicDns;
    return this;
  }

  /**
   * <p>Getter for the field <code>publicDns</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPublicDns() {
    return publicDns;
  }

  /**
   * <p>Setter for the field <code>startTimestamp</code>.</p>
   *
   * @param startTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.SparkNode} object
   */
  public SparkNode setStartTimestamp(Long startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>startTimestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartTimestamp() {
    return startTimestamp;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkNode that = (SparkNode) o;
    return Objects.equals(hostPrivateIp, that.hostPrivateIp)
        && Objects.equals(instanceId, that.instanceId)
        && Objects.equals(nodeAwsAttributes, that.nodeAwsAttributes)
        && Objects.equals(nodeId, that.nodeId)
        && Objects.equals(privateIp, that.privateIp)
        && Objects.equals(publicDns, that.publicDns)
        && Objects.equals(startTimestamp, that.startTimestamp);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        hostPrivateIp, instanceId, nodeAwsAttributes, nodeId, privateIp, publicDns, startTimestamp);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SparkNode.class)
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
