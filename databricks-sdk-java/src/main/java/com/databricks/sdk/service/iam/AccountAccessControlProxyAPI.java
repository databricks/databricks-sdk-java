// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage access rules on resources in an account. Currently, only grant rules are
 * supported. A grant rule specifies a role assigned to a set of principals. A list of rules
 * attached to a resource is called a rule set. A workspace must belong to an account for these APIs
 * to work.
 */
@Generated
public class AccountAccessControlProxyAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountAccessControlProxyAPI.class);

  private final AccountAccessControlProxyService impl;

  /** Regular-use constructor */
  public AccountAccessControlProxyAPI(ApiClient apiClient) {
    impl = new AccountAccessControlProxyImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccountAccessControlProxyAPI(AccountAccessControlProxyService mock) {
    impl = mock;
  }

  public GetAssignableRolesForResourceResponse getAssignableRolesForResource(String resource) {
    return getAssignableRolesForResource(
        new GetAssignableRolesForResourceRequest().setResource(resource));
  }

  /**
   * Get assignable roles for a resource.
   *
   * <p>Gets all the roles that can be granted on an account-level resource. A role is grantable if
   * the rule set on the resource can contain an access rule of the role.
   */
  public GetAssignableRolesForResourceResponse getAssignableRolesForResource(
      GetAssignableRolesForResourceRequest request) {
    return impl.getAssignableRolesForResource(request);
  }

  public RuleSetResponse getRuleSet(String name, String etag) {
    return getRuleSet(new GetRuleSetRequest().setName(name).setEtag(etag));
  }

  /**
   * Get a rule set.
   *
   * <p>Get a rule set by its name. A rule set is always attached to a resource and contains a list
   * of access rules on the said resource. Currently only a default rule set for each resource is
   * supported.
   */
  public RuleSetResponse getRuleSet(GetRuleSetRequest request) {
    return impl.getRuleSet(request);
  }

  public RuleSetResponse updateRuleSet(String name, RuleSetUpdateRequest ruleSet) {
    return updateRuleSet(new UpdateRuleSetRequest().setName(name).setRuleSet(ruleSet));
  }

  /**
   * Update a rule set.
   *
   * <p>Replace the rules of a rule set. First, use a GET rule set request to read the current
   * version of the rule set before modifying it. This pattern helps prevent conflicts between
   * concurrent updates.
   */
  public RuleSetResponse updateRuleSet(UpdateRuleSetRequest request) {
    return impl.updateRuleSet(request);
  }

  public AccountAccessControlProxyService impl() {
    return impl;
  }
}
