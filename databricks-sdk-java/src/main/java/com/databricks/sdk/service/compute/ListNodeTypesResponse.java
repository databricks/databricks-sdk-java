// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListNodeTypesResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListNodeTypesResponse {
  /** The list of available Spark node types. */
  @JsonProperty("node_types")
  private Collection<NodeType> nodeTypes;

  /**
   * <p>Setter for the field <code>nodeTypes</code>.</p>
   *
   * @param nodeTypes a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.ListNodeTypesResponse} object
   */
  public ListNodeTypesResponse setNodeTypes(Collection<NodeType> nodeTypes) {
    this.nodeTypes = nodeTypes;
    return this;
  }

  /**
   * <p>Getter for the field <code>nodeTypes</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<NodeType> getNodeTypes() {
    return nodeTypes;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListNodeTypesResponse that = (ListNodeTypesResponse) o;
    return Objects.equals(nodeTypes, that.nodeTypes);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(nodeTypes);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListNodeTypesResponse.class).add("nodeTypes", nodeTypes).toString();
  }
}
