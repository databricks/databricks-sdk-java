// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>GetExperimentByNameResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetExperimentByNameResponse {
  /** Experiment details. */
  @JsonProperty("experiment")
  private Experiment experiment;

  /**
   * <p>Setter for the field <code>experiment</code>.</p>
   *
   * @param experiment a {@link com.databricks.sdk.service.ml.Experiment} object
   * @return a {@link com.databricks.sdk.service.ml.GetExperimentByNameResponse} object
   */
  public GetExperimentByNameResponse setExperiment(Experiment experiment) {
    this.experiment = experiment;
    return this;
  }

  /**
   * <p>Getter for the field <code>experiment</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.Experiment} object
   */
  public Experiment getExperiment() {
    return experiment;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetExperimentByNameResponse that = (GetExperimentByNameResponse) o;
    return Objects.equals(experiment, that.experiment);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(experiment);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetExperimentByNameResponse.class)
        .add("experiment", experiment)
        .toString();
  }
}
