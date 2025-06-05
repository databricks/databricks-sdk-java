// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Represents a forecasting experiment with its unique identifier, URL, and state. */
@Generated
class ForecastingExperimentPb {
  @JsonProperty("experiment_id")
  private String experimentId;

  @JsonProperty("experiment_page_url")
  private String experimentPageUrl;

  @JsonProperty("state")
  private ForecastingExperimentState state;

  public ForecastingExperimentPb setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public ForecastingExperimentPb setExperimentPageUrl(String experimentPageUrl) {
    this.experimentPageUrl = experimentPageUrl;
    return this;
  }

  public String getExperimentPageUrl() {
    return experimentPageUrl;
  }

  public ForecastingExperimentPb setState(ForecastingExperimentState state) {
    this.state = state;
    return this;
  }

  public ForecastingExperimentState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForecastingExperimentPb that = (ForecastingExperimentPb) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(experimentPageUrl, that.experimentPageUrl)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, experimentPageUrl, state);
  }

  @Override
  public String toString() {
    return new ToStringer(ForecastingExperimentPb.class)
        .add("experimentId", experimentId)
        .add("experimentPageUrl", experimentPageUrl)
        .add("state", state)
        .toString();
  }
}
