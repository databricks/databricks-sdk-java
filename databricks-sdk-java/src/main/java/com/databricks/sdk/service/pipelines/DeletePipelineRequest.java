// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete a pipeline
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeletePipelineRequest {
  /** */
  private String pipelineId;

  /**
   * <p>Setter for the field <code>pipelineId</code>.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.DeletePipelineRequest} object
   */
  public DeletePipelineRequest setPipelineId(String pipelineId) {
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
    DeletePipelineRequest that = (DeletePipelineRequest) o;
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
    return new ToStringer(DeletePipelineRequest.class).add("pipelineId", pipelineId).toString();
  }
}
