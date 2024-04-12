// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ProviderFiles */
@Generated
class ProviderFilesImpl implements ProviderFilesService {
  private final ApiClient apiClient;

  public ProviderFilesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateFileResponse create(CreateFileRequest request) {
    String path = "/api/2.0/marketplace-provider/files";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateFileResponse.class, headers);
  }

  @Override
  public void delete(DeleteFileRequest request) {
    String path = String.format("/api/2.0/marketplace-provider/files/%s", request.getFileId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteFileResponse.class, headers);
  }

  @Override
  public GetFileResponse get(GetFileRequest request) {
    String path = String.format("/api/2.0/marketplace-provider/files/%s", request.getFileId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetFileResponse.class, headers);
  }

  @Override
  public ListFilesResponse list(ListFilesRequest request) {
    String path = "/api/2.0/marketplace-provider/files";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListFilesResponse.class, headers);
  }
}
