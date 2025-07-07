// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of MaterializedFeatures */
@Generated
class MaterializedFeaturesImpl implements MaterializedFeaturesService {
  private final ApiClient apiClient;

  public MaterializedFeaturesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public FeatureTag createFeatureTag(CreateFeatureTagRequest request) {
    String path =
        String.format(
            "/api/2.0/feature-store/feature-tables/%s/features/%s/tags",
            request.getTableName(), request.getFeatureName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getFeatureTag()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, FeatureTag.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteFeatureTag(DeleteFeatureTagRequest request) {
    String path =
        String.format(
            "/api/2.0/feature-store/feature-tables/%s/features/%s/tags/%s",
            request.getTableName(), request.getFeatureName(), request.getKey());
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
  public FeatureLineage getFeatureLineage(GetFeatureLineageRequest request) {
    String path =
        String.format(
            "/api/2.0/feature-store/feature-tables/%s/features/%s/lineage",
            request.getTableName(), request.getFeatureName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, FeatureLineage.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public FeatureTag getFeatureTag(GetFeatureTagRequest request) {
    String path =
        String.format(
            "/api/2.0/feature-store/feature-tables/%s/features/%s/tags/%s",
            request.getTableName(), request.getFeatureName(), request.getKey());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, FeatureTag.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListFeatureTagsResponse listFeatureTags(ListFeatureTagsRequest request) {
    String path =
        String.format(
            "/api/2.0/feature-store/feature-tables/%s/features/%s/tags",
            request.getTableName(), request.getFeatureName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListFeatureTagsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public FeatureTag updateFeatureTag(UpdateFeatureTagRequest request) {
    String path =
        String.format(
            "/api/2.0/feature-store/feature-tables/%s/features/%s/tags/%s",
            request.getTableName(), request.getFeatureName(), request.getKey());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getFeatureTag()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, FeatureTag.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
