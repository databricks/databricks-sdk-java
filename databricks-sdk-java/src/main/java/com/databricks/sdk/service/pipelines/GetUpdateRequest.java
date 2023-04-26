// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get a pipeline update
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetUpdateRequest {
  /** The ID of the pipeline. */
  private String pipelineId;

  /** The ID of the update. */
  private String updateId;

  /**
   * <p>Setter for the field <code>pipelineId</code>.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetUpdateRequest} object
   */
  public GetUpdateRequest setPipelineId(String pipelineId) {
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

  /**
   * <p>Setter for the field <code>updateId</code>.</p>
   *
   * @param updateId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetUpdateRequest} object
   */
  public GetUpdateRequest setUpdateId(String updateId) {
    this.updateId = updateId;
    return this;
  }

  /**
   * <p>Getter for the field <code>updateId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUpdateId() {
    return updateId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetUpdateRequest that = (GetUpdateRequest) o;
    return Objects.equals(pipelineId, that.pipelineId) && Objects.equals(updateId, that.updateId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(pipelineId, updateId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetUpdateRequest.class)
        .add("pipelineId", pipelineId)
        .add("updateId", updateId)
        .toString();
  }
}
