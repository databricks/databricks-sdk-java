// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The resources a Genie Agent can use. */
@Generated
public class GenieAgentResources {
  /** Unity Catalog MCP connections, sorted by `mcp_connection`. */
  @JsonProperty("mcp_connections")
  private Collection<GenieAgentMcpConnection> mcpConnections;

  /** Unity Catalog SQL functions the generated SQL may call, sorted by `id`, then `identifier`. */
  @JsonProperty("sql_functions")
  private Collection<GenieAgentSqlFunction> sqlFunctions;

  /** Unity Catalog tables, views, and metric views, sorted by `identifier`. */
  @JsonProperty("tables")
  private Collection<GenieAgentTable> tables;

  /** Unity Catalog volumes, sorted by `path`. */
  @JsonProperty("volumes")
  private Collection<GenieAgentVolume> volumes;

  public GenieAgentResources setMcpConnections(Collection<GenieAgentMcpConnection> mcpConnections) {
    this.mcpConnections = mcpConnections;
    return this;
  }

  public Collection<GenieAgentMcpConnection> getMcpConnections() {
    return mcpConnections;
  }

  public GenieAgentResources setSqlFunctions(Collection<GenieAgentSqlFunction> sqlFunctions) {
    this.sqlFunctions = sqlFunctions;
    return this;
  }

  public Collection<GenieAgentSqlFunction> getSqlFunctions() {
    return sqlFunctions;
  }

  public GenieAgentResources setTables(Collection<GenieAgentTable> tables) {
    this.tables = tables;
    return this;
  }

  public Collection<GenieAgentTable> getTables() {
    return tables;
  }

  public GenieAgentResources setVolumes(Collection<GenieAgentVolume> volumes) {
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
    GenieAgentResources that = (GenieAgentResources) o;
    return Objects.equals(mcpConnections, that.mcpConnections)
        && Objects.equals(sqlFunctions, that.sqlFunctions)
        && Objects.equals(tables, that.tables)
        && Objects.equals(volumes, that.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcpConnections, sqlFunctions, tables, volumes);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentResources.class)
        .add("mcpConnections", mcpConnections)
        .add("sqlFunctions", sqlFunctions)
        .add("tables", tables)
        .add("volumes", volumes)
        .toString();
  }
}
