// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Unity Catalog connection that points to the MCP server. On Create, provide `name` in the
 * schema-scoped form `connections/{catalog}.{schema}.{connection}`. On read, the service populates
 * the resolved connection metadata. If the connection is deleted, its reference remains visible so
 * you can identify the broken dependency.
 */
@Generated
public class McpServiceConfigSourceConnection {
  /**
   * Whether the referenced connection has been deleted. The MCP service keeps the reference so
   * callers can identify the broken dependency; tool invocation fails until the source connection
   * is updated.
   */
  @JsonProperty("is_deleted")
  private Boolean isDeleted;

  /**
   * Resource name of the Unity Catalog connection used to access the MCP server, in the form
   * `connections/{catalog}.{schema}.{connection}`.
   */
  @JsonProperty("name")
  private String name;

  public McpServiceConfigSourceConnection setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public McpServiceConfigSourceConnection setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    McpServiceConfigSourceConnection that = (McpServiceConfigSourceConnection) o;
    return Objects.equals(isDeleted, that.isDeleted) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDeleted, name);
  }

  @Override
  public String toString() {
    return new ToStringer(McpServiceConfigSourceConnection.class)
        .add("isDeleted", isDeleted)
        .add("name", name)
        .toString();
  }
}
