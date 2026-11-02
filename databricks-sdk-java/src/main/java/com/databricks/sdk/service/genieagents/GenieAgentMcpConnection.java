// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A Unity Catalog MCP connection the Genie Agent can use. */
@Generated
public class GenieAgentMcpConnection {
  /** The name of the Unity Catalog connection, for example `system.ai.google_calendar`. */
  @JsonProperty("mcp_connection")
  private String mcpConnection;

  public GenieAgentMcpConnection setMcpConnection(String mcpConnection) {
    this.mcpConnection = mcpConnection;
    return this;
  }

  public String getMcpConnection() {
    return mcpConnection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentMcpConnection that = (GenieAgentMcpConnection) o;
    return Objects.equals(mcpConnection, that.mcpConnection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcpConnection);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentMcpConnection.class)
        .add("mcpConnection", mcpConnection)
        .toString();
  }
}
