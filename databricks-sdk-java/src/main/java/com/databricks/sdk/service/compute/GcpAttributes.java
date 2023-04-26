// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>GcpAttributes class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>availability</code>.</p>
   *
   * @param availability a {@link com.databricks.sdk.service.compute.GcpAvailability} object
   * @return a {@link com.databricks.sdk.service.compute.GcpAttributes} object
   */
  public GcpAttributes setAvailability(GcpAvailability availability) {
    this.availability = availability;
    return this;
  }

  /**
   * <p>Getter for the field <code>availability</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.GcpAvailability} object
   */
  public GcpAvailability getAvailability() {
    return availability;
  }

  /**
   * <p>Setter for the field <code>bootDiskSize</code>.</p>
   *
   * @param bootDiskSize a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.GcpAttributes} object
   */
  public GcpAttributes setBootDiskSize(Long bootDiskSize) {
    this.bootDiskSize = bootDiskSize;
    return this;
  }

  /**
   * <p>Getter for the field <code>bootDiskSize</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getBootDiskSize() {
    return bootDiskSize;
  }

  /**
   * <p>Setter for the field <code>googleServiceAccount</code>.</p>
   *
   * @param googleServiceAccount a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.GcpAttributes} object
   */
  public GcpAttributes setGoogleServiceAccount(String googleServiceAccount) {
    this.googleServiceAccount = googleServiceAccount;
    return this;
  }

  /**
   * <p>Getter for the field <code>googleServiceAccount</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getGoogleServiceAccount() {
    return googleServiceAccount;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpAttributes that = (GcpAttributes) o;
    return Objects.equals(availability, that.availability)
        && Objects.equals(bootDiskSize, that.bootDiskSize)
        && Objects.equals(googleServiceAccount, that.googleServiceAccount);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(availability, bootDiskSize, googleServiceAccount);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GcpAttributes.class)
        .add("availability", availability)
        .add("bootDiskSize", bootDiskSize)
        .add("googleServiceAccount", googleServiceAccount)
        .toString();
  }
}
