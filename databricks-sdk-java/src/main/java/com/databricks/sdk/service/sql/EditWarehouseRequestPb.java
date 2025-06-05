// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class EditWarehouseRequestPb {
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

  @JsonIgnore private String id;

  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  @JsonProperty("max_num_clusters")
  private Long maxNumClusters;

  @JsonProperty("min_num_clusters")
  private Long minNumClusters;

  @JsonProperty("name")
  private String name;

  @JsonProperty("spot_instance_policy")
  private SpotInstancePolicy spotInstancePolicy;

  @JsonProperty("tags")
  private EndpointTags tags;

  @JsonProperty("warehouse_type")
  private EditWarehouseRequestWarehouseType warehouseType;

  public EditWarehouseRequestPb setAutoStopMins(Long autoStopMins) {
    this.autoStopMins = autoStopMins;
    return this;
  }

  public Long getAutoStopMins() {
    return autoStopMins;
  }

  public EditWarehouseRequestPb setChannel(Channel channel) {
    this.channel = channel;
    return this;
  }

  public Channel getChannel() {
    return channel;
  }

  public EditWarehouseRequestPb setClusterSize(String clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }

  public String getClusterSize() {
    return clusterSize;
  }

  public EditWarehouseRequestPb setCreatorName(String creatorName) {
    this.creatorName = creatorName;
    return this;
  }

  public String getCreatorName() {
    return creatorName;
  }

  public EditWarehouseRequestPb setEnablePhoton(Boolean enablePhoton) {
    this.enablePhoton = enablePhoton;
    return this;
  }

  public Boolean getEnablePhoton() {
    return enablePhoton;
  }

  public EditWarehouseRequestPb setEnableServerlessCompute(Boolean enableServerlessCompute) {
    this.enableServerlessCompute = enableServerlessCompute;
    return this;
  }

  public Boolean getEnableServerlessCompute() {
    return enableServerlessCompute;
  }

  public EditWarehouseRequestPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public EditWarehouseRequestPb setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public EditWarehouseRequestPb setMaxNumClusters(Long maxNumClusters) {
    this.maxNumClusters = maxNumClusters;
    return this;
  }

  public Long getMaxNumClusters() {
    return maxNumClusters;
  }

  public EditWarehouseRequestPb setMinNumClusters(Long minNumClusters) {
    this.minNumClusters = minNumClusters;
    return this;
  }

  public Long getMinNumClusters() {
    return minNumClusters;
  }

  public EditWarehouseRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EditWarehouseRequestPb setSpotInstancePolicy(SpotInstancePolicy spotInstancePolicy) {
    this.spotInstancePolicy = spotInstancePolicy;
    return this;
  }

  public SpotInstancePolicy getSpotInstancePolicy() {
    return spotInstancePolicy;
  }

  public EditWarehouseRequestPb setTags(EndpointTags tags) {
    this.tags = tags;
    return this;
  }

  public EndpointTags getTags() {
    return tags;
  }

  public EditWarehouseRequestPb setWarehouseType(EditWarehouseRequestWarehouseType warehouseType) {
    this.warehouseType = warehouseType;
    return this;
  }

  public EditWarehouseRequestWarehouseType getWarehouseType() {
    return warehouseType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EditWarehouseRequestPb that = (EditWarehouseRequestPb) o;
    return Objects.equals(autoStopMins, that.autoStopMins)
        && Objects.equals(channel, that.channel)
        && Objects.equals(clusterSize, that.clusterSize)
        && Objects.equals(creatorName, that.creatorName)
        && Objects.equals(enablePhoton, that.enablePhoton)
        && Objects.equals(enableServerlessCompute, that.enableServerlessCompute)
        && Objects.equals(id, that.id)
        && Objects.equals(instanceProfileArn, that.instanceProfileArn)
        && Objects.equals(maxNumClusters, that.maxNumClusters)
        && Objects.equals(minNumClusters, that.minNumClusters)
        && Objects.equals(name, that.name)
        && Objects.equals(spotInstancePolicy, that.spotInstancePolicy)
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
        id,
        instanceProfileArn,
        maxNumClusters,
        minNumClusters,
        name,
        spotInstancePolicy,
        tags,
        warehouseType);
  }

  @Override
  public String toString() {
    return new ToStringer(EditWarehouseRequestPb.class)
        .add("autoStopMins", autoStopMins)
        .add("channel", channel)
        .add("clusterSize", clusterSize)
        .add("creatorName", creatorName)
        .add("enablePhoton", enablePhoton)
        .add("enableServerlessCompute", enableServerlessCompute)
        .add("id", id)
        .add("instanceProfileArn", instanceProfileArn)
        .add("maxNumClusters", maxNumClusters)
        .add("minNumClusters", minNumClusters)
        .add("name", name)
        .add("spotInstancePolicy", spotInstancePolicy)
        .add("tags", tags)
        .add("warehouseType", warehouseType)
        .toString();
  }
}
