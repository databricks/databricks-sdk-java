// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.pipelines;

import java.util.List;
import java.util.Map;

/**
 * The Delta Live Tables API allows you to create, edit, delete, start, and view
 * details about pipelines.
 * 
 * Delta Live Tables is a framework for building reliable, maintainable, and
 * testable data processing pipelines. You define the transformations to perform
 * on your data, and Delta Live Tables manages task orchestration, cluster
 * management, monitoring, data quality, and error handling.
 * 
 * Instead of defining your data pipelines using a series of separate Apache
 * Spark tasks, Delta Live Tables manages how your data is transformed based on
 * a target schema you define for each processing step. You can also enforce
 * data quality with Delta Live Tables expectations. Expectations allow you to
 * define expected data quality and specify how to handle records that fail
 * those expectations.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
public interface PipelinesService {
	/**
     * Create a pipeline.
     * 
     * Creates a new data processing pipeline based on the requested
     * configuration. If successful, this method returns the ID of the new
     * pipeline.
     */
    CreatePipelineResponse create(CreatePipeline createPipeline);
    
	/**
     * Delete a pipeline.
     * 
     * Deletes a pipeline.
     */
    void delete(Delete delete);
    
	/**
     * Get a pipeline.
     */
    GetPipelineResponse get(Get get);
    
	/**
     * Get a pipeline update.
     * 
     * Gets an update from an active pipeline.
     */
    GetUpdateResponse getUpdate(GetUpdate getUpdate);
    
	/**
     * List pipeline events.
     * 
     * Retrieves events for a pipeline.
     */
    ListPipelineEventsResponse listPipelineEvents(ListPipelineEvents listPipelineEvents);
    
	/**
     * List pipelines.
     * 
     * Lists pipelines defined in the Delta Live Tables system.
     */
    ListPipelinesResponse listPipelines(ListPipelines listPipelines);
    
	/**
     * List pipeline updates.
     * 
     * List updates for an active pipeline.
     */
    ListUpdatesResponse listUpdates(ListUpdates listUpdates);
    
	/**
     * Reset a pipeline.
     * 
     * Resets a pipeline.
     */
    void reset(Reset reset);
    
	/**
     * Queue a pipeline update.
     * 
     * Starts or queues a pipeline update.
     */
    StartUpdateResponse startUpdate(StartUpdate startUpdate);
    
	/**
     * Stop a pipeline.
     * 
     * Stops a pipeline.
     */
    void stop(Stop stop);
    
	/**
     * Edit a pipeline.
     * 
     * Updates a pipeline with the supplied configuration.
     */
    void update(EditPipeline editPipeline);
    
}