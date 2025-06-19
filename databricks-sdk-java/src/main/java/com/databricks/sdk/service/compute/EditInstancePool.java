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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = EditInstancePool.EditInstancePoolSerializer.class)
@JsonDeserialize(using = EditInstancePool.EditInstancePoolDeserializer.class)
public class EditInstancePool {
  /**
   * Additional tags for pool resources. Databricks will tag all pool resources (e.g., AWS instances
   * and EBS volumes) with these tags in addition to `default_tags`. Notes:
   *
   * <p>- Currently, Databricks allows at most 45 custom tags
   */
  private Map<String, String> customTags;

  /**
   * Automatically terminates the extra instances in the pool cache after they are inactive for this
   * time in minutes if min_idle_instances requirement is already met. If not set, the extra pool
   * instances will be automatically terminated after a default timeout. If specified, the threshold
   * must be between 0 and 10000 minutes. Users can also set this value to 0 to instantly remove
   * idle instances from the cache if min cache size could still hold.
   */
  private Long idleInstanceAutoterminationMinutes;

  /** Instance pool ID */
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

  public EditInstancePool setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public EditInstancePool setIdleInstanceAutoterminationMinutes(
      Long idleInstanceAutoterminationMinutes) {
    this.idleInstanceAutoterminationMinutes = idleInstanceAutoterminationMinutes;
    return this;
  }

  public Long getIdleInstanceAutoterminationMinutes() {
    return idleInstanceAutoterminationMinutes;
  }

  public EditInstancePool setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }

  public EditInstancePool setInstancePoolName(String instancePoolName) {
    this.instancePoolName = instancePoolName;
    return this;
  }

  public String getInstancePoolName() {
    return instancePoolName;
  }

  public EditInstancePool setMaxCapacity(Long maxCapacity) {
    this.maxCapacity = maxCapacity;
    return this;
  }

  public Long getMaxCapacity() {
    return maxCapacity;
  }

  public EditInstancePool setMinIdleInstances(Long minIdleInstances) {
    this.minIdleInstances = minIdleInstances;
    return this;
  }

  public Long getMinIdleInstances() {
    return minIdleInstances;
  }

  public EditInstancePool setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  public String getNodeTypeId() {
    return nodeTypeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EditInstancePool that = (EditInstancePool) o;
    return Objects.equals(customTags, that.customTags)
        && Objects.equals(
            idleInstanceAutoterminationMinutes, that.idleInstanceAutoterminationMinutes)
        && Objects.equals(instancePoolId, that.instancePoolId)
        && Objects.equals(instancePoolName, that.instancePoolName)
        && Objects.equals(maxCapacity, that.maxCapacity)
        && Objects.equals(minIdleInstances, that.minIdleInstances)
        && Objects.equals(nodeTypeId, that.nodeTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customTags,
        idleInstanceAutoterminationMinutes,
        instancePoolId,
        instancePoolName,
        maxCapacity,
        minIdleInstances,
        nodeTypeId);
  }

  @Override
  public String toString() {
    return new ToStringer(EditInstancePool.class)
        .add("customTags", customTags)
        .add("idleInstanceAutoterminationMinutes", idleInstanceAutoterminationMinutes)
        .add("instancePoolId", instancePoolId)
        .add("instancePoolName", instancePoolName)
        .add("maxCapacity", maxCapacity)
        .add("minIdleInstances", minIdleInstances)
        .add("nodeTypeId", nodeTypeId)
        .toString();
  }

  EditInstancePoolPb toPb() {
    EditInstancePoolPb pb = new EditInstancePoolPb();
    pb.setCustomTags(customTags);
    pb.setIdleInstanceAutoterminationMinutes(idleInstanceAutoterminationMinutes);
    pb.setInstancePoolId(instancePoolId);
    pb.setInstancePoolName(instancePoolName);
    pb.setMaxCapacity(maxCapacity);
    pb.setMinIdleInstances(minIdleInstances);
    pb.setNodeTypeId(nodeTypeId);

    return pb;
  }

  static EditInstancePool fromPb(EditInstancePoolPb pb) {
    EditInstancePool model = new EditInstancePool();
    model.setCustomTags(pb.getCustomTags());
    model.setIdleInstanceAutoterminationMinutes(pb.getIdleInstanceAutoterminationMinutes());
    model.setInstancePoolId(pb.getInstancePoolId());
    model.setInstancePoolName(pb.getInstancePoolName());
    model.setMaxCapacity(pb.getMaxCapacity());
    model.setMinIdleInstances(pb.getMinIdleInstances());
    model.setNodeTypeId(pb.getNodeTypeId());

    return model;
  }

  public static class EditInstancePoolSerializer extends JsonSerializer<EditInstancePool> {
    @Override
    public void serialize(EditInstancePool value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EditInstancePoolPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EditInstancePoolDeserializer extends JsonDeserializer<EditInstancePool> {
    @Override
    public EditInstancePool deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EditInstancePoolPb pb = mapper.readValue(p, EditInstancePoolPb.class);
      return EditInstancePool.fromPb(pb);
    }
  }
}
