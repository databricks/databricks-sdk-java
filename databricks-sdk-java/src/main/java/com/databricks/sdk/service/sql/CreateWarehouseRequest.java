// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
import java.util.Objects;

@Generated
@JsonSerialize(using = CreateWarehouseRequest.CreateWarehouseRequestSerializer.class)
@JsonDeserialize(using = CreateWarehouseRequest.CreateWarehouseRequestDeserializer.class)
public class CreateWarehouseRequest {
  /**
   * The amount of time in minutes that a SQL warehouse must be idle (i.e., no RUNNING queries)
   * before it is automatically stopped.
   *
   * <p>Supported values: - Must be >= 0 mins for serverless warehouses - Must be == 0 or >= 10 mins
   * for non-serverless warehouses - 0 indicates no autostop.
   *
   * <p>Defaults to 120 mins
   */
  private Long autoStopMins;

  /** Channel Details */
  private Channel channel;

  /**
   * Size of the clusters allocated for this warehouse. Increasing the size of a spark cluster
   * allows you to run larger queries on it. If you want to increase the number of concurrent
   * queries, please tune max_num_clusters.
   *
   * <p>Supported values: - 2X-Small - X-Small - Small - Medium - Large - X-Large - 2X-Large -
   * 3X-Large - 4X-Large
   */
  private String clusterSize;

  /** warehouse creator name */
  private String creatorName;

  /**
   * Configures whether the warehouse should use Photon optimized clusters.
   *
   * <p>Defaults to false.
   */
  private Boolean enablePhoton;

  /** Configures whether the warehouse should use serverless compute */
  private Boolean enableServerlessCompute;

  /** Deprecated. Instance profile used to pass IAM role to the cluster */
  private String instanceProfileArn;

  /**
   * Maximum number of clusters that the autoscaler will create to handle concurrent queries.
   *
   * <p>Supported values: - Must be >= min_num_clusters - Must be <= 30.
   *
   * <p>Defaults to min_clusters if unset.
   */
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
  private Long minNumClusters;

  /**
   * Logical name for the cluster.
   *
   * <p>Supported values: - Must be unique within an org. - Must be less than 100 characters.
   */
  private String name;

  /** Configurations whether the warehouse should use spot instances. */
  private SpotInstancePolicy spotInstancePolicy;

  /**
   * A set of key-value pairs that will be tagged on all resources (e.g., AWS instances and EBS
   * volumes) associated with this SQL warehouse.
   *
   * <p>Supported values: - Number of tags < 45.
   */
  private EndpointTags tags;

  /**
   * Warehouse type: `PRO` or `CLASSIC`. If you want to use serverless compute, you must set to
   * `PRO` and also set the field `enable_serverless_compute` to `true`.
   */
  private CreateWarehouseRequestWarehouseType warehouseType;

  public CreateWarehouseRequest setAutoStopMins(Long autoStopMins) {
    this.autoStopMins = autoStopMins;
    return this;
  }

  public Long getAutoStopMins() {
    return autoStopMins;
  }

  public CreateWarehouseRequest setChannel(Channel channel) {
    this.channel = channel;
    return this;
  }

  public Channel getChannel() {
    return channel;
  }

  public CreateWarehouseRequest setClusterSize(String clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }

  public String getClusterSize() {
    return clusterSize;
  }

  public CreateWarehouseRequest setCreatorName(String creatorName) {
    this.creatorName = creatorName;
    return this;
  }

  public String getCreatorName() {
    return creatorName;
  }

  public CreateWarehouseRequest setEnablePhoton(Boolean enablePhoton) {
    this.enablePhoton = enablePhoton;
    return this;
  }

  public Boolean getEnablePhoton() {
    return enablePhoton;
  }

  public CreateWarehouseRequest setEnableServerlessCompute(Boolean enableServerlessCompute) {
    this.enableServerlessCompute = enableServerlessCompute;
    return this;
  }

  public Boolean getEnableServerlessCompute() {
    return enableServerlessCompute;
  }

  public CreateWarehouseRequest setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public CreateWarehouseRequest setMaxNumClusters(Long maxNumClusters) {
    this.maxNumClusters = maxNumClusters;
    return this;
  }

  public Long getMaxNumClusters() {
    return maxNumClusters;
  }

