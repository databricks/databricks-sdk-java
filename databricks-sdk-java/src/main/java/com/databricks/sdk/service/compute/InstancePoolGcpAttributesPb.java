// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Attributes set during instance pool creation which are related to GCP. */
@Generated
class InstancePoolGcpAttributesPb {
  @JsonProperty("gcp_availability")
  private GcpAvailability gcpAvailability;

  @JsonProperty("local_ssd_count")
  private Long localSsdCount;

  @JsonProperty("zone_id")
  private String zoneId;

  public InstancePoolGcpAttributesPb setGcpAvailability(GcpAvailability gcpAvailability) {
    this.gcpAvailability = gcpAvailability;
    return this;
  }

  public GcpAvailability getGcpAvailability() {
    return gcpAvailability;
  }

  public InstancePoolGcpAttributesPb setLocalSsdCount(Long localSsdCount) {
    this.localSsdCount = localSsdCount;
    return this;
  }

  public Long getLocalSsdCount() {
    return localSsdCount;
  }

  public InstancePoolGcpAttributesPb setZoneId(String zoneId) {
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
    InstancePoolGcpAttributesPb that = (InstancePoolGcpAttributesPb) o;
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
    return new ToStringer(InstancePoolGcpAttributesPb.class)
        .add("gcpAvailability", gcpAvailability)
        .add("localSsdCount", localSsdCount)
        .add("zoneId", zoneId)
        .toString();
  }
}
