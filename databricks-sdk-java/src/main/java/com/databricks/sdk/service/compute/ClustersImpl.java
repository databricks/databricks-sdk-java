// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;



/** Package-local implementation of Clusters */
@Generated
class ClustersImpl implements ClustersService {
  private final ApiClient apiClient;

  public ClustersImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
	
  @Override
  public void changeOwner(ChangeClusterOwner request) {
    String path = "/api/2.0/clusters/change-owner";
    apiClient.POST(path, request, Void.class);
    
  }
  
  @Override
  public CreateClusterResponse create(CreateCluster request) {
    String path = "/api/2.0/clusters/create";
    return apiClient.POST(path, request, CreateClusterResponse.class);
  }
  
  @Override
  public void delete(DeleteCluster request) {
    String path = "/api/2.0/clusters/delete";
    apiClient.POST(path, request, Void.class);
    
  }
  
  @Override
  public void edit(EditCluster request) {
    String path = "/api/2.0/clusters/edit";
    apiClient.POST(path, request, Void.class);
    
  }
  
  @Override
  public GetEventsResponse events(GetEvents request) {
    String path = "/api/2.0/clusters/events";
    return apiClient.POST(path, request, GetEventsResponse.class);
  }
  
  @Override
  public ClusterDetails get(GetClusterRequest request) {
    String path = "/api/2.0/clusters/get";
    return apiClient.GET(path, request, ClusterDetails.class);
  }
  
  @Override
  public ListClustersResponse list(ListClustersRequest request) {
    String path = "/api/2.0/clusters/list";
    return apiClient.GET(path, request, ListClustersResponse.class);
  }
  
  @Override
  public ListNodeTypesResponse listNodeTypes() {
    String path = "/api/2.0/clusters/list-node-types";
    return apiClient.GET(path, ListNodeTypesResponse.class);
  }
  
  @Override
  public ListAvailableZonesResponse listZones() {
    String path = "/api/2.0/clusters/list-zones";
    return apiClient.GET(path, ListAvailableZonesResponse.class);
  }
  
  @Override
  public void permanentDelete(PermanentDeleteCluster request) {
    String path = "/api/2.0/clusters/permanent-delete";
    apiClient.POST(path, request, Void.class);
    
  }
  
  @Override
  public void pin(PinCluster request) {
    String path = "/api/2.0/clusters/pin";
    apiClient.POST(path, request, Void.class);
    
  }
  
  @Override
  public void resize(ResizeCluster request) {
    String path = "/api/2.0/clusters/resize";
    apiClient.POST(path, request, Void.class);
    
  }
  
  @Override
  public void restart(RestartCluster request) {
    String path = "/api/2.0/clusters/restart";
    apiClient.POST(path, request, Void.class);
    
  }
  
  @Override
  public GetSparkVersionsResponse sparkVersions() {
    String path = "/api/2.0/clusters/spark-versions";
    return apiClient.GET(path, GetSparkVersionsResponse.class);
  }
  
  @Override
  public void start(StartCluster request) {
    String path = "/api/2.0/clusters/start";
    apiClient.POST(path, request, Void.class);
    
  }
  
  @Override
  public void unpin(UnpinCluster request) {
    String path = "/api/2.0/clusters/unpin";
    apiClient.POST(path, request, Void.class);
    
  }
  
}