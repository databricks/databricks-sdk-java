// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EndpointInfo {
  /**
   * The amount of time in minutes that a SQL warehouse must be idle (i.e., no RUNNING queries)
   * before it is automatically stopped.
   *
   * <p>Supported values: - Must be == 0 or >= 10 mins - 0 indicates no autostop.
   *
   * <p>Defaults to 120 mins
   */
  @JsonProperty("auto_stop_mins")
  private Long autoStopMins;

  /** Channel Details */
  @JsonProperty("channel")
  private Channel channel;

  /**
   * Size of the clusters allocated for this warehouse. Increasing the size of a spark cluster
   * allows you to run larger queries on it. If you want to increase the number of concurrent
   * queries, please tune max_num_clusters.
   *
   * <p>Supported values: - 2X-Small - X-Small - Small - Medium - Large - X-Large - 2X-Large -
   * 3X-Large - 4X-Large
   */
  @JsonProperty("cluster_size")
  private String clusterSize;

  /** warehouse creator name */
  @JsonProperty("creator_name")
  private String creatorName;

  /**
   * Configures whether the warehouse should use Photon optimized clusters.
   *
   * <p>Defaults to false.
   */
  @JsonProperty("enable_photon")
  private Boolean enablePhoton;

  /** Configures whether the warehouse should use serverless compute */
  @JsonProperty("enable_serverless_compute")
  private Boolean enableServerlessCompute;

  /** Optional health status. Assume the warehouse is healthy if this field is not set. */
  @JsonProperty("health")
  private EndpointHealth health;

  /** unique identifier for warehouse */
  @JsonProperty("id")
  private String id;

  /** Deprecated. Instance profile used to pass IAM role to the cluster */
  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  /** the jdbc connection string for this warehouse */
  @JsonProperty("jdbc_url")
  private String jdbcUrl;

  /**
   * Maximum number of clusters that the autoscaler will create to handle concurrent queries.
   *
   * <p>Supported values: - Must be >= min_num_clusters - Must be <= 30.
   *
   * <p>Defaults to min_clusters if unset.
   */
  @JsonProperty("max_num_clusters")
  private Long maxNumClusters;

  /**
   * Minimum number of available clusters that will be maintained for this SQL warehouse. Increasing
   * this will ensure that a larger number of clusters are always running and therefore may reduce
   * the cold start time for new queries. This is similar to reserved vs. revocable cores in a
   * resource manager.
   *
   * <p>Supported values: - Must be > 0 - Must be <= min(max_num_clusters, 30)
   *
   * <p>Defaults to 1
   */
  @JsonProperty("min_num_clusters")
  private Long minNumClusters;

  /**
   * Logical name for the cluster.
   *
   * <p>Supported values: - Must be unique within an org. - Must be less than 100 characters.
   */
  @JsonProperty("name")
  private String name;

  /** current number of active sessions for the warehouse */
  @JsonProperty("num_active_sessions")
  private Long numActiveSessions;

  /** current number of clusters running for the service */
  @JsonProperty("num_clusters")
  private Long numClusters;

  /** ODBC parameters for the SQL warehouse */
  @JsonProperty("odbc_params")
  private OdbcParams odbcParams;

  /** Configurations whether the warehouse should use spot instances. */
  @JsonProperty("spot_instance_policy")
  private SpotInstancePolicy spotInstancePolicy;

  /** State of the warehouse */
  @JsonProperty("state")
  private State state;

  /**
   * A set of key-value pairs that will be tagged on all resources (e.g., AWS instances and EBS
   * volumes) associated with this SQL warehouse.
   *
   * <p>Supported values: - Number of tags < 45.
   */
  @JsonProperty("tags")
  private EndpointTags tags;

  /**
   * Warehouse type: `PRO` or `CLASSIC`. If you want to use serverless compute, you must set to
   * `PRO` and also set the field `enable_serverless_compute` to `true`.
   */
  @JsonProperty("warehouse_type")
  private WarehouseType warehouseType;

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

  public EndpointInfo setWarehouseType(WarehouseType warehouseType) {
    this.warehouseType = warehouseType;
    return this;
  }

  public WarehouseType getWarehouseType() {
    return warehouseType;
  }
}
