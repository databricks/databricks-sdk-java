// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List all jobs
 */
public class List {
    /**
     * Whether to include task and cluster details in the response.
     */
    @QueryParam("expand_tasks")
    private Boolean expandTasks;
    
    /**
     * The number of jobs to return. This value must be greater than 0 and less
     * or equal to 25. The default value is 20.
     */
    @QueryParam("limit")
    private Long limit;
    
    /**
     * A filter on the list based on the exact (case insensitive) job name.
     */
    @QueryParam("name")
    private String name;
    
    /**
     * The offset of the first job to return, relative to the most recently
     * created job.
     */
    @QueryParam("offset")
    private Long offset;
    
    public List setExpandTasks(Boolean expandTasks) {
        this.expandTasks = expandTasks;
        return this;
    }

    public Boolean getExpandTasks() {
        return expandTasks;
    }
    
    public List setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    public Long getLimit() {
        return limit;
    }
    
    public List setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public List setOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    public Long getOffset() {
        return offset;
    }
    
}
