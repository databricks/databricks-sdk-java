// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class StartUpdatePb {
  @JsonProperty("cause")
  private StartUpdateCause cause;

  @JsonProperty("full_refresh")
  private Boolean fullRefresh;

  @JsonProperty("full_refresh_selection")
  private Collection<String> fullRefreshSelection;

  @JsonIgnore private String pipelineId;

  @JsonProperty("refresh_selection")
  private Collection<String> refreshSelection;

  @JsonProperty("validate_only")
  private Boolean validateOnly;

  public StartUpdatePb setCause(StartUpdateCause cause) {
    this.cause = cause;
    return this;
  }

  public StartUpdateCause getCause() {
    return cause;
  }

  public StartUpdatePb setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  public Boolean getFullRefresh() {
    return fullRefresh;
  }

  public StartUpdatePb setFullRefreshSelection(Collection<String> fullRefreshSelection) {
    this.fullRefreshSelection = fullRefreshSelection;
    return this;
  }

  public Collection<String> getFullRefreshSelection() {
    return fullRefreshSelection;
  }

  public StartUpdatePb setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public StartUpdatePb setRefreshSelection(Collection<String> refreshSelection) {
    this.refreshSelection = refreshSelection;
    return this;
  }

  public Collection<String> getRefreshSelection() {
    return refreshSelection;
  }

  public StartUpdatePb setValidateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  public Boolean getValidateOnly() {
    return validateOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StartUpdatePb that = (StartUpdatePb) o;
    return Objects.equals(cause, that.cause)
        && Objects.equals(fullRefresh, that.fullRefresh)
        && Objects.equals(fullRefreshSelection, that.fullRefreshSelection)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(refreshSelection, that.refreshSelection)
        && Objects.equals(validateOnly, that.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cause, fullRefresh, fullRefreshSelection, pipelineId, refreshSelection, validateOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(StartUpdatePb.class)
        .add("cause", cause)
        .add("fullRefresh", fullRefresh)
        .add("fullRefreshSelection", fullRefreshSelection)
        .add("pipelineId", pipelineId)
        .add("refreshSelection", refreshSelection)
        .add("validateOnly", validateOnly)
        .toString();
  }
}
