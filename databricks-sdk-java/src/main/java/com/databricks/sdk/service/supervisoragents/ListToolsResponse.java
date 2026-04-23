// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListToolsResponse {
  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("tools")
  private Collection<Tool> tools;

  public ListToolsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListToolsResponse setTools(Collection<Tool> tools) {
    this.tools = tools;
    return this;
  }

  public Collection<Tool> getTools() {
    return tools;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListToolsResponse that = (ListToolsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(tools, that.tools);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, tools);
  }

  @Override
  public String toString() {
    return new ToStringer(ListToolsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("tools", tools)
        .toString();
  }
}
