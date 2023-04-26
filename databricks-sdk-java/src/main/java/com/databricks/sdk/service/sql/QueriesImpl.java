// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Queries */
class QueriesImpl implements QueriesService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for QueriesImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public QueriesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public Query create(QueryPostContent request) {
    String path = "/api/2.0/preview/sql/queries";
    return apiClient.POST(path, request, Query.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteQueryRequest request) {
    String path = String.format("/api/2.0/preview/sql/queries/%s", request.getQueryId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public Query get(GetQueryRequest request) {
    String path = String.format("/api/2.0/preview/sql/queries/%s", request.getQueryId());
    return apiClient.GET(path, request, Query.class);
  }

  /** {@inheritDoc} */
  @Override
  public QueryList list(ListQueriesRequest request) {
    String path = "/api/2.0/preview/sql/queries";
    return apiClient.GET(path, request, QueryList.class);
  }

  /** {@inheritDoc} */
  @Override
  public void restore(RestoreQueryRequest request) {
    String path = String.format("/api/2.0/preview/sql/queries/trash/%s", request.getQueryId());
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public Query update(QueryEditContent request) {
    String path = String.format("/api/2.0/preview/sql/queries/%s", request.getQueryId());
    return apiClient.POST(path, request, Query.class);
  }
}
