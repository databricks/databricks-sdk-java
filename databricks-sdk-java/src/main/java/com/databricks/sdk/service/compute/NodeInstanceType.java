// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>NodeInstanceType class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>instanceTypeId</code>.</p>
   *
   * @param instanceTypeId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.NodeInstanceType} object
   */
  public NodeInstanceType setInstanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
    return this;
  }

  /**
   * <p>Getter for the field <code>instanceTypeId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstanceTypeId() {
    return instanceTypeId;
  }

  /**
   * <p>Setter for the field <code>localDiskSizeGb</code>.</p>
   *
   * @param localDiskSizeGb a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.NodeInstanceType} object
   */
  public NodeInstanceType setLocalDiskSizeGb(Long localDiskSizeGb) {
    this.localDiskSizeGb = localDiskSizeGb;
    return this;
  }

  /**
   * <p>Getter for the field <code>localDiskSizeGb</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLocalDiskSizeGb() {
    return localDiskSizeGb;
  }

  /**
   * <p>Setter for the field <code>localDisks</code>.</p>
   *
   * @param localDisks a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.NodeInstanceType} object
   */
  public NodeInstanceType setLocalDisks(Long localDisks) {
    this.localDisks = localDisks;
    return this;
  }

  /**
   * <p>Getter for the field <code>localDisks</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLocalDisks() {
    return localDisks;
  }

  /**
   * <p>Setter for the field <code>localNvmeDiskSizeGb</code>.</p>
   *
   * @param localNvmeDiskSizeGb a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.NodeInstanceType} object
   */
  public NodeInstanceType setLocalNvmeDiskSizeGb(Long localNvmeDiskSizeGb) {
    this.localNvmeDiskSizeGb = localNvmeDiskSizeGb;
    return this;
  }

  /**
   * <p>Getter for the field <code>localNvmeDiskSizeGb</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLocalNvmeDiskSizeGb() {
    return localNvmeDiskSizeGb;
  }

  /**
   * <p>Setter for the field <code>localNvmeDisks</code>.</p>
   *
   * @param localNvmeDisks a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.NodeInstanceType} object
   */
  public NodeInstanceType setLocalNvmeDisks(Long localNvmeDisks) {
    this.localNvmeDisks = localNvmeDisks;
    return this;
  }

  /**
   * <p>Getter for the field <code>localNvmeDisks</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLocalNvmeDisks() {
    return localNvmeDisks;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        instanceTypeId, localDiskSizeGb, localDisks, localNvmeDiskSizeGb, localNvmeDisks);
  }

  /** {@inheritDoc} */
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
