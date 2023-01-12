// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface MLflowRunsService {
	/**
     * Create a run.
     * 
     * Creates a new run within an experiment. A run is usually a single
     * execution of a machine learning or data ETL pipeline. MLflow uses runs to
     * track the `mlflowParam`, `mlflowMetric` and `mlflowRunTag` associated
     * with a single execution.
     */
    CreateRunResponse create(CreateRun createRun);
    
	/**
     * Delete a run.
     * 
     * Marks a run for deletion.
     */
    void delete(DeleteRun deleteRun);
    
	/**
     * Delete a tag.
     * 
     * Deletes a tag on a run. Tags are run metadata that can be updated during
     * a run and after a run completes.
     */
    void deleteTag(DeleteTag deleteTag);
    
	/**
     * Get a run.
     * 
     * "Gets the metadata, metrics, params, and tags for a run. In the case
     * where multiple metrics with the same key are logged for a run, return
     * only the value with the latest timestamp.
     * 
     * If there are multiple values with the latest timestamp, return the
     * maximum of these values.
     */
    GetRunResponse get(GetRunRequest getRunRequest);
    
	/**
     * Log a batch.
     * 
     * Logs a batch of metrics, params, and tags for a run. If any data failed
     * to be persisted, the server will respond with an error (non-200 status
     * code).
     * 
     * In case of error (due to internal server error or an invalid request),
     * partial data may be written.
     * 
     * You can write metrics, params, and tags in interleaving fashion, but
     * within a given entity type are guaranteed to follow the order specified
     * in the request body.
     * 
     * The overwrite behavior for metrics, params, and tags is as follows:
     * 
     * * Metrics: metric values are never overwritten. Logging a metric (key,
     * value, timestamp) appends to the set of values for the metric with the
     * provided key.
     * 
     * * Tags: tag values can be overwritten by successive writes to the same
     * tag key. That is, if multiple tag values with the same key are provided
     * in the same API request, the last-provided tag value is written. Logging
     * the same tag (key, value) is permitted. Specifically, logging a tag is
     * idempotent.
     * 
     * * Parameters: once written, param values cannot be changed (attempting to
     * overwrite a param value will result in an error). However, logging the
     * same param (key, value) is permitted. Specifically, logging a param is
     * idempotent.
     * 
     * Request Limits ------------------------------- A single JSON-serialized
     * API request may be up to 1 MB in size and contain:
     * 
     * * No more than 1000 metrics, params, and tags in total * Up to 1000
     * metrics\n- Up to 100 params * Up to 100 tags
     * 
     * For example, a valid request might contain 900 metrics, 50 params, and 50
     * tags, but logging 900 metrics, 50 params, and 51 tags is invalid.
     * 
     * The following limits also apply to metric, param, and tag keys and
     * values:
     * 
     * * Metric keyes, param keys, and tag keys can be up to 250 characters in
     * length * Parameter and tag values can be up to 250 characters in length
     */
    void logBatch(LogBatch logBatch);
    
	/**
     * Log a metric.
     * 
     * Logs a metric for a run. A metric is a key-value pair (string key, float
     * value) with an associated timestamp. Examples include the various metrics
     * that represent ML model accuracy. A metric can be logged multiple times.
     */
    void logMetric(LogMetric logMetric);
    
	/**
     * Log a model.
     * 
     * **NOTE:** Experimental: This API may change or be removed in a future
     * release without warning.
     */
    void logModel(LogModel logModel);
    
	/**
     * Log a param.
     * 
     * Logs a param used for a run. A param is a key-value pair (string key,
     * string value). Examples include hyperparameters used for ML model
     * training and constant dates and values used in an ETL pipeline. A param
     * can be logged only once for a run.
     */
    void logParameter(LogParam logParam);
    
	/**
     * Restore a run.
     * 
     * Restores a deleted run.
     */
    void restore(RestoreRun restoreRun);
    
	/**
     * Search for runs.
     * 
     * Searches for runs that satisfy expressions.
     * 
     * Search expressions can use `mlflowMetric` and `mlflowParam` keys.",
     */
    SearchRunsResponse search(SearchRuns searchRuns);
    
	/**
     * Set a tag.
     * 
     * Sets a tag on a run. Tags are run metadata that can be updated during a
     * run and after a run completes.
     */
    void setTag(SetTag setTag);
    
	/**
     * Update a run.
     * 
     * Updates run metadata.
     */
    UpdateRunResponse update(UpdateRun updateRun);
    
}