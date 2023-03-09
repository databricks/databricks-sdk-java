// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;


public class TransitionRequestsAPI implements TransitionRequestsService {
    private final ApiClient apiClient;

    public TransitionRequestsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Approve transition requests.
     * 
     * Approves a model version stage transition request.
     */
    @Override
    public ApproveResponse approve(ApproveTransitionRequest request) {
        String path = "/api/2.0/mlflow/transition-requests/approve";
        return apiClient.POST(path, request, ApproveResponse.class);
    }
    
	/**
     * Make a transition request.
     * 
     * Creates a model version stage transition request.
     */
    @Override
    public CreateResponse create(CreateTransitionRequest request) {
        String path = "/api/2.0/mlflow/transition-requests/create";
        return apiClient.POST(path, request, CreateResponse.class);
    }
    
	/**
     * Delete a ransition request.
     * 
     * Cancels a model version stage transition request.
     */
    @Override
    public void delete(DeleteTransitionRequestRequest request) {
        String path = "/api/2.0/mlflow/transition-requests/delete";
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * List transition requests.
     * 
     * Gets a list of all open stage transition requests for the model version.
     */
    @Override
    public ListResponse list(ListTransitionRequestsRequest request) {
        String path = "/api/2.0/mlflow/transition-requests/list";
        return apiClient.GET(path, request, ListResponse.class);
    }
    
	/**
     * Reject a transition request.
     * 
     * Rejects a model version stage transition request.
     */
    @Override
    public RejectResponse reject(RejectTransitionRequest request) {
        String path = "/api/2.0/mlflow/transition-requests/reject";
        return apiClient.POST(path, request, RejectResponse.class);
    }
    
}