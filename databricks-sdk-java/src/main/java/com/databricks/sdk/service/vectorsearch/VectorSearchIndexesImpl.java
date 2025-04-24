// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of VectorSearchIndexes */
@Generated
class VectorSearchIndexesImpl implements VectorSearchIndexesService {
  private final ApiClient apiClient;

  public VectorSearchIndexesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public VectorIndex createIndex(CreateVectorIndexRequest request) {
    String path = "/api/2.0/vector-search/indexes";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, VectorIndex.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DeleteDataVectorIndexResponse deleteDataVectorIndex(DeleteDataVectorIndexRequest request) {
    String path =
        String.format("/api/2.0/vector-search/indexes/%s/delete-data", request.getIndexName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DeleteDataVectorIndexResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteIndex(DeleteIndexRequest request) {
    String path = String.format("/api/2.0/vector-search/indexes/%s", request.getIndexName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeleteIndexResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public VectorIndex getIndex(GetIndexRequest request) {
    String path = String.format("/api/2.0/vector-search/indexes/%s", request.getIndexName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, VectorIndex.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListVectorIndexesResponse listIndexes(ListIndexesRequest request) {
    String path = "/api/2.0/vector-search/indexes";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListVectorIndexesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public QueryVectorIndexResponse queryIndex(QueryVectorIndexRequest request) {
    String path = String.format("/api/2.0/vector-search/indexes/%s/query", request.getIndexName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, QueryVectorIndexResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public QueryVectorIndexResponse queryNextPage(QueryVectorIndexNextPageRequest request) {
    String path =
        String.format("/api/2.0/vector-search/indexes/%s/query-next-page", request.getIndexName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, QueryVectorIndexResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ScanVectorIndexResponse scanIndex(ScanVectorIndexRequest request) {
    String path = String.format("/api/2.0/vector-search/indexes/%s/scan", request.getIndexName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ScanVectorIndexResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void syncIndex(SyncIndexRequest request) {
    String path = String.format("/api/2.0/vector-search/indexes/%s/sync", request.getIndexName());
    try {
      Request req = new Request("POST", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, SyncIndexResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public UpsertDataVectorIndexResponse upsertDataVectorIndex(UpsertDataVectorIndexRequest request) {
    String path =
        String.format("/api/2.0/vector-search/indexes/%s/upsert-data", request.getIndexName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, UpsertDataVectorIndexResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
