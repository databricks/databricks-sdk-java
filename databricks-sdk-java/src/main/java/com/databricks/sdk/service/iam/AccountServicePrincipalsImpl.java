// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;



/** Package-local implementation of AccountServicePrincipals */
@Generated
class AccountServicePrincipalsImpl implements AccountServicePrincipalsService {
  private final ApiClient apiClient;

  public AccountServicePrincipalsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
	
  @Override
  public ServicePrincipal create(ServicePrincipal request) {
    String path = String.format("/api/2.0/accounts/%s/scim/v2/ServicePrincipals", apiClient.configuredAccountID());
    return apiClient.POST(path, request, ServicePrincipal.class);
  }
  
  @Override
  public void delete(DeleteAccountServicePrincipalRequest request) {
    String path = String.format("/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s", apiClient.configuredAccountID(), request.getId());
    apiClient.DELETE(path, request, Void.class);
    
  }
  
  @Override
  public ServicePrincipal get(GetAccountServicePrincipalRequest request) {
    String path = String.format("/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s", apiClient.configuredAccountID(), request.getId());
    return apiClient.GET(path, request, ServicePrincipal.class);
  }
  
  @Override
  public ListServicePrincipalResponse list(ListAccountServicePrincipalsRequest request) {
    String path = String.format("/api/2.0/accounts/%s/scim/v2/ServicePrincipals", apiClient.configuredAccountID());
    return apiClient.GET(path, request, ListServicePrincipalResponse.class);
  }
  
  @Override
  public void patch(PartialUpdate request) {
    String path = String.format("/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s", apiClient.configuredAccountID(), request.getId());
    apiClient.PATCH(path, request, Void.class);
    
  }
  
  @Override
  public void update(ServicePrincipal request) {
    String path = String.format("/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s", apiClient.configuredAccountID(), request.getId());
    apiClient.PUT(path, request, Void.class);
    
  }
  
}