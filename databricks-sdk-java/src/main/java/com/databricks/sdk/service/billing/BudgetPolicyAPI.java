// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

  /** Creates a new policy. */
  public BudgetPolicy create(CreateBudgetPolicyRequest request) {
    return impl.create(request);
  }

  public void delete(String policyId) {
    delete(new DeleteBudgetPolicyRequest().setPolicyId(policyId));
  }

  /** Deletes a policy */
  public void delete(DeleteBudgetPolicyRequest request) {
    impl.delete(request);
  }

  public BudgetPolicy get(String policyId) {
    return get(new GetBudgetPolicyRequest().setPolicyId(policyId));
  }

  /** Retrieves a policy by it's ID. */
  public BudgetPolicy get(GetBudgetPolicyRequest request) {
    return impl.get(request);
  }

  /**
   * Lists all policies. Policies are returned in the alphabetically ascending order of their names.
   */
  public Iterable<BudgetPolicy> list(ListBudgetPoliciesRequest request) {
    return new Paginator<>(
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

  public BudgetPolicy update(String policyId, BudgetPolicy policy) {
    return update(new UpdateBudgetPolicyRequest().setPolicyId(policyId).setPolicy(policy));
  }

  /** Updates a policy */
  public BudgetPolicy update(UpdateBudgetPolicyRequest request) {
    return impl.update(request);
  }

  public BudgetPolicyService impl() {
    return impl;
  }
}
