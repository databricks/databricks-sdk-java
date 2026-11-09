// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * ServerlessCompute Service API.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ServerlessComputeServiceService {
  /**
   * Lists Interactive serverless computes that the caller can use or manage. Results are returned
   * in an unspecified order.
   */
  ListServerlessComputesResponse list(ListServerlessComputesRequest listServerlessComputesRequest);

  /**
   * Lists compute policies in the workspace. Results are returned in an unspecified order; callers
   * should sort client-side if a specific order is needed.
   */
  ListComputePoliciesResponse listComputePolicies(
      ListComputePoliciesRequest listComputePoliciesRequest);
}
