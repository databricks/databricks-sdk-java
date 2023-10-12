// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class EditInstancePool {
  /**
   * Additional tags for pool resources. Databricks will tag all pool resources (e.g., AWS instances
   * and EBS volumes) with these tags in addition to `default_tags`. Notes:
   *
   * <p>- Currently, Databricks allows at most 45 custom tags
   */
  @JsonProperty("custom_tags")
  private Map<String, String> customTags;

  /**
   * Automatically terminates the extra instances in the pool cache after they are inactive for this
   * time in minutes if min_idle_instances requirement is already met. If not set, the extra pool
   * instances will be automatically terminated after a default timeout. If specified, the threshold
   * must be between 0 and 10000 minutes. Users can also set this value to 0 to instantly remove
   * idle instances from the cache if min cache size could still hold.
   */
  @JsonProperty("idle_instance_autotermination_minutes")
  private Long idleInstanceAutoterminationMinutes;

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
}
