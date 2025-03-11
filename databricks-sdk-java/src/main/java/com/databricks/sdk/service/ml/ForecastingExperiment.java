// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Represents a forecasting experiment with its unique identifier, URL, and state. */
@Generated
public class ForecastingExperiment {
  /** The unique ID for the forecasting experiment. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /** The URL to the forecasting experiment page. */
  @JsonProperty("experiment_page_url")
  private String experimentPageUrl;

  /** The current state of the forecasting experiment. */
  @JsonProperty("state")
  private ForecastingExperimentState state;

  public ForecastingExperiment setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public ForecastingExperiment setExperimentPageUrl(String experimentPageUrl) {
    this.experimentPageUrl = experimentPageUrl;
    return this;
  }

  public String getExperimentPageUrl() {
    return experimentPageUrl;
  }

  public ForecastingExperiment setState(ForecastingExperimentState state) {
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
    ForecastingExperiment that = (ForecastingExperiment) o;
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
    return new ToStringer(ForecastingExperiment.class)
        .add("experimentId", experimentId)
        .add("experimentPageUrl", experimentPageUrl)
        .add("state", state)
        .toString();
  }
}
