// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;

/**
 * The Serving Endpoints API allows you to create, update, and delete model serving endpoints.
 *
 * <p>You can use a serving endpoint to serve models from the Databricks Model Registry or from
 * Unity Catalog. Endpoints expose the underlying models as scalable REST API endpoints using
 * serverless compute. This means the endpoints and associated compute resources are fully managed
 * by Databricks and will not appear in your cloud account. A serving endpoint can consist of one or
 * more MLflow models from the Databricks Model Registry, called served entities. A serving endpoint
 * can have at most ten served entities. You can configure traffic settings to define how requests
 * should be routed to your served entities behind an endpoint. Additionally, you can configure the
 * scale of resources that should be applied to each served entity.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ServingEndpointsService {
  /** Retrieves the build logs associated with the provided served model. */
  BuildLogsResponse buildLogs(BuildLogsRequest buildLogsRequest);

  ServingEndpointDetailed create(CreateServingEndpoint createServingEndpoint);

  ServingEndpointDetailed createProvisionedThroughputEndpoint(
      CreatePtEndpointRequest createPtEndpointRequest);

  void delete(DeleteServingEndpointRequest deleteServingEndpointRequest);

  /**
   * Retrieves the metrics associated with the provided serving endpoint in either Prometheus or
   * OpenMetrics exposition format.
   */
  ExportMetricsResponse exportMetrics(ExportMetricsRequest exportMetricsRequest);

  /** Retrieves the details for a single serving endpoint. */
  ServingEndpointDetailed get(GetServingEndpointRequest getServingEndpointRequest);

  /**
   * Get the query schema of the serving endpoint in OpenAPI format. The schema contains information
   * for the supported paths, input and output format and datatypes.
   */
  GetOpenApiResponse getOpenApi(GetOpenApiRequest getOpenApiRequest);

  /** Gets the permission levels that a user can have on an object. */
  GetServingEndpointPermissionLevelsResponse getPermissionLevels(
      GetServingEndpointPermissionLevelsRequest getServingEndpointPermissionLevelsRequest);

  /**
   * Gets the permissions of a serving endpoint. Serving endpoints can inherit permissions from
   * their root object.
   */
  ServingEndpointPermissions getPermissions(
      GetServingEndpointPermissionsRequest getServingEndpointPermissionsRequest);

  HttpRequestResponse httpRequest(ExternalFunctionRequest externalFunctionRequest);

  ListEndpointsResponse list();

  /** Retrieves the service logs associated with the provided served model. */
  ServerLogsResponse logs(LogsRequest logsRequest);

  /** Used to batch add and delete tags from a serving endpoint with a single API call. */
  EndpointTags patch(PatchServingEndpointTags patchServingEndpointTags);

  /** Deprecated: Please use AI Gateway to manage rate limits instead. */
  PutResponse put(PutRequest putRequest);

  /**
   * Used to update the AI Gateway of a serving endpoint. NOTE: External model, provisioned
   * throughput, and pay-per-token endpoints are fully supported; agent endpoints currently only
   * support inference tables.
   */
  PutAiGatewayResponse putAiGateway(PutAiGatewayRequest putAiGatewayRequest);

  QueryEndpointResponse query(QueryEndpointInput queryEndpointInput);

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  ServingEndpointPermissions setPermissions(
      ServingEndpointPermissionsRequest servingEndpointPermissionsRequest);

  /**
   * Updates any combination of the serving endpoint's served entities, the compute configuration of
   * those served entities, and the endpoint's traffic config. An endpoint that already has an
   * update in progress can not be updated until the current update completes or fails.
   */
  ServingEndpointDetailed updateConfig(EndpointCoreConfigInput endpointCoreConfigInput);

  /**
   * Updates the permissions on a serving endpoint. Serving endpoints can inherit permissions from
   * their root object.
   */
  ServingEndpointPermissions updatePermissions(
      ServingEndpointPermissionsRequest servingEndpointPermissionsRequest);

  /**
   * Updates any combination of the pt endpoint's served entities, the compute configuration of
   * those served entities, and the endpoint's traffic config. Updates are instantaneous and
   * endpoint should be updated instantly
   */
  ServingEndpointDetailed updateProvisionedThroughputEndpointConfig(
      UpdateProvisionedThroughputEndpointConfigRequest
          updateProvisionedThroughputEndpointConfigRequest);
}
