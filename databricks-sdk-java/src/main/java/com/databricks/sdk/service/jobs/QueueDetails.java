// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class QueueDetails {
  /**
   * The reason for queuing the run. * `ACTIVE_RUNS_LIMIT_REACHED`: The run was queued due to
   * reaching the workspace limit of active task runs. * `MAX_CONCURRENT_RUNS_REACHED`: The run was
   * queued due to reaching the per-job limit of concurrent job runs. *
   * `ACTIVE_RUN_JOB_TASKS_LIMIT_REACHED`: The run was queued due to reaching the workspace limit of
   * active run job tasks.
   */
  @JsonProperty("code")
  private QueueDetailsCodeCode code;

  /**
   * A descriptive message with the queuing details. This field is unstructured, and its exact
   * format is subject to change.
   */
  @JsonProperty("message")
  private String message;

  public QueueDetails setCode(QueueDetailsCodeCode code) {
    this.code = code;
    return this;
  }

  public QueueDetailsCodeCode getCode() {
    return code;
  }

  public QueueDetails setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueueDetails that = (QueueDetails) o;
    return Objects.equals(code, that.code) && Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    return new ToStringer(QueueDetails.class).add("code", code).add("message", message).toString();
  }
}
