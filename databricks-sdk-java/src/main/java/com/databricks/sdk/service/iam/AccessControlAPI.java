// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Rule based Access Control for Databricks Resources. */
@Generated
public class AccessControlAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccessControlAPI.class);

  private final AccessControlService impl;

  /** Regular-use constructor */
  public AccessControlAPI(ApiClient apiClient) {
    impl = new AccessControlImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccessControlAPI(AccessControlService mock) {
    impl = mock;
  }

  public CheckPolicyResponse checkPolicy(
      Actor actor,
      String permission,
      String resource,
      ConsistencyToken consistencyToken,
      RequestAuthzIdentity authzIdentity) {
    return checkPolicy(
        new CheckPolicyRequest()
            .setActor(actor)
            .setPermission(permission)
            .setResource(resource)
            .setConsistencyToken(consistencyToken)
            .setAuthzIdentity(authzIdentity));
  }

  public CheckPolicyResponse checkPolicy(CheckPolicyRequest request) {
    return impl.checkPolicy(request);
  }

  public AccessControlService impl() {
    return impl;
  }
}
