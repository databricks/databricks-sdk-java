// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;

/**
 * **Endpoint**: Represents the compute resources to host AI Search indexes.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface VectorSearchEndpointsService {
  /** Create a new endpoint. */
  EndpointInfo createEndpoint(CreateEndpoint createEndpoint);

  /** Delete an AI Search endpoint. */
  void deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest);

  /** Get details for a single AI Search endpoint. */
  EndpointInfo getEndpoint(GetEndpointRequest getEndpointRequest);

  /** Gets the permission levels that a user can have on an object. */
  GetVectorSearchEndpointPermissionLevelsResponse getPermissionLevels(
      GetVectorSearchEndpointPermissionLevelsRequest
          getVectorSearchEndpointPermissionLevelsRequest);

  /**
   * Gets the permissions of a vector search endpoint. Vector search endpoints can inherit
   * permissions from their root object.
   */
  VectorSearchEndpointPermissions getPermissions(
      GetVectorSearchEndpointPermissionsRequest getVectorSearchEndpointPermissionsRequest);

  /** List all AI Search endpoints in the workspace. */
  ListEndpointResponse listEndpoints(ListEndpointsRequest listEndpointsRequest);

  /** Update an endpoint */
  EndpointInfo patchEndpoint(PatchEndpointRequest patchEndpointRequest);

  /** Retrieve user-visible metrics for an endpoint */
  RetrieveUserVisibleMetricsResponse retrieveUserVisibleMetrics(
      RetrieveUserVisibleMetricsRequest retrieveUserVisibleMetricsRequest);

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  VectorSearchEndpointPermissions setPermissions(
      VectorSearchEndpointPermissionsRequest vectorSearchEndpointPermissionsRequest);

  /** Update the budget policy of an endpoint */
  PatchEndpointBudgetPolicyResponse updateEndpointBudgetPolicy(
      PatchEndpointBudgetPolicyRequest patchEndpointBudgetPolicyRequest);

  /** Update the custom tags of an endpoint. */
  UpdateEndpointCustomTagsResponse updateEndpointCustomTags(
      UpdateEndpointCustomTagsRequest updateEndpointCustomTagsRequest);

  /**
   * Updates the permissions on a vector search endpoint. Vector search endpoints can inherit
   * permissions from their root object.
   */
  VectorSearchEndpointPermissions updatePermissions(
      VectorSearchEndpointPermissionsRequest vectorSearchEndpointPermissionsRequest);
}
