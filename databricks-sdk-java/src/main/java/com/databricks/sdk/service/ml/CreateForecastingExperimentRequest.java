// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateForecastingExperimentRequest {
  /** The column in the training table used to customize weights for each time series. */
  @JsonProperty("custom_weights_column")
  private String customWeightsColumn;

  /** The path in the workspace to store the created experiment. */
  @JsonProperty("experiment_path")
  private String experimentPath;

  /**
   * The time interval between consecutive rows in the time series data. Possible values include: '1
   * second', '1 minute', '5 minutes', '10 minutes', '15 minutes', '30 minutes', 'Hourly', 'Daily',
   * 'Weekly', 'Monthly', 'Quarterly', 'Yearly'.
   */
  @JsonProperty("forecast_granularity")
  private String forecastGranularity;

  /**
   * The number of time steps into the future to make predictions, calculated as a multiple of
   * forecast_granularity. This value represents how far ahead the model should forecast.
   */
  @JsonProperty("forecast_horizon")
  private Long forecastHorizon;

  /**
   * The region code(s) to automatically add holiday features. Currently supports only one region.
   */
  @JsonProperty("holiday_regions")
  private Collection<String> holidayRegions;

  /**
   * Specifies the list of feature columns to include in model training. These columns must exist in
   * the training data and be of type string, numerical, or boolean. If not specified, no additional
   * features will be included. Note: Certain columns are automatically handled: - Automatically
   * excluded: split_column, target_column, custom_weights_column. - Automatically included:
   * time_column.
   */
  @JsonProperty("include_features")
  private Collection<String> includeFeatures;

  /**
   * The maximum duration for the experiment in minutes. The experiment stops automatically if it
   * exceeds this limit.
   */
  @JsonProperty("max_runtime")
  private Long maxRuntime;

  /**
   * The fully qualified path of a Unity Catalog table, formatted as
   * catalog_name.schema_name.table_name, used to store predictions.
   */
  @JsonProperty("prediction_data_path")
  private String predictionDataPath;

  /** The evaluation metric used to optimize the forecasting model. */
  @JsonProperty("primary_metric")
  private String primaryMetric;

  /**
   * The fully qualified path of a Unity Catalog model, formatted as
   * catalog_name.schema_name.model_name, used to store the best model.
   */
  @JsonProperty("register_to")
  private String registerTo;

  /**
   * // The column in the training table used for custom data splits. Values must be 'train',
   * 'validate', or 'test'.
   */
  @JsonProperty("split_column")
  private String splitColumn;

  /**
   * The column in the input training table used as the prediction target for model training. The
   * values in this column are used as the ground truth for model training.
   */
  @JsonProperty("target_column")
  private String targetColumn;

  /** The column in the input training table that represents each row's timestamp. */
  @JsonProperty("time_column")
  private String timeColumn;

  /**
   * The column in the training table used to group the dataset for predicting individual time
   * series.
   */
  @JsonProperty("timeseries_identifier_columns")
  private Collection<String> timeseriesIdentifierColumns;

  /**
   * The fully qualified name of a Unity Catalog table, formatted as
   * catalog_name.schema_name.table_name, used as training data for the forecasting model.
   */
  @JsonProperty("train_data_path")
  private String trainDataPath;

  /**
   * List of frameworks to include for model tuning. Possible values are 'Prophet', 'ARIMA',
   * 'DeepAR'. An empty list includes all supported frameworks.
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

  public CreateForecastingExperimentRequest setIncludeFeatures(Collection<String> includeFeatures) {
    this.includeFeatures = includeFeatures;
    return this;
  }

  public Collection<String> getIncludeFeatures() {
    return includeFeatures;
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
        && Objects.equals(includeFeatures, that.includeFeatures)
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
        includeFeatures,
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
        .add("includeFeatures", includeFeatures)
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
