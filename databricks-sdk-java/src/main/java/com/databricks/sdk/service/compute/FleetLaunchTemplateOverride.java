// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>FleetLaunchTemplateOverride class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>availabilityZone</code>.</p>
   *
   * @param availabilityZone a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.FleetLaunchTemplateOverride} object
   */
  public FleetLaunchTemplateOverride setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
    return this;
  }

  /**
   * <p>Getter for the field <code>availabilityZone</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * <p>Setter for the field <code>instanceType</code>.</p>
   *
   * @param instanceType a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.FleetLaunchTemplateOverride} object
   */
  public FleetLaunchTemplateOverride setInstanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  /**
   * <p>Getter for the field <code>instanceType</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * <p>Setter for the field <code>maxPrice</code>.</p>
   *
   * @param maxPrice a {@link java.lang.Float} object
   * @return a {@link com.databricks.sdk.service.compute.FleetLaunchTemplateOverride} object
   */
  public FleetLaunchTemplateOverride setMaxPrice(Float maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

  /**
   * <p>Getter for the field <code>maxPrice</code>.</p>
   *
   * @return a {@link java.lang.Float} object
   */
  public Float getMaxPrice() {
    return maxPrice;
  }

  /**
   * <p>Setter for the field <code>priority</code>.</p>
   *
   * @param priority a {@link java.lang.Float} object
   * @return a {@link com.databricks.sdk.service.compute.FleetLaunchTemplateOverride} object
   */
  public FleetLaunchTemplateOverride setPriority(Float priority) {
    this.priority = priority;
    return this;
  }

  /**
   * <p>Getter for the field <code>priority</code>.</p>
   *
   * @return a {@link java.lang.Float} object
   */
  public Float getPriority() {
    return priority;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(availabilityZone, instanceType, maxPrice, priority);
  }

  /** {@inheritDoc} */
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
