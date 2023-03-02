// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateAlert {
    /**
     * Name of the alert.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Alert configuration options.
     */
    @JsonProperty("options")
    private AlertOptions options;
    
    /**
     * The identifier of the workspace folder containing the alert. The default
     * is ther user's home folder.
     */
    @JsonProperty("parent")
    private String parent;
    
    /**
     * ID of the query evaluated by the alert.
     */
    @JsonProperty("query_id")
    private String queryId;
    
    /**
     * Number of seconds after being triggered before the alert rearms itself
     * and can be triggered again. If `null`, alert will never be triggered
     * again.
     */
    @JsonProperty("rearm")
    private Long rearm;
    
    public CreateAlert setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public CreateAlert setOptions(AlertOptions options) {
        this.options = options;
        return this;
    }

    public AlertOptions getOptions() {
        return options;
    }
    
    public CreateAlert setParent(String parent) {
        this.parent = parent;
        return this;
    }

    public String getParent() {
        return parent;
    }
    
    public CreateAlert setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    public String getQueryId() {
        return queryId;
    }
    
    public CreateAlert setRearm(Long rearm) {
        this.rearm = rearm;
        return this;
    }

    public Long getRearm() {
        return rearm;
    }
    
}
