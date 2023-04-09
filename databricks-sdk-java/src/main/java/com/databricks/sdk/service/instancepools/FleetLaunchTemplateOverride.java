// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class FleetLaunchTemplateOverride {
  /**
   * User-assigned preferred availability zone. It will adjust to the default zone of the worker
   * environment if the preferred zone does not exist in the subnet.
   */
  @JsonProperty("availability_zone")
  private String availabilityZone;

  /** */
  @JsonProperty("instance_type")
  private String instanceType;

  /** The maximum price per unit hour that you are willing to pay for a Spot Instance. */
  @JsonProperty("max_price")
  private Float maxPrice;

  /**
   * The priority for the launch template override. If AllocationStrategy is set to prioritized, EC2
   * Fleet uses priority to determine which launch template override or to use first in fulfilling
   * On-Demand capacity. The highest priority is launched first. Valid values are whole numbers
   * starting at 0. The lower the number, the higher the priority. If no number is set, the launch
   * template override has the lowest priority.
   */
  @JsonProperty("priority")
  private Float priority;

  public FleetLaunchTemplateOverride setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
    return this;
  }

  public String getAvailabilityZone() {
    return availabilityZone;
  }

  public FleetLaunchTemplateOverride setInstanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  public String getInstanceType() {
    return instanceType;
  }

  public FleetLaunchTemplateOverride setMaxPrice(Float maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

  public Float getMaxPrice() {
    return maxPrice;
  }

  public FleetLaunchTemplateOverride setPriority(Float priority) {
    this.priority = priority;
    return this;
  }

  public Float getPriority() {
    return priority;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FleetLaunchTemplateOverride that = (FleetLaunchTemplateOverride) o;
    return Objects.equals(availabilityZone, that.availabilityZone)
        && Objects.equals(instanceType, that.instanceType)
        && Objects.equals(maxPrice, that.maxPrice)
        && Objects.equals(priority, that.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityZone, instanceType, maxPrice, priority);
  }

  @Override
  public String toString() {
    return new ToStringer(FleetLaunchTemplateOverride.class)
        .add("availabilityZone", availabilityZone)
        .add("instanceType", instanceType)
        .add("maxPrice", maxPrice)
        .add("priority", priority)
        .toString();
  }
}
