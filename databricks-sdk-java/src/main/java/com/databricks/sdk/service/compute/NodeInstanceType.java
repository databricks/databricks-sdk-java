// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class NodeInstanceType {
  /** */
  @JsonProperty("instance_type_id")
  private String instanceTypeId;

  /** */
  @JsonProperty("local_disk_size_gb")
  private Long localDiskSizeGb;

  /** */
  @JsonProperty("local_disks")
  private Long localDisks;

  /** */
  @JsonProperty("local_nvme_disk_size_gb")
  private Long localNvmeDiskSizeGb;

  /** */
  @JsonProperty("local_nvme_disks")
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
}
