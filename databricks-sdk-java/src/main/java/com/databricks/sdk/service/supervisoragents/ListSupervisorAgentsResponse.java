// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListSupervisorAgentsResponse {
  /**
   * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("supervisor_agents")
  private Collection<SupervisorAgent> supervisorAgents;

  public ListSupervisorAgentsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSupervisorAgentsResponse setSupervisorAgents(
      Collection<SupervisorAgent> supervisorAgents) {
    this.supervisorAgents = supervisorAgents;
    return this;
  }

  public Collection<SupervisorAgent> getSupervisorAgents() {
    return supervisorAgents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSupervisorAgentsResponse that = (ListSupervisorAgentsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(supervisorAgents, that.supervisorAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, supervisorAgents);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSupervisorAgentsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("supervisorAgents", supervisorAgents)
        .toString();
  }
}
