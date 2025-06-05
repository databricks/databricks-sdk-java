// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreatePipelineResponsePb {
  @JsonProperty("effective_settings")
  private PipelineSpec effectiveSettings;

  @JsonProperty("pipeline_id")
  private String pipelineId;

  public CreatePipelineResponsePb setEffectiveSettings(PipelineSpec effectiveSettings) {
    this.effectiveSettings = effectiveSettings;
    return this;
  }

  public PipelineSpec getEffectiveSettings() {
    return effectiveSettings;
  }

  public CreatePipelineResponsePb setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreatePipelineResponsePb that = (CreatePipelineResponsePb) o;
    return Objects.equals(effectiveSettings, that.effectiveSettings)
        && Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveSettings, pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePipelineResponsePb.class)
        .add("effectiveSettings", effectiveSettings)
        .add("pipelineId", pipelineId)
        .toString();
  }
}
