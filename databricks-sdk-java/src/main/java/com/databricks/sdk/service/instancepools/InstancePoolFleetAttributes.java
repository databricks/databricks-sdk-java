// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class InstancePoolFleetAttributes {
    /**
     
     */
    @JsonProperty("fleet_on_demand_option")
    private FleetOnDemandOption fleetOnDemandOption;
    
    /**
     
     */
    @JsonProperty("fleet_spot_option")
    private FleetSpotOption fleetSpotOption;
    
    /**
     
     */
    @JsonProperty("launch_template_overrides")
    private java.util.List<FleetLaunchTemplateOverride> launchTemplateOverrides;
    
    public InstancePoolFleetAttributes setFleetOnDemandOption(FleetOnDemandOption fleetOnDemandOption) {
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
    
    public InstancePoolFleetAttributes setLaunchTemplateOverrides(java.util.List<FleetLaunchTemplateOverride> launchTemplateOverrides) {
        this.launchTemplateOverrides = launchTemplateOverrides;
        return this;
    }

    public java.util.List<FleetLaunchTemplateOverride> getLaunchTemplateOverrides() {
        return launchTemplateOverrides;
    }
    
}
