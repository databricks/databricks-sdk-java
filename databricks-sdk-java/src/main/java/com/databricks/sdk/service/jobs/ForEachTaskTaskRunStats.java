// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ForEachTaskTaskRunStats {
  /** Describes the iteration runs having an active lifecycle state or an active run sub state. */
  @JsonProperty("active_iterations")
  private Long activeIterations;

  /** Describes the number of failed and succeeded iteration runs. */
  @JsonProperty("completed_iterations")
  private Long completedIterations;

  /** Describes the number of failed iteration runs. */
  @JsonProperty("failed_iterations")
  private Long failedIterations;

  /** Describes the number of iteration runs that have been scheduled. */
  @JsonProperty("scheduled_iterations")
  private Long scheduledIterations;

  /** Describes the number of succeeded iteration runs. */
  @JsonProperty("succeeded_iterations")
  private Long succeededIterations;

  /** Describes the length of the list of items to iterate over. */
  @JsonProperty("total_iterations")
  private Long totalIterations;

  public ForEachTaskTaskRunStats setActiveIterations(Long activeIterations) {
    this.activeIterations = activeIterations;
    return this;
  }

  public Long getActiveIterations() {
    return activeIterations;
  }

  public ForEachTaskTaskRunStats setCompletedIterations(Long completedIterations) {
    this.completedIterations = completedIterations;
    return this;
  }

  public Long getCompletedIterations() {
    return completedIterations;
  }

  public ForEachTaskTaskRunStats setFailedIterations(Long failedIterations) {
    this.failedIterations = failedIterations;
    return this;
  }

  public Long getFailedIterations() {
    return failedIterations;
  }

  public ForEachTaskTaskRunStats setScheduledIterations(Long scheduledIterations) {
    this.scheduledIterations = scheduledIterations;
    return this;
  }

  public Long getScheduledIterations() {
    return scheduledIterations;
  }

  public ForEachTaskTaskRunStats setSucceededIterations(Long succeededIterations) {
    this.succeededIterations = succeededIterations;
    return this;
  }

  public Long getSucceededIterations() {
    return succeededIterations;
  }

  public ForEachTaskTaskRunStats setTotalIterations(Long totalIterations) {
    this.totalIterations = totalIterations;
    return this;
  }

  public Long getTotalIterations() {
    return totalIterations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForEachTaskTaskRunStats that = (ForEachTaskTaskRunStats) o;
    return Objects.equals(activeIterations, that.activeIterations)
        && Objects.equals(completedIterations, that.completedIterations)
        && Objects.equals(failedIterations, that.failedIterations)
        && Objects.equals(scheduledIterations, that.scheduledIterations)
        && Objects.equals(succeededIterations, that.succeededIterations)
        && Objects.equals(totalIterations, that.totalIterations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        activeIterations,
        completedIterations,
        failedIterations,
        scheduledIterations,
        succeededIterations,
        totalIterations);
  }

  @Override
  public String toString() {
    return new ToStringer(ForEachTaskTaskRunStats.class)
        .add("activeIterations", activeIterations)
        .add("completedIterations", completedIterations)
        .add("failedIterations", failedIterations)
        .add("scheduledIterations", scheduledIterations)
        .add("succeededIterations", succeededIterations)
        .add("totalIterations", totalIterations)
        .toString();
  }
}
