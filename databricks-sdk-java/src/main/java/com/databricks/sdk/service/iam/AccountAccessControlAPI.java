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

  public RuleSetResponse get(String name, String etag) {
    return get(new GetAccountAccessControlRequest().setName(name).setEtag(etag));
  }

  /**
   * Get a rule set.
   *
   * <p>Get a rule set by its name. A rule set is always attached to a resource and contains a list
   * of access rules on the said resource. Currently only a default rule set for each resource is
   * supported.
   */
  public RuleSetResponse get(GetAccountAccessControlRequest request) {
    return impl.get(request);
  }

  public GetAssignableRolesForResourceResponse list(String name) {
    return list(new ListAccountAccessControlRequest().setName(name));
  }

  /**
   * List assignable roles on a resource.
   *
   * <p>Gets all the roles that can be granted on an account level resource. A role is grantable if
   * the rule set on the resource can contain an access rule of the role.
   */
  public GetAssignableRolesForResourceResponse list(ListAccountAccessControlRequest request) {
    return impl.list(request);
  }

  public RuleSetResponse update(String name, RuleSetUpdateRequest ruleSet, String etag) {
    return update(new UpdateRuleSetRequest().setName(name).setRuleSet(ruleSet).setEtag(etag));
  }

  /**
   * Update a rule set.
   *
   * <p>Replace the rules of a rule set. First, use get to read the current version of the rule set
   * before modifying it. This pattern helps prevent conflicts between concurrent updates.
   */
  public RuleSetResponse update(UpdateRuleSetRequest request) {
    return impl.update(request);
  }

  public AccountAccessControlService impl() {
    return impl;
  }
}
