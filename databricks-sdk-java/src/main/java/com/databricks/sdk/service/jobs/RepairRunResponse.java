// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class RepairRunResponse {
    /**
     * The ID of the repair.
     */
    @JsonProperty("repair_id")
    private Long repairId;
    
    public RepairRunResponse setRepairId(Long repairId) {
        this.repairId = repairId;
        return this;
    }

    public Long getRepairId() {
        return repairId;
    }
    
}
