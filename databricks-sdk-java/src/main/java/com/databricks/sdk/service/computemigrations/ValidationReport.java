// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** Validation results from running the translated workload in the sandbox. */
@Generated
public class ValidationReport {
  /**
   * Duration of the sandbox validation run in milliseconds. Pair with start_time to derive the end
   * time.
   */
  @JsonProperty("duration_ms")
  private Long durationMs;

  /**
   * Databricks-internal recommendation on whether to proceed with the migration, based on the
   * validation run. May differ from run_status: a run can succeed while the recommendation is
   * negative, or vice versa.
   */
  @JsonProperty("passed")
  private Boolean passed;

  /**
   * Status of the validation run itself (the objective run outcome), as reported by the run system,
   * e.g. "SUCCESS" / "FAILED" / "TIMED_OUT".
   */
  @JsonProperty("run_status")
  private String runStatus;

  /** Link to the validation run (job or notebook). */
  @JsonProperty("run_url")
  private String runUrl;

  /** Timestamp when validation started in the sandbox. */
  @JsonProperty("start_time")
  private Timestamp startTime;

  public ValidationReport setDurationMs(Long durationMs) {
    this.durationMs = durationMs;
    return this;
  }

  public Long getDurationMs() {
    return durationMs;
  }

  public ValidationReport setPassed(Boolean passed) {
    this.passed = passed;
    return this;
  }

  public Boolean getPassed() {
    return passed;
  }

  public ValidationReport setRunStatus(String runStatus) {
    this.runStatus = runStatus;
    return this;
  }

  public String getRunStatus() {
    return runStatus;
  }

  public ValidationReport setRunUrl(String runUrl) {
    this.runUrl = runUrl;
    return this;
  }

  public String getRunUrl() {
    return runUrl;
  }

  public ValidationReport setStartTime(Timestamp startTime) {
    this.startTime = startTime;
    return this;
  }

  public Timestamp getStartTime() {
    return startTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidationReport that = (ValidationReport) o;
    return Objects.equals(durationMs, that.durationMs)
        && Objects.equals(passed, that.passed)
        && Objects.equals(runStatus, that.runStatus)
        && Objects.equals(runUrl, that.runUrl)
        && Objects.equals(startTime, that.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationMs, passed, runStatus, runUrl, startTime);
  }

  @Override
  public String toString() {
    return new ToStringer(ValidationReport.class)
        .add("durationMs", durationMs)
        .add("passed", passed)
        .add("runStatus", runStatus)
        .add("runUrl", runUrl)
        .add("startTime", startTime)
        .toString();
  }
}
