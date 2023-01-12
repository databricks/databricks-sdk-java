// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GetPipelineResponse {
    /**
     * An optional message detailing the cause of the pipeline state.
     */
    @JsonProperty("cause")
    private String cause;
    
    /**
     * The ID of the cluster that the pipeline is running on.
     */
    @JsonProperty("cluster_id")
    private String clusterId;
    
    /**
     * The username of the pipeline creator.
     */
    @JsonProperty("creator_user_name")
    private String creatorUserName;
    
    /**
     * The health of a pipeline.
     */
    @JsonProperty("health")
    private GetPipelineResponseHealth health;
    
    /**
     * The last time the pipeline settings were modified or created.
     */
    @JsonProperty("last_modified")
    private Long lastModified;
    
    /**
     * Status of the latest updates for the pipeline. Ordered with the newest
     * update first.
     */
    @JsonProperty("latest_updates")
    private java.util.List<UpdateStateInfo> latestUpdates;
    
    /**
     * A human friendly identifier for the pipeline, taken from the `spec`.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * The ID of the pipeline.
     */
    @JsonProperty("pipeline_id")
    private String pipelineId;
    
    /**
     * Username of the user that the pipeline will run on behalf of.
     */
    @JsonProperty("run_as_user_name")
    private String runAsUserName;
    
    /**
     * The pipeline specification. This field is not returned when called by
     * `ListPipelines`.
     */
    @JsonProperty("spec")
    private PipelineSpec spec;
    
    /**
     * The pipeline state.
     */
    @JsonProperty("state")
    private PipelineState state;
    
    public GetPipelineResponse setCause(String cause) {
        this.cause = cause;
        return this;
    }

    public String getCause() {
        return cause;
    }
    
    public GetPipelineResponse setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
    public GetPipelineResponse setCreatorUserName(String creatorUserName) {
        this.creatorUserName = creatorUserName;
        return this;
    }

    public String getCreatorUserName() {
        return creatorUserName;
    }
    
    public GetPipelineResponse setHealth(GetPipelineResponseHealth health) {
        this.health = health;
        return this;
    }

    public GetPipelineResponseHealth getHealth() {
        return health;
    }
    
    public GetPipelineResponse setLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    public Long getLastModified() {
        return lastModified;
    }
    
    public GetPipelineResponse setLatestUpdates(java.util.List<UpdateStateInfo> latestUpdates) {
        this.latestUpdates = latestUpdates;
        return this;
    }

    public java.util.List<UpdateStateInfo> getLatestUpdates() {
        return latestUpdates;
    }
    
    public GetPipelineResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public GetPipelineResponse setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    public String getPipelineId() {
        return pipelineId;
    }
    
    public GetPipelineResponse setRunAsUserName(String runAsUserName) {
        this.runAsUserName = runAsUserName;
        return this;
    }

    public String getRunAsUserName() {
        return runAsUserName;
    }
    
    public GetPipelineResponse setSpec(PipelineSpec spec) {
        this.spec = spec;
        return this;
    }

    public PipelineSpec getSpec() {
        return spec;
    }
    
    public GetPipelineResponse setState(PipelineState state) {
        this.state = state;
        return this;
    }

    public PipelineState getState() {
        return state;
    }
    
}
