// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateForecastingExperimentRequest {
  /**
   * Name of the column in the input training table used to customize the weight for each time
   * series to calculate weighted metrics.
   */
  @JsonProperty("custom_weights_column")
  private String customWeightsColumn;

  /**
   * The path to the created experiment. This is the path where the experiment will be stored in the
   * workspace.
   */
  @JsonProperty("experiment_path")
  private String experimentPath;

  /**
   * The granularity of the forecast. This defines the time interval between consecutive rows in the
   * time series data. Possible values: '1 second', '1 minute', '5 minutes', '10 minutes', '15
   * minutes', '30 minutes', 'Hourly', 'Daily', 'Weekly', 'Monthly', 'Quarterly', 'Yearly'.
   */
  @JsonProperty("forecast_granularity")
  private String forecastGranularity;

  /**
   * The number of time steps into the future for which predictions should be made. This value
   * represents a multiple of forecast_granularity determining how far ahead the model will
   * forecast.
   */
  @JsonProperty("forecast_horizon")
  private Long forecastHorizon;

  /**
   * Region code(s) to consider when automatically adding holiday features. When empty, no holiday
   * features are added. Only supports 1 holiday region for now.
   */
  @JsonProperty("holiday_regions")
  private Collection<String> holidayRegions;

  /**
   * The maximum duration in minutes for which the experiment is allowed to run. If the experiment
   * exceeds this time limit it will be stopped automatically.
   */
  @JsonProperty("max_runtime")
  private Long maxRuntime;

  /**
   * The three-level (fully qualified) path to a unity catalog table. This table path serves to
   * store the predictions.
   */
  @JsonProperty("prediction_data_path")
  private String predictionDataPath;

  /** The evaluation metric used to optimize the forecasting model. */
  @JsonProperty("primary_metric")
  private String primaryMetric;

  /**
   * The three-level (fully qualified) path to a unity catalog model. This model path serves to
   * store the best model.
   */
  @JsonProperty("register_to")
  private String registerTo;

  /**
   * Name of the column in the input training table used for custom data splits. The values in this
   * column must be "train", "validate", or "test" to indicate which split each row belongs to.
   */
  @JsonProperty("split_column")
  private String splitColumn;

  /**
   * Name of the column in the input training table that serves as the prediction target. The values
   * in this column will be used as the ground truth for model training.
   */
  @JsonProperty("target_column")
  private String targetColumn;

  /** Name of the column in the input training table that represents the timestamp of each row. */
  @JsonProperty("time_column")
  private String timeColumn;

  /**
   * Name of the column in the input training table used to group the dataset to predict individual
   * time series
   */
  @JsonProperty("timeseries_identifier_columns")
  private Collection<String> timeseriesIdentifierColumns;

  /**
   * The three-level (fully qualified) name of a unity catalog table. This table serves as the
   * training data for the forecasting model.
   */
  @JsonProperty("train_data_path")
  private String trainDataPath;

  /**
   * The list of frameworks to include for model tuning. Possible values: 'Prophet', 'ARIMA',
   * 'DeepAR'. An empty list will include all supported frameworks.
   */
  @JsonProperty("training_frameworks")
  private Collection<String> trainingFrameworks;

  public CreateForecastingExperimentRequest setCustomWeightsColumn(String customWeightsColumn) {
    this.customWeightsColumn = customWeightsColumn;
    return this;
  }

  public String getCustomWeightsColumn() {
    return customWeightsColumn;
  }

  public CreateForecastingExperimentRequest setExperimentPath(String experimentPath) {
    this.experimentPath = experimentPath;
    return this;
  }

  public String getExperimentPath() {
    return experimentPath;
  }

  public CreateForecastingExperimentRequest setForecastGranularity(String forecastGranularity) {
    this.forecastGranularity = forecastGranularity;
    return this;
  }

  public String getForecastGranularity() {
    return forecastGranularity;
  }

  public CreateForecastingExperimentRequest setForecastHorizon(Long forecastHorizon) {
    this.forecastHorizon = forecastHorizon;
    return this;
  }

  public Long getForecastHorizon() {
    return forecastHorizon;
  }

  public CreateForecastingExperimentRequest setHolidayRegions(Collection<String> holidayRegions) {
    this.holidayRegions = holidayRegions;
    return this;
  }

  public Collection<String> getHolidayRegions() {
    return holidayRegions;
  }

  public CreateForecastingExperimentRequest setMaxRuntime(Long maxRuntime) {
    this.maxRuntime = maxRuntime;
    return this;
  }

  public Long getMaxRuntime() {
    return maxRuntime;
  }

  public CreateForecastingExperimentRequest setPredictionDataPath(String predictionDataPath) {
    this.predictionDataPath = predictionDataPath;
    return this;
  }

  public String getPredictionDataPath() {
    return predictionDataPath;
  }

  public CreateForecastingExperimentRequest setPrimaryMetric(String primaryMetric) {
    this.primaryMetric = primaryMetric;
    return this;
  }

  public String getPrimaryMetric() {
    return primaryMetric;
  }

  public CreateForecastingExperimentRequest setRegisterTo(String registerTo) {
    this.registerTo = registerTo;
    return this;
  }

  public String getRegisterTo() {
    return registerTo;
  }

  public CreateForecastingExperimentRequest setSplitColumn(String splitColumn) {
    this.splitColumn = splitColumn;
    return this;
  }

  public String getSplitColumn() {
    return splitColumn;
  }

  public CreateForecastingExperimentRequest setTargetColumn(String targetColumn) {
    this.targetColumn = targetColumn;
    return this;
  }

  public String getTargetColumn() {
    return targetColumn;
  }

  public CreateForecastingExperimentRequest setTimeColumn(String timeColumn) {
    this.timeColumn = timeColumn;
    return this;
  }

  public String getTimeColumn() {
    return timeColumn;
  }

  public CreateForecastingExperimentRequest setTimeseriesIdentifierColumns(
      Collection<String> timeseriesIdentifierColumns) {
    this.timeseriesIdentifierColumns = timeseriesIdentifierColumns;
    return this;
  }

  public Collection<String> getTimeseriesIdentifierColumns() {
    return timeseriesIdentifierColumns;
  }

  public CreateForecastingExperimentRequest setTrainDataPath(String trainDataPath) {
    this.trainDataPath = trainDataPath;
    return this;
  }

  public String getTrainDataPath() {
    return trainDataPath;
  }

  public CreateForecastingExperimentRequest setTrainingFrameworks(
      Collection<String> trainingFrameworks) {
    this.trainingFrameworks = trainingFrameworks;
    return this;
  }

  public Collection<String> getTrainingFrameworks() {
    return trainingFrameworks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateForecastingExperimentRequest that = (CreateForecastingExperimentRequest) o;
    return Objects.equals(customWeightsColumn, that.customWeightsColumn)
        && Objects.equals(experimentPath, that.experimentPath)
        && Objects.equals(forecastGranularity, that.forecastGranularity)
        && Objects.equals(forecastHorizon, that.forecastHorizon)
        && Objects.equals(holidayRegions, that.holidayRegions)
        && Objects.equals(maxRuntime, that.maxRuntime)
        && Objects.equals(predictionDataPath, that.predictionDataPath)
        && Objects.equals(primaryMetric, that.primaryMetric)
        && Objects.equals(registerTo, that.registerTo)
        && Objects.equals(splitColumn, that.splitColumn)
        && Objects.equals(targetColumn, that.targetColumn)
        && Objects.equals(timeColumn, that.timeColumn)
        && Objects.equals(timeseriesIdentifierColumns, that.timeseriesIdentifierColumns)
        && Objects.equals(trainDataPath, that.trainDataPath)
        && Objects.equals(trainingFrameworks, that.trainingFrameworks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customWeightsColumn,
        experimentPath,
        forecastGranularity,
        forecastHorizon,
        holidayRegions,
        maxRuntime,
        predictionDataPath,
        primaryMetric,
        registerTo,
        splitColumn,
        targetColumn,
        timeColumn,
        timeseriesIdentifierColumns,
        trainDataPath,
        trainingFrameworks);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateForecastingExperimentRequest.class)
        .add("customWeightsColumn", customWeightsColumn)
        .add("experimentPath", experimentPath)
        .add("forecastGranularity", forecastGranularity)
        .add("forecastHorizon", forecastHorizon)
        .add("holidayRegions", holidayRegions)
        .add("maxRuntime", maxRuntime)
        .add("predictionDataPath", predictionDataPath)
        .add("primaryMetric", primaryMetric)
        .add("registerTo", registerTo)
        .add("splitColumn", splitColumn)
        .add("targetColumn", targetColumn)
        .add("timeColumn", timeColumn)
        .add("timeseriesIdentifierColumns", timeseriesIdentifierColumns)
        .add("trainDataPath", trainDataPath)
        .add("trainingFrameworks", trainingFrameworks)
        .toString();
  }
}
