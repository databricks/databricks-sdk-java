// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CreateForecastingExperimentRequestPb {
  @JsonProperty("custom_weights_column")
  private String customWeightsColumn;

  @JsonProperty("experiment_path")
  private String experimentPath;

  @JsonProperty("forecast_granularity")
  private String forecastGranularity;

  @JsonProperty("forecast_horizon")
  private Long forecastHorizon;

  @JsonProperty("future_feature_data_path")
  private String futureFeatureDataPath;

  @JsonProperty("holiday_regions")
  private Collection<String> holidayRegions;

  @JsonProperty("include_features")
  private Collection<String> includeFeatures;

  @JsonProperty("max_runtime")
  private Long maxRuntime;

  @JsonProperty("prediction_data_path")
  private String predictionDataPath;

  @JsonProperty("primary_metric")
  private String primaryMetric;

  @JsonProperty("register_to")
  private String registerTo;

  @JsonProperty("split_column")
  private String splitColumn;

  @JsonProperty("target_column")
  private String targetColumn;

  @JsonProperty("time_column")
  private String timeColumn;

  @JsonProperty("timeseries_identifier_columns")
  private Collection<String> timeseriesIdentifierColumns;

  @JsonProperty("train_data_path")
  private String trainDataPath;

  @JsonProperty("training_frameworks")
  private Collection<String> trainingFrameworks;

  public CreateForecastingExperimentRequestPb setCustomWeightsColumn(String customWeightsColumn) {
    this.customWeightsColumn = customWeightsColumn;
    return this;
  }

  public String getCustomWeightsColumn() {
    return customWeightsColumn;
  }

  public CreateForecastingExperimentRequestPb setExperimentPath(String experimentPath) {
    this.experimentPath = experimentPath;
    return this;
  }

  public String getExperimentPath() {
    return experimentPath;
  }

  public CreateForecastingExperimentRequestPb setForecastGranularity(String forecastGranularity) {
    this.forecastGranularity = forecastGranularity;
    return this;
  }

  public String getForecastGranularity() {
    return forecastGranularity;
  }

  public CreateForecastingExperimentRequestPb setForecastHorizon(Long forecastHorizon) {
    this.forecastHorizon = forecastHorizon;
    return this;
  }

  public Long getForecastHorizon() {
    return forecastHorizon;
  }

  public CreateForecastingExperimentRequestPb setFutureFeatureDataPath(
      String futureFeatureDataPath) {
    this.futureFeatureDataPath = futureFeatureDataPath;
    return this;
  }

  public String getFutureFeatureDataPath() {
    return futureFeatureDataPath;
  }

  public CreateForecastingExperimentRequestPb setHolidayRegions(Collection<String> holidayRegions) {
    this.holidayRegions = holidayRegions;
    return this;
  }

  public Collection<String> getHolidayRegions() {
    return holidayRegions;
  }

  public CreateForecastingExperimentRequestPb setIncludeFeatures(
      Collection<String> includeFeatures) {
    this.includeFeatures = includeFeatures;
    return this;
  }

  public Collection<String> getIncludeFeatures() {
    return includeFeatures;
  }

  public CreateForecastingExperimentRequestPb setMaxRuntime(Long maxRuntime) {
    this.maxRuntime = maxRuntime;
    return this;
  }

  public Long getMaxRuntime() {
    return maxRuntime;
  }

  public CreateForecastingExperimentRequestPb setPredictionDataPath(String predictionDataPath) {
    this.predictionDataPath = predictionDataPath;
    return this;
  }

  public String getPredictionDataPath() {
    return predictionDataPath;
  }

  public CreateForecastingExperimentRequestPb setPrimaryMetric(String primaryMetric) {
    this.primaryMetric = primaryMetric;
    return this;
  }

  public String getPrimaryMetric() {
    return primaryMetric;
  }

  public CreateForecastingExperimentRequestPb setRegisterTo(String registerTo) {
    this.registerTo = registerTo;
    return this;
  }

  public String getRegisterTo() {
    return registerTo;
  }

  public CreateForecastingExperimentRequestPb setSplitColumn(String splitColumn) {
    this.splitColumn = splitColumn;
    return this;
  }

  public String getSplitColumn() {
    return splitColumn;
  }

  public CreateForecastingExperimentRequestPb setTargetColumn(String targetColumn) {
    this.targetColumn = targetColumn;
    return this;
  }

  public String getTargetColumn() {
    return targetColumn;
  }

  public CreateForecastingExperimentRequestPb setTimeColumn(String timeColumn) {
    this.timeColumn = timeColumn;
    return this;
  }

  public String getTimeColumn() {
    return timeColumn;
  }

  public CreateForecastingExperimentRequestPb setTimeseriesIdentifierColumns(
      Collection<String> timeseriesIdentifierColumns) {
    this.timeseriesIdentifierColumns = timeseriesIdentifierColumns;
    return this;
  }

  public Collection<String> getTimeseriesIdentifierColumns() {
    return timeseriesIdentifierColumns;
  }

  public CreateForecastingExperimentRequestPb setTrainDataPath(String trainDataPath) {
    this.trainDataPath = trainDataPath;
    return this;
  }

  public String getTrainDataPath() {
    return trainDataPath;
  }

  public CreateForecastingExperimentRequestPb setTrainingFrameworks(
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
    CreateForecastingExperimentRequestPb that = (CreateForecastingExperimentRequestPb) o;
    return Objects.equals(customWeightsColumn, that.customWeightsColumn)
        && Objects.equals(experimentPath, that.experimentPath)
        && Objects.equals(forecastGranularity, that.forecastGranularity)
        && Objects.equals(forecastHorizon, that.forecastHorizon)
        && Objects.equals(futureFeatureDataPath, that.futureFeatureDataPath)
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
        futureFeatureDataPath,
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
    return new ToStringer(CreateForecastingExperimentRequestPb.class)
        .add("customWeightsColumn", customWeightsColumn)
        .add("experimentPath", experimentPath)
        .add("forecastGranularity", forecastGranularity)
        .add("forecastHorizon", forecastHorizon)
        .add("futureFeatureDataPath", futureFeatureDataPath)
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
