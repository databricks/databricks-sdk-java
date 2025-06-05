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

/**
 * This structure embodies the machine type that hosts spark containers Note: this should be an
 * internal data structure for now It is defined in proto in case we want to send it over the wire
 * in the future (which is likely)
 */
@Generated
@JsonSerialize(using = NodeInstanceType.NodeInstanceTypeSerializer.class)
@JsonDeserialize(using = NodeInstanceType.NodeInstanceTypeDeserializer.class)
public class NodeInstanceType {
  /** Unique identifier across instance types */
  private String instanceTypeId;

  /** Size of the individual local disks attached to this instance (i.e. per local disk). */
  private Long localDiskSizeGb;

  /** Number of local disks that are present on this instance. */
  private Long localDisks;

  /** Size of the individual local nvme disks attached to this instance (i.e. per local disk). */
  private Long localNvmeDiskSizeGb;

  /** Number of local nvme disks that are present on this instance. */
  private Long localNvmeDisks;

  public NodeInstanceType setInstanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
    return this;
  }

  public String getInstanceTypeId() {
    return instanceTypeId;
  }

  public NodeInstanceType setLocalDiskSizeGb(Long localDiskSizeGb) {
    this.localDiskSizeGb = localDiskSizeGb;
    return this;
  }

  public Long getLocalDiskSizeGb() {
    return localDiskSizeGb;
  }

  public NodeInstanceType setLocalDisks(Long localDisks) {
    this.localDisks = localDisks;
    return this;
  }

  public Long getLocalDisks() {
    return localDisks;
  }

  public NodeInstanceType setLocalNvmeDiskSizeGb(Long localNvmeDiskSizeGb) {
    this.localNvmeDiskSizeGb = localNvmeDiskSizeGb;
    return this;
  }

  public Long getLocalNvmeDiskSizeGb() {
    return localNvmeDiskSizeGb;
  }

  public NodeInstanceType setLocalNvmeDisks(Long localNvmeDisks) {
    this.localNvmeDisks = localNvmeDisks;
    return this;
  }

  public Long getLocalNvmeDisks() {
    return localNvmeDisks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NodeInstanceType that = (NodeInstanceType) o;
    return Objects.equals(instanceTypeId, that.instanceTypeId)
        && Objects.equals(localDiskSizeGb, that.localDiskSizeGb)
        && Objects.equals(localDisks, that.localDisks)
        && Objects.equals(localNvmeDiskSizeGb, that.localNvmeDiskSizeGb)
        && Objects.equals(localNvmeDisks, that.localNvmeDisks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        instanceTypeId, localDiskSizeGb, localDisks, localNvmeDiskSizeGb, localNvmeDisks);
  }

  @Override
  public String toString() {
    return new ToStringer(NodeInstanceType.class)
        .add("instanceTypeId", instanceTypeId)
        .add("localDiskSizeGb", localDiskSizeGb)
        .add("localDisks", localDisks)
        .add("localNvmeDiskSizeGb", localNvmeDiskSizeGb)
        .add("localNvmeDisks", localNvmeDisks)
        .toString();
  }

  NodeInstanceTypePb toPb() {
    NodeInstanceTypePb pb = new NodeInstanceTypePb();
    pb.setInstanceTypeId(instanceTypeId);
    pb.setLocalDiskSizeGb(localDiskSizeGb);
    pb.setLocalDisks(localDisks);
    pb.setLocalNvmeDiskSizeGb(localNvmeDiskSizeGb);
    pb.setLocalNvmeDisks(localNvmeDisks);

    return pb;
  }

  static NodeInstanceType fromPb(NodeInstanceTypePb pb) {
    NodeInstanceType model = new NodeInstanceType();
    model.setInstanceTypeId(pb.getInstanceTypeId());
    model.setLocalDiskSizeGb(pb.getLocalDiskSizeGb());
    model.setLocalDisks(pb.getLocalDisks());
    model.setLocalNvmeDiskSizeGb(pb.getLocalNvmeDiskSizeGb());
    model.setLocalNvmeDisks(pb.getLocalNvmeDisks());

    return model;
  }

  public static class NodeInstanceTypeSerializer extends JsonSerializer<NodeInstanceType> {
    @Override
    public void serialize(NodeInstanceType value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NodeInstanceTypePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NodeInstanceTypeDeserializer extends JsonDeserializer<NodeInstanceType> {
    @Override
    public NodeInstanceType deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NodeInstanceTypePb pb = mapper.readValue(p, NodeInstanceTypePb.class);
      return NodeInstanceType.fromPb(pb);
    }
  }
}
