// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class TaskDependenciesItem {
    /**
     
     */
    @JsonProperty("task_key")
    private String taskKey;
    
    public TaskDependenciesItem setTaskKey(String taskKey) {
        this.taskKey = taskKey;
        return this;
    }

    public String getTaskKey() {
        return taskKey;
    }
    
}
