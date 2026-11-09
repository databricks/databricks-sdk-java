// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/** ServerlessCompute Service API. */
@Generated
public class ServerlessComputeServiceAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ServerlessComputeServiceAPI.class);

  private final ServerlessComputeServiceService impl;

  /** Regular-use constructor */
  public ServerlessComputeServiceAPI(ApiClient apiClient) {
    impl = new ServerlessComputeServiceImpl(apiClient);
  }

  /** Constructor for mocks */
  public ServerlessComputeServiceAPI(ServerlessComputeServiceService mock) {
    impl = mock;
  }

  /**
   * Lists Interactive serverless computes that the caller can use or manage. Results are returned
   * in an unspecified order.
   */
  public Iterable<ServerlessCompute> list(ListServerlessComputesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::list,
        ListServerlessComputesResponse::getServerlessComputes,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Lists compute policies in the workspace. Results are returned in an unspecified order; callers
   * should sort client-side if a specific order is needed.
   */
  public Iterable<ComputePolicy> listComputePolicies(ListComputePoliciesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listComputePolicies,
        ListComputePoliciesResponse::getComputePolicies,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public ServerlessComputeServiceService impl() {
    return impl;
  }
}
