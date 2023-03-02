// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class QueryEditContent {
    /**
     * The ID of the data source / SQL warehouse where this query will run.
     */
    @JsonProperty("data_source_id")
    private String dataSourceId;
    
    /**
     * General description that can convey additional information about this
     * query such as usage notes.
     */
    @JsonProperty("description")
    private String description;
    
    /**
     * The name or title of this query to display in list views.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Exclusively used for storing a list parameter definitions. A parameter is
     * an object with `title`, `name`, `type`, and `value` properties. The
     * `value` field here is the default value. It can be overridden at runtime.
     */
    @JsonProperty("options")
    private Object /* MISSING TYPE */ options;
    
    /**
     * The text of the query.
     */
    @JsonProperty("query")
    private String query;
    
    /**
     
     */
    
    private String queryId;
    
    /**
     * JSON object that describes the scheduled execution frequency. A schedule
     * object includes `interval`, `time`, `day_of_week`, and `until` fields. If
     * a scheduled is supplied, then only `interval` is required. All other
     * field can be `null`.
     */
    @JsonProperty("schedule")
    private QueryInterval schedule;
    
    public QueryEditContent setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }
    
    public QueryEditContent setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }
    
    public QueryEditContent setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public QueryEditContent setOptions(Object /* MISSING TYPE */ options) {
        this.options = options;
        return this;
    }

    public Object /* MISSING TYPE */ getOptions() {
        return options;
    }
    
    public QueryEditContent setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getQuery() {
        return query;
    }
    
    public QueryEditContent setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    public String getQueryId() {
        return queryId;
    }
    
    public QueryEditContent setSchedule(QueryInterval schedule) {
        this.schedule = schedule;
        return this;
    }

    public QueryInterval getSchedule() {
        return schedule;
    }
    
}
