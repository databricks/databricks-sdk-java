// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage access rules on resources in an account. Currently, only grant rules are
 * supported. A grant rule specifies a role assigned to a set of principals. A list of rules
 * attached to a resource is called a rule set.
 */
@Generated
public class AccountAccessControlAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountAccessControlAPI.class);

  private final AccountAccessControlService impl;

  /** Regular-use constructor */
  public AccountAccessControlAPI(ApiClient apiClient) {
    impl = new AccountAccessControlImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccountAccessControlAPI(AccountAccessControlService mock) {
    impl = mock;
  }

  public GetAssignableRolesForResourceResponse getAssignableRolesForResource(String resource) {
    return getAssignableRolesForResource(
        new GetAssignableRolesForResourceRequest().setResource(resource));
  }

  /**
   * Gets all the roles that can be granted on an account level resource. A role is grantable if the
   * rule set on the resource can contain an access rule of the role.
   */
  public GetAssignableRolesForResourceResponse getAssignableRolesForResource(
      GetAssignableRolesForResourceRequest request) {
    return impl.getAssignableRolesForResource(request);
  }

  public RuleSetResponse getRuleSet(String name, String etag) {
    return getRuleSet(new GetRuleSetRequest().setName(name).setEtag(etag));
  }

  /**
   * Get a rule set by its name. A rule set is always attached to a resource and contains a list of
   * access rules on the said resource. Currently only a default rule set for each resource is
   * supported.
   */
  public RuleSetResponse getRuleSet(GetRuleSetRequest request) {
    return impl.getRuleSet(request);
  }

  /**
   * Replace the rules of a rule set. First, use get to read the current version of the rule set
   * before modifying it. This pattern helps prevent conflicts between concurrent updates.
   */
  public RuleSetResponse updateRuleSet(UpdateRuleSetRequest request) {
    return impl.updateRuleSet(request);
  }

  public AccountAccessControlService impl() {
    return impl;
  }
}
