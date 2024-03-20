// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import java.util.Collection;

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
  /**
   * Get build logs for a served model.
   *
   * <p>Retrieves the build logs associated with the provided served model.
   */
  BuildLogsResponse buildLogs(BuildLogsRequest buildLogsRequest);

  /** Create a new serving endpoint. */
  ServingEndpointDetailed create(CreateServingEndpoint createServingEndpoint);

  /** Delete a serving endpoint. */
  void delete(DeleteServingEndpointRequest deleteServingEndpointRequest);

  /**
   * Get metrics of a serving endpoint.
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

  /**
   * Get serving endpoint permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  GetServingEndpointPermissionLevelsResponse getPermissionLevels(
      GetServingEndpointPermissionLevelsRequest getServingEndpointPermissionLevelsRequest);

  /**
   * Get serving endpoint permissions.
   *
   * <p>Gets the permissions of a serving endpoint. Serving endpoints can inherit permissions from
   * their root object.
   */
  ServingEndpointPermissions getPermissions(
      GetServingEndpointPermissionsRequest getServingEndpointPermissionsRequest);

  /** Get all serving endpoints. */
  ListEndpointsResponse list();

  /**
   * Get the latest logs for a served model.
   *
   * <p>Retrieves the service logs associated with the provided served model.
   */
  ServerLogsResponse logs(LogsRequest logsRequest);

  /**
   * Update tags of a serving endpoint.
   *
   * <p>Used to batch add and delete tags from a serving endpoint with a single API call.
   */
  Collection<EndpointTag> patch(PatchServingEndpointTags patchServingEndpointTags);

  /**
   * Update rate limits of a serving endpoint.
   *
   * <p>Used to update the rate limits of a serving endpoint. NOTE: only external and foundation
   * model endpoints are supported as of now.
   */
  PutResponse put(PutRequest putRequest);

  /** Query a serving endpoint. */
  QueryEndpointResponse query(QueryEndpointInput queryEndpointInput);

  /**
   * Set serving endpoint permissions.
   *
   * <p>Sets permissions on a serving endpoint. Serving endpoints can inherit permissions from their
   * root object.
   */
  ServingEndpointPermissions setPermissions(
      ServingEndpointPermissionsRequest servingEndpointPermissionsRequest);

  /**
   * Update config of a serving endpoint.
   *
   * <p>Updates any combination of the serving endpoint's served entities, the compute configuration
   * of those served entities, and the endpoint's traffic config. An endpoint that already has an
   * update in progress can not be updated until the current update completes or fails.
   */
  ServingEndpointDetailed updateConfig(EndpointCoreConfigInput endpointCoreConfigInput);

  /**
   * Update serving endpoint permissions.
   *
   * <p>Updates the permissions on a serving endpoint. Serving endpoints can inherit permissions
   * from their root object.
   */
  ServingEndpointPermissions updatePermissions(
      ServingEndpointPermissionsRequest servingEndpointPermissionsRequest);
}
