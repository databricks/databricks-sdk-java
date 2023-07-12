// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class ListNodeTypesResponse {
  /**
   * The list of available Spark node types.
   */
  @JsonProperty("node_types")
  private Collection<NodeType> nodeTypes;
  
  public ListNodeTypesResponse setNodeTypes(Collection<NodeType> nodeTypes) {
    this.nodeTypes = nodeTypes;
    return this;
  }

  public Collection<NodeType> getNodeTypes() {
    return nodeTypes;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListNodeTypesResponse that = (ListNodeTypesResponse) o;
    return Objects.equals(nodeTypes, that.nodeTypes)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeTypes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNodeTypesResponse.class)
      .add("nodeTypes", nodeTypes).toString();
  }
}
