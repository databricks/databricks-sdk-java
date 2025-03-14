// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a forecasting experiment */
@Generated
public class GetForecastingExperimentRequest {
  /** The unique ID of a forecasting experiment */
  @JsonIgnore private String experimentId;

  public GetForecastingExperimentRequest setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetForecastingExperimentRequest that = (GetForecastingExperimentRequest) o;
    return Objects.equals(experimentId, that.experimentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetForecastingExperimentRequest.class)
        .add("experimentId", experimentId)
        .toString();
  }
}
