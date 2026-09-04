// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateMcpServiceRequest {
  /**
   * The MCP service to create. Do not set `name`; the server derives it from `parent` and
   * `mcp_service_id`. `source_connection` is required.
   */
  @JsonProperty("mcp_service")
  private McpService mcpService;

  /** Name for the MCP service, e.g. "my_mcp_service". */
  @JsonIgnore
  @QueryParam("mcp_service_id")
  private String mcpServiceId;

  /**
   * Name of the parent schema. Format: `schemas/{catalog}.{schema}`. Each `{...}` component is
   * capped at 255 characters individually.
   */
  @JsonIgnore
  @QueryParam("parent")
  private String parent;

  public CreateMcpServiceRequest setMcpService(McpService mcpService) {
    this.mcpService = mcpService;
    return this;
  }

  public McpService getMcpService() {
    return mcpService;
  }

  public CreateMcpServiceRequest setMcpServiceId(String mcpServiceId) {
    this.mcpServiceId = mcpServiceId;
    return this;
  }

  public String getMcpServiceId() {
    return mcpServiceId;
  }

  public CreateMcpServiceRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateMcpServiceRequest that = (CreateMcpServiceRequest) o;
    return Objects.equals(mcpService, that.mcpService)
        && Objects.equals(mcpServiceId, that.mcpServiceId)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcpService, mcpServiceId, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateMcpServiceRequest.class)
        .add("mcpService", mcpService)
        .add("mcpServiceId", mcpServiceId)
        .add("parent", parent)
        .toString();
  }
}
