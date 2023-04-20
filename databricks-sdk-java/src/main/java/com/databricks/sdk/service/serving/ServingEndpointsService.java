// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

/**
 * The Serving Endpoints API allows you to create, update, and delete model serving endpoints.
 *
 * <p>You can use a serving endpoint to serve models from the Databricks Model Registry. Endpoints
 * expose the underlying models as scalable REST API endpoints using serverless compute. This means
 * the endpoints and associated compute resources are fully managed by Databricks and will not
 * appear in your cloud account. A serving endpoint can consist of one or more MLflow models from
 * the Databricks Model Registry, called served models. A serving endpoint can have at most ten
 * served models. You can configure traffic settings to define how requests should be routed to your
 * served models behind an endpoint. Additionally, you can configure the scale of resources that
 * should be applied to each served model.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface ServingEndpointsService {
  /**
   * Retrieve the logs associated with building the model's environment for a given serving
   * endpoint's served model.
   *
   * <p>Retrieves the build logs associated with the provided served model.
   */
  BuildLogsResponse buildLogs(BuildLogsRequest buildLogsRequest);

  /** Create a new serving endpoint. */
  ServingEndpointDetailed create(CreateServingEndpoint createServingEndpoint);

  /** Delete a serving endpoint. */
  void delete(DeleteServingEndpointRequest deleteServingEndpointRequest);

  /**
   * Retrieve the metrics corresponding to a serving endpoint for the current time in Prometheus or
   * OpenMetrics exposition format.
   *
   * <p>Retrieves the metrics associated with the provided serving endpoint in either Prometheus or
   * OpenMetrics exposition format.
   */
  void exportMetrics(ExportMetricsRequest exportMetricsRequest);

  /**
   * Get a single serving endpoint.
   *
   * <p>Retrieves the details for a single serving endpoint.
   */
  ServingEndpointDetailed get(GetServingEndpointRequest getServingEndpointRequest);

  /** Retrieve all serving endpoints. */
  ListEndpointsResponse list();

  /**
   * Retrieve the most recent log lines associated with a given serving endpoint's served model.
   *
   * <p>Retrieves the service logs associated with the provided served model.
   */
  ServerLogsResponse logs(LogsRequest logsRequest);

  /** Query a serving endpoint with provided model input. */
  QueryEndpointResponse query(QueryRequest queryRequest);

  /**
   * Update a serving endpoint with a new config.
   *
   * <p>Updates any combination of the serving endpoint's served models, the compute configuration
   * of those served models, and the endpoint's traffic config. An endpoint that already has an
   * update in progress can not be updated until the current update completes or fails.
   */
  ServingEndpointDetailed updateConfig(EndpointCoreConfigInput endpointCoreConfigInput);
}
