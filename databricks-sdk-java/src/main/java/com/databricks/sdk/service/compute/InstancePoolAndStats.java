// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = InstancePoolAndStats.InstancePoolAndStatsSerializer.class)
@JsonDeserialize(using = InstancePoolAndStats.InstancePoolAndStatsDeserializer.class)
public class InstancePoolAndStats {
  /**
   * Attributes related to instance pools running on Amazon Web Services. If not specified at pool
   * creation, a set of default values will be used.
   */
  private InstancePoolAwsAttributes awsAttributes;

  /**
   * Attributes related to instance pools running on Azure. If not specified at pool creation, a set
   * of default values will be used.
   */
  private InstancePoolAzureAttributes azureAttributes;

  /**
   * Additional tags for pool resources. Databricks will tag all pool resources (e.g., AWS instances
   * and EBS volumes) with these tags in addition to `default_tags`. Notes:
   *
   * <p>- Currently, Databricks allows at most 45 custom tags
   */
  private Map<String, String> customTags;

  /**
   * Tags that are added by Databricks regardless of any ``custom_tags``, including:
   *
   * <p>- Vendor: Databricks
   *
   * <p>- InstancePoolCreator: <user_id_of_creator>
   *
   * <p>- InstancePoolName: <name_of_pool>
   *
   * <p>- InstancePoolId: <id_of_pool>
   */
  private Map<String, String> defaultTags;

  /** Defines the specification of the disks that will be attached to all spark containers. */
  private DiskSpec diskSpec;

  /**
   * Autoscaling Local Storage: when enabled, this instances in this pool will dynamically acquire
   * additional disk space when its Spark workers are running low on disk space. In AWS, this
   * feature requires specific AWS permissions to function correctly - refer to the User Guide for
   * more details.
   */
  private Boolean enableElasticDisk;

  /**
   * Attributes related to instance pools running on Google Cloud Platform. If not specified at pool
   * creation, a set of default values will be used.
   */
  private InstancePoolGcpAttributes gcpAttributes;

  /**
   * Automatically terminates the extra instances in the pool cache after they are inactive for this
   * time in minutes if min_idle_instances requirement is already met. If not set, the extra pool
   * instances will be automatically terminated after a default timeout. If specified, the threshold
   * must be between 0 and 10000 minutes. Users can also set this value to 0 to instantly remove
   * idle instances from the cache if min cache size could still hold.
   */
  private Long idleInstanceAutoterminationMinutes;

  /** Canonical unique identifier for the pool. */
  private String instancePoolId;

  /**
   * Pool name requested by the user. Pool name must be unique. Length must be between 1 and 100
   * characters.
   */
  private String instancePoolName;

  /**
   * Maximum number of outstanding instances to keep in the pool, including both instances used by
   * clusters and idle instances. Clusters that require further instance provisioning will fail
   * during upsize requests.
   */
  private Long maxCapacity;

  /** Minimum number of idle instances to keep in the instance pool */
  private Long minIdleInstances;

  /**
   * This field encodes, through a single value, the resources available to each of the Spark nodes
   * in this cluster. For example, the Spark nodes can be provisioned and optimized for memory or
   * compute intensive workloads. A list of available node types can be retrieved by using the
   * :method:clusters/listNodeTypes API call.
   */
  private String nodeTypeId;

  /** Custom Docker Image BYOC */
  private Collection<DockerImage> preloadedDockerImages;

  /**
   * A list containing at most one preloaded Spark image version for the pool. Pool-backed clusters
   * started with the preloaded Spark version will start faster. A list of available Spark versions
   * can be retrieved by using the :method:clusters/sparkVersions API call.
   */
  private Collection<String> preloadedSparkVersions;

  /** Current state of the instance pool. */
  private InstancePoolState state;

  /** Usage statistics about the instance pool. */
  private InstancePoolStats stats;

  /** Status of failed pending instances in the pool. */
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

  public InstancePoolAndStats setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public InstancePoolAndStats setDefaultTags(Map<String, String> defaultTags) {
    this.defaultTags = defaultTags;
    return this;
  }

  public Map<String, String> getDefaultTags() {
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

  public InstancePoolAndStats setIdleInstanceAutoterminationMinutes(
      Long idleInstanceAutoterminationMinutes) {
    this.idleInstanceAutoterminationMinutes = idleInstanceAutoterminationMinutes;
    return this;
  }

  public Long getIdleInstanceAutoterminationMinutes() {
    return idleInstanceAutoterminationMinutes;
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

  public InstancePoolAndStats setPreloadedDockerImages(
      Collection<DockerImage> preloadedDockerImages) {
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
    return new ToStringer(InstancePoolAndStats.class)
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

  InstancePoolAndStatsPb toPb() {
    InstancePoolAndStatsPb pb = new InstancePoolAndStatsPb();
    pb.setAwsAttributes(awsAttributes);
    pb.setAzureAttributes(azureAttributes);
    pb.setCustomTags(customTags);
    pb.setDefaultTags(defaultTags);
    pb.setDiskSpec(diskSpec);
    pb.setEnableElasticDisk(enableElasticDisk);
    pb.setGcpAttributes(gcpAttributes);
    pb.setIdleInstanceAutoterminationMinutes(idleInstanceAutoterminationMinutes);
    pb.setInstancePoolId(instancePoolId);
    pb.setInstancePoolName(instancePoolName);
    pb.setMaxCapacity(maxCapacity);
    pb.setMinIdleInstances(minIdleInstances);
    pb.setNodeTypeId(nodeTypeId);
    pb.setPreloadedDockerImages(preloadedDockerImages);
    pb.setPreloadedSparkVersions(preloadedSparkVersions);
    pb.setState(state);
    pb.setStats(stats);
    pb.setStatus(status);

    return pb;
  }

  static InstancePoolAndStats fromPb(InstancePoolAndStatsPb pb) {
    InstancePoolAndStats model = new InstancePoolAndStats();
    model.setAwsAttributes(pb.getAwsAttributes());
    model.setAzureAttributes(pb.getAzureAttributes());
    model.setCustomTags(pb.getCustomTags());
    model.setDefaultTags(pb.getDefaultTags());
    model.setDiskSpec(pb.getDiskSpec());
    model.setEnableElasticDisk(pb.getEnableElasticDisk());
    model.setGcpAttributes(pb.getGcpAttributes());
    model.setIdleInstanceAutoterminationMinutes(pb.getIdleInstanceAutoterminationMinutes());
    model.setInstancePoolId(pb.getInstancePoolId());
    model.setInstancePoolName(pb.getInstancePoolName());
    model.setMaxCapacity(pb.getMaxCapacity());
    model.setMinIdleInstances(pb.getMinIdleInstances());
    model.setNodeTypeId(pb.getNodeTypeId());
    model.setPreloadedDockerImages(pb.getPreloadedDockerImages());
    model.setPreloadedSparkVersions(pb.getPreloadedSparkVersions());
    model.setState(pb.getState());
    model.setStats(pb.getStats());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class InstancePoolAndStatsSerializer extends JsonSerializer<InstancePoolAndStats> {
    @Override
    public void serialize(
        InstancePoolAndStats value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstancePoolAndStatsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstancePoolAndStatsDeserializer
      extends JsonDeserializer<InstancePoolAndStats> {
    @Override
    public InstancePoolAndStats deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstancePoolAndStatsPb pb = mapper.readValue(p, InstancePoolAndStatsPb.class);
      return InstancePoolAndStats.fromPb(pb);
    }
  }
}
