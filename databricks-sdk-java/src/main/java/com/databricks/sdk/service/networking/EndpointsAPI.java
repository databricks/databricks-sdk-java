// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.networking;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** These APIs manage endpoint configurations for this account. */
@Generated
public class EndpointsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(EndpointsAPI.class);

  private final EndpointsService impl;

  /** Regular-use constructor */
  public EndpointsAPI(ApiClient apiClient) {
    impl = new EndpointsImpl(apiClient);
  }

  /** Constructor for mocks */
  public EndpointsAPI(EndpointsService mock) {
    impl = mock;
  }

  /**
   * Creates a new network connectivity endpoint that enables private connectivity between your
   * network resources and Databricks services.
   *
   * <p>After creation, the endpoint is initially in the PENDING state. The Databricks endpoint
   * service automatically reviews and approves the endpoint within a few minutes. Use the GET
   * method to retrieve the latest endpoint state.
   *
   * <p>An endpoint can be used only after it reaches the APPROVED state.
   */
  public Endpoint createEndpoint(CreateEndpointRequest request) {
    return impl.createEndpoint(request);
  }

  public void deleteEndpoint(String name) {
    deleteEndpoint(new DeleteEndpointRequest().setName(name));
  }

  /**
   * Deletes a network endpoint. This will remove the endpoint configuration from Databricks.
   * Depending on the endpoint type and use case, you may also need to delete corresponding network
   * resources in your cloud provider account.
   */
  public void deleteEndpoint(DeleteEndpointRequest request) {
    impl.deleteEndpoint(request);
  }

  public Endpoint getEndpoint(String name) {
    return getEndpoint(new GetEndpointRequest().setName(name));
  }

  /** Gets details of a specific network endpoint. */
  public Endpoint getEndpoint(GetEndpointRequest request) {
    return impl.getEndpoint(request);
  }

  public Iterable<Endpoint> listEndpoints(String parent) {
    return listEndpoints(new ListEndpointsRequest().setParent(parent));
  }

  /** Lists all network connectivity endpoints for the account. */
  public Iterable<Endpoint> listEndpoints(ListEndpointsRequest request) {
    return new Paginator<>(
        request,
        impl::listEndpoints,
        ListEndpointsResponse::getItems,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public EndpointsService impl() {
    return impl;
  }
}
