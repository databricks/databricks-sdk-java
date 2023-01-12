// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.pipelines;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

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
 */
@Generated("databricks-sdk-generator")
public class PipelinesAPI implements PipelinesService {
    private final ApiClient apiClient;

    public PipelinesAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a pipeline.
     * 
     * Creates a new data processing pipeline based on the requested
     * configuration. If successful, this method returns the ID of the new
     * pipeline.
     */
    @Override
    public CreatePipelineResponse create(CreatePipeline request) {
        String path = "/api/2.0/pipelines";
        return apiClient.POST(path, request, CreatePipelineResponse.class);
    }
    
	/**
     * Delete a pipeline.
     * 
     * Deletes a pipeline.
     */
    @Override
    public void delete(Delete request) {
        String path = String.format("/api/2.0/pipelines/%s", request.getPipelineId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a pipeline.
     */
    @Override
    public GetPipelineResponse get(Get request) {
        String path = String.format("/api/2.0/pipelines/%s", request.getPipelineId());
        return apiClient.GET(path, request, GetPipelineResponse.class);
    }
    
	/**
     * Get a pipeline update.
     * 
     * Gets an update from an active pipeline.
     */
    @Override
    public GetUpdateResponse getUpdate(GetUpdate request) {
        String path = String.format("/api/2.0/pipelines/%s/updates/%s", request.getPipelineId(), request.getUpdateId());
        return apiClient.GET(path, request, GetUpdateResponse.class);
    }
    
	/**
     * List pipelines.
     * 
     * Lists pipelines defined in the Delta Live Tables system.
     */
    @Override
    public ListPipelinesResponse listPipelines(ListPipelines request) {
        String path = "/api/2.0/pipelines";
        return apiClient.GET(path, request, ListPipelinesResponse.class);
    }
    
	/**
     * List pipeline updates.
     * 
     * List updates for an active pipeline.
     */
    @Override
    public ListUpdatesResponse listUpdates(ListUpdates request) {
        String path = String.format("/api/2.0/pipelines/%s/updates", request.getPipelineId());
        return apiClient.GET(path, request, ListUpdatesResponse.class);
    }
    
	/**
     * Reset a pipeline.
     * 
     * Resets a pipeline.
     */
    @Override
    public void reset(Reset request) {
        String path = String.format("/api/2.0/pipelines/%s/reset", request.getPipelineId());
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Queue a pipeline update.
     * 
     * Starts or queues a pipeline update.
     */
    @Override
    public StartUpdateResponse startUpdate(StartUpdate request) {
        String path = String.format("/api/2.0/pipelines/%s/updates", request.getPipelineId());
        return apiClient.POST(path, request, StartUpdateResponse.class);
    }
    
	/**
     * Stop a pipeline.
     * 
     * Stops a pipeline.
     */
    @Override
    public void stop(Stop request) {
        String path = String.format("/api/2.0/pipelines/%s/stop", request.getPipelineId());
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Edit a pipeline.
     * 
     * Updates a pipeline with the supplied configuration.
     */
    @Override
    public void update(EditPipeline request) {
        String path = String.format("/api/2.0/pipelines/%s", request.getPipelineId());
        apiClient.PUT(path, request, Void.class);
    }
    
}