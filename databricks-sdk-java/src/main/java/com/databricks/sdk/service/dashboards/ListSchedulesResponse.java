// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListSchedulesResponse {
  /**
   * A token that can be used as a `page_token` in subsequent requests to retrieve the next page of
   * results. If this field is omitted, there are no subsequent schedules.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("schedules")
  private Collection<Schedule> schedules;

  public ListSchedulesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSchedulesResponse setSchedules(Collection<Schedule> schedules) {
    this.schedules = schedules;
    return this;
  }

  public Collection<Schedule> getSchedules() {
    return schedules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSchedulesResponse that = (ListSchedulesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(schedules, that.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, schedules);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSchedulesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("schedules", schedules)
        .toString();
  }
}
