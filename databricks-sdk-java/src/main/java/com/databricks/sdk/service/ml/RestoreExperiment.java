// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RestoreExperiment class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RestoreExperiment {
  /** ID of the associated experiment. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /**
   * <p>Setter for the field <code>experimentId</code>.</p>
   *
   * @param experimentId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.RestoreExperiment} object
   */
  public RestoreExperiment setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  /**
   * <p>Getter for the field <code>experimentId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExperimentId() {
    return experimentId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestoreExperiment that = (RestoreExperiment) o;
    return Objects.equals(experimentId, that.experimentId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(experimentId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RestoreExperiment.class).add("experimentId", experimentId).toString();
  }
}
