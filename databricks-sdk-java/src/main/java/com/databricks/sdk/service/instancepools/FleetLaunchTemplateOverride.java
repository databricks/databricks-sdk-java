// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class FleetLaunchTemplateOverride {
    /**
     * User-assigned preferred availability zone. It will adjust to the default
     * zone of the worker environment if the preferred zone does not exist in
     * the subnet.
     */
    @JsonProperty("availability_zone")
    private String availabilityZone;
    
    /**
     
     */
    @JsonProperty("instance_type")
    private String instanceType;
    
    /**
     * The maximum price per unit hour that you are willing to pay for a Spot
     * Instance.
     */
    @JsonProperty("max_price")
    private Float maxPrice;
    
    /**
     * The priority for the launch template override. If AllocationStrategy is
     * set to prioritized, EC2 Fleet uses priority to determine which launch
     * template override or to use first in fulfilling On-Demand capacity. The
     * highest priority is launched first. Valid values are whole numbers
     * starting at 0. The lower the number, the higher the priority. If no
     * number is set, the launch template override has the lowest priority.
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
    
}
