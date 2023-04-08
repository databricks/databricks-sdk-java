// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GcpAttributes {
  /**
   * This field determines whether the spark executors will be scheduled to run on preemptible VMs,
   * on-demand VMs, or preemptible VMs with a fallback to on-demand VMs if the former is
   * unavailable.
   */
  @JsonProperty("availability")
  private GcpAvailability availability;

  /** boot disk size in GB */
  @JsonProperty("boot_disk_size")
  private Long bootDiskSize;

  /**
   * If provided, the cluster will impersonate the google service account when accessing gcloud
   * services (like GCS). The google service account must have previously been added to the
   * Databricks environment by an account administrator.
   */
  @JsonProperty("google_service_account")
  private String googleServiceAccount;

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
}
