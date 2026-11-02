// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Summary of baking metrics after the baking window completes. */
@Generated
public class BakingReport {
  /** Number of successful runs. */
  @JsonProperty("successful_runs")
  private Long successfulRuns;

  /** Number of runs observed during the baking window. */
  @JsonProperty("total_runs")
  private Long totalRuns;

  public BakingReport setSuccessfulRuns(Long successfulRuns) {
    this.successfulRuns = successfulRuns;
    return this;
  }

  public Long getSuccessfulRuns() {
    return successfulRuns;
  }

  public BakingReport setTotalRuns(Long totalRuns) {
    this.totalRuns = totalRuns;
    return this;
  }

  public Long getTotalRuns() {
    return totalRuns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BakingReport that = (BakingReport) o;
    return Objects.equals(successfulRuns, that.successfulRuns)
        && Objects.equals(totalRuns, that.totalRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successfulRuns, totalRuns);
  }

  @Override
  public String toString() {
    return new ToStringer(BakingReport.class)
        .add("successfulRuns", successfulRuns)
        .add("totalRuns", totalRuns)
        .toString();
  }
}
