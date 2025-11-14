// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Lineage context information for tracking where an API was invoked. This will allow us to track
 * lineage, which currently uses caller entity information for use across the Lineage Client and
 * Observability in Lumberjack.
 */
@Generated
public class LineageContext {
  /** Job context information including job ID and run ID. */
  @JsonProperty("job_context")
  private JobContext jobContext;

  /** The notebook ID where this API was invoked. */
  @JsonProperty("notebook_id")
  private Long notebookId;

  public LineageContext setJobContext(JobContext jobContext) {
    this.jobContext = jobContext;
    return this;
  }

  public JobContext getJobContext() {
    return jobContext;
  }

  public LineageContext setNotebookId(Long notebookId) {
    this.notebookId = notebookId;
    return this;
  }

  public Long getNotebookId() {
    return notebookId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LineageContext that = (LineageContext) o;
    return Objects.equals(jobContext, that.jobContext)
        && Objects.equals(notebookId, that.notebookId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobContext, notebookId);
  }

  @Override
  public String toString() {
    return new ToStringer(LineageContext.class)
        .add("jobContext", jobContext)
        .add("notebookId", notebookId)
        .toString();
  }
}
