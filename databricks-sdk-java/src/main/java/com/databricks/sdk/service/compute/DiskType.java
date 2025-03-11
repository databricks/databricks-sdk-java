// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Describes the disk type. */
@Generated
public class DiskType {
  /**
   * All Azure Disk types that Databricks supports. See
   * https://docs.microsoft.com/en-us/azure/storage/storage-about-disks-and-vhds-linux#types-of-disks
   */
  @JsonProperty("azure_disk_volume_type")
  private DiskTypeAzureDiskVolumeType azureDiskVolumeType;

  /**
   * All EBS volume types that Databricks supports. See https://aws.amazon.com/ebs/details/ for
   * details.
   */
  @JsonProperty("ebs_volume_type")
  private DiskTypeEbsVolumeType ebsVolumeType;

  public DiskType setAzureDiskVolumeType(DiskTypeAzureDiskVolumeType azureDiskVolumeType) {
    this.azureDiskVolumeType = azureDiskVolumeType;
    return this;
  }

  public DiskTypeAzureDiskVolumeType getAzureDiskVolumeType() {
    return azureDiskVolumeType;
  }

  public DiskType setEbsVolumeType(DiskTypeEbsVolumeType ebsVolumeType) {
    this.ebsVolumeType = ebsVolumeType;
    return this;
  }

  public DiskTypeEbsVolumeType getEbsVolumeType() {
    return ebsVolumeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiskType that = (DiskType) o;
    return Objects.equals(azureDiskVolumeType, that.azureDiskVolumeType)
        && Objects.equals(ebsVolumeType, that.ebsVolumeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureDiskVolumeType, ebsVolumeType);
  }

  @Override
  public String toString() {
    return new ToStringer(DiskType.class)
        .add("azureDiskVolumeType", azureDiskVolumeType)
        .add("ebsVolumeType", ebsVolumeType)
        .toString();
  }
}
