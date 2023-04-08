// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.pipelines;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of Pipelines */
class PipelinesImpl implements PipelinesService {
    private final ApiClient apiClient;

    public PipelinesImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public CreatePipelineResponse create(CreatePipeline request) {
        String path = "/api/2.0/pipelines";
        return apiClient.POST(path, request, CreatePipelineResponse.class);
    }
    
    @Override
    public void delete(Delete request) {
        String path = String.format("/api/2.0/pipelines/%s", request.getPipelineId());
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public GetPipelineResponse get(Get request) {
        String path = String.format("/api/2.0/pipelines/%s", request.getPipelineId());
        return apiClient.GET(path, request, GetPipelineResponse.class);
    }
    
    @Override
    public GetUpdateResponse getUpdate(GetUpdate request) {
        String path = String.format("/api/2.0/pipelines/%s/updates/%s", request.getPipelineId(), request.getUpdateId());
        return apiClient.GET(path, request, GetUpdateResponse.class);
    }
    
    @Override
    public ListPipelineEventsResponse listPipelineEvents(ListPipelineEvents request) {
        String path = String.format("/api/2.0/pipelines/%s/events", request.getPipelineId());
        return apiClient.GET(path, request, ListPipelineEventsResponse.class);
    }
    
    @Override
    public ListPipelinesResponse listPipelines(ListPipelines request) {
        String path = "/api/2.0/pipelines";
        return apiClient.GET(path, request, ListPipelinesResponse.class);
    }
    
    @Override
    public ListUpdatesResponse listUpdates(ListUpdates request) {
        String path = String.format("/api/2.0/pipelines/%s/updates", request.getPipelineId());
        return apiClient.GET(path, request, ListUpdatesResponse.class);
    }
    
    @Override
    public void reset(Reset request) {
        String path = String.format("/api/2.0/pipelines/%s/reset", request.getPipelineId());
        apiClient.POST(path, request, Void.class);
    }
    
    @Override
    public StartUpdateResponse startUpdate(StartUpdate request) {
        String path = String.format("/api/2.0/pipelines/%s/updates", request.getPipelineId());
        return apiClient.POST(path, request, StartUpdateResponse.class);
    }
    
    @Override
    public void stop(Stop request) {
        String path = String.format("/api/2.0/pipelines/%s/stop", request.getPipelineId());
        apiClient.POST(path, request, Void.class);
    }
    
    @Override
    public void update(EditPipeline request) {
        String path = String.format("/api/2.0/pipelines/%s", request.getPipelineId());
        apiClient.PUT(path, request, Void.class);
    }
    
}