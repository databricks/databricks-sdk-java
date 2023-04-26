// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateExperiment class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateExperiment {
  /** ID of the associated experiment. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /** If provided, the experiment's name is changed to the new name. The new name must be unique. */
  @JsonProperty("new_name")
  private String newName;

  /**
   * <p>Setter for the field <code>experimentId</code>.</p>
   *
   * @param experimentId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateExperiment} object
   */
  public UpdateExperiment setExperimentId(String experimentId) {
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

  /**
   * <p>Setter for the field <code>newName</code>.</p>
   *
   * @param newName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateExperiment} object
   */
  public UpdateExperiment setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * <p>Getter for the field <code>newName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNewName() {
    return newName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateExperiment that = (UpdateExperiment) o;
    return Objects.equals(experimentId, that.experimentId) && Objects.equals(newName, that.newName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(experimentId, newName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateExperiment.class)
        .add("experimentId", experimentId)
        .add("newName", newName)
        .toString();
  }
}
