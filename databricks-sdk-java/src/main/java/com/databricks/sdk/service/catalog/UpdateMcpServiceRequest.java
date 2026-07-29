// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateMcpServiceRequest {
  /**
   * If-match precondition: when set, the update proceeds only if the current server-side etag
   * matches. Empty means an unconditional update.
   */
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  /**
   * The MCP service with the updated field values. `name` identifies the resource
   * (`mcp-services/{catalog}.{schema}.{mcp_service}`); only fields listed in `update_mask` are
   * applied.
   */
  @JsonProperty("mcp_service")
  private McpService mcpService;

  /**
   * Resource name of the MCP service. Format: `mcp-services/{catalog}.{schema}.{mcp_service}`. Each
   * `{...}` component is capped at 255 characters individually. Server-derived on Create from
   * `parent` + `mcp_service_id`; required and immutable on Update/Get/Delete.
   */
  @JsonIgnore private String name;

  /**
   * The list of fields to update. The framework validates each path against the `mcp_service` field
   * above. Wildcard paths (`paths: ["*"]`) are not supported; list each field path explicitly.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateMcpServiceRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public UpdateMcpServiceRequest setMcpService(McpService mcpService) {
    this.mcpService = mcpService;
    return this;
  }

  public McpService getMcpService() {
    return mcpService;
  }

  public UpdateMcpServiceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateMcpServiceRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateMcpServiceRequest that = (UpdateMcpServiceRequest) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(mcpService, that.mcpService)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, mcpService, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateMcpServiceRequest.class)
        .add("etag", etag)
        .add("mcpService", mcpService)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
