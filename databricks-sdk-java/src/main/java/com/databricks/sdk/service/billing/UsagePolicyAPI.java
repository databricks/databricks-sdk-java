// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** A service serves REST API about Usage policies */
@Generated
public class UsagePolicyAPI {
  private static final Logger LOG = LoggerFactory.getLogger(UsagePolicyAPI.class);

  private final UsagePolicyService impl;

  /** Regular-use constructor */
  public UsagePolicyAPI(ApiClient apiClient) {
    impl = new UsagePolicyImpl(apiClient);
  }

  /** Constructor for mocks */
  public UsagePolicyAPI(UsagePolicyService mock) {
    impl = mock;
  }

  /** Creates a new usage policy. */
  public UsagePolicy create(CreateUsagePolicyRequest request) {
    return impl.create(request);
  }

  public void delete(String policyId) {
    delete(new DeleteUsagePolicyRequest().setPolicyId(policyId));
  }

  /** Deletes a usage policy */
  public void delete(DeleteUsagePolicyRequest request) {
    impl.delete(request);
  }

  public UsagePolicy get(String policyId) {
    return get(new GetUsagePolicyRequest().setPolicyId(policyId));
  }

  /** Retrieves a usage policy by it's ID. */
  public UsagePolicy get(GetUsagePolicyRequest request) {
    return impl.get(request);
  }

  /**
   * Lists all usage policies. Policies are returned in the alphabetically ascending order of their
   * names.
   */
  public Iterable<UsagePolicy> list(ListUsagePoliciesRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListUsagePoliciesResponse::getPolicies,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Updates a usage policy */
  public UsagePolicy update(UpdateUsagePolicyRequest request) {
    return impl.update(request);
  }

  public UsagePolicyService impl() {
    return impl;
  }
}
