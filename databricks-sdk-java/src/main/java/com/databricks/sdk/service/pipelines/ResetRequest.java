// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Reset a pipeline
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ResetRequest {
  /** */
  private String pipelineId;

  /**
   * <p>Setter for the field <code>pipelineId</code>.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.ResetRequest} object
   */
  public ResetRequest setPipelineId(String pipelineId) {
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
    ResetRequest that = (ResetRequest) o;
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
    return new ToStringer(ResetRequest.class).add("pipelineId", pipelineId).toString();
  }
}
