// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.endpoints;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * The Serverless Real-Time Inference Serving Endpoints API allows you to
 * create, update, and delete model serving endpoints.
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
@Generated("databricks-sdk-generator")
public class ServingEndpointsAPI implements ServingEndpointsService {
    private final ApiClient apiClient;

    public ServingEndpointsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Retrieve the logs associated with building the model's environment for a
     * given serving endpoint's served model.
     * 
     * Retrieves the build logs associated with the provided served model.
     * Please note that this API is in preview and may change in the future.
     */
    @Override
    public BuildLogsResponse buildLogs(BuildLogsRequest request) {
        String path = String.format("/api/2.0/serving-endpoints/%s/served-models/%s/build-logs", request.getName(), request.getServedModelName());
        return apiClient.GET(path, request, BuildLogsResponse.class);
    }
    
	/**
     * Create a new serving endpoint.
     */
    @Override
    public ServingEndpointDetailed create(CreateServingEndpoint request) {
        String path = "/api/2.0/serving-endpoints";
        return apiClient.POST(path, request, ServingEndpointDetailed.class);
    }
    
	/**
     * Delete a serving endpoint.
     */
    @Override
    public void delete(DeleteServingEndpointRequest request) {
        String path = String.format("/api/2.0/serving-endpoints/%s", request.getName());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Retrieve the metrics corresponding to a serving endpoint for the current
     * time in Prometheus or OpenMetrics exposition format.
     * 
     * Retrieves the metrics associated with the provided serving endpoint in
     * either Prometheus or OpenMetrics exposition format. Please note that this
     * API is in preview and may change in the future.
     */
    @Override
    public void exportMetrics(ExportMetricsRequest request) {
        String path = String.format("/api/2.0/serving-endpoints/%s/metrics", request.getName());
        apiClient.GET(path, request, Void.class);
    }
    
	/**
     * Get a single serving endpoint.
     * 
     * Retrieves the details for a single serving endpoint.
     */
    @Override
    public ServingEndpointDetailed get(GetServingEndpointRequest request) {
        String path = String.format("/api/2.0/serving-endpoints/%s", request.getName());
        return apiClient.GET(path, request, ServingEndpointDetailed.class);
    }
    
	/**
     * Retrieve all serving endpoints.
     */
    @Override
    public ListEndpointsResponse list() {
        String path = "/api/2.0/serving-endpoints";
        return apiClient.GET(path, ListEndpointsResponse.class);
    }
    
	/**
     * Retrieve the most recent log lines associated with a given serving
     * endpoint's served model.
     * 
     * Retrieves the service logs associated with the provided served model.
     * Please note that this API is in preview and may change in the future.
     */
    @Override
    public ServerLogsResponse logs(LogsRequest request) {
        String path = String.format("/api/2.0/serving-endpoints/%s/served-models/%s/logs", request.getName(), request.getServedModelName());
        return apiClient.GET(path, request, ServerLogsResponse.class);
    }
    
	/**
     * Query a serving endpoint with provided model input.
     */
    @Override
    public QueryEndpointResponse query(QueryRequest request) {
        String path = String.format("/serving-endpoints/%s/invocations", request.getName());
        return apiClient.POST(path, request, QueryEndpointResponse.class);
    }
    
	/**
     * Update a serving endpoint with a new config.
     * 
     * Updates any combination of the serving endpoint's served models, the
     * compute configuration of those served models, and the endpoint's traffic
     * config. An endpoint that already has an update in progress can not be
     * updated until the current update completes or fails.
     */
    @Override
    public ServingEndpointDetailed updateConfig(EndpointCoreConfigInput request) {
        String path = String.format("/api/2.0/serving-endpoints/%s/config", request.getName());
        return apiClient.PUT(path, request, ServingEndpointDetailed.class);
    }
    
}