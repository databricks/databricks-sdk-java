// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListCleanRoomNotebookTaskRunsResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * page_token should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Name of the clean room. */
  @JsonProperty("runs")
  private Collection<CleanRoomNotebookTaskRun> runs;

  public ListCleanRoomNotebookTaskRunsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListCleanRoomNotebookTaskRunsResponse setRuns(Collection<CleanRoomNotebookTaskRun> runs) {
    this.runs = runs;
    return this;
  }

  public Collection<CleanRoomNotebookTaskRun> getRuns() {
    return runs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCleanRoomNotebookTaskRunsResponse that = (ListCleanRoomNotebookTaskRunsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(runs, that.runs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, runs);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomNotebookTaskRunsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("runs", runs)
        .toString();
  }
}
