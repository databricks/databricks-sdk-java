// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>PipelineTask class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PipelineTask {
  /** If true, a full refresh will be triggered on the delta live table. */
  @JsonProperty("full_refresh")
  private Boolean fullRefresh;

  /** The full name of the pipeline task to execute. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /**
   * <p>Setter for the field <code>fullRefresh</code>.</p>
   *
   * @param fullRefresh a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.PipelineTask} object
   */
  public PipelineTask setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullRefresh</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getFullRefresh() {
    return fullRefresh;
  }

  /**
   * <p>Setter for the field <code>pipelineId</code>.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.PipelineTask} object
   */
  public PipelineTask setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  /**
   * <p>Getter for the field <code>pipelineId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPipelineId() {
    return pipelineId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineTask that = (PipelineTask) o;
    return Objects.equals(fullRefresh, that.fullRefresh)
        && Objects.equals(pipelineId, that.pipelineId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(fullRefresh, pipelineId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PipelineTask.class)
        .add("fullRefresh", fullRefresh)
        .add("pipelineId", pipelineId)
        .toString();
  }
}
