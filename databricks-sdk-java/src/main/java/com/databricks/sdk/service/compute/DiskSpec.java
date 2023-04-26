// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>DiskSpec class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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
  @JsonProperty("disk_count")
  private Long diskCount;

  /** */
  @JsonProperty("disk_iops")
  private Long diskIops;

  /**
   * The size of each disk (in GiB) launched for each instance. Values must fall into the supported
   * range for a particular instance type.
   *
   * <p>For AWS: - General Purpose SSD: 100 - 4096 GiB - Throughput Optimized HDD: 500 - 4096 GiB
   *
   * <p>For Azure: - Premium LRS (SSD): 1 - 1023 GiB - Standard LRS (HDD): 1- 1023 GiB
   */
  @JsonProperty("disk_size")
  private Long diskSize;

  /** */
  @JsonProperty("disk_throughput")
  private Long diskThroughput;

  /** The type of disks that will be launched with this cluster. */
  @JsonProperty("disk_type")
  private DiskType diskType;

  /**
   * <p>Setter for the field <code>diskCount</code>.</p>
   *
   * @param diskCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.DiskSpec} object
   */
  public DiskSpec setDiskCount(Long diskCount) {
    this.diskCount = diskCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>diskCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getDiskCount() {
    return diskCount;
  }

  /**
   * <p>Setter for the field <code>diskIops</code>.</p>
   *
   * @param diskIops a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.DiskSpec} object
   */
  public DiskSpec setDiskIops(Long diskIops) {
    this.diskIops = diskIops;
    return this;
  }

  /**
   * <p>Getter for the field <code>diskIops</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getDiskIops() {
    return diskIops;
  }

  /**
   * <p>Setter for the field <code>diskSize</code>.</p>
   *
   * @param diskSize a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.DiskSpec} object
   */
  public DiskSpec setDiskSize(Long diskSize) {
    this.diskSize = diskSize;
    return this;
  }

  /**
   * <p>Getter for the field <code>diskSize</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getDiskSize() {
    return diskSize;
  }

  /**
   * <p>Setter for the field <code>diskThroughput</code>.</p>
   *
   * @param diskThroughput a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.DiskSpec} object
   */
  public DiskSpec setDiskThroughput(Long diskThroughput) {
    this.diskThroughput = diskThroughput;
    return this;
  }

  /**
   * <p>Getter for the field <code>diskThroughput</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getDiskThroughput() {
    return diskThroughput;
  }

  /**
   * <p>Setter for the field <code>diskType</code>.</p>
   *
   * @param diskType a {@link com.databricks.sdk.service.compute.DiskType} object
   * @return a {@link com.databricks.sdk.service.compute.DiskSpec} object
   */
  public DiskSpec setDiskType(DiskType diskType) {
    this.diskType = diskType;
    return this;
  }

  /**
   * <p>Getter for the field <code>diskType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.DiskType} object
   */
  public DiskType getDiskType() {
    return diskType;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(diskCount, diskIops, diskSize, diskThroughput, diskType);
  }

  /** {@inheritDoc} */
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
