// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Describes the disk type. */
@Generated
class DiskTypePb {
  @JsonProperty("azure_disk_volume_type")
  private DiskTypeAzureDiskVolumeType azureDiskVolumeType;

  @JsonProperty("ebs_volume_type")
  private DiskTypeEbsVolumeType ebsVolumeType;

  public DiskTypePb setAzureDiskVolumeType(DiskTypeAzureDiskVolumeType azureDiskVolumeType) {
    this.azureDiskVolumeType = azureDiskVolumeType;
    return this;
  }

  public DiskTypeAzureDiskVolumeType getAzureDiskVolumeType() {
    return azureDiskVolumeType;
  }

  public DiskTypePb setEbsVolumeType(DiskTypeEbsVolumeType ebsVolumeType) {
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
    DiskTypePb that = (DiskTypePb) o;
    return Objects.equals(azureDiskVolumeType, that.azureDiskVolumeType)
        && Objects.equals(ebsVolumeType, that.ebsVolumeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureDiskVolumeType, ebsVolumeType);
  }

  @Override
  public String toString() {
    return new ToStringer(DiskTypePb.class)
        .add("azureDiskVolumeType", azureDiskVolumeType)
        .add("ebsVolumeType", ebsVolumeType)
        .toString();
  }
}
