// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.endpoints;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * The Serving Endpoints API allows you to create, update, and delete model
 * serving endpoints.
 * 
 * You can use a serving endpoint to serve models from the Databricks Model
 * Registry. Endpoints expose the underlying models as scalable REST API
 * endpoints using serverless compute. This means the endpoints and associated
 * compute resources are fully managed by Databricks and will not appear in your
 * cloud account. A serving endpoint can consist of one or more MLflow models
 * from the Databricks Model Registry, called served models. A serving endpoint
 * can have at most ten served models. You can configure traffic settings to
 * define how requests should be routed to your served models behind an
 * endpoint. Additionally, you can configure the scale of resources that should
 * be applied to each served model.
 */
public class ServingEndpointsAPI {
    private final ServingEndpointsService impl;

    /** Regular-use constructor */
    public ServingEndpointsAPI(ApiClient apiClient) {
        impl = new ServingEndpointsImpl(apiClient);
    }

    /** Constructor for mocks */
    public ServingEndpointsAPI(ServingEndpointsService mock) {
        impl = mock;
    }
	
	/**
     * Retrieve the logs associated with building the model's environment for a
     * given serving endpoint's served model.
     * 
     * Retrieves the build logs associated with the provided served model.
     */
    public BuildLogsResponse buildLogs(BuildLogsRequest request) {
        return impl.buildLogs(request);
    }
    
	/**
     * Create a new serving endpoint.
     */
    public ServingEndpointDetailed create(CreateServingEndpoint request) {
        return impl.create(request);
    }
    
	/**
     * Delete a serving endpoint.
     */
    public void delete(DeleteServingEndpointRequest request) {
        impl.delete(request);
    }
    
	/**
     * Retrieve the metrics corresponding to a serving endpoint for the current
     * time in Prometheus or OpenMetrics exposition format.
     * 
     * Retrieves the metrics associated with the provided serving endpoint in
     * either Prometheus or OpenMetrics exposition format.
     */
    public void exportMetrics(ExportMetricsRequest request) {
        impl.exportMetrics(request);
    }
    
	/**
     * Get a single serving endpoint.
     * 
     * Retrieves the details for a single serving endpoint.
     */
    public ServingEndpointDetailed get(GetServingEndpointRequest request) {
        return impl.get(request);
    }
    
	/**
     * Retrieve all serving endpoints.
     */
    public ListEndpointsResponse list() {
        return impl.list();
    }
    
	/**
     * Retrieve the most recent log lines associated with a given serving
     * endpoint's served model.
     * 
     * Retrieves the service logs associated with the provided served model.
     */
    public ServerLogsResponse logs(LogsRequest request) {
        return impl.logs(request);
    }
    
	/**
     * Query a serving endpoint with provided model input.
     */
    public QueryEndpointResponse query(QueryRequest request) {
        return impl.query(request);
    }
    
	/**
     * Update a serving endpoint with a new config.
     * 
     * Updates any combination of the serving endpoint's served models, the
     * compute configuration of those served models, and the endpoint's traffic
     * config. An endpoint that already has an update in progress can not be
     * updated until the current update completes or fails.
     */
    public ServingEndpointDetailed updateConfig(EndpointCoreConfigInput request) {
        return impl.updateConfig(request);
    }
    
    public ServingEndpointsService impl() {
        return impl;
    }
}