// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of QueriesLegacy */
@Generated
class QueriesLegacyImpl implements QueriesLegacyService {
  private final ApiClient apiClient;

  public QueriesLegacyImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public LegacyQuery create(QueryPostContent request) {
    String path = "/api/2.0/preview/sql/queries";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, LegacyQuery.class, headers);
  }

  @Override
  public void delete(DeleteQueriesLegacyRequest request) {
    String path = String.format("/api/2.0/preview/sql/queries/%s", request.getQueryId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public LegacyQuery get(GetQueriesLegacyRequest request) {
    String path = String.format("/api/2.0/preview/sql/queries/%s", request.getQueryId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, LegacyQuery.class, headers);
  }

  @Override
  public QueryList list(ListQueriesLegacyRequest request) {
    String path = "/api/2.0/preview/sql/queries";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, QueryList.class, headers);
  }

  @Override
  public void restore(RestoreQueriesLegacyRequest request) {
    String path = String.format("/api/2.0/preview/sql/queries/trash/%s", request.getQueryId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.POST(path, null, RestoreResponse.class, headers);
  }

  @Override
  public LegacyQuery update(QueryEditContent request) {
    String path = String.format("/api/2.0/preview/sql/queries/%s", request.getQueryId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, LegacyQuery.class, headers);
  }
}
