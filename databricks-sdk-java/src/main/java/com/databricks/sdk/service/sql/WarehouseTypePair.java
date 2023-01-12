// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class WarehouseTypePair {
    /**
     * If set to false the specific warehouse type will not be be allowed as a
     * value for warehouse_type in CreateWarehouse and EditWarehouse
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    
    /**
     
     */
    @JsonProperty("warehouse_type")
    private WarehouseType warehouseType;
    
    public WarehouseTypePair setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    
    public WarehouseTypePair setWarehouseType(WarehouseType warehouseType) {
        this.warehouseType = warehouseType;
        return this;
    }

    public WarehouseType getWarehouseType() {
        return warehouseType;
    }
    
}
