// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
