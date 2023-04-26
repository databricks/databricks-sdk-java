// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * <p>EditInstancePool class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class EditInstancePool {
  /**
   * Attributes related to pool running on Amazon Web Services. If not specified at pool creation, a
   * set of default values will be used.
   */
  @JsonProperty("aws_attributes")
  private InstancePoolAwsAttributes awsAttributes;

  /**
   * Attributes related to pool running on Azure. If not specified at pool creation, a set of
   * default values will be used.
   */
  @JsonProperty("azure_attributes")
  private InstancePoolAzureAttributes azureAttributes;

  /**
   * Additional tags for pool resources. Databricks will tag all pool resources (e.g., AWS instances
   * and EBS volumes) with these tags in addition to `default_tags`. Notes:
   *
   * <p>- Currently, Databricks allows at most 45 custom tags
   */
  @JsonProperty("custom_tags")
  private Map<String, String> customTags;

  /** Defines the specification of the disks that will be attached to all spark containers. */
  @JsonProperty("disk_spec")
  private DiskSpec diskSpec;

  /**
   * Autoscaling Local Storage: when enabled, this instances in this pool will dynamically acquire
   * additional disk space when its Spark workers are running low on disk space. In AWS, this
   * feature requires specific AWS permissions to function correctly - refer to the User Guide for
   * more details.
   */
  @JsonProperty("enable_elastic_disk")
  private Boolean enableElasticDisk;

  /**
   * Automatically terminates the extra instances in the pool cache after they are inactive for this
   * time in minutes if min_idle_instances requirement is already met. If not set, the extra pool
   * instances will be automatically terminated after a default timeout. If specified, the threshold
   * must be between 0 and 10000 minutes. Users can also set this value to 0 to instantly remove
   * idle instances from the cache if min cache size could still hold.
   */
  @JsonProperty("idle_instance_autotermination_minutes")
  private Long idleInstanceAutoterminationMinutes;

  /** The fleet related setting to power the instance pool. */
  @JsonProperty("instance_pool_fleet_attributes")
  private InstancePoolFleetAttributes instancePoolFleetAttributes;

  /** Instance pool ID */
  @JsonProperty("instance_pool_id")
  private String instancePoolId;

  /**
   * Pool name requested by the user. Pool name must be unique. Length must be between 1 and 100
   * characters.
   */
  @JsonProperty("instance_pool_name")
  private String instancePoolName;

  /**
   * Maximum number of outstanding instances to keep in the pool, including both instances used by
   * clusters and idle instances. Clusters that require further instance provisioning will fail
   * during upsize requests.
   */
  @JsonProperty("max_capacity")
  private Long maxCapacity;

  /** Minimum number of idle instances to keep in the instance pool */
  @JsonProperty("min_idle_instances")
  private Long minIdleInstances;

  /**
   * This field encodes, through a single value, the resources available to each of the Spark nodes
   * in this cluster. For example, the Spark nodes can be provisioned and optimized for memory or
   * compute intensive workloads. A list of available node types can be retrieved by using the
   * :method:clusters/listNodeTypes API call.
   */
  @JsonProperty("node_type_id")
  private String nodeTypeId;

  /** Custom Docker Image BYOC */
  @JsonProperty("preloaded_docker_images")
  private Collection<DockerImage> preloadedDockerImages;

  /**
   * A list of preloaded Spark image versions for the pool. Pool-backed clusters started with the
   * preloaded Spark version will start faster. A list of available Spark versions can be retrieved
   * by using the :method:clusters/sparkVersions API call.
   */
  @JsonProperty("preloaded_spark_versions")
  private Collection<String> preloadedSparkVersions;

  /**
   * <p>Setter for the field <code>awsAttributes</code>.</p>
   *
   * @param awsAttributes a {@link com.databricks.sdk.service.compute.InstancePoolAwsAttributes} object
   * @return a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public EditInstancePool setAwsAttributes(InstancePoolAwsAttributes awsAttributes) {
    this.awsAttributes = awsAttributes;
    return this;
  }

  /**
   * <p>Getter for the field <code>awsAttributes</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.InstancePoolAwsAttributes} object
   */
  public InstancePoolAwsAttributes getAwsAttributes() {
    return awsAttributes;
  }

  /**
   * <p>Setter for the field <code>azureAttributes</code>.</p>
   *
   * @param azureAttributes a {@link com.databricks.sdk.service.compute.InstancePoolAzureAttributes} object
   * @return a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public EditInstancePool setAzureAttributes(InstancePoolAzureAttributes azureAttributes) {
    this.azureAttributes = azureAttributes;
    return this;
  }

  /**
   * <p>Getter for the field <code>azureAttributes</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.InstancePoolAzureAttributes} object
   */
  public InstancePoolAzureAttributes getAzureAttributes() {
    return azureAttributes;
  }

  /**
   * <p>Setter for the field <code>customTags</code>.</p>
   *
   * @param customTags a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public EditInstancePool setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  /**
   * <p>Getter for the field <code>customTags</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getCustomTags() {
    return customTags;
  }

  /**
   * <p>Setter for the field <code>diskSpec</code>.</p>
   *
   * @param diskSpec a {@link com.databricks.sdk.service.compute.DiskSpec} object
   * @return a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public EditInstancePool setDiskSpec(DiskSpec diskSpec) {
    this.diskSpec = diskSpec;
    return this;
  }

  /**
   * <p>Getter for the field <code>diskSpec</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.DiskSpec} object
   */
  public DiskSpec getDiskSpec() {
    return diskSpec;
  }

  /**
   * <p>Setter for the field <code>enableElasticDisk</code>.</p>
   *
   * @param enableElasticDisk a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public EditInstancePool setEnableElasticDisk(Boolean enableElasticDisk) {
    this.enableElasticDisk = enableElasticDisk;
    return this;
  }

  /**
   * <p>Getter for the field <code>enableElasticDisk</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnableElasticDisk() {
    return enableElasticDisk;
  }

  /**
   * <p>Setter for the field <code>idleInstanceAutoterminationMinutes</code>.</p>
   *
   * @param idleInstanceAutoterminationMinutes a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public EditInstancePool setIdleInstanceAutoterminationMinutes(
      Long idleInstanceAutoterminationMinutes) {
    this.idleInstanceAutoterminationMinutes = idleInstanceAutoterminationMinutes;
    return this;
  }

  /**
   * <p>Getter for the field <code>idleInstanceAutoterminationMinutes</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getIdleInstanceAutoterminationMinutes() {
    return idleInstanceAutoterminationMinutes;
  }

  /**
   * <p>Setter for the field <code>instancePoolFleetAttributes</code>.</p>
   *
   * @param instancePoolFleetAttributes a {@link com.databricks.sdk.service.compute.InstancePoolFleetAttributes} object
   * @return a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public EditInstancePool setInstancePoolFleetAttributes(
      InstancePoolFleetAttributes instancePoolFleetAttributes) {
    this.instancePoolFleetAttributes = instancePoolFleetAttributes;
    return this;
  }

  /**
   * <p>Getter for the field <code>instancePoolFleetAttributes</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.InstancePoolFleetAttributes} object
   */
  public InstancePoolFleetAttributes getInstancePoolFleetAttributes() {
    return instancePoolFleetAttributes;
  }

  /**
   * <p>Setter for the field <code>instancePoolId</code>.</p>
   *
   * @param instancePoolId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public EditInstancePool setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  /**
   * <p>Getter for the field <code>instancePoolId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstancePoolId() {
    return instancePoolId;
  }

  /**
   * <p>Setter for the field <code>instancePoolName</code>.</p>
   *
   * @param instancePoolName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public EditInstancePool setInstancePoolName(String instancePoolName) {
    this.instancePoolName = instancePoolName;
    return this;
  }

  /**
   * <p>Getter for the field <code>instancePoolName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstancePoolName() {
    return instancePoolName;
  }

  /**
   * <p>Setter for the field <code>maxCapacity</code>.</p>
   *
   * @param maxCapacity a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public EditInstancePool setMaxCapacity(Long maxCapacity) {
    this.maxCapacity = maxCapacity;
    return this;
  }

  /**
   * <p>Getter for the field <code>maxCapacity</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMaxCapacity() {
    return maxCapacity;
  }

  /**
   * <p>Setter for the field <code>minIdleInstances</code>.</p>
   *
   * @param minIdleInstances a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public EditInstancePool setMinIdleInstances(Long minIdleInstances) {
    this.minIdleInstances = minIdleInstances;
    return this;
  }

  /**
   * <p>Getter for the field <code>minIdleInstances</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMinIdleInstances() {
    return minIdleInstances;
  }

  /**
   * <p>Setter for the field <code>nodeTypeId</code>.</p>
   *
   * @param nodeTypeId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public EditInstancePool setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  /**
   * <p>Getter for the field <code>nodeTypeId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNodeTypeId() {
    return nodeTypeId;
  }

  /**
   * <p>Setter for the field <code>preloadedDockerImages</code>.</p>
   *
   * @param preloadedDockerImages a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public EditInstancePool setPreloadedDockerImages(Collection<DockerImage> preloadedDockerImages) {
    this.preloadedDockerImages = preloadedDockerImages;
    return this;
  }

  /**
   * <p>Getter for the field <code>preloadedDockerImages</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<DockerImage> getPreloadedDockerImages() {
    return preloadedDockerImages;
  }

  /**
   * <p>Setter for the field <code>preloadedSparkVersions</code>.</p>
   *
   * @param preloadedSparkVersions a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public EditInstancePool setPreloadedSparkVersions(Collection<String> preloadedSparkVersions) {
    this.preloadedSparkVersions = preloadedSparkVersions;
    return this;
  }

  /**
   * <p>Getter for the field <code>preloadedSparkVersions</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getPreloadedSparkVersions() {
    return preloadedSparkVersions;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EditInstancePool that = (EditInstancePool) o;
    return Objects.equals(awsAttributes, that.awsAttributes)
        && Objects.equals(azureAttributes, that.azureAttributes)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(diskSpec, that.diskSpec)
        && Objects.equals(enableElasticDisk, that.enableElasticDisk)
        && Objects.equals(
            idleInstanceAutoterminationMinutes, that.idleInstanceAutoterminationMinutes)
        && Objects.equals(instancePoolFleetAttributes, that.instancePoolFleetAttributes)
        && Objects.equals(instancePoolId, that.instancePoolId)
        && Objects.equals(instancePoolName, that.instancePoolName)
        && Objects.equals(maxCapacity, that.maxCapacity)
        && Objects.equals(minIdleInstances, that.minIdleInstances)
        && Objects.equals(nodeTypeId, that.nodeTypeId)
        && Objects.equals(preloadedDockerImages, that.preloadedDockerImages)
        && Objects.equals(preloadedSparkVersions, that.preloadedSparkVersions);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        awsAttributes,
        azureAttributes,
        customTags,
        diskSpec,
        enableElasticDisk,
        idleInstanceAutoterminationMinutes,
        instancePoolFleetAttributes,
        instancePoolId,
        instancePoolName,
        maxCapacity,
        minIdleInstances,
        nodeTypeId,
        preloadedDockerImages,
        preloadedSparkVersions);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(EditInstancePool.class)
        .add("awsAttributes", awsAttributes)
        .add("azureAttributes", azureAttributes)
        .add("customTags", customTags)
        .add("diskSpec", diskSpec)
        .add("enableElasticDisk", enableElasticDisk)
        .add("idleInstanceAutoterminationMinutes", idleInstanceAutoterminationMinutes)
        .add("instancePoolFleetAttributes", instancePoolFleetAttributes)
        .add("instancePoolId", instancePoolId)
        .add("instancePoolName", instancePoolName)
        .add("maxCapacity", maxCapacity)
        .add("minIdleInstances", minIdleInstances)
        .add("nodeTypeId", nodeTypeId)
        .add("preloadedDockerImages", preloadedDockerImages)
        .add("preloadedSparkVersions", preloadedSparkVersions)
        .toString();
  }
}
