// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 */
@Generated
public class ServingEndpointsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ServingEndpointsAPI.class);

  private final ServingEndpointsService impl;

  /** Regular-use constructor */
  public ServingEndpointsAPI(ApiClient apiClient) {
    impl = new ServingEndpointsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ServingEndpointsAPI(ServingEndpointsService mock) {
    impl = mock;
  }

  public ServingEndpointDetailed waitGetServingEndpointNotUpdating(String name)
      throws TimeoutException {
    return waitGetServingEndpointNotUpdating(name, Duration.ofMinutes(20), null);
  }

  public ServingEndpointDetailed waitGetServingEndpointNotUpdating(
      String name, Duration timeout, Consumer<ServingEndpointDetailed> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<EndpointStateConfigUpdate> targetStates =
        Arrays.asList(EndpointStateConfigUpdate.NOT_UPDATING);
    java.util.List<EndpointStateConfigUpdate> failureStates =
        Arrays.asList(
            EndpointStateConfigUpdate.UPDATE_FAILED, EndpointStateConfigUpdate.UPDATE_CANCELED);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      ServingEndpointDetailed poll = get(new GetServingEndpointRequest().setName(name));
      EndpointStateConfigUpdate status = poll.getState().getConfigUpdate();
      statusMessage = String.format("current status: %s", status);
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg =
            String.format("failed to reach NOT_UPDATING, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix = String.format("name=%s", name);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        throw new DatabricksException("Current thread was interrupted", e);
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  public BuildLogsResponse buildLogs(String name, String servedModelName) {
    return buildLogs(new BuildLogsRequest().setName(name).setServedModelName(servedModelName));
  }

  /** Retrieves the build logs associated with the provided served model. */
  public BuildLogsResponse buildLogs(BuildLogsRequest request) {
    return impl.buildLogs(request);
  }

  /** Create a new serving endpoint. */
  public Wait<ServingEndpointDetailed, ServingEndpointDetailed> create(
      CreateServingEndpoint request) {
    ServingEndpointDetailed response = impl.create(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetServingEndpointNotUpdating(response.getName(), timeout, callback),
        response);
  }

  /** Create a new PT serving endpoint. */
  public Wait<ServingEndpointDetailed, ServingEndpointDetailed> createProvisionedThroughputEndpoint(
      CreatePtEndpointRequest request) {
    ServingEndpointDetailed response = impl.createProvisionedThroughputEndpoint(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetServingEndpointNotUpdating(response.getName(), timeout, callback),
        response);
  }

  public void delete(String name) {
    delete(new DeleteServingEndpointRequest().setName(name));
  }

  /** Delete a serving endpoint. */
  public void delete(DeleteServingEndpointRequest request) {
    impl.delete(request);
  }

  public ExportMetricsResponse exportMetrics(String name) {
    return exportMetrics(new ExportMetricsRequest().setName(name));
  }

  /**
   * Retrieves the metrics associated with the provided serving endpoint in either Prometheus or
   * OpenMetrics exposition format.
   */
  public ExportMetricsResponse exportMetrics(ExportMetricsRequest request) {
    return impl.exportMetrics(request);
  }

  public ServingEndpointDetailed get(String name) {
    return get(new GetServingEndpointRequest().setName(name));
  }

  /** Retrieves the details for a single serving endpoint. */
  public ServingEndpointDetailed get(GetServingEndpointRequest request) {
    return impl.get(request);
  }

  public GetOpenApiResponse getOpenApi(String name) {
    return getOpenApi(new GetOpenApiRequest().setName(name));
  }

  /**
   * Get the query schema of the serving endpoint in OpenAPI format. The schema contains information
   * for the supported paths, input and output format and datatypes.
   */
  public GetOpenApiResponse getOpenApi(GetOpenApiRequest request) {
    return impl.getOpenApi(request);
  }

  public GetServingEndpointPermissionLevelsResponse getPermissionLevels(String servingEndpointId) {
    return getPermissionLevels(
        new GetServingEndpointPermissionLevelsRequest().setServingEndpointId(servingEndpointId));
  }

  /** Gets the permission levels that a user can have on an object. */
  public GetServingEndpointPermissionLevelsResponse getPermissionLevels(
      GetServingEndpointPermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }

  public ServingEndpointPermissions getPermissions(String servingEndpointId) {
    return getPermissions(
        new GetServingEndpointPermissionsRequest().setServingEndpointId(servingEndpointId));
  }

  /**
   * Gets the permissions of a serving endpoint. Serving endpoints can inherit permissions from
   * their root object.
   */
  public ServingEndpointPermissions getPermissions(GetServingEndpointPermissionsRequest request) {
    return impl.getPermissions(request);
  }

  /** Make external services call using the credentials stored in UC Connection. */
  public HttpRequestResponse httpRequest(ExternalFunctionRequest request) {
    return impl.httpRequest(request);
  }

  /** Get all serving endpoints. */
  public Iterable<ServingEndpoint> list() {
    return new Paginator<>(
        null, (Void v) -> impl.list(), ListEndpointsResponse::getEndpoints, response -> null);
  }

  public ServerLogsResponse logs(String name, String servedModelName) {
    return logs(new LogsRequest().setName(name).setServedModelName(servedModelName));
  }

  /** Retrieves the service logs associated with the provided served model. */
  public ServerLogsResponse logs(LogsRequest request) {
    return impl.logs(request);
  }

  /** Used to batch add and delete tags from a serving endpoint with a single API call. */
  public EndpointTags patch(PatchServingEndpointTags request) {
    return impl.patch(request);
  }

  /** Deprecated: Please use AI Gateway to manage rate limits instead. */
  public PutResponse put(PutRequest request) {
    return impl.put(request);
  }

  /**
   * Used to update the AI Gateway of a serving endpoint. NOTE: External model, provisioned
   * throughput, and pay-per-token endpoints are fully supported; agent endpoints currently only
   * support inference tables.
   */
  public PutAiGatewayResponse putAiGateway(PutAiGatewayRequest request) {
    return impl.putAiGateway(request);
  }

  /** Query a serving endpoint. */
  public QueryEndpointResponse query(QueryEndpointInput request) {
    return impl.query(request);
  }

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  public ServingEndpointPermissions setPermissions(ServingEndpointPermissionsRequest request) {
    return impl.setPermissions(request);
  }

  /**
   * Updates any combination of the serving endpoint's served entities, the compute configuration of
   * those served entities, and the endpoint's traffic config. An endpoint that already has an
   * update in progress can not be updated until the current update completes or fails.
   */
  public Wait<ServingEndpointDetailed, ServingEndpointDetailed> updateConfig(
      EndpointCoreConfigInput request) {
    ServingEndpointDetailed response = impl.updateConfig(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetServingEndpointNotUpdating(response.getName(), timeout, callback),
        response);
  }

  /**
   * Updates the permissions on a serving endpoint. Serving endpoints can inherit permissions from
   * their root object.
   */
  public ServingEndpointPermissions updatePermissions(ServingEndpointPermissionsRequest request) {
    return impl.updatePermissions(request);
  }

  /**
   * Updates any combination of the pt endpoint's served entities, the compute configuration of
   * those served entities, and the endpoint's traffic config. Updates are instantaneous and
   * endpoint should be updated instantly
   */
  public Wait<ServingEndpointDetailed, ServingEndpointDetailed>
      updateProvisionedThroughputEndpointConfig(
          UpdateProvisionedThroughputEndpointConfigRequest request) {
    ServingEndpointDetailed response = impl.updateProvisionedThroughputEndpointConfig(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetServingEndpointNotUpdating(response.getName(), timeout, callback),
        response);
  }

  public ServingEndpointsService impl() {
    return impl;
  }
}
