// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;

/**
 * These APIs manage endpoint configurations for this account.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface EndpointsService {
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
  Endpoint createEndpoint(CreateEndpointRequest createEndpointRequest);

  /**
   * Deletes a network endpoint. This will remove the endpoint configuration from Databricks.
   * Depending on the endpoint type and use case, you may also need to delete corresponding network
   * resources in your cloud provider account.
   */
  void deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest);

  /** Gets details of a specific network endpoint. */
  Endpoint getEndpoint(GetEndpointRequest getEndpointRequest);

  /** Lists all network connectivity endpoints for the account. */
  ListEndpointsResponse listEndpoints(ListEndpointsRequest listEndpointsRequest);
}
