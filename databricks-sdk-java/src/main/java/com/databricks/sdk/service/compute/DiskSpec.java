// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Describes the disks that are launched for each instance in the spark cluster. For example, if the
 * cluster has 3 instances, each instance is configured to launch 2 disks, 100 GiB each, then
 * Databricks will launch a total of 6 disks, 100 GiB each, for this cluster.
 */
@Generated
public class DiskSpec {
  /**
   * The number of disks launched for each instance:
   *
   * <ul>
   *   <li>This feature is only enabled for supported node types.
   *   <li>Users can choose up to the limit of the disks supported by the node type.
   *   <li>For node types with no OS disk, at least one disk must be specified; otherwise, cluster
   *       creation will fail.
   * </ul>
   *
   * <p>If disks are attached, Databricks will configure Spark to use only the disks for scratch
   * storage, because heterogenously sized scratch devices can lead to inefficient disk utilization.
   * If no disks are attached, Databricks will configure Spark to use instance store disks.
   *
   * <p>Note: If disks are specified, then the Spark configuration {@code spark.local.dir} will be
   * overridden.
   *
   * <p>Disks will be mounted at:
   *
   * <ul>
   *   <li>For AWS: {@code /ebs0}, {@code /ebs1}, and etc.
   *   <li>For Azure: {@code /remote_volume0}, {@code /remote_volume1}, and etc.
   * </ul>
   */
  @JsonProperty("disk_count")
  private Long diskCount;

  /** */
  @JsonProperty("disk_iops")
  private Long diskIops;

  /**
   * The size of each disk (in GiB) launched for each instance. Values must fall into the supported
   * range for a particular instance type.
   *
   * <p>For AWS:
   *
   * <ul>
   *   <li>General Purpose SSD: 100 - 4096 GiB
   *   <li>Throughput Optimized HDD: 500 - 4096 GiB
   * </ul>
   *
   * <p>For Azure:
   *
   * <ul>
   *   <li>Premium LRS (SSD): 1 - 1023 GiB
   *   <li>Standard LRS (HDD): 1- 1023 GiB
   * </ul>
   */
  @JsonProperty("disk_size")
  private Long diskSize;

  /** */
  @JsonProperty("disk_throughput")
  private Long diskThroughput;

  /** The type of disks that will be launched with this cluster. */
  @JsonProperty("disk_type")
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
}
