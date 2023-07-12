// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;



/** Package-local implementation of InstanceProfiles */
@Generated
class InstanceProfilesImpl implements InstanceProfilesService {
  private final ApiClient apiClient;

  public InstanceProfilesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
	
  @Override
  public void add(AddInstanceProfile request) {
    String path = "/api/2.0/instance-profiles/add";
    apiClient.POST(path, request, Void.class);
    
  }
  
  @Override
  public void edit(InstanceProfile request) {
    String path = "/api/2.0/instance-profiles/edit";
    apiClient.POST(path, request, Void.class);
    
  }
  
  @Override
  public ListInstanceProfilesResponse list() {
    String path = "/api/2.0/instance-profiles/list";
    return apiClient.GET(path, ListInstanceProfilesResponse.class);
  }
  
  @Override
  public void remove(RemoveInstanceProfile request) {
    String path = "/api/2.0/instance-profiles/remove";
    apiClient.POST(path, request, Void.class);
    
  }
  
}