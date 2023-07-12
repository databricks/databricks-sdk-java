// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;



/** Package-local implementation of AccountGroups */
@Generated
class AccountGroupsImpl implements AccountGroupsService {
  private final ApiClient apiClient;

  public AccountGroupsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
	
  @Override
  public Group create(Group request) {
    String path = String.format("/api/2.0/accounts/%s/scim/v2/Groups", apiClient.configuredAccountID());
    return apiClient.POST(path, request, Group.class);
  }
  
  @Override
  public void delete(DeleteAccountGroupRequest request) {
    String path = String.format("/api/2.0/accounts/%s/scim/v2/Groups/%s", apiClient.configuredAccountID(), request.getId());
    apiClient.DELETE(path, request, Void.class);
    
  }
  
  @Override
  public Group get(GetAccountGroupRequest request) {
    String path = String.format("/api/2.0/accounts/%s/scim/v2/Groups/%s", apiClient.configuredAccountID(), request.getId());
    return apiClient.GET(path, request, Group.class);
  }
  
  @Override
  public ListGroupsResponse list(ListAccountGroupsRequest request) {
    String path = String.format("/api/2.0/accounts/%s/scim/v2/Groups", apiClient.configuredAccountID());
    return apiClient.GET(path, request, ListGroupsResponse.class);
  }
  
  @Override
  public void patch(PartialUpdate request) {
    String path = String.format("/api/2.0/accounts/%s/scim/v2/Groups/%s", apiClient.configuredAccountID(), request.getId());
    apiClient.PATCH(path, request, Void.class);
    
  }
  
  @Override
  public void update(Group request) {
    String path = String.format("/api/2.0/accounts/%s/scim/v2/Groups/%s", apiClient.configuredAccountID(), request.getId());
    apiClient.PUT(path, request, Void.class);
    
  }
  
}