// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Attributes set during cluster creation which are related to GCP. */
@Generated
class GcpAttributesPb {
  @JsonProperty("availability")
  private GcpAvailability availability;

  @JsonProperty("boot_disk_size")
  private Long bootDiskSize;

  @JsonProperty("google_service_account")
  private String googleServiceAccount;

  @JsonProperty("local_ssd_count")
  private Long localSsdCount;

  @JsonProperty("use_preemptible_executors")
  private Boolean usePreemptibleExecutors;

  @JsonProperty("zone_id")
  private String zoneId;

  public GcpAttributesPb setAvailability(GcpAvailability availability) {
    this.availability = availability;
    return this;
  }

  public GcpAvailability getAvailability() {
    return availability;
  }

  public GcpAttributesPb setBootDiskSize(Long bootDiskSize) {
    this.bootDiskSize = bootDiskSize;
    return this;
  }

  public Long getBootDiskSize() {
    return bootDiskSize;
  }

  public GcpAttributesPb setGoogleServiceAccount(String googleServiceAccount) {
    this.googleServiceAccount = googleServiceAccount;
    return this;
  }

  public String getGoogleServiceAccount() {
    return googleServiceAccount;
  }

  public GcpAttributesPb setLocalSsdCount(Long localSsdCount) {
    this.localSsdCount = localSsdCount;
    return this;
  }

  public Long getLocalSsdCount() {
    return localSsdCount;
  }

  public GcpAttributesPb setUsePreemptibleExecutors(Boolean usePreemptibleExecutors) {
    this.usePreemptibleExecutors = usePreemptibleExecutors;
    return this;
  }

  public Boolean getUsePreemptibleExecutors() {
    return usePreemptibleExecutors;
  }

  public GcpAttributesPb setZoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

  public String getZoneId() {
    return zoneId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpAttributesPb that = (GcpAttributesPb) o;
    return Objects.equals(availability, that.availability)
        && Objects.equals(bootDiskSize, that.bootDiskSize)
        && Objects.equals(googleServiceAccount, that.googleServiceAccount)
        && Objects.equals(localSsdCount, that.localSsdCount)
        && Objects.equals(usePreemptibleExecutors, that.usePreemptibleExecutors)
        && Objects.equals(zoneId, that.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        availability,
        bootDiskSize,
        googleServiceAccount,
        localSsdCount,
        usePreemptibleExecutors,
        zoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpAttributesPb.class)
        .add("availability", availability)
        .add("bootDiskSize", bootDiskSize)
        .add("googleServiceAccount", googleServiceAccount)
        .add("localSsdCount", localSsdCount)
        .add("usePreemptibleExecutors", usePreemptibleExecutors)
        .add("zoneId", zoneId)
        .toString();
  }
}
