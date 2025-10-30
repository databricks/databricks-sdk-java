// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ExternalMetadata */
@Generated
class ExternalMetadataImpl implements ExternalMetadataService {
  private final ApiClient apiClient;

  public ExternalMetadataImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ExternalMetadata createExternalMetadata(CreateExternalMetadataRequest request) {
    String path = "/api/2.0/lineage-tracking/external-metadata";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getExternalMetadata()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ExternalMetadata.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteExternalMetadata(DeleteExternalMetadataRequest request) {
    String path =
        String.format("/api/2.0/lineage-tracking/external-metadata/%s", request.getName());
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
  public ExternalMetadata getExternalMetadata(GetExternalMetadataRequest request) {
    String path =
        String.format("/api/2.0/lineage-tracking/external-metadata/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ExternalMetadata.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListExternalMetadataResponse listExternalMetadata(ListExternalMetadataRequest request) {
    String path = "/api/2.0/lineage-tracking/external-metadata";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListExternalMetadataResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ExternalMetadata updateExternalMetadata(UpdateExternalMetadataRequest request) {
    String path =
        String.format("/api/2.0/lineage-tracking/external-metadata/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getExternalMetadata()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ExternalMetadata.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
