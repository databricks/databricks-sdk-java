// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListAppEventsResponse {
  /** App events */
  @JsonProperty("events")
  private Collection<AppEvents> events;

  public ListAppEventsResponse setEvents(Collection<AppEvents> events) {
    this.events = events;
    return this;
  }

  public Collection<AppEvents> getEvents() {
    return events;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAppEventsResponse that = (ListAppEventsResponse) o;
    return Objects.equals(events, that.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAppEventsResponse.class).add("events", events).toString();
  }
}
