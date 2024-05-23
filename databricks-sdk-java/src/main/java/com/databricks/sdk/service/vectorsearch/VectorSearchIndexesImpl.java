// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of VectorSearchIndexes */
@Generated
class VectorSearchIndexesImpl implements VectorSearchIndexesService {
  private final ApiClient apiClient;

  public VectorSearchIndexesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateVectorIndexResponse createIndex(CreateVectorIndexRequest request) {
    String path = "/api/2.0/vector-search/indexes";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateVectorIndexResponse.class, headers);
  }

  @Override
  public DeleteDataVectorIndexResponse deleteDataVectorIndex(DeleteDataVectorIndexRequest request) {
    String path =
        String.format("/api/2.0/vector-search/indexes/%s/delete-data", request.getIndexName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, DeleteDataVectorIndexResponse.class, headers);
  }

  @Override
  public void deleteIndex(DeleteIndexRequest request) {
    String path = String.format("/api/2.0/vector-search/indexes/%s", request.getIndexName());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, DeleteIndexResponse.class, headers);
  }

  @Override
  public VectorIndex getIndex(GetIndexRequest request) {
    String path = String.format("/api/2.0/vector-search/indexes/%s", request.getIndexName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, VectorIndex.class, headers);
  }

  @Override
  public ListVectorIndexesResponse listIndexes(ListIndexesRequest request) {
    String path = "/api/2.0/vector-search/indexes";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListVectorIndexesResponse.class, headers);
  }

  @Override
  public QueryVectorIndexResponse queryIndex(QueryVectorIndexRequest request) {
    String path = String.format("/api/2.0/vector-search/indexes/%s/query", request.getIndexName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, QueryVectorIndexResponse.class, headers);
  }

  @Override
  public ScanVectorIndexResponse scanIndex(ScanVectorIndexRequest request) {
    String path = String.format("/api/2.0/vector-search/indexes/%s/scan", request.getIndexName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, ScanVectorIndexResponse.class, headers);
  }

  @Override
  public void syncIndex(SyncIndexRequest request) {
    String path = String.format("/api/2.0/vector-search/indexes/%s/sync", request.getIndexName());
    Map<String, String> headers = new HashMap<>();
    apiClient.POST(path, null, SyncIndexResponse.class, headers);
  }

  @Override
  public UpsertDataVectorIndexResponse upsertDataVectorIndex(UpsertDataVectorIndexRequest request) {
    String path =
        String.format("/api/2.0/vector-search/indexes/%s/upsert-data", request.getIndexName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, UpsertDataVectorIndexResponse.class, headers);
  }
}
