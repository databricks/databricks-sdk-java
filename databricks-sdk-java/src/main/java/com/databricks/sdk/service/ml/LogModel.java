// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>LogModel class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class LogModel {
  /** MLmodel file in json format. */
  @JsonProperty("model_json")
  private String modelJson;

  /** ID of the run to log under */
  @JsonProperty("run_id")
  private String runId;

  /**
   * <p>Setter for the field <code>modelJson</code>.</p>
   *
   * @param modelJson a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.LogModel} object
   */
  public LogModel setModelJson(String modelJson) {
    this.modelJson = modelJson;
    return this;
  }

  /**
   * <p>Getter for the field <code>modelJson</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getModelJson() {
    return modelJson;
  }

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.LogModel} object
   */
  public LogModel setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * <p>Getter for the field <code>runId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunId() {
    return runId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogModel that = (LogModel) o;
    return Objects.equals(modelJson, that.modelJson) && Objects.equals(runId, that.runId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(modelJson, runId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(LogModel.class)
        .add("modelJson", modelJson)
        .add("runId", runId)
        .toString();
  }
}
