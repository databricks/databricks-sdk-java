// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class InstancePoolGcpAttributes {
  /**
   * This field determines whether the instance pool will contain preemptible
   * VMs, on-demand VMs, or preemptible VMs with a fallback to on-demand VMs if
   * the former is unavailable.
   */
  @JsonProperty("gcp_availability")
  private GcpAvailability gcpAvailability;
  
  /**
   * If provided, each node in the instance pool will have this number of local
   * SSDs attached. Each local SSD is 375GB in size. Refer to [GCP
   * documentation] for the supported number of local SSDs for each instance
   * type.
   * 
   * [GCP documentation]: https://cloud.google.com/compute/docs/disks/local-ssd#choose_number_local_ssds
   */
  @JsonProperty("local_ssd_count")
  private Long localSsdCount;
  
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
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolGcpAttributes that = (InstancePoolGcpAttributes) o;
    return Objects.equals(gcpAvailability, that.gcpAvailability)
    && Objects.equals(localSsdCount, that.localSsdCount)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcpAvailability, localSsdCount);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolGcpAttributes.class)
      .add("gcpAvailability", gcpAvailability)
      .add("localSsdCount", localSsdCount).toString();
  }
}
