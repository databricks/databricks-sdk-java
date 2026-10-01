// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response listing tracked command executions. */
@Generated
public class ListCommandsResponse {
  /** Commands in this page of results. */
  @JsonProperty("commands")
  private Collection<Command> commands;

  /** Token to retrieve the next page. Empty when there are no more results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListCommandsResponse setCommands(Collection<Command> commands) {
    this.commands = commands;
    return this;
  }

  public Collection<Command> getCommands() {
    return commands;
  }

  public ListCommandsResponse setNextPageToken(String nextPageToken) {
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
    ListCommandsResponse that = (ListCommandsResponse) o;
    return Objects.equals(commands, that.commands)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commands, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCommandsResponse.class)
        .add("commands", commands)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
