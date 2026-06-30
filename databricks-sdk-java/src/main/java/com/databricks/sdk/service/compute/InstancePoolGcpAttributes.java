// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Attributes set during instance pool creation which are related to GCP. */
@Generated
public class InstancePoolGcpAttributes {
  /** */
  @JsonProperty("gcp_availability")
  private GcpAvailability gcpAvailability;

  /**
   * If provided, each node in the instance pool will have this number of local SSDs attached. Each
   * local SSD is 375GB in size. Refer to [GCP documentation] for the supported number of local SSDs
   * for each instance type.
   *
   * <p>[GCP documentation]:
   * https://cloud.google.com/compute/docs/disks/local-ssd#choose_number_local_ssds
   */
  @JsonProperty("local_ssd_count")
  private Long localSsdCount;

  /**
   * Identifier for the availability zone/datacenter in which the cluster resides. This string will
   * be of a form like "us-west1-a". The provided availability zone must be in the same region as
   * the Databricks workspace. For example, "us-west1-a" is not a valid zone id if the Databricks
   * workspace resides in the "us-east1" region. This is an optional field at instance pool
   * creation, and if not specified, a default zone will be used.
   *
   * <p>This field can be one of the following: - "HA" => High availability, spread nodes across
   * availability zones for a Databricks deployment region - A GCP availability zone => Pick One of
   * the available zones for (machine type + region) from
   * https://cloud.google.com/compute/docs/regions-zones (e.g. "us-west1-a").
   *
   * <p>If empty, Databricks picks an availability zone to schedule the cluster on.
   */
  @JsonProperty("zone_id")
  private String zoneId;

  public InstancePoolGcpAttributes setGcpAvailability(GcpAvailability gcpAvailability) {
    this.gcpAvailability = gcpAvailability;
    return this;
  }

  public GcpAvailability getGcpAvailability() {
    return gcpAvailability;
  }

  public InstancePoolGcpAttributes setLocalSsdCount(Long localSsdCount) {
    this.localSsdCount = localSsdCount;
    return this;
  }

  public Long getLocalSsdCount() {
    return localSsdCount;
  }

  public InstancePoolGcpAttributes setZoneId(String zoneId) {
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
    InstancePoolGcpAttributes that = (InstancePoolGcpAttributes) o;
    return Objects.equals(gcpAvailability, that.gcpAvailability)
        && Objects.equals(localSsdCount, that.localSsdCount)
        && Objects.equals(zoneId, that.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcpAvailability, localSsdCount, zoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolGcpAttributes.class)
        .add("gcpAvailability", gcpAvailability)
        .add("localSsdCount", localSsdCount)
        .add("zoneId", zoneId)
        .toString();
  }
}
