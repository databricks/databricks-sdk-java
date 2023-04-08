// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;


public class MLflowRunsAPI {
    private final MLflowRunsService impl;

    /** Regular-use constructor */
    public MLflowRunsAPI(ApiClient apiClient) {
        impl = new MLflowRunsImpl(apiClient);
    }

    /** Constructor for mocks */
    public MLflowRunsAPI(MLflowRunsService mock) {
        impl = mock;
    }
	
	/**
     * Create a run.
     * 
     * Creates a new run within an experiment. A run is usually a single
     * execution of a machine learning or data ETL pipeline. MLflow uses runs to
     * track the `mlflowParam`, `mlflowMetric` and `mlflowRunTag` associated
     * with a single execution.
     */
    public CreateRunResponse create(CreateRun request) {
        return impl.create(request);
    }
    
	/**
     * Delete a run.
     * 
     * Marks a run for deletion.
     */
    public void delete(DeleteRun request) {
        impl.delete(request);
    }
    
	/**
     * Delete a tag.
     * 
     * Deletes a tag on a run. Tags are run metadata that can be updated during
     * a run and after a run completes.
     */
    public void deleteTag(DeleteTag request) {
        impl.deleteTag(request);
    }
    
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
    public GetRunResponse get(GetRunRequest request) {
        return impl.get(request);
    }
    
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
     * metrics - Up to 100 params * Up to 100 tags
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
    public void logBatch(LogBatch request) {
        impl.logBatch(request);
    }
    
	/**
     * Log a metric.
     * 
     * Logs a metric for a run. A metric is a key-value pair (string key, float
     * value) with an associated timestamp. Examples include the various metrics
     * that represent ML model accuracy. A metric can be logged multiple times.
     */
    public void logMetric(LogMetric request) {
        impl.logMetric(request);
    }
    
	/**
     * Log a model.
     * 
     * **NOTE:** Experimental: This API may change or be removed in a future
     * release without warning.
     */
    public void logModel(LogModel request) {
        impl.logModel(request);
    }
    
	/**
     * Log a param.
     * 
     * Logs a param used for a run. A param is a key-value pair (string key,
     * string value). Examples include hyperparameters used for ML model
     * training and constant dates and values used in an ETL pipeline. A param
     * can be logged only once for a run.
     */
    public void logParameter(LogParam request) {
        impl.logParameter(request);
    }
    
	/**
     * Restore a run.
     * 
     * Restores a deleted run.
     */
    public void restore(RestoreRun request) {
        impl.restore(request);
    }
    
	/**
     * Search for runs.
     * 
     * Searches for runs that satisfy expressions.
     * 
     * Search expressions can use `mlflowMetric` and `mlflowParam` keys.",
     */
    public SearchRunsResponse search(SearchRuns request) {
        return impl.search(request);
    }
    
	/**
     * Set a tag.
     * 
     * Sets a tag on a run. Tags are run metadata that can be updated during a
     * run and after a run completes.
     */
    public void setTag(SetTag request) {
        impl.setTag(request);
    }
    
	/**
     * Update a run.
     * 
     * Updates run metadata.
     */
    public UpdateRunResponse update(UpdateRun request) {
        return impl.update(request);
    }
    
    public MLflowRunsService impl() {
        return impl;
    }
}