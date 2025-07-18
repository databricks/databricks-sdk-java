// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controls whether to enable the compliance security profile for the current workspace. Enabling it
 * on a workspace is permanent. By default, it is turned off.
 *
 * <p>This settings can NOT be disabled once it is enabled.
 */
@Generated
public class ComplianceSecurityProfileAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ComplianceSecurityProfileAPI.class);

  private final ComplianceSecurityProfileService impl;

  /** Regular-use constructor */
  public ComplianceSecurityProfileAPI(ApiClient apiClient) {
    impl = new ComplianceSecurityProfileImpl(apiClient);
  }

  /** Constructor for mocks */
  public ComplianceSecurityProfileAPI(ComplianceSecurityProfileService mock) {
    impl = mock;
  }

  /** Gets the compliance security profile setting. */
  public ComplianceSecurityProfileSetting get(GetComplianceSecurityProfileSettingRequest request) {
    return impl.get(request);
  }

  /**
   * Updates the compliance security profile setting for the workspace. A fresh etag needs to be
   * provided in `PATCH` requests (as part of the setting field). The etag can be retrieved by
   * making a `GET` request before the `PATCH` request. If the setting is updated concurrently,
   * `PATCH` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  public ComplianceSecurityProfileSetting update(
      UpdateComplianceSecurityProfileSettingRequest request) {
    return impl.update(request);
  }

  public ComplianceSecurityProfileService impl() {
    return impl;
  }
}
