// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Inference log configuration. */
@Generated
public class InferenceLogConfig {
  /**
   * List of granularities to use when aggregating data into time windows based on their timestamp.
   */
  @JsonProperty("granularities")
  private Collection<AggregationGranularity> granularities;

  /** Column for the label. */
  @JsonProperty("label_column")
  private String labelColumn;

  /** Column for the model identifier. */
  @JsonProperty("model_id_column")
  private String modelIdColumn;

  /** Column for the prediction. */
  @JsonProperty("prediction_column")
  private String predictionColumn;

  /** Problem type the model aims to solve. */
  @JsonProperty("problem_type")
  private InferenceProblemType problemType;

  /** Column for the timestamp. */
  @JsonProperty("timestamp_column")
  private String timestampColumn;

  public InferenceLogConfig setGranularities(Collection<AggregationGranularity> granularities) {
    this.granularities = granularities;
    return this;
  }

  public Collection<AggregationGranularity> getGranularities() {
    return granularities;
  }

  public InferenceLogConfig setLabelColumn(String labelColumn) {
    this.labelColumn = labelColumn;
    return this;
  }

  public String getLabelColumn() {
    return labelColumn;
  }

  public InferenceLogConfig setModelIdColumn(String modelIdColumn) {
    this.modelIdColumn = modelIdColumn;
    return this;
  }

  public String getModelIdColumn() {
    return modelIdColumn;
  }

  public InferenceLogConfig setPredictionColumn(String predictionColumn) {
    this.predictionColumn = predictionColumn;
    return this;
  }

  public String getPredictionColumn() {
    return predictionColumn;
  }

  public InferenceLogConfig setProblemType(InferenceProblemType problemType) {
    this.problemType = problemType;
    return this;
  }

  public InferenceProblemType getProblemType() {
    return problemType;
  }

  public InferenceLogConfig setTimestampColumn(String timestampColumn) {
    this.timestampColumn = timestampColumn;
    return this;
  }

  public String getTimestampColumn() {
    return timestampColumn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InferenceLogConfig that = (InferenceLogConfig) o;
    return Objects.equals(granularities, that.granularities)
        && Objects.equals(labelColumn, that.labelColumn)
        && Objects.equals(modelIdColumn, that.modelIdColumn)
        && Objects.equals(predictionColumn, that.predictionColumn)
        && Objects.equals(problemType, that.problemType)
        && Objects.equals(timestampColumn, that.timestampColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        granularities, labelColumn, modelIdColumn, predictionColumn, problemType, timestampColumn);
  }

  @Override
  public String toString() {
    return new ToStringer(InferenceLogConfig.class)
        .add("granularities", granularities)
        .add("labelColumn", labelColumn)
        .add("modelIdColumn", modelIdColumn)
        .add("predictionColumn", predictionColumn)
        .add("problemType", problemType)
        .add("timestampColumn", timestampColumn)
        .toString();
  }
}
