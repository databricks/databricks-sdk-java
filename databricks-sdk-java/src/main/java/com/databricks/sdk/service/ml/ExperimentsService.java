// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * Experiments are the primary unit of organization in MLflow; all MLflow runs belong to an
 * experiment. Each experiment lets you visualize, search, and compare runs, as well as download run
 * artifacts or metadata for analysis in other tools. Experiments are maintained in a Databricks
 * hosted MLflow tracking server.
 *
 * <p>Experiments are located in the workspace file tree. You manage experiments using the same
 * tools you use to manage other workspace objects such as folders, notebooks, and libraries.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ExperimentsService {
  /**
   * Create experiment.
   *
   * <p>Creates an experiment with a name. Returns the ID of the newly created experiment. Validates
   * that another experiment with the same name does not already exist and fails if another
   * experiment with the same name already exists.
   *
   * <p>Throws `RESOURCE_ALREADY_EXISTS` if a experiment with the given name exists.
   */
  CreateExperimentResponse createExperiment(CreateExperiment createExperiment);

  /**
   * Create a run.
   *
   * <p>Creates a new run within an experiment. A run is usually a single execution of a machine
   * learning or data ETL pipeline. MLflow uses runs to track the `mlflowParam`, `mlflowMetric` and
   * `mlflowRunTag` associated with a single execution.
   */
  CreateRunResponse createRun(CreateRun createRun);

  /**
   * Delete an experiment.
   *
   * <p>Marks an experiment and associated metadata, runs, metrics, params, and tags for deletion.
   * If the experiment uses FileStore, artifacts associated with experiment are also deleted.
   */
  void deleteExperiment(DeleteExperiment deleteExperiment);

  /**
   * Delete a run.
   *
   * <p>Marks a run for deletion.
   */
  void deleteRun(DeleteRun deleteRun);

  /**
   * Delete a tag.
   *
   * <p>Deletes a tag on a run. Tags are run metadata that can be updated during a run and after a
   * run completes.
   */
  void deleteTag(DeleteTag deleteTag);

  /**
   * Get metadata.
   *
   * <p>Gets metadata for an experiment.
   *
   * <p>This endpoint will return deleted experiments, but prefers the active experiment if an
   * active and deleted experiment share the same name. If multiple deleted experiments share the
   * same name, the API will return one of them.
   *
   * <p>Throws `RESOURCE_DOES_NOT_EXIST` if no experiment with the specified name exists.
   */
  GetExperimentByNameResponse getByName(GetByNameRequest getByNameRequest);

  /**
   * Get an experiment.
   *
   * <p>Gets metadata for an experiment. This method works on deleted experiments.
   */
  Experiment getExperiment(GetExperimentRequest getExperimentRequest);

  /**
   * Get history of a given metric within a run.
   *
   * <p>Gets a list of all values for the specified metric for a given run.
   */
  GetMetricHistoryResponse getHistory(GetHistoryRequest getHistoryRequest);

  /**
   * Get a run.
   *
   * <p>Gets the metadata, metrics, params, and tags for a run. In the case where multiple metrics
   * with the same key are logged for a run, return only the value with the latest timestamp.
   *
   * <p>If there are multiple values with the latest timestamp, return the maximum of these values.
   */
  GetRunResponse getRun(GetRunRequest getRunRequest);

  /**
   * Get all artifacts.
   *
   * <p>List artifacts for a run. Takes an optional `artifact_path` prefix. If it is specified, the
   * response contains only artifacts with the specified prefix.",
   */
  ListArtifactsResponse listArtifacts(ListArtifactsRequest listArtifactsRequest);

  /**
   * List experiments.
   *
   * <p>Gets a list of all experiments.
   */
  ListExperimentsResponse listExperiments(ListExperimentsRequest listExperimentsRequest);

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
   * <p>* No more than 1000 metrics, params, and tags in total * Up to 1000 metrics * Up to 100
   * params * Up to 100 tags
   *
   * <p>For example, a valid request might contain 900 metrics, 50 params, and 50 tags, but logging
   * 900 metrics, 50 params, and 51 tags is invalid.
   *
   * <p>The following limits also apply to metric, param, and tag keys and values:
   *
   * <p>* Metric keys, param keys, and tag keys can be up to 250 characters in length * Parameter
   * and tag values can be up to 250 characters in length
   */
  void logBatch(LogBatch logBatch);

  /**
   * Log inputs to a run.
   *
   * <p>**NOTE:** Experimental: This API may change or be removed in a future release without
   * warning.
   */
  void logInputs(LogInputs logInputs);

  /**
   * Log a metric.
   *
   * <p>Logs a metric for a run. A metric is a key-value pair (string key, float value) with an
   * associated timestamp. Examples include the various metrics that represent ML model accuracy. A
   * metric can be logged multiple times.
   */
  void logMetric(LogMetric logMetric);

  /**
   * Log a model.
   *
   * <p>**NOTE:** Experimental: This API may change or be removed in a future release without
   * warning.
   */
  void logModel(LogModel logModel);

  /**
   * Log a param.
   *
   * <p>Logs a param used for a run. A param is a key-value pair (string key, string value).
   * Examples include hyperparameters used for ML model training and constant dates and values used
   * in an ETL pipeline. A param can be logged only once for a run.
   */
  void logParam(LogParam logParam);

  /**
   * Restores an experiment.
   *
   * <p>Restore an experiment marked for deletion. This also restores associated metadata, runs,
   * metrics, params, and tags. If experiment uses FileStore, underlying artifacts associated with
   * experiment are also restored.
   *
   * <p>Throws `RESOURCE_DOES_NOT_EXIST` if experiment was never created or was permanently deleted.
   */
  void restoreExperiment(RestoreExperiment restoreExperiment);

  /**
   * Restore a run.
   *
   * <p>Restores a deleted run.
   */
  void restoreRun(RestoreRun restoreRun);

  /**
   * Search experiments.
   *
   * <p>Searches for experiments that satisfy specified search criteria.
   */
  SearchExperimentsResponse searchExperiments(SearchExperiments searchExperiments);

  /**
   * Search for runs.
   *
   * <p>Searches for runs that satisfy expressions.
   *
   * <p>Search expressions can use `mlflowMetric` and `mlflowParam` keys.",
   */
  SearchRunsResponse searchRuns(SearchRuns searchRuns);

  /**
   * Set a tag.
   *
   * <p>Sets a tag on an experiment. Experiment tags are metadata that can be updated.
   */
  void setExperimentTag(SetExperimentTag setExperimentTag);

  /**
   * Set a tag.
   *
   * <p>Sets a tag on a run. Tags are run metadata that can be updated during a run and after a run
   * completes.
   */
  void setTag(SetTag setTag);

  /**
   * Update an experiment.
   *
   * <p>Updates experiment metadata.
   */
  void updateExperiment(UpdateExperiment updateExperiment);

  /**
   * Update a run.
   *
   * <p>Updates run metadata.
   */
  UpdateRunResponse updateRun(UpdateRun updateRun);
}
