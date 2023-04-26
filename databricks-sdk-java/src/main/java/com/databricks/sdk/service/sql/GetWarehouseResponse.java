// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>GetWarehouseResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetWarehouseResponse {
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

  /**
   * <p>Setter for the field <code>autoStopMins</code>.</p>
   *
   * @param autoStopMins a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setAutoStopMins(Long autoStopMins) {
    this.autoStopMins = autoStopMins;
    return this;
  }

  /**
   * <p>Getter for the field <code>autoStopMins</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getAutoStopMins() {
    return autoStopMins;
  }

  /**
   * <p>Setter for the field <code>channel</code>.</p>
   *
   * @param channel a {@link com.databricks.sdk.service.sql.Channel} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setChannel(Channel channel) {
    this.channel = channel;
    return this;
  }

  /**
   * <p>Getter for the field <code>channel</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.Channel} object
   */
  public Channel getChannel() {
    return channel;
  }

  /**
   * <p>Setter for the field <code>clusterSize</code>.</p>
   *
   * @param clusterSize a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setClusterSize(String clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterSize</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClusterSize() {
    return clusterSize;
  }

  /**
   * <p>Setter for the field <code>creatorName</code>.</p>
   *
   * @param creatorName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setCreatorName(String creatorName) {
    this.creatorName = creatorName;
    return this;
  }

  /**
   * <p>Getter for the field <code>creatorName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatorName() {
    return creatorName;
  }

  /**
   * <p>Setter for the field <code>enablePhoton</code>.</p>
   *
   * @param enablePhoton a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setEnablePhoton(Boolean enablePhoton) {
    this.enablePhoton = enablePhoton;
    return this;
  }

  /**
   * <p>Getter for the field <code>enablePhoton</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnablePhoton() {
    return enablePhoton;
  }

  /**
   * <p>Setter for the field <code>enableServerlessCompute</code>.</p>
   *
   * @param enableServerlessCompute a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setEnableServerlessCompute(Boolean enableServerlessCompute) {
    this.enableServerlessCompute = enableServerlessCompute;
    return this;
  }

  /**
   * <p>Getter for the field <code>enableServerlessCompute</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnableServerlessCompute() {
    return enableServerlessCompute;
  }

  /**
   * <p>Setter for the field <code>health</code>.</p>
   *
   * @param health a {@link com.databricks.sdk.service.sql.EndpointHealth} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setHealth(EndpointHealth health) {
    this.health = health;
    return this;
  }

  /**
   * <p>Getter for the field <code>health</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.EndpointHealth} object
   */
  public EndpointHealth getHealth() {
    return health;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>instanceProfileArn</code>.</p>
   *
   * @param instanceProfileArn a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  /**
   * <p>Getter for the field <code>instanceProfileArn</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  /**
   * <p>Setter for the field <code>jdbcUrl</code>.</p>
   *
   * @param jdbcUrl a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setJdbcUrl(String jdbcUrl) {
    this.jdbcUrl = jdbcUrl;
    return this;
  }

  /**
   * <p>Getter for the field <code>jdbcUrl</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getJdbcUrl() {
    return jdbcUrl;
  }

  /**
   * <p>Setter for the field <code>maxNumClusters</code>.</p>
   *
   * @param maxNumClusters a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setMaxNumClusters(Long maxNumClusters) {
    this.maxNumClusters = maxNumClusters;
    return this;
  }

  /**
   * <p>Getter for the field <code>maxNumClusters</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMaxNumClusters() {
    return maxNumClusters;
  }

  /**
   * <p>Setter for the field <code>minNumClusters</code>.</p>
   *
   * @param minNumClusters a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setMinNumClusters(Long minNumClusters) {
    this.minNumClusters = minNumClusters;
    return this;
  }

  /**
   * <p>Getter for the field <code>minNumClusters</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMinNumClusters() {
    return minNumClusters;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>numActiveSessions</code>.</p>
   *
   * @param numActiveSessions a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setNumActiveSessions(Long numActiveSessions) {
    this.numActiveSessions = numActiveSessions;
    return this;
  }

  /**
   * <p>Getter for the field <code>numActiveSessions</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getNumActiveSessions() {
    return numActiveSessions;
  }

  /**
   * <p>Setter for the field <code>numClusters</code>.</p>
   *
   * @param numClusters a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setNumClusters(Long numClusters) {
    this.numClusters = numClusters;
    return this;
  }

  /**
   * <p>Getter for the field <code>numClusters</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getNumClusters() {
    return numClusters;
  }

  /**
   * <p>Setter for the field <code>odbcParams</code>.</p>
   *
   * @param odbcParams a {@link com.databricks.sdk.service.sql.OdbcParams} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setOdbcParams(OdbcParams odbcParams) {
    this.odbcParams = odbcParams;
    return this;
  }

  /**
   * <p>Getter for the field <code>odbcParams</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.OdbcParams} object
   */
  public OdbcParams getOdbcParams() {
    return odbcParams;
  }

  /**
   * <p>Setter for the field <code>spotInstancePolicy</code>.</p>
   *
   * @param spotInstancePolicy a {@link com.databricks.sdk.service.sql.SpotInstancePolicy} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setSpotInstancePolicy(SpotInstancePolicy spotInstancePolicy) {
    this.spotInstancePolicy = spotInstancePolicy;
    return this;
  }

  /**
   * <p>Getter for the field <code>spotInstancePolicy</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.SpotInstancePolicy} object
   */
  public SpotInstancePolicy getSpotInstancePolicy() {
    return spotInstancePolicy;
  }

  /**
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link com.databricks.sdk.service.sql.State} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setState(State state) {
    this.state = state;
    return this;
  }

  /**
   * <p>Getter for the field <code>state</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.State} object
   */
  public State getState() {
    return state;
  }

  /**
   * <p>Setter for the field <code>tags</code>.</p>
   *
   * @param tags a {@link com.databricks.sdk.service.sql.EndpointTags} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setTags(EndpointTags tags) {
    this.tags = tags;
    return this;
  }

  /**
   * <p>Getter for the field <code>tags</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.EndpointTags} object
   */
  public EndpointTags getTags() {
    return tags;
  }

  /**
   * <p>Setter for the field <code>warehouseType</code>.</p>
   *
   * @param warehouseType a {@link com.databricks.sdk.service.sql.WarehouseType} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse setWarehouseType(WarehouseType warehouseType) {
    this.warehouseType = warehouseType;
    return this;
  }

  /**
   * <p>Getter for the field <code>warehouseType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.WarehouseType} object
   */
  public WarehouseType getWarehouseType() {
    return warehouseType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetWarehouseResponse that = (GetWarehouseResponse) o;
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
        && Objects.equals(warehouseType, that.warehouseType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        autoStopMins,
        channel,
        clusterSize,
        creatorName,
        enablePhoton,
        enableServerlessCompute,
        health,
        id,
        instanceProfileArn,
        jdbcUrl,
        maxNumClusters,
        minNumClusters,
        name,
        numActiveSessions,
        numClusters,
        odbcParams,
        spotInstancePolicy,
        state,
        tags,
        warehouseType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetWarehouseResponse.class)
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
        .add("warehouseType", warehouseType)
        .toString();
  }
}
