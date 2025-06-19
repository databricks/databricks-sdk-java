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
 * Describes the disks that are launched for each instance in the spark cluster. For example, if the
 * cluster has 3 instances, each instance is configured to launch 2 disks, 100 GiB each, then
 * Databricks will launch a total of 6 disks, 100 GiB each, for this cluster.
 */
@Generated
@JsonSerialize(using = DiskSpec.DiskSpecSerializer.class)
@JsonDeserialize(using = DiskSpec.DiskSpecDeserializer.class)
public class DiskSpec {
  /**
   * The number of disks launched for each instance: - This feature is only enabled for supported
   * node types. - Users can choose up to the limit of the disks supported by the node type. - For
   * node types with no OS disk, at least one disk must be specified; otherwise, cluster creation
   * will fail.
   *
   * <p>If disks are attached, Databricks will configure Spark to use only the disks for scratch
   * storage, because heterogenously sized scratch devices can lead to inefficient disk utilization.
   * If no disks are attached, Databricks will configure Spark to use instance store disks.
   *
   * <p>Note: If disks are specified, then the Spark configuration `spark.local.dir` will be
   * overridden.
   *
   * <p>Disks will be mounted at: - For AWS: `/ebs0`, `/ebs1`, and etc. - For Azure:
   * `/remote_volume0`, `/remote_volume1`, and etc.
   */
  private Long diskCount;

  /** */
  private Long diskIops;

  /**
   * The size of each disk (in GiB) launched for each instance. Values must fall into the supported
   * range for a particular instance type.
   *
   * <p>For AWS: - General Purpose SSD: 100 - 4096 GiB - Throughput Optimized HDD: 500 - 4096 GiB
   *
   * <p>For Azure: - Premium LRS (SSD): 1 - 1023 GiB - Standard LRS (HDD): 1- 1023 GiB
   */
  private Long diskSize;

  /** */
  private Long diskThroughput;

  /** The type of disks that will be launched with this cluster. */
  private DiskType diskType;

  public DiskSpec setDiskCount(Long diskCount) {
    this.diskCount = diskCount;
    return this;
  }

  public Long getDiskCount() {
    return diskCount;
  }

  public DiskSpec setDiskIops(Long diskIops) {
    this.diskIops = diskIops;
    return this;
  }

  public Long getDiskIops() {
    return diskIops;
  }

  public DiskSpec setDiskSize(Long diskSize) {
    this.diskSize = diskSize;
    return this;
  }

  public Long getDiskSize() {
    return diskSize;
  }

  public DiskSpec setDiskThroughput(Long diskThroughput) {
    this.diskThroughput = diskThroughput;
    return this;
  }

  public Long getDiskThroughput() {
    return diskThroughput;
  }

  public DiskSpec setDiskType(DiskType diskType) {
    this.diskType = diskType;
    return this;
  }

  public DiskType getDiskType() {
    return diskType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiskSpec that = (DiskSpec) o;
    return Objects.equals(diskCount, that.diskCount)
        && Objects.equals(diskIops, that.diskIops)
        && Objects.equals(diskSize, that.diskSize)
        && Objects.equals(diskThroughput, that.diskThroughput)
        && Objects.equals(diskType, that.diskType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskCount, diskIops, diskSize, diskThroughput, diskType);
  }

  @Override
  public String toString() {
    return new ToStringer(DiskSpec.class)
        .add("diskCount", diskCount)
        .add("diskIops", diskIops)
        .add("diskSize", diskSize)
        .add("diskThroughput", diskThroughput)
        .add("diskType", diskType)
        .toString();
  }

  DiskSpecPb toPb() {
    DiskSpecPb pb = new DiskSpecPb();
    pb.setDiskCount(diskCount);
    pb.setDiskIops(diskIops);
    pb.setDiskSize(diskSize);
    pb.setDiskThroughput(diskThroughput);
    pb.setDiskType(diskType);

    return pb;
  }

  static DiskSpec fromPb(DiskSpecPb pb) {
    DiskSpec model = new DiskSpec();
    model.setDiskCount(pb.getDiskCount());
    model.setDiskIops(pb.getDiskIops());
    model.setDiskSize(pb.getDiskSize());
    model.setDiskThroughput(pb.getDiskThroughput());
    model.setDiskType(pb.getDiskType());

    return model;
  }

  public static class DiskSpecSerializer extends JsonSerializer<DiskSpec> {
    @Override
    public void serialize(DiskSpec value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DiskSpecPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DiskSpecDeserializer extends JsonDeserializer<DiskSpec> {
    @Override
    public DiskSpec deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DiskSpecPb pb = mapper.readValue(p, DiskSpecPb.class);
      return DiskSpec.fromPb(pb);
    }
  }
}
