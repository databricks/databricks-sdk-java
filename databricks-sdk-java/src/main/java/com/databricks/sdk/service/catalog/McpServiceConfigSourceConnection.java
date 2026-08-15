// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * UC Connection that hosts the MCP server. On create, provide `name` in the schema-scoped form
 * `connections/{catalog}.{schema}.{connection}`. On read, the service populates the resolved
 * connection metadata and preserves a dangling source so callers can diagnose a deleted backing
 * connection.
 */
@Generated
public class McpServiceConfigSourceConnection {
  /** */
  @JsonProperty("is_deleted")
  private Boolean isDeleted;

  /**
   * Name of the UC connection that hosts the MCP server, as
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
