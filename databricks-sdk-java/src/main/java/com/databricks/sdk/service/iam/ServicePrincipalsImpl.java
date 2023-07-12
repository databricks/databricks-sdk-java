// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;



/** Package-local implementation of ServicePrincipals */
@Generated
class ServicePrincipalsImpl implements ServicePrincipalsService {
  private final ApiClient apiClient;

  public ServicePrincipalsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
	
  @Override
  public ServicePrincipal create(ServicePrincipal request) {
    String path = "/api/2.0/preview/scim/v2/ServicePrincipals";
    return apiClient.POST(path, request, ServicePrincipal.class);
  }
  
  @Override
  public void delete(DeleteServicePrincipalRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/ServicePrincipals/%s", request.getId());
    apiClient.DELETE(path, request, Void.class);
    
  }
  
  @Override
  public ServicePrincipal get(GetServicePrincipalRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/ServicePrincipals/%s", request.getId());
    return apiClient.GET(path, request, ServicePrincipal.class);
  }
  
  @Override
  public ListServicePrincipalResponse list(ListServicePrincipalsRequest request) {
    String path = "/api/2.0/preview/scim/v2/ServicePrincipals";
    return apiClient.GET(path, request, ListServicePrincipalResponse.class);
  }
  
  @Override
  public void patch(PartialUpdate request) {
    String path = String.format("/api/2.0/preview/scim/v2/ServicePrincipals/%s", request.getId());
    apiClient.PATCH(path, request, Void.class);
    
  }
  
  @Override
  public void update(ServicePrincipal request) {
    String path = String.format("/api/2.0/preview/scim/v2/ServicePrincipals/%s", request.getId());
    apiClient.PUT(path, request, Void.class);
    
  }
  
}