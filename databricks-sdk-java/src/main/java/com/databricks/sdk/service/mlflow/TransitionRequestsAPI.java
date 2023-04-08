// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;


public class TransitionRequestsAPI {
    private final TransitionRequestsService impl;

    /** Regular-use constructor */
    public TransitionRequestsAPI(ApiClient apiClient) {
        impl = new TransitionRequestsImpl(apiClient);
    }

    /** Constructor for mocks */
    public TransitionRequestsAPI(TransitionRequestsService mock) {
        impl = mock;
    }
	
	/**
     * Approve transition requests.
     * 
     * Approves a model version stage transition request.
     */
    public ApproveResponse approve(ApproveTransitionRequest request) {
        return impl.approve(request);
    }
    
	/**
     * Make a transition request.
     * 
     * Creates a model version stage transition request.
     */
    public CreateResponse create(CreateTransitionRequest request) {
        return impl.create(request);
    }
    
	/**
     * Delete a ransition request.
     * 
     * Cancels a model version stage transition request.
     */
    public void delete(DeleteTransitionRequestRequest request) {
        impl.delete(request);
    }
    
	/**
     * List transition requests.
     * 
     * Gets a list of all open stage transition requests for the model version.
     */
    public ListResponse list(ListTransitionRequestsRequest request) {
        return impl.list(request);
    }
    
	/**
     * Reject a transition request.
     * 
     * Rejects a model version stage transition request.
     */
    public RejectResponse reject(RejectTransitionRequest request) {
        return impl.reject(request);
    }
    
    public TransitionRequestsService impl() {
        return impl;
    }
}