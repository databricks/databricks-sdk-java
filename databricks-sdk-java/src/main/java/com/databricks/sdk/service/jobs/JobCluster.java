// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class JobCluster {
    /**
     * A unique name for the job cluster. This field is required and must be
     * unique within the job. `JobTaskSettings` may refer to this field to
     * determine which cluster to launch for the task execution.
     */
    @JsonProperty("job_cluster_key")
    private String jobClusterKey;
    
    /**
     * If new_cluster, a description of a cluster that is created for each task.
     */
    @JsonProperty("new_cluster")
    private Object /* MISSING TYPE */ newCluster;
    
    public JobCluster setJobClusterKey(String jobClusterKey) {
        this.jobClusterKey = jobClusterKey;
        return this;
    }

    public String getJobClusterKey() {
        return jobClusterKey;
    }
    
    public JobCluster setNewCluster(Object /* MISSING TYPE */ newCluster) {
        this.newCluster = newCluster;
        return this;
    }

    public Object /* MISSING TYPE */ getNewCluster() {
        return newCluster;
    }
    
}
