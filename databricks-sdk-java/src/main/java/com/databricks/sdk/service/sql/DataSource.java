// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A JSON object representing a DBSQL data source / SQL warehouse.
 */
public class DataSource {
    /**
     * The unique identifier for this data source / SQL warehouse. Can be used
     * when creating / modifying queries and dashboards.
     */
    @JsonProperty("id")
    private String id;
    
    /**
     * The string name of this data source / SQL warehouse as it appears in the
     * Databricks SQL web application.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Reserved for internal use.
     */
    @JsonProperty("pause_reason")
    private String pauseReason;
    
    /**
     * Reserved for internal use.
     */
    @JsonProperty("paused")
    private Long paused;
    
    /**
     * Reserved for internal use.
     */
    @JsonProperty("supports_auto_limit")
    private Boolean supportsAutoLimit;
    
    /**
     * Reserved for internal use.
     */
    @JsonProperty("syntax")
    private String syntax;
    
    /**
     * The type of data source. For SQL warehouses, this will be
     * `databricks_internal`.
     */
    @JsonProperty("type")
    private String typeValue;
    
    /**
     * Reserved for internal use.
     */
    @JsonProperty("view_only")
    private Boolean viewOnly;
    
    /**
     * The ID of the associated SQL warehouse, if this data source is backed by
     * a SQL warehouse.
     */
    @JsonProperty("warehouse_id")
    private String warehouseId;
    
    public DataSource setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    public DataSource setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public DataSource setPauseReason(String pauseReason) {
        this.pauseReason = pauseReason;
        return this;
    }

    public String getPauseReason() {
        return pauseReason;
    }
    
    public DataSource setPaused(Long paused) {
        this.paused = paused;
        return this;
    }

    public Long getPaused() {
        return paused;
    }
    
    public DataSource setSupportsAutoLimit(Boolean supportsAutoLimit) {
        this.supportsAutoLimit = supportsAutoLimit;
        return this;
    }

    public Boolean getSupportsAutoLimit() {
        return supportsAutoLimit;
    }
    
    public DataSource setSyntax(String syntax) {
        this.syntax = syntax;
        return this;
    }

    public String getSyntax() {
        return syntax;
    }
    
    public DataSource setType(String typeValue) {
        this.typeValue = typeValue;
        return this;
    }

    public String getType() {
        return typeValue;
    }
    
    public DataSource setViewOnly(Boolean viewOnly) {
        this.viewOnly = viewOnly;
        return this;
    }

    public Boolean getViewOnly() {
        return viewOnly;
    }
    
    public DataSource setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }

    public String getWarehouseId() {
        return warehouseId;
    }
    
}
