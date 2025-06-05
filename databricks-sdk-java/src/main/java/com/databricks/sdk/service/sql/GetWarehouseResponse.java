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
@JsonSerialize(using = GetWarehouseResponse.GetWarehouseResponseSerializer.class)
@JsonDeserialize(using = GetWarehouseResponse.GetWarehouseResponseDeserializer.class)
public class GetWarehouseResponse {
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

  /** Configures whether the warehouse should use serverless compute */
  private Boolean enableServerlessCompute;

  /** Optional health status. Assume the warehouse is healthy if this field is not set. */
  private EndpointHealth health;

  /** unique identifier for warehouse */
  private String id;

  /** Deprecated. Instance profile used to pass IAM role to the cluster */
  private String instanceProfileArn;

  /** the jdbc connection string for this warehouse */
  private String jdbcUrl;

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

  /** Deprecated. current number of active sessions for the warehouse */
  private Long numActiveSessions;

  /** current number of clusters running for the service */
  private Long numClusters;

  /** ODBC parameters for the SQL warehouse */
  private OdbcParams odbcParams;

  /** Configurations whether the warehouse should use spot instances. */
  private SpotInstancePolicy spotInstancePolicy;

  /** State of the warehouse */
  private State state;

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
  private GetWarehouseResponseWarehouseType warehouseType;

  public GetWarehouseResponse setAutoStopMins(Long autoStopMins) {
    this.autoStopMins = autoStopMins;
    return this;
  }

  public Long getAutoStopMins() {
    return autoStopMins;
  }

  public GetWarehouseResponse setChannel(Channel channel) {
    this.channel = channel;
    return this;
  }

  public Channel getChannel() {
    return channel;
  }

  public GetWarehouseResponse setClusterSize(String clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }

  public String getClusterSize() {
    return clusterSize;
  }

  public GetWarehouseResponse setCreatorName(String creatorName) {
    this.creatorName = creatorName;
    return this;
  }

  public String getCreatorName() {
    return creatorName;
  }

  public GetWarehouseResponse setEnablePhoton(Boolean enablePhoton) {
    this.enablePhoton = enablePhoton;
    return this;
  }

  public Boolean getEnablePhoton() {
    return enablePhoton;
  }

  public GetWarehouseResponse setEnableServerlessCompute(Boolean enableServerlessCompute) {
    this.enableServerlessCompute = enableServerlessCompute;
    return this;
  }

  public Boolean getEnableServerlessCompute() {
    return enableServerlessCompute;
  }

  public GetWarehouseResponse setHealth(EndpointHealth health) {
    this.health = health;
    return this;
  }

  public EndpointHealth getHealth() {
    return health;
  }

  public GetWarehouseResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GetWarehouseResponse setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public GetWarehouseResponse setJdbcUrl(String jdbcUrl) {
    this.jdbcUrl = jdbcUrl;
    return this;
  }

  public String getJdbcUrl() {
    return jdbcUrl;
  }

  public GetWarehouseResponse setMaxNumClusters(Long maxNumClusters) {
    this.maxNumClusters = maxNumClusters;
    return this;
  }

  public Long getMaxNumClusters() {
    return maxNumClusters;
  }

  public GetWarehouseResponse setMinNumClusters(Long minNumClusters) {
    this.minNumClusters = minNumClusters;
    return this;
  }

  public Long getMinNumClusters() {
    return minNumClusters;
  }

  public GetWarehouseResponse setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetWarehouseResponse setNumActiveSessions(Long numActiveSessions) {
    this.numActiveSessions = numActiveSessions;
    return this;
  }

  public Long getNumActiveSessions() {
    return numActiveSessions;
  }

  public GetWarehouseResponse setNumClusters(Long numClusters) {
    this.numClusters = numClusters;
    return this;
  }

  public Long getNumClusters() {
    return numClusters;
  }

