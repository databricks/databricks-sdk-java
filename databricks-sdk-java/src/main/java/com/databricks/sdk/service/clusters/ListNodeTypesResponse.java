// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListNodeTypesResponse {
  /** The list of available Spark node types. */
  @JsonProperty("node_types")
  private java.util.List<NodeType> nodeTypes;

  public ListNodeTypesResponse setNodeTypes(java.util.List<NodeType> nodeTypes) {
    this.nodeTypes = nodeTypes;
    return this;
  }

  public java.util.List<NodeType> getNodeTypes() {
    return nodeTypes;
  }
}
