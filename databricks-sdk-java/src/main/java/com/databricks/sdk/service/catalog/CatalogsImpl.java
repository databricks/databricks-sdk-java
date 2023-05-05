// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import org.apache.http.client.methods.*;

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
    return apiClient.POST(path, request, CatalogInfo.class);
  }

  @Override
  public void delete(DeleteCatalogRequest request) {
    String path = String.format("/api/2.1/unity-catalog/catalogs/%s", request.getName());

    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public CatalogInfo get(GetCatalogRequest request) {
    String path = String.format("/api/2.1/unity-catalog/catalogs/%s", request.getName());
    return apiClient.GET(path, request, CatalogInfo.class);
  }

  @Override
  public ListCatalogsResponse list() {
    String path = "/api/2.1/unity-catalog/catalogs";
    return apiClient.GET(path, ListCatalogsResponse.class);
  }

  @Override
  public CatalogInfo update(UpdateCatalog request) {
    String path = String.format("/api/2.1/unity-catalog/catalogs/%s", request.getName());
    return apiClient.PATCH(path, request, CatalogInfo.class);
  }
}