  public GetWarehouseResponse setOdbcParams(OdbcParams odbcParams) {
    this.odbcParams = odbcParams;
    return this;
  }

  public OdbcParams getOdbcParams() {
    return odbcParams;
  }

  public GetWarehouseResponse setSpotInstancePolicy(SpotInstancePolicy spotInstancePolicy) {
    this.spotInstancePolicy = spotInstancePolicy;
    return this;
  }

  public SpotInstancePolicy getSpotInstancePolicy() {
    return spotInstancePolicy;
  }

  public GetWarehouseResponse setState(State state) {
    this.state = state;
    return this;
  }

  public State getState() {
    return state;
  }

  public GetWarehouseResponse setTags(EndpointTags tags) {
    this.tags = tags;
    return this;
  }

  public EndpointTags getTags() {
    return tags;
  }

  public GetWarehouseResponse setWarehouseType(GetWarehouseResponseWarehouseType warehouseType) {
    this.warehouseType = warehouseType;
    return this;
  }

  public GetWarehouseResponseWarehouseType getWarehouseType() {
    return warehouseType;
  }

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

  GetWarehouseResponsePb toPb() {
    GetWarehouseResponsePb pb = new GetWarehouseResponsePb();
    pb.setAutoStopMins(autoStopMins);
    pb.setChannel(channel);
    pb.setClusterSize(clusterSize);
    pb.setCreatorName(creatorName);
    pb.setEnablePhoton(enablePhoton);
    pb.setEnableServerlessCompute(enableServerlessCompute);
    pb.setHealth(health);
    pb.setId(id);
    pb.setInstanceProfileArn(instanceProfileArn);
    pb.setJdbcUrl(jdbcUrl);
    pb.setMaxNumClusters(maxNumClusters);
    pb.setMinNumClusters(minNumClusters);
    pb.setName(name);
    pb.setNumActiveSessions(numActiveSessions);
    pb.setNumClusters(numClusters);
    pb.setOdbcParams(odbcParams);
    pb.setSpotInstancePolicy(spotInstancePolicy);
    pb.setState(state);
    pb.setTags(tags);
    pb.setWarehouseType(warehouseType);

    return pb;
  }

  static GetWarehouseResponse fromPb(GetWarehouseResponsePb pb) {
    GetWarehouseResponse model = new GetWarehouseResponse();
    model.setAutoStopMins(pb.getAutoStopMins());
    model.setChannel(pb.getChannel());
    model.setClusterSize(pb.getClusterSize());
    model.setCreatorName(pb.getCreatorName());
    model.setEnablePhoton(pb.getEnablePhoton());
    model.setEnableServerlessCompute(pb.getEnableServerlessCompute());
    model.setHealth(pb.getHealth());
    model.setId(pb.getId());
    model.setInstanceProfileArn(pb.getInstanceProfileArn());
    model.setJdbcUrl(pb.getJdbcUrl());
    model.setMaxNumClusters(pb.getMaxNumClusters());
    model.setMinNumClusters(pb.getMinNumClusters());
    model.setName(pb.getName());
    model.setNumActiveSessions(pb.getNumActiveSessions());
    model.setNumClusters(pb.getNumClusters());
    model.setOdbcParams(pb.getOdbcParams());
    model.setSpotInstancePolicy(pb.getSpotInstancePolicy());
    model.setState(pb.getState());
    model.setTags(pb.getTags());
    model.setWarehouseType(pb.getWarehouseType());

    return model;
  }

  public static class GetWarehouseResponseSerializer extends JsonSerializer<GetWarehouseResponse> {
    @Override
    public void serialize(
        GetWarehouseResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetWarehouseResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetWarehouseResponseDeserializer
      extends JsonDeserializer<GetWarehouseResponse> {
    @Override
    public GetWarehouseResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetWarehouseResponsePb pb = mapper.readValue(p, GetWarehouseResponsePb.class);
      return GetWarehouseResponse.fromPb(pb);
    }
  }
}
