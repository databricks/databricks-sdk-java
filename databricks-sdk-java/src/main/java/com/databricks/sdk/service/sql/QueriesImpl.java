// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;



/** Package-local implementation of Queries */
@Generated
class QueriesImpl implements QueriesService {
  private final ApiClient apiClient;

  public QueriesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
	
  @Override
  public Query create(QueryPostContent request) {
    String path = "/api/2.0/preview/sql/queries";
    return apiClient.POST(path, request, Query.class);
  }
  
  @Override
  public void delete(DeleteQueryRequest request) {
    String path = String.format("/api/2.0/preview/sql/queries/%s", request.getQueryId());
    apiClient.DELETE(path, request, Void.class);
    
  }
  
  @Override
  public Query get(GetQueryRequest request) {
    String path = String.format("/api/2.0/preview/sql/queries/%s", request.getQueryId());
    return apiClient.GET(path, request, Query.class);
  }
  
  @Override
  public QueryList list(ListQueriesRequest request) {
    String path = "/api/2.0/preview/sql/queries";
    return apiClient.GET(path, request, QueryList.class);
  }
  
  @Override
  public void restore(RestoreQueryRequest request) {
    String path = String.format("/api/2.0/preview/sql/queries/trash/%s", request.getQueryId());
    apiClient.POST(path, request, Void.class);
    
  }
  
  @Override
  public Query update(QueryEditContent request) {
    String path = String.format("/api/2.0/preview/sql/queries/%s", request.getQueryId());
    return apiClient.POST(path, request, Query.class);
  }
  
}