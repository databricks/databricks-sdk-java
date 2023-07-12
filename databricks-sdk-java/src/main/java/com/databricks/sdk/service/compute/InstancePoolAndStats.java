// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class InstancePoolAndStats {
  /**
   * Attributes related to instance pools running on Amazon Web Services. If not
   * specified at pool creation, a set of default values will be used.
   */
  @JsonProperty("aws_attributes")
  private InstancePoolAwsAttributes awsAttributes;
  
  /**
   * Attributes related to instance pools running on Azure. If not specified at
   * pool creation, a set of default values will be used.
   */
  @JsonProperty("azure_attributes")
  private InstancePoolAzureAttributes azureAttributes;
  
  /**
   * Additional tags for pool resources. Databricks will tag all pool resources
   * (e.g., AWS instances and EBS volumes) with these tags in addition to
   * `default_tags`. Notes:
   * 
   * - Currently, Databricks allows at most 45 custom tags
   */
  @JsonProperty("custom_tags")
  private Map<String,String> customTags;
  
  /**
   * Tags that are added by Databricks regardless of any `custom_tags`,
   * including:
   * 
   * - Vendor: Databricks
   * 
   * - InstancePoolCreator: <user_id_of_creator>
   * 
   * - InstancePoolName: <name_of_pool>
   * 
   * - InstancePoolId: <id_of_pool>
   */
  @JsonProperty("default_tags")
  private Map<String,String> defaultTags;
  
  /**
   * Defines the specification of the disks that will be attached to all spark
   * containers.
   */
  @JsonProperty("disk_spec")
  private DiskSpec diskSpec;
  
  /**
   * Autoscaling Local Storage: when enabled, this instances in this pool will
   * dynamically acquire additional disk space when its Spark workers are
   * running low on disk space. In AWS, this feature requires specific AWS
   * permissions to function correctly - refer to the User Guide for more
   * details.
   */
  @JsonProperty("enable_elastic_disk")
  private Boolean enableElasticDisk;
  
  /**
   * Attributes related to instance pools running on Google Cloud Platform. If
   * not specified at pool creation, a set of default values will be used.
   */
  @JsonProperty("gcp_attributes")
  private InstancePoolGcpAttributes gcpAttributes;
  
  /**
   * Automatically terminates the extra instances in the pool cache after they
   * are inactive for this time in minutes if min_idle_instances requirement is
   * already met. If not set, the extra pool instances will be automatically
   * terminated after a default timeout. If specified, the threshold must be
   * between 0 and 10000 minutes. Users can also set this value to 0 to
   * instantly remove idle instances from the cache if min cache size could
   * still hold.
   */
  @JsonProperty("idle_instance_autotermination_minutes")
  private Long idleInstanceAutoterminationMinutes;
  
  /**
   * The fleet related setting to power the instance pool.
   */
  @JsonProperty("instance_pool_fleet_attributes")
  private InstancePoolFleetAttributes instancePoolFleetAttributes;
  
  /**
   * Canonical unique identifier for the pool.
   */
  @JsonProperty("instance_pool_id")
  private String instancePoolId;
  
  /**
   * Pool name requested by the user. Pool name must be unique. Length must be
   * between 1 and 100 characters.
   */
  @JsonProperty("instance_pool_name")
  private String instancePoolName;
  
  /**
   * Maximum number of outstanding instances to keep in the pool, including both
   * instances used by clusters and idle instances. Clusters that require
   * further instance provisioning will fail during upsize requests.
   */
  @JsonProperty("max_capacity")
  private Long maxCapacity;
  
  /**
   * Minimum number of idle instances to keep in the instance pool
   */
  @JsonProperty("min_idle_instances")
  private Long minIdleInstances;
  
  /**
   * This field encodes, through a single value, the resources available to each
   * of the Spark nodes in this cluster. For example, the Spark nodes can be
   * provisioned and optimized for memory or compute intensive workloads. A list
   * of available node types can be retrieved by using the
   * :method:clusters/listNodeTypes API call.
   */
  @JsonProperty("node_type_id")
  private String nodeTypeId;
  
  /**
   * Custom Docker Image BYOC
   */
  @JsonProperty("preloaded_docker_images")
  private Collection<DockerImage> preloadedDockerImages;
  
  /**
   * A list of preloaded Spark image versions for the pool. Pool-backed clusters
   * started with the preloaded Spark version will start faster. A list of
   * available Spark versions can be retrieved by using the
   * :method:clusters/sparkVersions API call.
   */
  @JsonProperty("preloaded_spark_versions")
  private Collection<String> preloadedSparkVersions;
  
  /**
   * Current state of the instance pool.
   */
  @JsonProperty("state")
  private InstancePoolState state;
  
  /**
   * Usage statistics about the instance pool.
   */
  @JsonProperty("stats")
  private InstancePoolStats stats;
  
  /**
   * Status of failed pending instances in the pool.
   */
  @JsonProperty("status")
  private InstancePoolStatus status;
  
  public InstancePoolAndStats setAwsAttributes(InstancePoolAwsAttributes awsAttributes) {
    this.awsAttributes = awsAttributes;
    return this;
  }

  public InstancePoolAwsAttributes getAwsAttributes() {
    return awsAttributes;
  }
  
  public InstancePoolAndStats setAzureAttributes(InstancePoolAzureAttributes azureAttributes) {
    this.azureAttributes = azureAttributes;
    return this;
  }

  public InstancePoolAzureAttributes getAzureAttributes() {
    return azureAttributes;
  }
  
  public InstancePoolAndStats setCustomTags(Map<String,String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String,String> getCustomTags() {
    return customTags;
  }
  
  public InstancePoolAndStats setDefaultTags(Map<String,String> defaultTags) {
    this.defaultTags = defaultTags;
    return this;
  }

  public Map<String,String> getDefaultTags() {
    return defaultTags;
  }
  
  public InstancePoolAndStats setDiskSpec(DiskSpec diskSpec) {
    this.diskSpec = diskSpec;
    return this;
  }

  public DiskSpec getDiskSpec() {
    return diskSpec;
  }
  
  public InstancePoolAndStats setEnableElasticDisk(Boolean enableElasticDisk) {
    this.enableElasticDisk = enableElasticDisk;
    return this;
  }

  public Boolean getEnableElasticDisk() {
    return enableElasticDisk;
  }
  
  public InstancePoolAndStats setGcpAttributes(InstancePoolGcpAttributes gcpAttributes) {
    this.gcpAttributes = gcpAttributes;
    return this;
  }

  public InstancePoolGcpAttributes getGcpAttributes() {
    return gcpAttributes;
  }
  
  public InstancePoolAndStats setIdleInstanceAutoterminationMinutes(Long idleInstanceAutoterminationMinutes) {
    this.idleInstanceAutoterminationMinutes = idleInstanceAutoterminationMinutes;
    return this;
  }

  public Long getIdleInstanceAutoterminationMinutes() {
    return idleInstanceAutoterminationMinutes;
  }
  
  public InstancePoolAndStats setInstancePoolFleetAttributes(InstancePoolFleetAttributes instancePoolFleetAttributes) {
    this.instancePoolFleetAttributes = instancePoolFleetAttributes;
    return this;
  }

  public InstancePoolFleetAttributes getInstancePoolFleetAttributes() {
    return instancePoolFleetAttributes;
  }
  
  public InstancePoolAndStats setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }
  
  public InstancePoolAndStats setInstancePoolName(String instancePoolName) {
    this.instancePoolName = instancePoolName;
    return this;
  }

  public String getInstancePoolName() {
    return instancePoolName;
  }
  
  public InstancePoolAndStats setMaxCapacity(Long maxCapacity) {
    this.maxCapacity = maxCapacity;
    return this;
  }

  public Long getMaxCapacity() {
    return maxCapacity;
  }
  
  public InstancePoolAndStats setMinIdleInstances(Long minIdleInstances) {
    this.minIdleInstances = minIdleInstances;
    return this;
  }

  public Long getMinIdleInstances() {
    return minIdleInstances;
  }
  
  public InstancePoolAndStats setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  public String getNodeTypeId() {
    return nodeTypeId;
  }
  
  public InstancePoolAndStats setPreloadedDockerImages(Collection<DockerImage> preloadedDockerImages) {
    this.preloadedDockerImages = preloadedDockerImages;
    return this;
  }

  public Collection<DockerImage> getPreloadedDockerImages() {
    return preloadedDockerImages;
  }
  
  public InstancePoolAndStats setPreloadedSparkVersions(Collection<String> preloadedSparkVersions) {
    this.preloadedSparkVersions = preloadedSparkVersions;
    return this;
  }

  public Collection<String> getPreloadedSparkVersions() {
    return preloadedSparkVersions;
  }
  
  public InstancePoolAndStats setState(InstancePoolState state) {
    this.state = state;
    return this;
  }

  public InstancePoolState getState() {
    return state;
  }
  
  public InstancePoolAndStats setStats(InstancePoolStats stats) {
    this.stats = stats;
    return this;
  }

  public InstancePoolStats getStats() {
    return stats;
  }
  
  public InstancePoolAndStats setStatus(InstancePoolStatus status) {
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
    InstancePoolAndStats that = (InstancePoolAndStats) o;
    return Objects.equals(awsAttributes, that.awsAttributes)
    && Objects.equals(azureAttributes, that.azureAttributes)
    && Objects.equals(customTags, that.customTags)
    && Objects.equals(defaultTags, that.defaultTags)
    && Objects.equals(diskSpec, that.diskSpec)
    && Objects.equals(enableElasticDisk, that.enableElasticDisk)
    && Objects.equals(gcpAttributes, that.gcpAttributes)
    && Objects.equals(idleInstanceAutoterminationMinutes, that.idleInstanceAutoterminationMinutes)
    && Objects.equals(instancePoolFleetAttributes, that.instancePoolFleetAttributes)
    && Objects.equals(instancePoolId, that.instancePoolId)
    && Objects.equals(instancePoolName, that.instancePoolName)
    && Objects.equals(maxCapacity, that.maxCapacity)
    && Objects.equals(minIdleInstances, that.minIdleInstances)
    && Objects.equals(nodeTypeId, that.nodeTypeId)
    && Objects.equals(preloadedDockerImages, that.preloadedDockerImages)
    && Objects.equals(preloadedSparkVersions, that.preloadedSparkVersions)
    && Objects.equals(state, that.state)
    && Objects.equals(stats, that.stats)
    && Objects.equals(status, that.status)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsAttributes, azureAttributes, customTags, defaultTags, diskSpec, enableElasticDisk, gcpAttributes, idleInstanceAutoterminationMinutes, instancePoolFleetAttributes, instancePoolId, instancePoolName, maxCapacity, minIdleInstances, nodeTypeId, preloadedDockerImages, preloadedSparkVersions, state, stats, status);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolAndStats.class)
      .add("awsAttributes", awsAttributes)
      .add("azureAttributes", azureAttributes)
      .add("customTags", customTags)
      .add("defaultTags", defaultTags)
      .add("diskSpec", diskSpec)
      .add("enableElasticDisk", enableElasticDisk)
      .add("gcpAttributes", gcpAttributes)
      .add("idleInstanceAutoterminationMinutes", idleInstanceAutoterminationMinutes)
      .add("instancePoolFleetAttributes", instancePoolFleetAttributes)
      .add("instancePoolId", instancePoolId)
      .add("instancePoolName", instancePoolName)
      .add("maxCapacity", maxCapacity)
      .add("minIdleInstances", minIdleInstances)
      .add("nodeTypeId", nodeTypeId)
      .add("preloadedDockerImages", preloadedDockerImages)
      .add("preloadedSparkVersions", preloadedSparkVersions)
      .add("state", state)
      .add("stats", stats)
      .add("status", status).toString();
  }
}
