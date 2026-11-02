// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for a list request: a page of Genie Agents plus the token for the next page. */
@Generated
public class ListGenieAgentsResponse {
  /** The Genie Agents, with the fields selected by the request's `view`. */
  @JsonProperty("genie_agents")
  private Collection<GenieAgent> genieAgents;

  /** Token to get the next page of results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /**
   * Resource names, in the form `agents/{genie_agent_id}`, of Genie Agents in this page that could
   * not be read and are omitted from `genie_agents`. Populated only for `GENIE_AGENT_VIEW_FULL`. To
   * see why, get the Genie Agent by name; to retry, repeat the request. Other kinds of resource
   * names may be added to this field in the future.
   */
  @JsonProperty("unreachable")
  private Collection<String> unreachable;

  public ListGenieAgentsResponse setGenieAgents(Collection<GenieAgent> genieAgents) {
    this.genieAgents = genieAgents;
    return this;
  }

  public Collection<GenieAgent> getGenieAgents() {
    return genieAgents;
  }

  public ListGenieAgentsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListGenieAgentsResponse setUnreachable(Collection<String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  public Collection<String> getUnreachable() {
    return unreachable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListGenieAgentsResponse that = (ListGenieAgentsResponse) o;
    return Objects.equals(genieAgents, that.genieAgents)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(unreachable, that.unreachable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genieAgents, nextPageToken, unreachable);
  }

  @Override
  public String toString() {
    return new ToStringer(ListGenieAgentsResponse.class)
        .add("genieAgents", genieAgents)
        .add("nextPageToken", nextPageToken)
        .add("unreachable", unreachable)
        .toString();
  }
}
