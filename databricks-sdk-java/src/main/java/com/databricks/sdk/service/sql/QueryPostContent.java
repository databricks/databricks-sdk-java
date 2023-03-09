// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class QueryPostContent {
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
     * The identifier of the workspace folder containing the query. The default
     * is the user's home folder.
     */
    @JsonProperty("parent")
    private String parent;
    
    /**
     * The text of the query.
     */
    @JsonProperty("query")
    private String query;
    
    public QueryPostContent setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }
    
    public QueryPostContent setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }
    
    public QueryPostContent setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public QueryPostContent setOptions(Object /* MISSING TYPE */ options) {
        this.options = options;
        return this;
    }

    public Object /* MISSING TYPE */ getOptions() {
        return options;
    }
    
    public QueryPostContent setParent(String parent) {
        this.parent = parent;
        return this;
    }

    public String getParent() {
        return parent;
    }
    
    public QueryPostContent setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getQuery() {
        return query;
    }
    
}
