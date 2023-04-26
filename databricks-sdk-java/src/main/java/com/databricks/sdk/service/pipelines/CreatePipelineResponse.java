// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreatePipelineResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreatePipelineResponse {
  /** Only returned when dry_run is true. */
  @JsonProperty("effective_settings")
  private PipelineSpec effectiveSettings;

  /** The unique identifier for the newly created pipeline. Only returned when dry_run is false. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /**
   * <p>Setter for the field <code>effectiveSettings</code>.</p>
   *
   * @param effectiveSettings a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   * @return a {@link com.databricks.sdk.service.pipelines.CreatePipelineResponse} object
   */
  public CreatePipelineResponse setEffectiveSettings(PipelineSpec effectiveSettings) {
    this.effectiveSettings = effectiveSettings;
    return this;
  }

  /**
   * <p>Getter for the field <code>effectiveSettings</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec getEffectiveSettings() {
    return effectiveSettings;
  }

  /**
   * <p>Setter for the field <code>pipelineId</code>.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.CreatePipelineResponse} object
   */
  public CreatePipelineResponse setPipelineId(String pipelineId) {
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
    CreatePipelineResponse that = (CreatePipelineResponse) o;
    return Objects.equals(effectiveSettings, that.effectiveSettings)
        && Objects.equals(pipelineId, that.pipelineId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(effectiveSettings, pipelineId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreatePipelineResponse.class)
        .add("effectiveSettings", effectiveSettings)
        .add("pipelineId", pipelineId)
        .toString();
  }
}
