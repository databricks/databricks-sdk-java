// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class RefreshSchedule {
    /**
     * Cron string representing the refresh schedule.
     */
    @JsonProperty("cron")
    private String cron;
    
    /**
     * ID of the SQL warehouse to refresh with. If `null`, query's SQL warehouse
     * will be used to refresh.
     */
    @JsonProperty("data_source_id")
    private String dataSourceId;
    
    /**
     * ID of the refresh schedule.
     */
    @JsonProperty("id")
    private String id;
    
    public RefreshSchedule setCron(String cron) {
        this.cron = cron;
        return this;
    }

    public String getCron() {
        return cron;
    }
    
    public RefreshSchedule setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }
    
    public RefreshSchedule setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
}
