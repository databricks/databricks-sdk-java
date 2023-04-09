// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

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

  public InstancePoolFleetAttributes setFleetOnDemandOption(
      FleetOnDemandOption fleetOnDemandOption) {
    this.fleetOnDemandOption = fleetOnDemandOption;
    return this;
  }

  public FleetOnDemandOption getFleetOnDemandOption() {
    return fleetOnDemandOption;
  }

  public InstancePoolFleetAttributes setFleetSpotOption(FleetSpotOption fleetSpotOption) {
    this.fleetSpotOption = fleetSpotOption;
    return this;
  }

  public FleetSpotOption getFleetSpotOption() {
    return fleetSpotOption;
  }

  public InstancePoolFleetAttributes setLaunchTemplateOverrides(
      Collection<FleetLaunchTemplateOverride> launchTemplateOverrides) {
    this.launchTemplateOverrides = launchTemplateOverrides;
    return this;
  }

  public Collection<FleetLaunchTemplateOverride> getLaunchTemplateOverrides() {
    return launchTemplateOverrides;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolFleetAttributes that = (InstancePoolFleetAttributes) o;
    return Objects.equals(fleetOnDemandOption, that.fleetOnDemandOption)
        && Objects.equals(fleetSpotOption, that.fleetSpotOption)
        && Objects.equals(launchTemplateOverrides, that.launchTemplateOverrides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fleetOnDemandOption, fleetSpotOption, launchTemplateOverrides);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolFleetAttributes.class)
        .add("fleetOnDemandOption", fleetOnDemandOption)
        .add("fleetSpotOption", fleetSpotOption)
        .add("launchTemplateOverrides", launchTemplateOverrides)
        .toString();
  }
}
