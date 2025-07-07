// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of FeatureStore */
@Generated
class FeatureStoreImpl implements FeatureStoreService {
  private final ApiClient apiClient;

  public FeatureStoreImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public OnlineStore createOnlineStore(CreateOnlineStoreRequest request) {
    String path = "/api/2.0/feature-store/online-stores";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getOnlineStore()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, OnlineStore.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteOnlineStore(DeleteOnlineStoreRequest request) {
    String path = String.format("/api/2.0/feature-store/online-stores/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public OnlineStore getOnlineStore(GetOnlineStoreRequest request) {
    String path = String.format("/api/2.0/feature-store/online-stores/%s", request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, OnlineStore.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListOnlineStoresResponse listOnlineStores(ListOnlineStoresRequest request) {
    String path = "/api/2.0/feature-store/online-stores";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListOnlineStoresResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PublishTableResponse publishTable(PublishTableRequest request) {
    String path =
        String.format("/api/2.0/feature-store/tables/%s/publish", request.getSourceTableName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, PublishTableResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public OnlineStore updateOnlineStore(UpdateOnlineStoreRequest request) {
    String path = String.format("/api/2.0/feature-store/online-stores/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getOnlineStore()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, OnlineStore.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
