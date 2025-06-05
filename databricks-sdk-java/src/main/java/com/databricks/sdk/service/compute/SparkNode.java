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

/** Describes a specific Spark driver or executor. */
@Generated
@JsonSerialize(using = SparkNode.SparkNodeSerializer.class)
@JsonDeserialize(using = SparkNode.SparkNodeDeserializer.class)
public class SparkNode {
  /** The private IP address of the host instance. */
  private String hostPrivateIp;

  /** Globally unique identifier for the host instance from the cloud provider. */
  private String instanceId;

  /** Attributes specific to AWS for a Spark node. */
  private SparkNodeAwsAttributes nodeAwsAttributes;

  /** Globally unique identifier for this node. */
  private String nodeId;

  /**
   * Private IP address (typically a 10.x.x.x address) of the Spark node. Note that this is
   * different from the private IP address of the host instance.
   */
  private String privateIp;

  /**
   * Public DNS address of this node. This address can be used to access the Spark JDBC server on
   * the driver node. To communicate with the JDBC server, traffic must be manually authorized by
   * adding security group rules to the "worker-unmanaged" security group via the AWS console.
   */
  private String publicDns;

  /** The timestamp (in millisecond) when the Spark node is launched. */
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

  @Override
  public int hashCode() {
    return Objects.hash(
        hostPrivateIp, instanceId, nodeAwsAttributes, nodeId, privateIp, publicDns, startTimestamp);
  }

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

  SparkNodePb toPb() {
    SparkNodePb pb = new SparkNodePb();
    pb.setHostPrivateIp(hostPrivateIp);
    pb.setInstanceId(instanceId);
    pb.setNodeAwsAttributes(nodeAwsAttributes);
    pb.setNodeId(nodeId);
    pb.setPrivateIp(privateIp);
    pb.setPublicDns(publicDns);
    pb.setStartTimestamp(startTimestamp);

    return pb;
  }

  static SparkNode fromPb(SparkNodePb pb) {
    SparkNode model = new SparkNode();
    model.setHostPrivateIp(pb.getHostPrivateIp());
    model.setInstanceId(pb.getInstanceId());
    model.setNodeAwsAttributes(pb.getNodeAwsAttributes());
    model.setNodeId(pb.getNodeId());
    model.setPrivateIp(pb.getPrivateIp());
    model.setPublicDns(pb.getPublicDns());
    model.setStartTimestamp(pb.getStartTimestamp());

    return model;
  }

  public static class SparkNodeSerializer extends JsonSerializer<SparkNode> {
    @Override
    public void serialize(SparkNode value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SparkNodePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SparkNodeDeserializer extends JsonDeserializer<SparkNode> {
    @Override
    public SparkNode deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SparkNodePb pb = mapper.readValue(p, SparkNodePb.class);
      return SparkNode.fromPb(pb);
    }
  }
}
