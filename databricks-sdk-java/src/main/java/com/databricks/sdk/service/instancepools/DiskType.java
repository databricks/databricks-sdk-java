// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class DiskType {
  /** */
  @JsonProperty("azure_disk_volume_type")
  private DiskTypeAzureDiskVolumeType azureDiskVolumeType;

  /** */
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
