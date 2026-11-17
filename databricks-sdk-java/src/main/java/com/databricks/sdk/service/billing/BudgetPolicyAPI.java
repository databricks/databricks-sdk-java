// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/** A service serves REST API about Budget policies */
@Generated
public class BudgetPolicyAPI {
  private static final Logger LOG = LoggerFactory.getLogger(BudgetPolicyAPI.class);

  private final BudgetPolicyService impl;

  /** Regular-use constructor */
  public BudgetPolicyAPI(ApiClient apiClient) {
    impl = new BudgetPolicyImpl(apiClient);
  }

  /** Constructor for mocks */
  public BudgetPolicyAPI(BudgetPolicyService mock) {
    impl = mock;
  }

  /** Creates a new usage policy. The creator is granted the manager role on the new policy. */
  public BudgetPolicy create(CreateBudgetPolicyRequest request) {
    return impl.create(request);
  }

  public void delete(String policyId) {
    delete(new DeleteBudgetPolicyRequest().setPolicyId(policyId));
  }

  /** Deletes a usage policy. */
  public void delete(DeleteBudgetPolicyRequest request) {
    impl.delete(request);
  }

  public BudgetPolicy get(String policyId) {
    return get(new GetBudgetPolicyRequest().setPolicyId(policyId));
  }

  /** Retrieves a usage policy by its ID. */
  public BudgetPolicy get(GetBudgetPolicyRequest request) {
    return impl.get(request);
  }

  /**
   * Lists the usage policies that the caller has permission to view. Policies are sorted by name in
   * ascending order unless `sort_spec` requests a different order.
   */
  public Iterable<BudgetPolicy> list(ListBudgetPoliciesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::list,
        ListBudgetPoliciesResponse::getPolicies,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Updates a usage policy. Changes apply only to serverless usage that starts after the update,
   * not to workloads that are already running.
   */
  public BudgetPolicy update(UpdateBudgetPolicyRequest request) {
    return impl.update(request);
  }

  public BudgetPolicyService impl() {
    return impl;
  }
}
