// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
class GetInstancePoolPb {
  @JsonProperty("aws_attributes")
  private InstancePoolAwsAttributes awsAttributes;

  @JsonProperty("azure_attributes")
  private InstancePoolAzureAttributes azureAttributes;

  @JsonProperty("custom_tags")
  private Map<String, String> customTags;

  @JsonProperty("default_tags")
  private Map<String, String> defaultTags;

  @JsonProperty("disk_spec")
  private DiskSpec diskSpec;

  @JsonProperty("enable_elastic_disk")
  private Boolean enableElasticDisk;

  @JsonProperty("gcp_attributes")
  private InstancePoolGcpAttributes gcpAttributes;

  @JsonProperty("idle_instance_autotermination_minutes")
  private Long idleInstanceAutoterminationMinutes;

  @JsonProperty("instance_pool_id")
  private String instancePoolId;

  @JsonProperty("instance_pool_name")
  private String instancePoolName;

  @JsonProperty("max_capacity")
  private Long maxCapacity;

  @JsonProperty("min_idle_instances")
  private Long minIdleInstances;

  @JsonProperty("node_type_id")
  private String nodeTypeId;

  @JsonProperty("preloaded_docker_images")
  private Collection<DockerImage> preloadedDockerImages;

  @JsonProperty("preloaded_spark_versions")
  private Collection<String> preloadedSparkVersions;

  @JsonProperty("state")
  private InstancePoolState state;

  @JsonProperty("stats")
  private InstancePoolStats stats;

  @JsonProperty("status")
  private InstancePoolStatus status;

  public GetInstancePoolPb setAwsAttributes(InstancePoolAwsAttributes awsAttributes) {
    this.awsAttributes = awsAttributes;
    return this;
  }

  public InstancePoolAwsAttributes getAwsAttributes() {
    return awsAttributes;
  }

  public GetInstancePoolPb setAzureAttributes(InstancePoolAzureAttributes azureAttributes) {
    this.azureAttributes = azureAttributes;
    return this;
  }

  public InstancePoolAzureAttributes getAzureAttributes() {
    return azureAttributes;
  }

  public GetInstancePoolPb setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public GetInstancePoolPb setDefaultTags(Map<String, String> defaultTags) {
    this.defaultTags = defaultTags;
    return this;
  }

  public Map<String, String> getDefaultTags() {
    return defaultTags;
  }

  public GetInstancePoolPb setDiskSpec(DiskSpec diskSpec) {
    this.diskSpec = diskSpec;
    return this;
  }

  public DiskSpec getDiskSpec() {
    return diskSpec;
  }

  public GetInstancePoolPb setEnableElasticDisk(Boolean enableElasticDisk) {
    this.enableElasticDisk = enableElasticDisk;
    return this;
  }

  public Boolean getEnableElasticDisk() {
    return enableElasticDisk;
  }

  public GetInstancePoolPb setGcpAttributes(InstancePoolGcpAttributes gcpAttributes) {
    this.gcpAttributes = gcpAttributes;
    return this;
  }

  public InstancePoolGcpAttributes getGcpAttributes() {
    return gcpAttributes;
  }

  public GetInstancePoolPb setIdleInstanceAutoterminationMinutes(
      Long idleInstanceAutoterminationMinutes) {
    this.idleInstanceAutoterminationMinutes = idleInstanceAutoterminationMinutes;
    return this;
  }

  public Long getIdleInstanceAutoterminationMinutes() {
    return idleInstanceAutoterminationMinutes;
  }

