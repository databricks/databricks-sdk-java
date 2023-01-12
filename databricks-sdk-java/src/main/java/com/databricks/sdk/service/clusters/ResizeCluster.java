// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ResizeCluster {
    /**
     * Parameters needed in order to automatically scale clusters up and down
     * based on load. Note: autoscaling works best with DB runtime versions 3.0
     * or later.
     */
    @JsonProperty("autoscale")
    private AutoScale autoscale;
    
    /**
     * The cluster to be resized.
     */
    @JsonProperty("cluster_id")
    private String clusterId;
    
    /**
     * Number of worker nodes that this cluster should have. A cluster has one
     * Spark Driver and `num_workers` Executors for a total of `num_workers` + 1
     * Spark nodes.
     * 
     * Note: When reading the properties of a cluster, this field reflects the
     * desired number of workers rather than the actual current number of
     * workers. For instance, if a cluster is resized from 5 to 10 workers, this
     * field will immediately be updated to reflect the target size of 10
     * workers, whereas the workers listed in `spark_info` will gradually
     * increase from 5 to 10 as the new nodes are provisioned.
     */
    @JsonProperty("num_workers")
    private Long numWorkers;
    
    public ResizeCluster setAutoscale(AutoScale autoscale) {
        this.autoscale = autoscale;
        return this;
    }

    public AutoScale getAutoscale() {
        return autoscale;
    }
    
    public ResizeCluster setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
    public ResizeCluster setNumWorkers(Long numWorkers) {
        this.numWorkers = numWorkers;
        return this;
    }

    public Long getNumWorkers() {
        return numWorkers;
    }
    
}
