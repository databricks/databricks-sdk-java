// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of ServicePrincipals */
class ServicePrincipalsImpl implements ServicePrincipalsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for ServicePrincipalsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public ServicePrincipalsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public ServicePrincipal create(ServicePrincipal request) {
    String path = "/api/2.0/preview/scim/v2/ServicePrincipals";
    return apiClient.POST(path, request, ServicePrincipal.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteServicePrincipalRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/ServicePrincipals/%s", request.getId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public ServicePrincipal get(GetServicePrincipalRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/ServicePrincipals/%s", request.getId());
    return apiClient.GET(path, request, ServicePrincipal.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListServicePrincipalResponse list(ListServicePrincipalsRequest request) {
    String path = "/api/2.0/preview/scim/v2/ServicePrincipals";
    return apiClient.GET(path, request, ListServicePrincipalResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void patch(PartialUpdate request) {
    String path = String.format("/api/2.0/preview/scim/v2/ServicePrincipals/%s", request.getId());
    apiClient.PATCH(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void update(ServicePrincipal request) {
    String path = String.format("/api/2.0/preview/scim/v2/ServicePrincipals/%s", request.getId());
    apiClient.PUT(path, request, Void.class);
  }
}
