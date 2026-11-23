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
  /** Creates a custom compute policy in the workspace. */
  ComputePolicy createComputePolicy(CreateComputePolicyRequest createComputePolicyRequest);

  /**
   * Deletes a custom compute policy in the workspace. Default (system-provisioned) policies cannot
   * be deleted.
   */
  void deleteComputePolicy(DeleteComputePolicyRequest deleteComputePolicyRequest);

  /** Retrieves a compute policy by its ID. */
  ComputePolicy getComputePolicy(GetComputePolicyRequest getComputePolicyRequest);

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

  /**
   * Updates a custom compute policy in the workspace. The display_name and allowed_compute_products
   * are mutable; use update_mask to control which fields change. Default (system-provisioned)
   * policies cannot be updated.
   */
  ComputePolicy updateComputePolicy(UpdateComputePolicyRequest updateComputePolicyRequest);
}
