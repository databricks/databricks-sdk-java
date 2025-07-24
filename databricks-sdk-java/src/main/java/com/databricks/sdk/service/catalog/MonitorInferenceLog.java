// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class MonitorInferenceLog {
  /**
   * List of granularities to use when aggregating data into time windows based on their timestamp.
   */
  @JsonProperty("granularities")
  private Collection<String> granularities;

  /** Column for the label. */
  @JsonProperty("label_col")
  private String labelCol;

  /** Column for the model identifier. */
  @JsonProperty("model_id_col")
  private String modelIdCol;

  /** Column for the prediction. */
  @JsonProperty("prediction_col")
  private String predictionCol;

  /** Column for prediction probabilities */
  @JsonProperty("prediction_proba_col")
  private String predictionProbaCol;

  /** Problem type the model aims to solve. */
  @JsonProperty("problem_type")
  private MonitorInferenceLogProblemType problemType;

  /** Column for the timestamp. */
  @JsonProperty("timestamp_col")
  private String timestampCol;

  public MonitorInferenceLog setGranularities(Collection<String> granularities) {
    this.granularities = granularities;
    return this;
  }

  public Collection<String> getGranularities() {
    return granularities;
  }

  public MonitorInferenceLog setLabelCol(String labelCol) {
    this.labelCol = labelCol;
    return this;
  }

  public String getLabelCol() {
    return labelCol;
  }

  public MonitorInferenceLog setModelIdCol(String modelIdCol) {
    this.modelIdCol = modelIdCol;
    return this;
  }

  public String getModelIdCol() {
    return modelIdCol;
  }

  public MonitorInferenceLog setPredictionCol(String predictionCol) {
    this.predictionCol = predictionCol;
    return this;
  }

  public String getPredictionCol() {
    return predictionCol;
  }

  public MonitorInferenceLog setPredictionProbaCol(String predictionProbaCol) {
    this.predictionProbaCol = predictionProbaCol;
    return this;
  }

  public String getPredictionProbaCol() {
    return predictionProbaCol;
  }

  public MonitorInferenceLog setProblemType(MonitorInferenceLogProblemType problemType) {
    this.problemType = problemType;
    return this;
  }

  public MonitorInferenceLogProblemType getProblemType() {
    return problemType;
  }

  public MonitorInferenceLog setTimestampCol(String timestampCol) {
    this.timestampCol = timestampCol;
    return this;
  }

  public String getTimestampCol() {
    return timestampCol;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorInferenceLog that = (MonitorInferenceLog) o;
    return Objects.equals(granularities, that.granularities)
        && Objects.equals(labelCol, that.labelCol)
        && Objects.equals(modelIdCol, that.modelIdCol)
        && Objects.equals(predictionCol, that.predictionCol)
        && Objects.equals(predictionProbaCol, that.predictionProbaCol)
        && Objects.equals(problemType, that.problemType)
        && Objects.equals(timestampCol, that.timestampCol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        granularities,
        labelCol,
        modelIdCol,
        predictionCol,
        predictionProbaCol,
        problemType,
        timestampCol);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorInferenceLog.class)
        .add("granularities", granularities)
        .add("labelCol", labelCol)
        .add("modelIdCol", modelIdCol)
        .add("predictionCol", predictionCol)
        .add("predictionProbaCol", predictionProbaCol)
        .add("problemType", problemType)
        .add("timestampCol", timestampCol)
        .toString();
  }
}
