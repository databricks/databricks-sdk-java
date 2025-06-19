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
@JsonSerialize(using = EditWarehouseRequest.EditWarehouseRequestSerializer.class)
@JsonDeserialize(using = EditWarehouseRequest.EditWarehouseRequestDeserializer.class)
public class EditWarehouseRequest {
  /**
   * The amount of time in minutes that a SQL warehouse must be idle (i.e., no RUNNING queries)
   * before it is automatically stopped.
   *
   * <p>Supported values: - Must be == 0 or >= 10 mins - 0 indicates no autostop.
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

  /** Configures whether the warehouse should use serverless compute. */
  private Boolean enableServerlessCompute;

  /** Required. Id of the warehouse to configure. */
  private String id;

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
  private EditWarehouseRequestWarehouseType warehouseType;

  public EditWarehouseRequest setAutoStopMins(Long autoStopMins) {
    this.autoStopMins = autoStopMins;
    return this;
  }

  public Long getAutoStopMins() {
    return autoStopMins;
  }

  public EditWarehouseRequest setChannel(Channel channel) {
    this.channel = channel;
    return this;
  }

  public Channel getChannel() {
    return channel;
  }

  public EditWarehouseRequest setClusterSize(String clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }

  public String getClusterSize() {
    return clusterSize;
  }

  public EditWarehouseRequest setCreatorName(String creatorName) {
    this.creatorName = creatorName;
    return this;
  }

  public String getCreatorName() {
    return creatorName;
  }

  public EditWarehouseRequest setEnablePhoton(Boolean enablePhoton) {
    this.enablePhoton = enablePhoton;
    return this;
  }

  public Boolean getEnablePhoton() {
    return enablePhoton;
  }

  public EditWarehouseRequest setEnableServerlessCompute(Boolean enableServerlessCompute) {
    this.enableServerlessCompute = enableServerlessCompute;
    return this;
  }

  public Boolean getEnableServerlessCompute() {
    return enableServerlessCompute;
  }

  public EditWarehouseRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public EditWarehouseRequest setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public EditWarehouseRequest setMaxNumClusters(Long maxNumClusters) {
    this.maxNumClusters = maxNumClusters;
    return this;
  }

  public Long getMaxNumClusters() {
    return maxNumClusters;
  }

  public EditWarehouseRequest setMinNumClusters(Long minNumClusters) {
    this.minNumClusters = minNumClusters;
    return this;
  }

  public Long getMinNumClusters() {
    return minNumClusters;
  }

  public EditWarehouseRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EditWarehouseRequest setSpotInstancePolicy(SpotInstancePolicy spotInstancePolicy) {
    this.spotInstancePolicy = spotInstancePolicy;
    return this;
  }

  public SpotInstancePolicy getSpotInstancePolicy() {
    return spotInstancePolicy;
  }

  public EditWarehouseRequest setTags(EndpointTags tags) {
    this.tags = tags;
    return this;
  }

  public EndpointTags getTags() {
    return tags;
  }

  public EditWarehouseRequest setWarehouseType(EditWarehouseRequestWarehouseType warehouseType) {
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
    EditWarehouseRequest that = (EditWarehouseRequest) o;
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
    return new ToStringer(EditWarehouseRequest.class)
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

  EditWarehouseRequestPb toPb() {
    EditWarehouseRequestPb pb = new EditWarehouseRequestPb();
    pb.setAutoStopMins(autoStopMins);
    pb.setChannel(channel);
    pb.setClusterSize(clusterSize);
    pb.setCreatorName(creatorName);
    pb.setEnablePhoton(enablePhoton);
    pb.setEnableServerlessCompute(enableServerlessCompute);
    pb.setId(id);
    pb.setInstanceProfileArn(instanceProfileArn);
    pb.setMaxNumClusters(maxNumClusters);
    pb.setMinNumClusters(minNumClusters);
    pb.setName(name);
    pb.setSpotInstancePolicy(spotInstancePolicy);
    pb.setTags(tags);
    pb.setWarehouseType(warehouseType);

    return pb;
  }

  static EditWarehouseRequest fromPb(EditWarehouseRequestPb pb) {
    EditWarehouseRequest model = new EditWarehouseRequest();
    model.setAutoStopMins(pb.getAutoStopMins());
    model.setChannel(pb.getChannel());
    model.setClusterSize(pb.getClusterSize());
    model.setCreatorName(pb.getCreatorName());
    model.setEnablePhoton(pb.getEnablePhoton());
    model.setEnableServerlessCompute(pb.getEnableServerlessCompute());
    model.setId(pb.getId());
    model.setInstanceProfileArn(pb.getInstanceProfileArn());
    model.setMaxNumClusters(pb.getMaxNumClusters());
    model.setMinNumClusters(pb.getMinNumClusters());
    model.setName(pb.getName());
    model.setSpotInstancePolicy(pb.getSpotInstancePolicy());
    model.setTags(pb.getTags());
    model.setWarehouseType(pb.getWarehouseType());

    return model;
  }

  public static class EditWarehouseRequestSerializer extends JsonSerializer<EditWarehouseRequest> {
    @Override
    public void serialize(
        EditWarehouseRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EditWarehouseRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EditWarehouseRequestDeserializer
      extends JsonDeserializer<EditWarehouseRequest> {
    @Override
    public EditWarehouseRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EditWarehouseRequestPb pb = mapper.readValue(p, EditWarehouseRequestPb.class);
      return EditWarehouseRequest.fromPb(pb);
    }
  }
}
