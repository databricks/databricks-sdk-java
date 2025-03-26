// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Attributes set during cluster creation which are related to GCP. */
@Generated
public class GcpAttributes {
  /**
   * This field determines whether the spark executors will be scheduled to run on preemptible VMs,
   * on-demand VMs, or preemptible VMs with a fallback to on-demand VMs if the former is
   * unavailable.
   */
  @JsonProperty("availability")
  private GcpAvailability availability;

  /** Boot disk size in GB */
  @JsonProperty("boot_disk_size")
  private Long bootDiskSize;

  /**
   * If provided, the cluster will impersonate the google service account when accessing gcloud
   * services (like GCS). The google service account must have previously been added to the
   * Databricks environment by an account administrator.
   */
  @JsonProperty("google_service_account")
  private String googleServiceAccount;

  /**
   * If provided, each node (workers and driver) in the cluster will have this number of local SSDs
   * attached. Each local SSD is 375GB in size. Refer to [GCP documentation] for the supported
   * number of local SSDs for each instance type.
   *
   * <p>[GCP documentation]:
   * https://cloud.google.com/compute/docs/disks/local-ssd#choose_number_local_ssds
   */
  @JsonProperty("local_ssd_count")
  private Long localSsdCount;

  /**
   * This field determines whether the spark executors will be scheduled to run on preemptible VMs
   * (when set to true) versus standard compute engine VMs (when set to false; default). Note: Soon
   * to be deprecated, use the 'availability' field instead.
   */
  @JsonProperty("use_preemptible_executors")
  private Boolean usePreemptibleExecutors;

  /**
   * Identifier for the availability zone in which the cluster resides. This can be one of the
   * following: - "HA" => High availability, spread nodes across availability zones for a Databricks
   * deployment region [default]. - "AUTO" => Databricks picks an availability zone to schedule the
   * cluster on. - A GCP availability zone => Pick One of the available zones for (machine type +
   * region) from https://cloud.google.com/compute/docs/regions-zones.
   */
  @JsonProperty("zone_id")
  private String zoneId;

  public GcpAttributes setAvailability(GcpAvailability availability) {
    this.availability = availability;
    return this;
  }

  public GcpAvailability getAvailability() {
    return availability;
  }

  public GcpAttributes setBootDiskSize(Long bootDiskSize) {
    this.bootDiskSize = bootDiskSize;
    return this;
  }

  public Long getBootDiskSize() {
    return bootDiskSize;
  }

  public GcpAttributes setGoogleServiceAccount(String googleServiceAccount) {
    this.googleServiceAccount = googleServiceAccount;
    return this;
  }

  public String getGoogleServiceAccount() {
    return googleServiceAccount;
  }

  public GcpAttributes setLocalSsdCount(Long localSsdCount) {
    this.localSsdCount = localSsdCount;
    return this;
  }

  public Long getLocalSsdCount() {
    return localSsdCount;
  }

  public GcpAttributes setUsePreemptibleExecutors(Boolean usePreemptibleExecutors) {
    this.usePreemptibleExecutors = usePreemptibleExecutors;
    return this;
  }

  public Boolean getUsePreemptibleExecutors() {
    return usePreemptibleExecutors;
  }

  public GcpAttributes setZoneId(String zoneId) {
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
    GcpAttributes that = (GcpAttributes) o;
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
    return new ToStringer(GcpAttributes.class)
        .add("availability", availability)
        .add("bootDiskSize", bootDiskSize)
        .add("googleServiceAccount", googleServiceAccount)
        .add("localSsdCount", localSsdCount)
        .add("usePreemptibleExecutors", usePreemptibleExecutors)
        .add("zoneId", zoneId)
        .toString();
  }
}