  public CreateWarehouseRequest setMinNumClusters(Long minNumClusters) {
    this.minNumClusters = minNumClusters;
    return this;
  }

  public Long getMinNumClusters() {
    return minNumClusters;
  }

  public CreateWarehouseRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateWarehouseRequest setSpotInstancePolicy(SpotInstancePolicy spotInstancePolicy) {
    this.spotInstancePolicy = spotInstancePolicy;
    return this;
  }

  public SpotInstancePolicy getSpotInstancePolicy() {
    return spotInstancePolicy;
  }

  public CreateWarehouseRequest setTags(EndpointTags tags) {
    this.tags = tags;
    return this;
  }

  public EndpointTags getTags() {
    return tags;
  }

  public CreateWarehouseRequest setWarehouseType(
      CreateWarehouseRequestWarehouseType warehouseType) {
    this.warehouseType = warehouseType;
    return this;
  }

  public CreateWarehouseRequestWarehouseType getWarehouseType() {
    return warehouseType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateWarehouseRequest that = (CreateWarehouseRequest) o;
    return Objects.equals(autoStopMins, that.autoStopMins)
        && Objects.equals(channel, that.channel)
        && Objects.equals(clusterSize, that.clusterSize)
        && Objects.equals(creatorName, that.creatorName)
        && Objects.equals(enablePhoton, that.enablePhoton)
        && Objects.equals(enableServerlessCompute, that.enableServerlessCompute)
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
    return new ToStringer(CreateWarehouseRequest.class)
        .add("autoStopMins", autoStopMins)
        .add("channel", channel)
        .add("clusterSize", clusterSize)
        .add("creatorName", creatorName)
        .add("enablePhoton", enablePhoton)
        .add("enableServerlessCompute", enableServerlessCompute)
        .add("instanceProfileArn", instanceProfileArn)
        .add("maxNumClusters", maxNumClusters)
        .add("minNumClusters", minNumClusters)
        .add("name", name)
        .add("spotInstancePolicy", spotInstancePolicy)
        .add("tags", tags)
        .add("warehouseType", warehouseType)
        .toString();
  }

  CreateWarehouseRequestPb toPb() {
    CreateWarehouseRequestPb pb = new CreateWarehouseRequestPb();
    pb.setAutoStopMins(autoStopMins);
    pb.setChannel(channel);
    pb.setClusterSize(clusterSize);
    pb.setCreatorName(creatorName);
    pb.setEnablePhoton(enablePhoton);
    pb.setEnableServerlessCompute(enableServerlessCompute);
    pb.setInstanceProfileArn(instanceProfileArn);
    pb.setMaxNumClusters(maxNumClusters);
    pb.setMinNumClusters(minNumClusters);
    pb.setName(name);
    pb.setSpotInstancePolicy(spotInstancePolicy);
    pb.setTags(tags);
    pb.setWarehouseType(warehouseType);

    return pb;
  }

  static CreateWarehouseRequest fromPb(CreateWarehouseRequestPb pb) {
    CreateWarehouseRequest model = new CreateWarehouseRequest();
    model.setAutoStopMins(pb.getAutoStopMins());
    model.setChannel(pb.getChannel());
    model.setClusterSize(pb.getClusterSize());
    model.setCreatorName(pb.getCreatorName());
    model.setEnablePhoton(pb.getEnablePhoton());
    model.setEnableServerlessCompute(pb.getEnableServerlessCompute());
    model.setInstanceProfileArn(pb.getInstanceProfileArn());
    model.setMaxNumClusters(pb.getMaxNumClusters());
    model.setMinNumClusters(pb.getMinNumClusters());
    model.setName(pb.getName());
    model.setSpotInstancePolicy(pb.getSpotInstancePolicy());
    model.setTags(pb.getTags());
    model.setWarehouseType(pb.getWarehouseType());

    return model;
  }

  public static class CreateWarehouseRequestSerializer
      extends JsonSerializer<CreateWarehouseRequest> {
    @Override
    public void serialize(
        CreateWarehouseRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateWarehouseRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateWarehouseRequestDeserializer
      extends JsonDeserializer<CreateWarehouseRequest> {
    @Override
    public CreateWarehouseRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateWarehouseRequestPb pb = mapper.readValue(p, CreateWarehouseRequestPb.class);
      return CreateWarehouseRequest.fromPb(pb);
    }
  }
}
