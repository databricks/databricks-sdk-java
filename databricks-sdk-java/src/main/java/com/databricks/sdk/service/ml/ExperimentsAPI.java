// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Generated
public class ExperimentsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ExperimentsAPI.class);

  private final ExperimentsService impl;

  /** Regular-use constructor */
  public ExperimentsAPI(ApiClient apiClient) {
    impl = new ExperimentsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ExperimentsAPI(ExperimentsService mock) {
    impl = mock;
  }

  public CreateExperimentResponse createExperiment(String name) {
    return createExperiment(new CreateExperiment().setName(name));
  }

  /**
   * Create experiment.
   *
   * <p>Creates an experiment with a name. Returns the ID of the newly created experiment. Validates
   * that another experiment with the same name does not already exist and fails if another
   * experiment with the same name already exists.
   *
   * <p>Throws `RESOURCE_ALREADY_EXISTS` if a experiment with the given name exists.
   */
  public CreateExperimentResponse createExperiment(CreateExperiment request) {
    return impl.createExperiment(request);
  }

  /**
   * Create a run.
   *
   * <p>Creates a new run within an experiment. A run is usually a single execution of a machine
   * learning or data ETL pipeline. MLflow uses runs to track the `mlflowParam`, `mlflowMetric` and
   * `mlflowRunTag` associated with a single execution.
   */
  public CreateRunResponse createRun(CreateRun request) {
    return impl.createRun(request);
  }

  public void deleteExperiment(String experimentId) {
    deleteExperiment(new DeleteExperiment().setExperimentId(experimentId));
  }

  /**
   * Delete an experiment.
   *
   * <p>Marks an experiment and associated metadata, runs, metrics, params, and tags for deletion.
   * If the experiment uses FileStore, artifacts associated with experiment are also deleted.
   */
  public void deleteExperiment(DeleteExperiment request) {
    impl.deleteExperiment(request);
  }

  public void deleteRun(String runId) {
    deleteRun(new DeleteRun().setRunId(runId));
  }

  /**
   * Delete a run.
   *
   * <p>Marks a run for deletion.
   */
  public void deleteRun(DeleteRun request) {
    impl.deleteRun(request);
  }

  public void deleteTag(String runId, String key) {
    deleteTag(new DeleteTag().setRunId(runId).setKey(key));
  }

  /**
   * Delete a tag.
   *
   * <p>Deletes a tag on a run. Tags are run metadata that can be updated during a run and after a
   * run completes.
   */
  public void deleteTag(DeleteTag request) {
    impl.deleteTag(request);
  }

  public GetExperimentByNameResponse getByName(String experimentName) {
    return getByName(new GetByNameRequest().setExperimentName(experimentName));
  }

  /**
   * Get metadata.
   *
   * <p>"Gets metadata for an experiment.
   *
   * <p>This endpoint will return deleted experiments, but prefers the active experiment if an
   * active and deleted experiment share the same name. If multiple deleted experiments share the
   * same name, the API will return one of them.
   *
   * <p>Throws `RESOURCE_DOES_NOT_EXIST` if no experiment with the specified name exists.S
   */
  public GetExperimentByNameResponse getByName(GetByNameRequest request) {
    return impl.getByName(request);
  }

  public Experiment getExperiment(String experimentId) {
    return getExperiment(new GetExperimentRequest().setExperimentId(experimentId));
  }

  /**
   * Get an experiment.
   *
   * <p>Gets metadata for an experiment. This method works on deleted experiments.
   */
  public Experiment getExperiment(GetExperimentRequest request) {
    return impl.getExperiment(request);
  }

  public GetMetricHistoryResponse getHistory(String metricKey) {
    return getHistory(new GetHistoryRequest().setMetricKey(metricKey));
  }

  /**
   * Get history of a given metric within a run.
   *
   * <p>Gets a list of all values for the specified metric for a given run.
   */
  public GetMetricHistoryResponse getHistory(GetHistoryRequest request) {
    return impl.getHistory(request);
  }

  public GetRunResponse getRun(String runId) {
    return getRun(new GetRunRequest().setRunId(runId));
  }

  /**
   * Get a run.
   *
   * <p>"Gets the metadata, metrics, params, and tags for a run. In the case where multiple metrics
   * with the same key are logged for a run, return only the value with the latest timestamp.
   *
   * <p>If there are multiple values with the latest timestamp, return the maximum of these values.
   */
  public GetRunResponse getRun(GetRunRequest request) {
    return impl.getRun(request);
  }

  /**
   * Get all artifacts.
   *
   * <p>List artifacts for a run. Takes an optional `artifact_path` prefix. If it is specified, the
   * response contains only artifacts with the specified prefix.",
   */
  public Iterable<FileInfo> listArtifacts(ListArtifactsRequest request) {
    return new Paginator<>(
        request,
        impl::listArtifacts,
        ListArtifactsResponse::getFiles,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * List experiments.
   *
   * <p>Gets a list of all experiments.
   */
  public Iterable<Experiment> listExperiments(ListExperimentsRequest request) {
    return new Paginator<>(
        request,
        impl::listExperiments,
        ListExperimentsResponse::getExperiments,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Log a batch.
   *
   * <p>Logs a batch of metrics, params, and tags for a run. If any data failed to be persisted, the
   * server will respond with an error (non-200 status code).
   *
   * <p>In case of error (due to internal server error or an invalid request), partial data may be
   * written.
   *
   * <p>You can write metrics, params, and tags in interleaving fashion, but within a given entity
   * type are guaranteed to follow the order specified in the request body.
   *
   * <p>The overwrite behavior for metrics, params, and tags is as follows:
   *
   * <p>* Metrics: metric values are never overwritten. Logging a metric (key, value, timestamp)
   * appends to the set of values for the metric with the provided key.
   *
   * <p>* Tags: tag values can be overwritten by successive writes to the same tag key. That is, if
   * multiple tag values with the same key are provided in the same API request, the last-provided
   * tag value is written. Logging the same tag (key, value) is permitted. Specifically, logging a
   * tag is idempotent.
   *
   * <p>* Parameters: once written, param values cannot be changed (attempting to overwrite a param
   * value will result in an error). However, logging the same param (key, value) is permitted.
   * Specifically, logging a param is idempotent.
   *
   * <p>Request Limits ------------------------------- A single JSON-serialized API request may be
   * up to 1 MB in size and contain:
   *
   * <p>* No more than 1000 metrics, params, and tags in total * Up to 1000 metrics - Up to 100
   * params * Up to 100 tags
   *
   * <p>For example, a valid request might contain 900 metrics, 50 params, and 50 tags, but logging
   * 900 metrics, 50 params, and 51 tags is invalid.
   *
   * <p>The following limits also apply to metric, param, and tag keys and values:
   *
   * <p>* Metric keyes, param keys, and tag keys can be up to 250 characters in length * Parameter
   * and tag values can be up to 250 characters in length
   */
  public void logBatch(LogBatch request) {
    impl.logBatch(request);
  }

  public void logMetric(String key, Float value, Long timestamp) {
    logMetric(new LogMetric().setKey(key).setValue(value).setTimestamp(timestamp));
  }

  /**
   * Log a metric.
   *
   * <p>Logs a metric for a run. A metric is a key-value pair (string key, float value) with an
   * associated timestamp. Examples include the various metrics that represent ML model accuracy. A
   * metric can be logged multiple times.
   */
  public void logMetric(LogMetric request) {
    impl.logMetric(request);
  }

  /**
   * Log a model.
   *
   * <p>**NOTE:** Experimental: This API may change or be removed in a future release without
   * warning.
   */
  public void logModel(LogModel request) {
    impl.logModel(request);
  }

  public void logParam(String key, String value) {
    logParam(new LogParam().setKey(key).setValue(value));
  }

  /**
   * Log a param.
   *
   * <p>Logs a param used for a run. A param is a key-value pair (string key, string value).
   * Examples include hyperparameters used for ML model training and constant dates and values used
   * in an ETL pipeline. A param can be logged only once for a run.
   */
  public void logParam(LogParam request) {
    impl.logParam(request);
  }

  public void restoreExperiment(String experimentId) {
    restoreExperiment(new RestoreExperiment().setExperimentId(experimentId));
  }

  /**
   * Restores an experiment.
   *
   * <p>"Restore an experiment marked for deletion. This also restores associated metadata, runs,
   * metrics, params, and tags. If experiment uses FileStore, underlying artifacts associated with
   * experiment are also restored.
   *
   * <p>Throws `RESOURCE_DOES_NOT_EXIST` if experiment was never created or was permanently
   * deleted.",
   */
  public void restoreExperiment(RestoreExperiment request) {
    impl.restoreExperiment(request);
  }

  public void restoreRun(String runId) {
    restoreRun(new RestoreRun().setRunId(runId));
  }

  /**
   * Restore a run.
   *
   * <p>Restores a deleted run.
   */
  public void restoreRun(RestoreRun request) {
    impl.restoreRun(request);
  }

  /**
   * Search experiments.
   *
   * <p>Searches for experiments that satisfy specified search criteria.
   */
  public Iterable<Experiment> searchExperiments(SearchExperiments request) {
    return new Paginator<>(
        request,
        impl::searchExperiments,
        SearchExperimentsResponse::getExperiments,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Search for runs.
   *
   * <p>Searches for runs that satisfy expressions.
   *
   * <p>Search expressions can use `mlflowMetric` and `mlflowParam` keys.",
   */
  public Iterable<Run> searchRuns(SearchRuns request) {
    return new Paginator<>(
        request,
        impl::searchRuns,
        SearchRunsResponse::getRuns,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public void setExperimentTag(String experimentId, String key, String value) {
    setExperimentTag(
        new SetExperimentTag().setExperimentId(experimentId).setKey(key).setValue(value));
  }

  /**
   * Set a tag.
   *
   * <p>Sets a tag on an experiment. Experiment tags are metadata that can be updated.
   */
  public void setExperimentTag(SetExperimentTag request) {
    impl.setExperimentTag(request);
  }

  public void setTag(String key, String value) {
    setTag(new SetTag().setKey(key).setValue(value));
  }

  /**
   * Set a tag.
   *
   * <p>Sets a tag on a run. Tags are run metadata that can be updated during a run and after a run
   * completes.
   */
  public void setTag(SetTag request) {
    impl.setTag(request);
  }

  public void updateExperiment(String experimentId) {
    updateExperiment(new UpdateExperiment().setExperimentId(experimentId));
  }

  /**
   * Update an experiment.
   *
   * <p>Updates experiment metadata.
   */
  public void updateExperiment(UpdateExperiment request) {
    impl.updateExperiment(request);
  }

  /**
   * Update a run.
   *
   * <p>Updates run metadata.
   */
  public UpdateRunResponse updateRun(UpdateRun request) {
    return impl.updateRun(request);
  }

  public ExperimentsService impl() {
    return impl;
  }
}
