// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>DiskType class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DiskType {
  /** */
  @JsonProperty("azure_disk_volume_type")
  private DiskTypeAzureDiskVolumeType azureDiskVolumeType;

  /** */
  @JsonProperty("ebs_volume_type")
  private DiskTypeEbsVolumeType ebsVolumeType;

  /**
   * <p>Setter for the field <code>azureDiskVolumeType</code>.</p>
   *
   * @param azureDiskVolumeType a {@link com.databricks.sdk.service.compute.DiskTypeAzureDiskVolumeType} object
   * @return a {@link com.databricks.sdk.service.compute.DiskType} object
   */
  public DiskType setAzureDiskVolumeType(DiskTypeAzureDiskVolumeType azureDiskVolumeType) {
    this.azureDiskVolumeType = azureDiskVolumeType;
    return this;
  }

  /**
   * <p>Getter for the field <code>azureDiskVolumeType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.DiskTypeAzureDiskVolumeType} object
   */
  public DiskTypeAzureDiskVolumeType getAzureDiskVolumeType() {
    return azureDiskVolumeType;
  }

  /**
   * <p>Setter for the field <code>ebsVolumeType</code>.</p>
   *
   * @param ebsVolumeType a {@link com.databricks.sdk.service.compute.DiskTypeEbsVolumeType} object
   * @return a {@link com.databricks.sdk.service.compute.DiskType} object
   */
  public DiskType setEbsVolumeType(DiskTypeEbsVolumeType ebsVolumeType) {
    this.ebsVolumeType = ebsVolumeType;
    return this;
  }

  /**
   * <p>Getter for the field <code>ebsVolumeType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.DiskTypeEbsVolumeType} object
   */
  public DiskTypeEbsVolumeType getEbsVolumeType() {
    return ebsVolumeType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiskType that = (DiskType) o;
    return Objects.equals(azureDiskVolumeType, that.azureDiskVolumeType)
        && Objects.equals(ebsVolumeType, that.ebsVolumeType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(azureDiskVolumeType, ebsVolumeType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DiskType.class)
        .add("azureDiskVolumeType", azureDiskVolumeType)
        .add("ebsVolumeType", ebsVolumeType)
        .toString();
  }
}
