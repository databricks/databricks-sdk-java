// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of OAuthEnrollment */
class OAuthEnrollmentImpl implements OAuthEnrollmentService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for OAuthEnrollmentImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public OAuthEnrollmentImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public void create(CreateOAuthEnrollment request) {
    String path =
        String.format("/api/2.0/accounts/%s/oauth2/enrollment", apiClient.configuredAccountID());
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public OAuthEnrollmentStatus get() {
    String path =
        String.format("/api/2.0/accounts/%s/oauth2/enrollment", apiClient.configuredAccountID());
    return apiClient.GET(path, OAuthEnrollmentStatus.class);
  }
}
