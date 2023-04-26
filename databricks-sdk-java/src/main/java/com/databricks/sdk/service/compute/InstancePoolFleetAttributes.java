// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>InstancePoolFleetAttributes class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class InstancePoolFleetAttributes {
  /** */
  @JsonProperty("fleet_on_demand_option")
  private FleetOnDemandOption fleetOnDemandOption;

  /** */
  @JsonProperty("fleet_spot_option")
  private FleetSpotOption fleetSpotOption;

  /** */
  @JsonProperty("launch_template_overrides")
  private Collection<FleetLaunchTemplateOverride> launchTemplateOverrides;

  /**
   * <p>Setter for the field <code>fleetOnDemandOption</code>.</p>
   *
   * @param fleetOnDemandOption a {@link com.databricks.sdk.service.compute.FleetOnDemandOption} object
   * @return a {@link com.databricks.sdk.service.compute.InstancePoolFleetAttributes} object
   */
  public InstancePoolFleetAttributes setFleetOnDemandOption(
      FleetOnDemandOption fleetOnDemandOption) {
    this.fleetOnDemandOption = fleetOnDemandOption;
    return this;
  }

  /**
   * <p>Getter for the field <code>fleetOnDemandOption</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.FleetOnDemandOption} object
   */
  public FleetOnDemandOption getFleetOnDemandOption() {
    return fleetOnDemandOption;
  }

  /**
   * <p>Setter for the field <code>fleetSpotOption</code>.</p>
   *
   * @param fleetSpotOption a {@link com.databricks.sdk.service.compute.FleetSpotOption} object
   * @return a {@link com.databricks.sdk.service.compute.InstancePoolFleetAttributes} object
   */
  public InstancePoolFleetAttributes setFleetSpotOption(FleetSpotOption fleetSpotOption) {
    this.fleetSpotOption = fleetSpotOption;
    return this;
  }

  /**
   * <p>Getter for the field <code>fleetSpotOption</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.FleetSpotOption} object
   */
  public FleetSpotOption getFleetSpotOption() {
    return fleetSpotOption;
  }

  /**
   * <p>Setter for the field <code>launchTemplateOverrides</code>.</p>
   *
   * @param launchTemplateOverrides a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.InstancePoolFleetAttributes} object
   */
  public InstancePoolFleetAttributes setLaunchTemplateOverrides(
      Collection<FleetLaunchTemplateOverride> launchTemplateOverrides) {
    this.launchTemplateOverrides = launchTemplateOverrides;
    return this;
  }

  /**
   * <p>Getter for the field <code>launchTemplateOverrides</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<FleetLaunchTemplateOverride> getLaunchTemplateOverrides() {
    return launchTemplateOverrides;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolFleetAttributes that = (InstancePoolFleetAttributes) o;
    return Objects.equals(fleetOnDemandOption, that.fleetOnDemandOption)
        && Objects.equals(fleetSpotOption, that.fleetSpotOption)
        && Objects.equals(launchTemplateOverrides, that.launchTemplateOverrides);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(fleetOnDemandOption, fleetSpotOption, launchTemplateOverrides);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(InstancePoolFleetAttributes.class)
        .add("fleetOnDemandOption", fleetOnDemandOption)
        .add("fleetSpotOption", fleetSpotOption)
        .add("launchTemplateOverrides", launchTemplateOverrides)
        .toString();
  }
}
