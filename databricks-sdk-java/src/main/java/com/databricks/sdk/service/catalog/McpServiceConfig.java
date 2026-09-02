// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Operational configuration for an MCP service. Groups the source reference, tool selectors, and
 * rate limits -- the fields that configure how the MCP service behaves at invocation time.
 */
@Generated
public class McpServiceConfig {
  /**
   * Tool names or prefix patterns to expose from the MCP server. Use exact tool names or prefix
   * patterns such as `read_*`. An empty list exposes all tools. Each selector can contain at most
   * 256 characters.
   */
  @JsonProperty("include_tool_selectors")
  private Collection<String> includeToolSelectors;

  /**
   * Rate limits for tool invocations, scoped to a user, group, service principal, the service as a
   * whole, or each user by default. Request-tag rate limits are not supported for MCP services.
   * Empty when no rate limit is configured.
   */
  @JsonProperty("rate_limits")
  private Collection<RateLimit> rateLimits;

  /** Unity Catalog connection referencing the MCP server. Required on Create. */
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
