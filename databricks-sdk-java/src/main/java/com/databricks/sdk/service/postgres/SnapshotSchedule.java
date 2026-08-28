// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * The automatic snapshot cadences for a branch. There is exactly one schedule per branch
 * (singleton); it is configured in place, not created or deleted.
 *
 * <p>Name: projects/{project_id}/branches/{branch_id}/snapshot-schedule
 */
@Generated
public class SnapshotSchedule {
  /**
   * The resource name of the branch's snapshot schedule. Format:
   * projects/{project_id}/branches/{branch_id}/snapshot-schedule
   */
  @JsonProperty("name")
  private String name;

  /**
   * The cadences at which automatic snapshots are taken. Update replaces the whole set; an empty
   * set disables automatic snapshots. Order is not significant. When several cadences fire
   * together, one snapshot is taken, retained for the longest of their retentions.
   */
  @JsonProperty("schedule")
  private Collection<ScheduleCadence> schedule;

  public SnapshotSchedule setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SnapshotSchedule setSchedule(Collection<ScheduleCadence> schedule) {
    this.schedule = schedule;
    return this;
  }

  public Collection<ScheduleCadence> getSchedule() {
    return schedule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SnapshotSchedule that = (SnapshotSchedule) o;
    return Objects.equals(name, that.name) && Objects.equals(schedule, that.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, schedule);
  }

  @Override
  public String toString() {
    return new ToStringer(SnapshotSchedule.class)
        .add("name", name)
        .add("schedule", schedule)
        .toString();
  }
}
