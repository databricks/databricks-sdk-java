// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Catalogs */
@Generated
class CatalogsImpl implements CatalogsService {
  private final ApiClient apiClient;

  public CatalogsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CatalogInfo create(CreateCatalog request) {
    String path = "/api/2.1/unity-catalog/catalogs";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CatalogInfo.class, headers);
  }

  @Override
  public void delete(DeleteCatalogRequest request) {
    String path = String.format("/api/2.1/unity-catalog/catalogs/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public CatalogInfo get(GetCatalogRequest request) {
    String path = String.format("/api/2.1/unity-catalog/catalogs/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, CatalogInfo.class, headers);
  }

  @Override
  public ListCatalogsResponse list() {
    String path = "/api/2.1/unity-catalog/catalogs";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, ListCatalogsResponse.class, headers);
  }

  @Override
  public CatalogInfo update(UpdateCatalog request) {
    String path = String.format("/api/2.1/unity-catalog/catalogs/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, CatalogInfo.class, headers);
  }
}
