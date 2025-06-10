// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FileArrivalTriggerState {
  /** Indicates whether the trigger leverages file events to detect file arrivals. */
  @JsonProperty("using_file_events")
  private Boolean usingFileEvents;

  public FileArrivalTriggerState setUsingFileEvents(Boolean usingFileEvents) {
    this.usingFileEvents = usingFileEvents;
    return this;
  }

  public Boolean getUsingFileEvents() {
    return usingFileEvents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileArrivalTriggerState that = (FileArrivalTriggerState) o;
    return Objects.equals(usingFileEvents, that.usingFileEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usingFileEvents);
  }

  @Override
  public String toString() {
    return new ToStringer(FileArrivalTriggerState.class)
        .add("usingFileEvents", usingFileEvents)
        .toString();
  }
}
