// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/**
 * These APIs enable administrators to enroll OAuth for their accounts, which is required for
 * adding/using any OAuth published/custom application integration.
 *
 * <p>**Note:** Your account must be on the E2 version to use these APIs, this is because OAuth is
 * only supported on the E2 version.
 */
public class OAuthEnrollmentAPI {
  private final OAuthEnrollmentService impl;

  /** Regular-use constructor */
  public OAuthEnrollmentAPI(ApiClient apiClient) {
    impl = new OAuthEnrollmentImpl(apiClient);
  }

  /** Constructor for mocks */
  public OAuthEnrollmentAPI(OAuthEnrollmentService mock) {
    impl = mock;
  }

  /**
   * Create OAuth Enrollment request.
   *
   * <p>Create an OAuth Enrollment request to enroll OAuth for this account and optionally enable
   * the OAuth integration for all the partner applications in the account.
   *
   * <p>The parter applications are: - Power BI - Tableau Desktop - Databricks CLI
   *
   * <p>The enrollment is executed asynchronously, so the API will return 204 immediately. The
   * actual enrollment take a few minutes, you can check the status via API :method:get.
   */
  public void create(CreateOAuthEnrollment request) {
    impl.create(request);
  }

  /**
   * Get OAuth enrollment status.
   *
   * <p>Gets the OAuth enrollment status for this Account.
   *
   * <p>You can only add/use the OAuth published/custom application integrations when OAuth
   * enrollment status is enabled.
   */
  public OAuthEnrollmentStatus get() {
    return impl.get();
  }

  public OAuthEnrollmentService impl() {
    return impl;
  }
}
