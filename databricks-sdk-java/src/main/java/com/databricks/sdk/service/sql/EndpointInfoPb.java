// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class EndpointInfoPb {
  @JsonProperty("auto_stop_mins")
  private Long autoStopMins;

  @JsonProperty("channel")
  private Channel channel;

  @JsonProperty("cluster_size")
  private String clusterSize;

  @JsonProperty("creator_name")
  private String creatorName;

  @JsonProperty("enable_photon")
  private Boolean enablePhoton;

  @JsonProperty("enable_serverless_compute")
  private Boolean enableServerlessCompute;

  @JsonProperty("health")
  private EndpointHealth health;

  @JsonProperty("id")
  private String id;

  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  @JsonProperty("jdbc_url")
  private String jdbcUrl;

  @JsonProperty("max_num_clusters")
  private Long maxNumClusters;

  @JsonProperty("min_num_clusters")
  private Long minNumClusters;

  @JsonProperty("name")
  private String name;

  @JsonProperty("num_active_sessions")
  private Long numActiveSessions;

  @JsonProperty("num_clusters")
  private Long numClusters;

  @JsonProperty("odbc_params")
  private OdbcParams odbcParams;

  @JsonProperty("spot_instance_policy")
  private SpotInstancePolicy spotInstancePolicy;

  @JsonProperty("state")
  private State state;

  @JsonProperty("tags")
  private EndpointTags tags;

  @JsonProperty("warehouse_type")
  private EndpointInfoWarehouseType warehouseType;

  public EndpointInfoPb setAutoStopMins(Long autoStopMins) {
    this.autoStopMins = autoStopMins;
    return this;
  }

  public Long getAutoStopMins() {
    return autoStopMins;
  }

  public EndpointInfoPb setChannel(Channel channel) {
    this.channel = channel;
    return this;
  }

  public Channel getChannel() {
    return channel;
  }

  public EndpointInfoPb setClusterSize(String clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }

  public String getClusterSize() {
    return clusterSize;
  }

  public EndpointInfoPb setCreatorName(String creatorName) {
    this.creatorName = creatorName;
    return this;
  }

  public String getCreatorName() {
    return creatorName;
  }

  public EndpointInfoPb setEnablePhoton(Boolean enablePhoton) {
    this.enablePhoton = enablePhoton;
    return this;
  }

  public Boolean getEnablePhoton() {
    return enablePhoton;
  }

  public EndpointInfoPb setEnableServerlessCompute(Boolean enableServerlessCompute) {
    this.enableServerlessCompute = enableServerlessCompute;
    return this;
  }

  public Boolean getEnableServerlessCompute() {
    return enableServerlessCompute;
  }

  public EndpointInfoPb setHealth(EndpointHealth health) {
    this.health = health;
    return this;
  }

  public EndpointHealth getHealth() {
    return health;
  }

  public EndpointInfoPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public EndpointInfoPb setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public EndpointInfoPb setJdbcUrl(String jdbcUrl) {
    this.jdbcUrl = jdbcUrl;
    return this;
  }

  public String getJdbcUrl() {
    return jdbcUrl;
  }

  public EndpointInfoPb setMaxNumClusters(Long maxNumClusters) {
    this.maxNumClusters = maxNumClusters;
    return this;
  }

  public Long getMaxNumClusters() {
    return maxNumClusters;
  }

  public EndpointInfoPb setMinNumClusters(Long minNumClusters) {
    this.minNumClusters = minNumClusters;
    return this;
  }

  public Long getMinNumClusters() {
    return minNumClusters;
  }

  public EndpointInfoPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EndpointInfoPb setNumActiveSessions(Long numActiveSessions) {
    this.numActiveSessions = numActiveSessions;
    return this;
  }

  public Long getNumActiveSessions() {
    return numActiveSessions;
  }

  public EndpointInfoPb setNumClusters(Long numClusters) {
    this.numClusters = numClusters;
    return this;
  }

  public Long getNumClusters() {
    return numClusters;
  }

  public EndpointInfoPb setOdbcParams(OdbcParams odbcParams) {
    this.odbcParams = odbcParams;
    return this;
  }

  public OdbcParams getOdbcParams() {
    return odbcParams;
  }

  public EndpointInfoPb setSpotInstancePolicy(SpotInstancePolicy spotInstancePolicy) {
    this.spotInstancePolicy = spotInstancePolicy;
    return this;
  }

  public SpotInstancePolicy getSpotInstancePolicy() {
    return spotInstancePolicy;
  }

  public EndpointInfoPb setState(State state) {
    this.state = state;
    return this;
  }

  public State getState() {
    return state;
  }

  public EndpointInfoPb setTags(EndpointTags tags) {
    this.tags = tags;
    return this;
  }

  public EndpointTags getTags() {
    return tags;
  }

  public EndpointInfoPb setWarehouseType(EndpointInfoWarehouseType warehouseType) {
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
    EndpointInfoPb that = (EndpointInfoPb) o;
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

  @Override
  public String toString() {
    return new ToStringer(EndpointInfoPb.class)
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
