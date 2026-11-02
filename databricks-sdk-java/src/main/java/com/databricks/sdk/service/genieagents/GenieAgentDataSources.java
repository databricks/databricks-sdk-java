// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The data a Genie Agent can access. */
@Generated
public class GenieAgentDataSources {
  /** Unity Catalog MCP connections, sorted by `mcp_connection`. */
  @JsonProperty("mcp_connections")
  private Collection<GenieAgentMcpConnection> mcpConnections;

  /** Unity Catalog tables, views, and metric views, in the order they were added. */
  @JsonProperty("tables")
  private Collection<GenieAgentTable> tables;

  /** Unity Catalog volumes, in the order they were added. */
  @JsonProperty("volumes")
  private Collection<GenieAgentVolume> volumes;

  public GenieAgentDataSources setMcpConnections(
      Collection<GenieAgentMcpConnection> mcpConnections) {
    this.mcpConnections = mcpConnections;
    return this;
  }

  public Collection<GenieAgentMcpConnection> getMcpConnections() {
    return mcpConnections;
  }

  public GenieAgentDataSources setTables(Collection<GenieAgentTable> tables) {
    this.tables = tables;
    return this;
  }

  public Collection<GenieAgentTable> getTables() {
    return tables;
  }

  public GenieAgentDataSources setVolumes(Collection<GenieAgentVolume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public Collection<GenieAgentVolume> getVolumes() {
    return volumes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentDataSources that = (GenieAgentDataSources) o;
    return Objects.equals(mcpConnections, that.mcpConnections)
        && Objects.equals(tables, that.tables)
        && Objects.equals(volumes, that.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcpConnections, tables, volumes);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentDataSources.class)
        .add("mcpConnections", mcpConnections)
        .add("tables", tables)
        .add("volumes", volumes)
        .toString();
  }
}
