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
class DiskSpecPb {
  @JsonProperty("disk_count")
  private Long diskCount;

  @JsonProperty("disk_iops")
  private Long diskIops;

  @JsonProperty("disk_size")
  private Long diskSize;

  @JsonProperty("disk_throughput")
  private Long diskThroughput;

  @JsonProperty("disk_type")
  private DiskType diskType;

  public DiskSpecPb setDiskCount(Long diskCount) {
    this.diskCount = diskCount;
    return this;
  }

  public Long getDiskCount() {
    return diskCount;
  }

  public DiskSpecPb setDiskIops(Long diskIops) {
    this.diskIops = diskIops;
    return this;
  }

  public Long getDiskIops() {
    return diskIops;
  }

  public DiskSpecPb setDiskSize(Long diskSize) {
    this.diskSize = diskSize;
    return this;
  }

  public Long getDiskSize() {
    return diskSize;
  }

  public DiskSpecPb setDiskThroughput(Long diskThroughput) {
    this.diskThroughput = diskThroughput;
    return this;
  }

  public Long getDiskThroughput() {
    return diskThroughput;
  }

  public DiskSpecPb setDiskType(DiskType diskType) {
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
    DiskSpecPb that = (DiskSpecPb) o;
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
    return new ToStringer(DiskSpecPb.class)
        .add("diskCount", diskCount)
        .add("diskIops", diskIops)
        .add("diskSize", diskSize)
        .add("diskThroughput", diskThroughput)
        .add("diskType", diskType)
        .toString();
  }
}
