// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GetWarehouseResponse {
    /**
     * The amount of time in minutes that a SQL Endpoint must be idle (i.e., no
     * RUNNING queries) before it is automatically stopped.
     * 
     * Supported values: - Must be == 0 or >= 10 mins - 0 indicates no autostop.
     * 
     * Defaults to 120 mins
     */
    @JsonProperty("auto_stop_mins")
    private Long autoStopMins;
    
    /**
     * Channel Details
     */
    @JsonProperty("channel")
    private Channel channel;
    
    /**
     * Size of the clusters allocated for this endpoint. Increasing the size of
     * a spark cluster allows you to run larger queries on it. If you want to
     * increase the number of concurrent queries, please tune max_num_clusters.
     * 
     * Supported values: - 2X-Small - X-Small - Small - Medium - Large - X-Large
     * - 2X-Large - 3X-Large - 4X-Large
     */
    @JsonProperty("cluster_size")
    private String clusterSize;
    
    /**
     * endpoint creator name
     */
    @JsonProperty("creator_name")
    private String creatorName;
    
    /**
     * Configures whether the endpoint should use Databricks Compute (aka
     * Nephos)
     * 
     * Deprecated: Use enable_serverless_compute
     */
    @JsonProperty("enable_databricks_compute")
    private Boolean enableDatabricksCompute;
    
    /**
     * Configures whether the endpoint should use Photon optimized clusters.
     * 
     * Defaults to false.
     */
    @JsonProperty("enable_photon")
    private Boolean enablePhoton;
    
    /**
     * Configures whether the endpoint should use Serverless Compute (aka
     * Nephos)
     * 
     * Defaults to value in global endpoint settings
     */
    @JsonProperty("enable_serverless_compute")
    private Boolean enableServerlessCompute;
    
    /**
     * Optional health status. Assume the endpoint is healthy if this field is
     * not set.
     */
    @JsonProperty("health")
    private EndpointHealth health;
    
    /**
     * unique identifier for endpoint
     */
    @JsonProperty("id")
    private String id;
    
    /**
     * Deprecated. Instance profile used to pass IAM role to the cluster
     */
    @JsonProperty("instance_profile_arn")
    private String instanceProfileArn;
    
    /**
     * the jdbc connection string for this endpoint
     */
    @JsonProperty("jdbc_url")
    private String jdbcUrl;
    
    /**
     * Maximum number of clusters that the autoscaler will create to handle
     * concurrent queries.
     * 
     * Supported values: - Must be >= min_num_clusters - Must be <= 30.
     * 
     * Defaults to min_clusters if unset.
     */
    @JsonProperty("max_num_clusters")
    private Long maxNumClusters;
    
    /**
     * Minimum number of available clusters that will be maintained for this SQL
     * Endpoint. Increasing this will ensure that a larger number of clusters
     * are always running and therefore may reduce the cold start time for new
     * queries. This is similar to reserved vs. revocable cores in a resource
     * manager.
     * 
     * Supported values: - Must be > 0 - Must be <= min(max_num_clusters, 30)
     * 
     * Defaults to 1
     */
    @JsonProperty("min_num_clusters")
    private Long minNumClusters;
    
    /**
     * Logical name for the cluster.
     * 
     * Supported values: - Must be unique within an org. - Must be less than 100
     * characters.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * current number of active sessions for the endpoint
     */
    @JsonProperty("num_active_sessions")
    private Long numActiveSessions;
    
    /**
     * current number of clusters running for the service
     */
    @JsonProperty("num_clusters")
    private Long numClusters;
    
    /**
     * ODBC parameters for the sql endpoint
     */
    @JsonProperty("odbc_params")
    private OdbcParams odbcParams;
    
    /**
     * Configurations whether the warehouse should use spot instances.
     */
    @JsonProperty("spot_instance_policy")
    private SpotInstancePolicy spotInstancePolicy;
    
    /**
     * State of the warehouse
     */
    @JsonProperty("state")
    private State state;
    
    /**
     * A set of key-value pairs that will be tagged on all resources (e.g., AWS
     * instances and EBS volumes) associated with this SQL Endpoints.
     * 
     * Supported values: - Number of tags < 45.
     */
    @JsonProperty("tags")
    private EndpointTags tags;
    
    /**
     
     */
    @JsonProperty("warehouse_type")
    private WarehouseType warehouseType;
    
    public GetWarehouseResponse setAutoStopMins(Long autoStopMins) {
        this.autoStopMins = autoStopMins;
        return this;
    }

    public Long getAutoStopMins() {
        return autoStopMins;
    }
    
    public GetWarehouseResponse setChannel(Channel channel) {
        this.channel = channel;
        return this;
    }

    public Channel getChannel() {
        return channel;
    }
    
    public GetWarehouseResponse setClusterSize(String clusterSize) {
        this.clusterSize = clusterSize;
        return this;
    }

    public String getClusterSize() {
        return clusterSize;
    }
    
    public GetWarehouseResponse setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    public String getCreatorName() {
        return creatorName;
    }
    
    public GetWarehouseResponse setEnableDatabricksCompute(Boolean enableDatabricksCompute) {
        this.enableDatabricksCompute = enableDatabricksCompute;
        return this;
    }

    public Boolean getEnableDatabricksCompute() {
        return enableDatabricksCompute;
    }
    
    public GetWarehouseResponse setEnablePhoton(Boolean enablePhoton) {
        this.enablePhoton = enablePhoton;
        return this;
    }

    public Boolean getEnablePhoton() {
        return enablePhoton;
    }
    
    public GetWarehouseResponse setEnableServerlessCompute(Boolean enableServerlessCompute) {
        this.enableServerlessCompute = enableServerlessCompute;
        return this;
    }

    public Boolean getEnableServerlessCompute() {
        return enableServerlessCompute;
    }
    
    public GetWarehouseResponse setHealth(EndpointHealth health) {
        this.health = health;
        return this;
    }

    public EndpointHealth getHealth() {
        return health;
    }
    
    public GetWarehouseResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    public GetWarehouseResponse setInstanceProfileArn(String instanceProfileArn) {
        this.instanceProfileArn = instanceProfileArn;
        return this;
    }

    public String getInstanceProfileArn() {
        return instanceProfileArn;
    }
    
    public GetWarehouseResponse setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
        return this;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }
    
    public GetWarehouseResponse setMaxNumClusters(Long maxNumClusters) {
        this.maxNumClusters = maxNumClusters;
        return this;
    }

    public Long getMaxNumClusters() {
        return maxNumClusters;
    }
    
    public GetWarehouseResponse setMinNumClusters(Long minNumClusters) {
        this.minNumClusters = minNumClusters;
        return this;
    }

    public Long getMinNumClusters() {
        return minNumClusters;
    }
    
    public GetWarehouseResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public GetWarehouseResponse setNumActiveSessions(Long numActiveSessions) {
        this.numActiveSessions = numActiveSessions;
        return this;
    }

    public Long getNumActiveSessions() {
        return numActiveSessions;
    }
    
    public GetWarehouseResponse setNumClusters(Long numClusters) {
        this.numClusters = numClusters;
        return this;
    }

    public Long getNumClusters() {
        return numClusters;
    }
    
    public GetWarehouseResponse setOdbcParams(OdbcParams odbcParams) {
        this.odbcParams = odbcParams;
        return this;
    }

    public OdbcParams getOdbcParams() {
        return odbcParams;
    }
    
    public GetWarehouseResponse setSpotInstancePolicy(SpotInstancePolicy spotInstancePolicy) {
        this.spotInstancePolicy = spotInstancePolicy;
        return this;
    }

    public SpotInstancePolicy getSpotInstancePolicy() {
        return spotInstancePolicy;
    }
    
    public GetWarehouseResponse setState(State state) {
        this.state = state;
        return this;
    }

    public State getState() {
        return state;
    }
    
    public GetWarehouseResponse setTags(EndpointTags tags) {
        this.tags = tags;
        return this;
    }

    public EndpointTags getTags() {
        return tags;
    }
    
    public GetWarehouseResponse setWarehouseType(WarehouseType warehouseType) {
        this.warehouseType = warehouseType;
        return this;
    }

    public WarehouseType getWarehouseType() {
        return warehouseType;
    }
    
}
