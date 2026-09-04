// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for listing MCP services. */
@Generated
public class ListMcpServicesResponse {
  /** The list of MCP services. */
  @JsonProperty("mcp_services")
  private Collection<McpService> mcpServices;

  /** Pagination token for retrieving the next page. Empty when there are no more results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListMcpServicesResponse setMcpServices(Collection<McpService> mcpServices) {
    this.mcpServices = mcpServices;
    return this;
  }

  public Collection<McpService> getMcpServices() {
    return mcpServices;
  }

  public ListMcpServicesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListMcpServicesResponse that = (ListMcpServicesResponse) o;
    return Objects.equals(mcpServices, that.mcpServices)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcpServices, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListMcpServicesResponse.class)
        .add("mcpServices", mcpServices)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
