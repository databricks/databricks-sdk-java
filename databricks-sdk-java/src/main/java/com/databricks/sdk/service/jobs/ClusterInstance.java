// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ClusterInstance {
    /**
     * The canonical identifier for the cluster used by a run. This field is
     * always available for runs on existing clusters. For runs on new clusters,
     * it becomes available once the cluster is created. This value can be used
     * to view logs by browsing to `/#setting/sparkui/$cluster_id/driver-logs`.
     * The logs continue to be available after the run completes.
     * 
     * The response won’t include this field if the identifier is not
     * available yet.
     */
    @JsonProperty("cluster_id")
    private String clusterId;
    
    /**
     * The canonical identifier for the Spark context used by a run. This field
     * is filled in once the run begins execution. This value can be used to
     * view the Spark UI by browsing to
     * `/#setting/sparkui/$cluster_id/$spark_context_id`. The Spark UI continues
     * to be available after the run has completed.
     * 
     * The response won’t include this field if the identifier is not
     * available yet.
     */
    @JsonProperty("spark_context_id")
    private String sparkContextId;
    
    public ClusterInstance setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
    public ClusterInstance setSparkContextId(String sparkContextId) {
        this.sparkContextId = sparkContextId;
        return this;
    }

    public String getSparkContextId() {
        return sparkContextId;
    }
    
}
