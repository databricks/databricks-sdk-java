// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class FleetOnDemandOption {
    /**
     * Only lowest-price and prioritized are allowed
     */
    @JsonProperty("allocation_strategy")
    private FleetOnDemandOptionAllocationStrategy allocationStrategy;
    
    /**
     * The maximum amount per hour for On-Demand Instances that you're willing
     * to pay.
     */
    @JsonProperty("max_total_price")
    private Float maxTotalPrice;
    
    /**
     * If you specify use-capacity-reservations-first, the fleet uses unused
     * Capacity Reservations to fulfill On-Demand capacity up to the target
     * On-Demand capacity. If multiple instance pools have unused Capacity
     * Reservations, the On-Demand allocation strategy (lowest-price or
     * prioritized) is applied. If the number of unused Capacity Reservations is
     * less than the On-Demand target capacity, the remaining On-Demand target
     * capacity is launched according to the On-Demand allocation strategy
     * (lowest-price or prioritized).
     */
    @JsonProperty("use_capacity_reservations_first")
    private Boolean useCapacityReservationsFirst;
    
    public FleetOnDemandOption setAllocationStrategy(FleetOnDemandOptionAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }

    public FleetOnDemandOptionAllocationStrategy getAllocationStrategy() {
        return allocationStrategy;
    }
    
    public FleetOnDemandOption setMaxTotalPrice(Float maxTotalPrice) {
        this.maxTotalPrice = maxTotalPrice;
        return this;
    }

    public Float getMaxTotalPrice() {
        return maxTotalPrice;
    }
    
    public FleetOnDemandOption setUseCapacityReservationsFirst(Boolean useCapacityReservationsFirst) {
        this.useCapacityReservationsFirst = useCapacityReservationsFirst;
        return this;
    }

    public Boolean getUseCapacityReservationsFirst() {
        return useCapacityReservationsFirst;
    }
    
}
