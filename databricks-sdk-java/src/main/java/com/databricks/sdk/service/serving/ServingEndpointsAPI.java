// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        Arrays.asList(EndpointStateConfigUpdate.UPDATE_FAILED);
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
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  public BuildLogsResponse buildLogs(String name, String servedModelName) {
    return buildLogs(new BuildLogsRequest().setName(name).setServedModelName(servedModelName));
  }

  /**
   * Retrieve the logs associated with building the model's environment for a given serving
   * endpoint's served model.
   *
   * <p>Retrieves the build logs associated with the provided served model.
   */
  public BuildLogsResponse buildLogs(BuildLogsRequest request) {
    return impl.buildLogs(request);
  }

  public Wait<ServingEndpointDetailed, ServingEndpointDetailed> create(
      String name, EndpointCoreConfigInput config) {
    return create(new CreateServingEndpoint().setName(name).setConfig(config));
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

  public void delete(String name) {
    delete(new DeleteServingEndpointRequest().setName(name));
  }

  /** Delete a serving endpoint. */
  public void delete(DeleteServingEndpointRequest request) {
    impl.delete(request);
  }

  public void exportMetrics(String name) {
    exportMetrics(new ExportMetricsRequest().setName(name));
  }

  /**
   * Retrieve the metrics corresponding to a serving endpoint for the current time in Prometheus or
   * OpenMetrics exposition format.
   *
   * <p>Retrieves the metrics associated with the provided serving endpoint in either Prometheus or
   * OpenMetrics exposition format.
   */
  public void exportMetrics(ExportMetricsRequest request) {
    impl.exportMetrics(request);
  }

  public ServingEndpointDetailed get(String name) {
    return get(new GetServingEndpointRequest().setName(name));
  }

  /**
   * Get a single serving endpoint.
   *
   * <p>Retrieves the details for a single serving endpoint.
   */
  public ServingEndpointDetailed get(GetServingEndpointRequest request) {
    return impl.get(request);
  }

  /** Retrieve all serving endpoints. */
  public ListEndpointsResponse list() {
    return impl.list();
  }

  public ServerLogsResponse logs(String name, String servedModelName) {
    return logs(new LogsRequest().setName(name).setServedModelName(servedModelName));
  }

  /**
   * Retrieve the most recent log lines associated with a given serving endpoint's served model.
   *
   * <p>Retrieves the service logs associated with the provided served model.
   */
  public ServerLogsResponse logs(LogsRequest request) {
    return impl.logs(request);
  }

  public QueryEndpointResponse query(String name) {
    return query(new QueryRequest().setName(name));
  }

  /** Query a serving endpoint with provided model input. */
  public QueryEndpointResponse query(QueryRequest request) {
    return impl.query(request);
  }

  public Wait<ServingEndpointDetailed, ServingEndpointDetailed> updateConfig(
      Collection<ServedModelInput> servedModels, String name) {
    return updateConfig(new EndpointCoreConfigInput().setServedModels(servedModels).setName(name));
  }

  /**
   * Update a serving endpoint with a new config.
   *
   * <p>Updates any combination of the serving endpoint's served models, the compute configuration
   * of those served models, and the endpoint's traffic config. An endpoint that already has an
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

  public ServingEndpointsService impl() {
    return impl;
  }
}
