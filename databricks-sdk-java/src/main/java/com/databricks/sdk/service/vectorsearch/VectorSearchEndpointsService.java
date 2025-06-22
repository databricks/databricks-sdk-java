// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;

/**
 * **Endpoint**: Represents the compute resources to host vector search indexes.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface VectorSearchEndpointsService {
  /** Create a new endpoint. */
  EndpointInfo createEndpoint(CreateEndpoint createEndpoint);

  /** Delete a vector search endpoint. */
  void deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest);

  /** Get details for a single vector search endpoint. */
  EndpointInfo getEndpoint(GetEndpointRequest getEndpointRequest);

  /** List all vector search endpoints in the workspace. */
  ListEndpointResponse listEndpoints(ListEndpointsRequest listEndpointsRequest);

  /** Update the budget policy of an endpoint */
  PatchEndpointBudgetPolicyResponse updateEndpointBudgetPolicy(
      PatchEndpointBudgetPolicyRequest patchEndpointBudgetPolicyRequest);

  UpdateEndpointCustomTagsResponse updateEndpointCustomTags(
      UpdateEndpointCustomTagsRequest updateEndpointCustomTagsRequest);
}
