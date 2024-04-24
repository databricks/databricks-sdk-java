// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.vectorsearch;

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

/** **Endpoint**: Represents the compute resources to host vector search indexes. */
@Generated
public class VectorSearchEndpointsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(VectorSearchEndpointsAPI.class);

  private final VectorSearchEndpointsService impl;

  /** Regular-use constructor */
  public VectorSearchEndpointsAPI(ApiClient apiClient) {
    impl = new VectorSearchEndpointsImpl(apiClient);
  }

  /** Constructor for mocks */
  public VectorSearchEndpointsAPI(VectorSearchEndpointsService mock) {
    impl = mock;
  }

  public EndpointInfo waitGetEndpointVectorSearchEndpointOnline(String endpointName)
      throws TimeoutException {
    return waitGetEndpointVectorSearchEndpointOnline(endpointName, Duration.ofMinutes(20), null);
  }

  public EndpointInfo waitGetEndpointVectorSearchEndpointOnline(
      String endpointName, Duration timeout, Consumer<EndpointInfo> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<EndpointStatusState> targetStates = Arrays.asList(EndpointStatusState.ONLINE);
    java.util.List<EndpointStatusState> failureStates = Arrays.asList(EndpointStatusState.OFFLINE);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      EndpointInfo poll = getEndpoint(new GetEndpointRequest().setEndpointName(endpointName));
      EndpointStatusState status = poll.getEndpointStatus().getState();
      statusMessage = String.format("current status: %s", status);
      if (poll.getEndpointStatus() != null) {
        statusMessage = poll.getEndpointStatus().getMessage();
      }
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg = String.format("failed to reach ONLINE, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix = String.format("endpointName=%s", endpointName);
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

  public Wait<EndpointInfo, EndpointInfo> createEndpoint(String name, EndpointType endpointType) {
    return createEndpoint(new CreateEndpoint().setName(name).setEndpointType(endpointType));
  }

  /**
   * Create an endpoint.
   *
   * <p>Create a new endpoint.
   */
  public Wait<EndpointInfo, EndpointInfo> createEndpoint(CreateEndpoint request) {
    EndpointInfo response = impl.createEndpoint(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetEndpointVectorSearchEndpointOnline(response.getName(), timeout, callback),
        response);
  }

  public void deleteEndpoint(String endpointName) {
    deleteEndpoint(new DeleteEndpointRequest().setEndpointName(endpointName));
  }

  /** Delete an endpoint. */
  public void deleteEndpoint(DeleteEndpointRequest request) {
    impl.deleteEndpoint(request);
  }

  public EndpointInfo getEndpoint(String endpointName) {
    return getEndpoint(new GetEndpointRequest().setEndpointName(endpointName));
  }

  /** Get an endpoint. */
  public EndpointInfo getEndpoint(GetEndpointRequest request) {
    return impl.getEndpoint(request);
  }

  /** List all endpoints. */
  public Iterable<EndpointInfo> listEndpoints(ListEndpointsRequest request) {
    return new Paginator<>(
        request,
        impl::listEndpoints,
        ListEndpointResponse::getEndpoints,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public VectorSearchEndpointsService impl() {
    return impl;
  }
}
