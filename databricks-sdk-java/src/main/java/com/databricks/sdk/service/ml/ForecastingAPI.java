// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** The Forecasting API allows you to create and get serverless forecasting experiments */
@Generated
public class ForecastingAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ForecastingAPI.class);

  private final ForecastingService impl;

  /** Regular-use constructor */
  public ForecastingAPI(ApiClient apiClient) {
    impl = new ForecastingImpl(apiClient);
  }

  /** Constructor for mocks */
  public ForecastingAPI(ForecastingService mock) {
    impl = mock;
  }

  public ForecastingExperiment waitGetExperimentForecastingSucceeded(String experimentId)
      throws TimeoutException {
    return waitGetExperimentForecastingSucceeded(experimentId, Duration.ofMinutes(120), null);
  }

  public ForecastingExperiment waitGetExperimentForecastingSucceeded(
      String experimentId, Duration timeout, Consumer<ForecastingExperiment> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<ForecastingExperimentState> targetStates =
        Arrays.asList(ForecastingExperimentState.SUCCEEDED);
    java.util.List<ForecastingExperimentState> failureStates =
        Arrays.asList(ForecastingExperimentState.FAILED, ForecastingExperimentState.CANCELLED);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      ForecastingExperiment poll =
          getExperiment(new GetForecastingExperimentRequest().setExperimentId(experimentId));
      ForecastingExperimentState status = poll.getState();
      statusMessage = String.format("current status: %s", status);
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg = String.format("failed to reach SUCCEEDED, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix = String.format("experimentId=%s", experimentId);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        throw new DatabricksException("Current thread was interrupted", e);
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  public Wait<ForecastingExperiment, CreateForecastingExperimentResponse> createExperiment(
      String trainDataPath,
      String targetColumn,
      String timeColumn,
      String forecastGranularity,
      long forecastHorizon) {
    return createExperiment(
        new CreateForecastingExperimentRequest()
            .setTrainDataPath(trainDataPath)
            .setTargetColumn(targetColumn)
            .setTimeColumn(timeColumn)
            .setForecastGranularity(forecastGranularity)
            .setForecastHorizon(forecastHorizon));
  }

  /** Creates a serverless forecasting experiment. Returns the experiment ID. */
  public Wait<ForecastingExperiment, CreateForecastingExperimentResponse> createExperiment(
      CreateForecastingExperimentRequest request) {
    CreateForecastingExperimentResponse response = impl.createExperiment(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetExperimentForecastingSucceeded(response.getExperimentId(), timeout, callback),
        response);
  }

  public ForecastingExperiment getExperiment(String experimentId) {
    return getExperiment(new GetForecastingExperimentRequest().setExperimentId(experimentId));
  }

  /** Public RPC to get forecasting experiment */
  public ForecastingExperiment getExperiment(GetForecastingExperimentRequest request) {
    return impl.getExperiment(request);
  }

  public ForecastingService impl() {
    return impl;
  }
}
