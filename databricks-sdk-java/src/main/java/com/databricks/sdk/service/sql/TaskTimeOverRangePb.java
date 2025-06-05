// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class TaskTimeOverRangePb {
  @JsonProperty("entries")
  private Collection<TaskTimeOverRangeEntry> entries;

  @JsonProperty("interval")
  private Long interval;

  public TaskTimeOverRangePb setEntries(Collection<TaskTimeOverRangeEntry> entries) {
    this.entries = entries;
    return this;
  }

  public Collection<TaskTimeOverRangeEntry> getEntries() {
    return entries;
  }

  public TaskTimeOverRangePb setInterval(Long interval) {
    this.interval = interval;
    return this;
  }

  public Long getInterval() {
    return interval;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaskTimeOverRangePb that = (TaskTimeOverRangePb) o;
    return Objects.equals(entries, that.entries) && Objects.equals(interval, that.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, interval);
  }

  @Override
  public String toString() {
    return new ToStringer(TaskTimeOverRangePb.class)
        .add("entries", entries)
        .add("interval", interval)
        .toString();
  }
}