  public GetInstancePoolPb setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }

  public GetInstancePoolPb setInstancePoolName(String instancePoolName) {
    this.instancePoolName = instancePoolName;
    return this;
  }

  public String getInstancePoolName() {
    return instancePoolName;
  }

  public GetInstancePoolPb setMaxCapacity(Long maxCapacity) {
    this.maxCapacity = maxCapacity;
    return this;
  }

  public Long getMaxCapacity() {
    return maxCapacity;
  }

  public GetInstancePoolPb setMinIdleInstances(Long minIdleInstances) {
    this.minIdleInstances = minIdleInstances;
    return this;
  }

  public Long getMinIdleInstances() {
    return minIdleInstances;
  }

  public GetInstancePoolPb setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  public String getNodeTypeId() {
    return nodeTypeId;
  }

  public GetInstancePoolPb setPreloadedDockerImages(Collection<DockerImage> preloadedDockerImages) {
    this.preloadedDockerImages = preloadedDockerImages;
    return this;
  }

  public Collection<DockerImage> getPreloadedDockerImages() {
    return preloadedDockerImages;
  }

  public GetInstancePoolPb setPreloadedSparkVersions(Collection<String> preloadedSparkVersions) {
    this.preloadedSparkVersions = preloadedSparkVersions;
    return this;
  }

  public Collection<String> getPreloadedSparkVersions() {
    return preloadedSparkVersions;
  }

  public GetInstancePoolPb setState(InstancePoolState state) {
    this.state = state;
    return this;
  }

  public InstancePoolState getState() {
    return state;
  }

  public GetInstancePoolPb setStats(InstancePoolStats stats) {
    this.stats = stats;
    return this;
  }

  public InstancePoolStats getStats() {
    return stats;
  }

  public GetInstancePoolPb setStatus(InstancePoolStatus status) {
    this.status = status;
    return this;
  }

  public InstancePoolStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetInstancePoolPb that = (GetInstancePoolPb) o;
    return Objects.equals(awsAttributes, that.awsAttributes)
        && Objects.equals(azureAttributes, that.azureAttributes)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(defaultTags, that.defaultTags)
        && Objects.equals(diskSpec, that.diskSpec)
        && Objects.equals(enableElasticDisk, that.enableElasticDisk)
        && Objects.equals(gcpAttributes, that.gcpAttributes)
        && Objects.equals(
            idleInstanceAutoterminationMinutes, that.idleInstanceAutoterminationMinutes)
        && Objects.equals(instancePoolId, that.instancePoolId)
        && Objects.equals(instancePoolName, that.instancePoolName)
        && Objects.equals(maxCapacity, that.maxCapacity)
        && Objects.equals(minIdleInstances, that.minIdleInstances)
        && Objects.equals(nodeTypeId, that.nodeTypeId)
        && Objects.equals(preloadedDockerImages, that.preloadedDockerImages)
        && Objects.equals(preloadedSparkVersions, that.preloadedSparkVersions)
        && Objects.equals(state, that.state)
        && Objects.equals(stats, that.stats)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsAttributes,
        azureAttributes,
        customTags,
        defaultTags,
        diskSpec,
        enableElasticDisk,
        gcpAttributes,
        idleInstanceAutoterminationMinutes,
        instancePoolId,
        instancePoolName,
        maxCapacity,
        minIdleInstances,
        nodeTypeId,
        preloadedDockerImages,
        preloadedSparkVersions,
        state,
        stats,
        status);
  }

  @Override
  public String toString() {
    return new ToStringer(GetInstancePoolPb.class)
        .add("awsAttributes", awsAttributes)
        .add("azureAttributes", azureAttributes)
        .add("customTags", customTags)
        .add("defaultTags", defaultTags)
        .add("diskSpec", diskSpec)
        .add("enableElasticDisk", enableElasticDisk)
        .add("gcpAttributes", gcpAttributes)
        .add("idleInstanceAutoterminationMinutes", idleInstanceAutoterminationMinutes)
        .add("instancePoolId", instancePoolId)
        .add("instancePoolName", instancePoolName)
        .add("maxCapacity", maxCapacity)
        .add("minIdleInstances", minIdleInstances)
        .add("nodeTypeId", nodeTypeId)
        .add("preloadedDockerImages", preloadedDockerImages)
        .add("preloadedSparkVersions", preloadedSparkVersions)
        .add("state", state)
        .add("stats", stats)
        .add("status", status)
        .toString();
  }
}
