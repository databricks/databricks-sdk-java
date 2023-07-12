// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class EndpointInfo {
  /**
   * The amount of time in minutes that a SQL warehouse must be idle (i.e., no
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
   * Size of the clusters allocated for this warehouse. Increasing the size of a
   * spark cluster allows you to run larger queries on it. If you want to
   * increase the number of concurrent queries, please tune max_num_clusters.
   * 
   * Supported values: - 2X-Small - X-Small - Small - Medium - Large - X-Large -
   * 2X-Large - 3X-Large - 4X-Large
   */
  @JsonProperty("cluster_size")
  private String clusterSize;
  
  /**
   * warehouse creator name
   */
  @JsonProperty("creator_name")
  private String creatorName;
  
  /**
   * Configures whether the warehouse should use Photon optimized clusters.
   * 
   * Defaults to false.
   */
  @JsonProperty("enable_photon")
  private Boolean enablePhoton;
  
  /**
   * Configures whether the warehouse should use serverless compute
   */
  @JsonProperty("enable_serverless_compute")
  private Boolean enableServerlessCompute;
  
  /**
   * Optional health status. Assume the warehouse is healthy if this field is
   * not set.
   */
  @JsonProperty("health")
  private EndpointHealth health;
  
  /**
   * unique identifier for warehouse
   */
  @JsonProperty("id")
  private String id;
  
  /**
   * Deprecated. Instance profile used to pass IAM role to the cluster
   */
  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;
  
  /**
   * the jdbc connection string for this warehouse
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
   * warehouse. Increasing this will ensure that a larger number of clusters are
   * always running and therefore may reduce the cold start time for new
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
   * current number of active sessions for the warehouse
   */
  @JsonProperty("num_active_sessions")
  private Long numActiveSessions;
  
  /**
   * current number of clusters running for the service
   */
  @JsonProperty("num_clusters")
  private Long numClusters;
  
  /**
   * ODBC parameters for the SQL warehouse
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
   * instances and EBS volumes) associated with this SQL warehouse.
   * 
   * Supported values: - Number of tags < 45.
   */
  @JsonProperty("tags")
  private EndpointTags tags;
  
  /**
   * Warehouse type: `PRO` or `CLASSIC`. If you want to use serverless compute,
   * you must set to `PRO` and also set the field `enable_serverless_compute` to
   * `true`.
   */
  @JsonProperty("warehouse_type")
  private EndpointInfoWarehouseType warehouseType;
  
  public EndpointInfo setAutoStopMins(Long autoStopMins) {
    this.autoStopMins = autoStopMins;
    return this;
  }

  public Long getAutoStopMins() {
    return autoStopMins;
  }
  
  public EndpointInfo setChannel(Channel channel) {
    this.channel = channel;
    return this;
  }

  public Channel getChannel() {
    return channel;
  }
  
  public EndpointInfo setClusterSize(String clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }

  public String getClusterSize() {
    return clusterSize;
  }
  
  public EndpointInfo setCreatorName(String creatorName) {
    this.creatorName = creatorName;
    return this;
  }

  public String getCreatorName() {
    return creatorName;
  }
  
  public EndpointInfo setEnablePhoton(Boolean enablePhoton) {
    this.enablePhoton = enablePhoton;
    return this;
  }

  public Boolean getEnablePhoton() {
    return enablePhoton;
  }
  
  public EndpointInfo setEnableServerlessCompute(Boolean enableServerlessCompute) {
    this.enableServerlessCompute = enableServerlessCompute;
    return this;
  }

  public Boolean getEnableServerlessCompute() {
    return enableServerlessCompute;
  }
  
  public EndpointInfo setHealth(EndpointHealth health) {
    this.health = health;
    return this;
  }

  public EndpointHealth getHealth() {
    return health;
  }
  
  public EndpointInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
  
  public EndpointInfo setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }
  
  public EndpointInfo setJdbcUrl(String jdbcUrl) {
    this.jdbcUrl = jdbcUrl;
    return this;
  }

  public String getJdbcUrl() {
    return jdbcUrl;
  }
  
  public EndpointInfo setMaxNumClusters(Long maxNumClusters) {
    this.maxNumClusters = maxNumClusters;
    return this;
  }

  public Long getMaxNumClusters() {
    return maxNumClusters;
  }
  
  public EndpointInfo setMinNumClusters(Long minNumClusters) {
    this.minNumClusters = minNumClusters;
    return this;
  }

  public Long getMinNumClusters() {
    return minNumClusters;
  }
  
  public EndpointInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
  
  public EndpointInfo setNumActiveSessions(Long numActiveSessions) {
    this.numActiveSessions = numActiveSessions;
    return this;
  }

  public Long getNumActiveSessions() {
    return numActiveSessions;
  }
  
  public EndpointInfo setNumClusters(Long numClusters) {
    this.numClusters = numClusters;
    return this;
  }

  public Long getNumClusters() {
    return numClusters;
  }
  
  public EndpointInfo setOdbcParams(OdbcParams odbcParams) {
    this.odbcParams = odbcParams;
    return this;
  }

  public OdbcParams getOdbcParams() {
    return odbcParams;
  }
  
  public EndpointInfo setSpotInstancePolicy(SpotInstancePolicy spotInstancePolicy) {
    this.spotInstancePolicy = spotInstancePolicy;
    return this;
  }

  public SpotInstancePolicy getSpotInstancePolicy() {
    return spotInstancePolicy;
  }
  
  public EndpointInfo setState(State state) {
    this.state = state;
    return this;
  }

  public State getState() {
    return state;
  }
  
  public EndpointInfo setTags(EndpointTags tags) {
    this.tags = tags;
    return this;
  }

  public EndpointTags getTags() {
    return tags;
  }
  
  public EndpointInfo setWarehouseType(EndpointInfoWarehouseType warehouseType) {
    this.warehouseType = warehouseType;
    return this;
  }

  public EndpointInfoWarehouseType getWarehouseType() {
    return warehouseType;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointInfo that = (EndpointInfo) o;
    return Objects.equals(autoStopMins, that.autoStopMins)
    && Objects.equals(channel, that.channel)
    && Objects.equals(clusterSize, that.clusterSize)
    && Objects.equals(creatorName, that.creatorName)
    && Objects.equals(enablePhoton, that.enablePhoton)
    && Objects.equals(enableServerlessCompute, that.enableServerlessCompute)
    && Objects.equals(health, that.health)
    && Objects.equals(id, that.id)
    && Objects.equals(instanceProfileArn, that.instanceProfileArn)
    && Objects.equals(jdbcUrl, that.jdbcUrl)
    && Objects.equals(maxNumClusters, that.maxNumClusters)
    && Objects.equals(minNumClusters, that.minNumClusters)
    && Objects.equals(name, that.name)
    && Objects.equals(numActiveSessions, that.numActiveSessions)
    && Objects.equals(numClusters, that.numClusters)
    && Objects.equals(odbcParams, that.odbcParams)
    && Objects.equals(spotInstancePolicy, that.spotInstancePolicy)
    && Objects.equals(state, that.state)
    && Objects.equals(tags, that.tags)
    && Objects.equals(warehouseType, that.warehouseType)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoStopMins, channel, clusterSize, creatorName, enablePhoton, enableServerlessCompute, health, id, instanceProfileArn, jdbcUrl, maxNumClusters, minNumClusters, name, numActiveSessions, numClusters, odbcParams, spotInstancePolicy, state, tags, warehouseType);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointInfo.class)
      .add("autoStopMins", autoStopMins)
      .add("channel", channel)
      .add("clusterSize", clusterSize)
      .add("creatorName", creatorName)
      .add("enablePhoton", enablePhoton)
      .add("enableServerlessCompute", enableServerlessCompute)
      .add("health", health)
      .add("id", id)
      .add("instanceProfileArn", instanceProfileArn)
      .add("jdbcUrl", jdbcUrl)
      .add("maxNumClusters", maxNumClusters)
      .add("minNumClusters", minNumClusters)
      .add("name", name)
      .add("numActiveSessions", numActiveSessions)
      .add("numClusters", numClusters)
      .add("odbcParams", odbcParams)
      .add("spotInstancePolicy", spotInstancePolicy)
      .add("state", state)
      .add("tags", tags)
      .add("warehouseType", warehouseType).toString();
  }
}
