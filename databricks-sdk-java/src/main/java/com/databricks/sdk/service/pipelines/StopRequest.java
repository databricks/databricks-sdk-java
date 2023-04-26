// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Stop a pipeline
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class StopRequest {
  /** */
  private String pipelineId;

  /**
   * <p>Setter for the field <code>pipelineId</code>.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.StopRequest} object
   */
  public StopRequest setPipelineId(String pipelineId) {
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
    StopRequest that = (StopRequest) o;
    return Objects.equals(pipelineId, that.pipelineId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(pipelineId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(StopRequest.class).add("pipelineId", pipelineId).toString();
  }
}
