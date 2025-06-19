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
@JsonSerialize(using = CreateInstancePool.CreateInstancePoolSerializer.class)
@JsonDeserialize(using = CreateInstancePool.CreateInstancePoolDeserializer.class)
public class CreateInstancePool {
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

  public CreateInstancePool setAwsAttributes(InstancePoolAwsAttributes awsAttributes) {
    this.awsAttributes = awsAttributes;
    return this;
  }

  public InstancePoolAwsAttributes getAwsAttributes() {
    return awsAttributes;
  }

  public CreateInstancePool setAzureAttributes(InstancePoolAzureAttributes azureAttributes) {
    this.azureAttributes = azureAttributes;
    return this;
  }

  public InstancePoolAzureAttributes getAzureAttributes() {
    return azureAttributes;
  }

  public CreateInstancePool setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public CreateInstancePool setDiskSpec(DiskSpec diskSpec) {
    this.diskSpec = diskSpec;
    return this;
  }

  public DiskSpec getDiskSpec() {
    return diskSpec;
  }

  public CreateInstancePool setEnableElasticDisk(Boolean enableElasticDisk) {
    this.enableElasticDisk = enableElasticDisk;
    return this;
  }

  public Boolean getEnableElasticDisk() {
    return enableElasticDisk;
  }

  public CreateInstancePool setGcpAttributes(InstancePoolGcpAttributes gcpAttributes) {
    this.gcpAttributes = gcpAttributes;
    return this;
  }

  public InstancePoolGcpAttributes getGcpAttributes() {
    return gcpAttributes;
  }

  public CreateInstancePool setIdleInstanceAutoterminationMinutes(
      Long idleInstanceAutoterminationMinutes) {
    this.idleInstanceAutoterminationMinutes = idleInstanceAutoterminationMinutes;
    return this;
  }

  public Long getIdleInstanceAutoterminationMinutes() {
    return idleInstanceAutoterminationMinutes;
  }

  public CreateInstancePool setInstancePoolName(String instancePoolName) {
    this.instancePoolName = instancePoolName;
    return this;
  }

  public String getInstancePoolName() {
    return instancePoolName;
  }

  public CreateInstancePool setMaxCapacity(Long maxCapacity) {
    this.maxCapacity = maxCapacity;
    return this;
  }

  public Long getMaxCapacity() {
    return maxCapacity;
  }

  public CreateInstancePool setMinIdleInstances(Long minIdleInstances) {
    this.minIdleInstances = minIdleInstances;
    return this;
  }

  public Long getMinIdleInstances() {
    return minIdleInstances;
  }

  public CreateInstancePool setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  public String getNodeTypeId() {
    return nodeTypeId;
  }

  public CreateInstancePool setPreloadedDockerImages(
      Collection<DockerImage> preloadedDockerImages) {
    this.preloadedDockerImages = preloadedDockerImages;
    return this;
  }

  public Collection<DockerImage> getPreloadedDockerImages() {
    return preloadedDockerImages;
  }

  public CreateInstancePool setPreloadedSparkVersions(Collection<String> preloadedSparkVersions) {
    this.preloadedSparkVersions = preloadedSparkVersions;
    return this;
  }

  public Collection<String> getPreloadedSparkVersions() {
    return preloadedSparkVersions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateInstancePool that = (CreateInstancePool) o;
    return Objects.equals(awsAttributes, that.awsAttributes)
        && Objects.equals(azureAttributes, that.azureAttributes)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(diskSpec, that.diskSpec)
        && Objects.equals(enableElasticDisk, that.enableElasticDisk)
        && Objects.equals(gcpAttributes, that.gcpAttributes)
        && Objects.equals(
            idleInstanceAutoterminationMinutes, that.idleInstanceAutoterminationMinutes)
        && Objects.equals(instancePoolName, that.instancePoolName)
        && Objects.equals(maxCapacity, that.maxCapacity)
        && Objects.equals(minIdleInstances, that.minIdleInstances)
        && Objects.equals(nodeTypeId, that.nodeTypeId)
        && Objects.equals(preloadedDockerImages, that.preloadedDockerImages)
        && Objects.equals(preloadedSparkVersions, that.preloadedSparkVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsAttributes,
        azureAttributes,
        customTags,
        diskSpec,
        enableElasticDisk,
        gcpAttributes,
        idleInstanceAutoterminationMinutes,
        instancePoolName,
        maxCapacity,
        minIdleInstances,
        nodeTypeId,
        preloadedDockerImages,
        preloadedSparkVersions);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateInstancePool.class)
        .add("awsAttributes", awsAttributes)
        .add("azureAttributes", azureAttributes)
        .add("customTags", customTags)
        .add("diskSpec", diskSpec)
        .add("enableElasticDisk", enableElasticDisk)
        .add("gcpAttributes", gcpAttributes)
        .add("idleInstanceAutoterminationMinutes", idleInstanceAutoterminationMinutes)
        .add("instancePoolName", instancePoolName)
        .add("maxCapacity", maxCapacity)
        .add("minIdleInstances", minIdleInstances)
        .add("nodeTypeId", nodeTypeId)
        .add("preloadedDockerImages", preloadedDockerImages)
        .add("preloadedSparkVersions", preloadedSparkVersions)
        .toString();
  }

  CreateInstancePoolPb toPb() {
    CreateInstancePoolPb pb = new CreateInstancePoolPb();
    pb.setAwsAttributes(awsAttributes);
    pb.setAzureAttributes(azureAttributes);
    pb.setCustomTags(customTags);
    pb.setDiskSpec(diskSpec);
    pb.setEnableElasticDisk(enableElasticDisk);
    pb.setGcpAttributes(gcpAttributes);
    pb.setIdleInstanceAutoterminationMinutes(idleInstanceAutoterminationMinutes);
    pb.setInstancePoolName(instancePoolName);
    pb.setMaxCapacity(maxCapacity);
    pb.setMinIdleInstances(minIdleInstances);
    pb.setNodeTypeId(nodeTypeId);
    pb.setPreloadedDockerImages(preloadedDockerImages);
    pb.setPreloadedSparkVersions(preloadedSparkVersions);

    return pb;
  }

  static CreateInstancePool fromPb(CreateInstancePoolPb pb) {
    CreateInstancePool model = new CreateInstancePool();
    model.setAwsAttributes(pb.getAwsAttributes());
    model.setAzureAttributes(pb.getAzureAttributes());
    model.setCustomTags(pb.getCustomTags());
    model.setDiskSpec(pb.getDiskSpec());
    model.setEnableElasticDisk(pb.getEnableElasticDisk());
    model.setGcpAttributes(pb.getGcpAttributes());
    model.setIdleInstanceAutoterminationMinutes(pb.getIdleInstanceAutoterminationMinutes());
    model.setInstancePoolName(pb.getInstancePoolName());
    model.setMaxCapacity(pb.getMaxCapacity());
    model.setMinIdleInstances(pb.getMinIdleInstances());
    model.setNodeTypeId(pb.getNodeTypeId());
    model.setPreloadedDockerImages(pb.getPreloadedDockerImages());
    model.setPreloadedSparkVersions(pb.getPreloadedSparkVersions());

    return model;
  }

  public static class CreateInstancePoolSerializer extends JsonSerializer<CreateInstancePool> {
    @Override
    public void serialize(CreateInstancePool value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateInstancePoolPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateInstancePoolDeserializer extends JsonDeserializer<CreateInstancePool> {
    @Override
    public CreateInstancePool deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateInstancePoolPb pb = mapper.readValue(p, CreateInstancePoolPb.class);
      return CreateInstancePool.fromPb(pb);
    }
  }
}
