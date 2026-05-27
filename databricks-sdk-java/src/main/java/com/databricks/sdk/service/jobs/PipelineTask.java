// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class PipelineTask {
  /** If true, triggers a full refresh on the spark declarative pipeline. */
  @JsonProperty("full_refresh")
  private Boolean fullRefresh;

  /** A list of tables to update with fullRefresh. */
  @JsonProperty("full_refresh_selection")
  private Collection<String> fullRefreshSelection;

  /** The full name of the pipeline task to execute. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /**
   * Key/value-map of parameters passed to the pipeline execution. Limited to 10k characters in
   * total.
   */
  @JsonProperty("pipeline_task_parameters")
  private Map<String, String> pipelineTaskParameters;

  /**
   * Flow names to selectively refresh. These are unioned with other selective refresh options
   * (refresh_selection, full_refresh_selection) to determine the final set of flows to refresh.
   */
  @JsonProperty("refresh_flow_selection")
  private Collection<String> refreshFlowSelection;

  /** A list of tables to update without fullRefresh. */
  @JsonProperty("refresh_selection")
  private Collection<String> refreshSelection;

  /** A list of streaming flows to reset checkpoints without clearing data. */
  @JsonProperty("reset_checkpoint_selection")
  private Collection<String> resetCheckpointSelection;

  public PipelineTask setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  public Boolean getFullRefresh() {
    return fullRefresh;
  }

  public PipelineTask setFullRefreshSelection(Collection<String> fullRefreshSelection) {
    this.fullRefreshSelection = fullRefreshSelection;
    return this;
  }

  public Collection<String> getFullRefreshSelection() {
    return fullRefreshSelection;
  }

  public PipelineTask setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public PipelineTask setPipelineTaskParameters(Map<String, String> pipelineTaskParameters) {
    this.pipelineTaskParameters = pipelineTaskParameters;
    return this;
  }

  public Map<String, String> getPipelineTaskParameters() {
    return pipelineTaskParameters;
  }

  public PipelineTask setRefreshFlowSelection(Collection<String> refreshFlowSelection) {
    this.refreshFlowSelection = refreshFlowSelection;
    return this;
  }

  public Collection<String> getRefreshFlowSelection() {
    return refreshFlowSelection;
  }

  public PipelineTask setRefreshSelection(Collection<String> refreshSelection) {
    this.refreshSelection = refreshSelection;
    return this;
  }

  public Collection<String> getRefreshSelection() {
    return refreshSelection;
  }

  public PipelineTask setResetCheckpointSelection(Collection<String> resetCheckpointSelection) {
    this.resetCheckpointSelection = resetCheckpointSelection;
    return this;
  }

  public Collection<String> getResetCheckpointSelection() {
    return resetCheckpointSelection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineTask that = (PipelineTask) o;
    return Objects.equals(fullRefresh, that.fullRefresh)
        && Objects.equals(fullRefreshSelection, that.fullRefreshSelection)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(pipelineTaskParameters, that.pipelineTaskParameters)
        && Objects.equals(refreshFlowSelection, that.refreshFlowSelection)
        && Objects.equals(refreshSelection, that.refreshSelection)
        && Objects.equals(resetCheckpointSelection, that.resetCheckpointSelection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fullRefresh,
        fullRefreshSelection,
        pipelineId,
        pipelineTaskParameters,
        refreshFlowSelection,
        refreshSelection,
        resetCheckpointSelection);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineTask.class)
        .add("fullRefresh", fullRefresh)
        .add("fullRefreshSelection", fullRefreshSelection)
        .add("pipelineId", pipelineId)
        .add("pipelineTaskParameters", pipelineTaskParameters)
        .add("refreshFlowSelection", refreshFlowSelection)
        .add("refreshSelection", refreshSelection)
        .add("resetCheckpointSelection", resetCheckpointSelection)
        .toString();
  }
}
