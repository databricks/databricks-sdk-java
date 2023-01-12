// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A filter to limit query history results. This field is optional.
 */
@Generated("databricks-sdk-generator")
public class QueryFilter {
    /**
     
     */
    @JsonProperty("query_start_time_range")
    private TimeRange queryStartTimeRange;
    
    /**
     
     */
    @JsonProperty("statuses")
    private java.util.List<QueryStatus> statuses;
    
    /**
     * A list of user IDs who ran the queries.
     */
    @JsonProperty("user_ids")
    private java.util.List<Long> userIds;
    
    /**
     * A list of warehouse IDs.
     */
    @JsonProperty("warehouse_ids")
    private java.util.List<String> warehouseIds;
    
    public QueryFilter setQueryStartTimeRange(TimeRange queryStartTimeRange) {
        this.queryStartTimeRange = queryStartTimeRange;
        return this;
    }

    public TimeRange getQueryStartTimeRange() {
        return queryStartTimeRange;
    }
    
    public QueryFilter setStatuses(java.util.List<QueryStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    public java.util.List<QueryStatus> getStatuses() {
        return statuses;
    }
    
    public QueryFilter setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }

    public java.util.List<Long> getUserIds() {
        return userIds;
    }
    
    public QueryFilter setWarehouseIds(java.util.List<String> warehouseIds) {
        this.warehouseIds = warehouseIds;
        return this;
    }

    public java.util.List<String> getWarehouseIds() {
        return warehouseIds;
    }
    
}
