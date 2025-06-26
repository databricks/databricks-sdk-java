// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * The Forecasting API allows you to create and get serverless forecasting experiments
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ForecastingService {
  /** Creates a serverless forecasting experiment. Returns the experiment ID. */
  CreateForecastingExperimentResponse createExperiment(
      CreateForecastingExperimentRequest createForecastingExperimentRequest);

  /** Public RPC to get forecasting experiment */
  ForecastingExperiment getExperiment(
      GetForecastingExperimentRequest getForecastingExperimentRequest);
}
