// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Configuration for flexible node types, allowing fallback to alternate node types during cluster
 * launch and upscale.
 */
@Generated
public class NodeTypeFlexibility {
  /** A list of node type IDs to use as fallbacks when the primary node type is unavailable. */
  @JsonProperty("alternate_node_type_ids")
  private Collection<String> alternateNodeTypeIds;

  public NodeTypeFlexibility setAlternateNodeTypeIds(Collection<String> alternateNodeTypeIds) {
    this.alternateNodeTypeIds = alternateNodeTypeIds;
    return this;
  }

  public Collection<String> getAlternateNodeTypeIds() {
    return alternateNodeTypeIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NodeTypeFlexibility that = (NodeTypeFlexibility) o;
    return Objects.equals(alternateNodeTypeIds, that.alternateNodeTypeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateNodeTypeIds);
  }

  @Override
  public String toString() {
    return new ToStringer(NodeTypeFlexibility.class)
        .add("alternateNodeTypeIds", alternateNodeTypeIds)
        .toString();
  }
}
