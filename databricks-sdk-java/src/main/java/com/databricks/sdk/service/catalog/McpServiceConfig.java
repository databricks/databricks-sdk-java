// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Operational configuration for an MCP service. Groups the source reference, tool selectors, and
 * rate limit -- the fields that configure how the MCP service behaves at invocation time.
 */
@Generated
public class McpServiceConfig {
  /**
   * Glob or exact-match patterns selecting which tools from the MCP server to expose. Prefix match
   * for patterns with `*`, exact match otherwise. An empty list means all tools are included.
   * Per-element max 256 chars.
   */
  @JsonProperty("include_tool_selectors")
  private Collection<String> includeToolSelectors;

  /**
   * Per-principal rate limits applied to tool invocations routed through this MCP service. Repeated
   * to support per-USER / USER_GROUP / SERVICE_PRINCIPAL / SERVICE / USER_DEFAULT scopes
   * simultaneously, mirroring the `ModelServiceConfig.rate_limits` shape. Empty when no rate limit
   * is configured.
   */
  @JsonProperty("rate_limits")
  private Collection<RateLimit> rateLimits;

  /** UC Connection referencing the MCP server. */
  @JsonProperty("source_connection")
  private McpServiceConfigSourceConnection sourceConnection;

  public McpServiceConfig setIncludeToolSelectors(Collection<String> includeToolSelectors) {
    this.includeToolSelectors = includeToolSelectors;
    return this;
  }

  public Collection<String> getIncludeToolSelectors() {
    return includeToolSelectors;
  }

  public McpServiceConfig setRateLimits(Collection<RateLimit> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  public Collection<RateLimit> getRateLimits() {
    return rateLimits;
  }

  public McpServiceConfig setSourceConnection(McpServiceConfigSourceConnection sourceConnection) {
    this.sourceConnection = sourceConnection;
    return this;
  }

  public McpServiceConfigSourceConnection getSourceConnection() {
    return sourceConnection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    McpServiceConfig that = (McpServiceConfig) o;
    return Objects.equals(includeToolSelectors, that.includeToolSelectors)
        && Objects.equals(rateLimits, that.rateLimits)
        && Objects.equals(sourceConnection, that.sourceConnection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeToolSelectors, rateLimits, sourceConnection);
  }

  @Override
  public String toString() {
    return new ToStringer(McpServiceConfig.class)
        .add("includeToolSelectors", includeToolSelectors)
        .add("rateLimits", rateLimits)
        .add("sourceConnection", sourceConnection)
        .toString();
  }
}
