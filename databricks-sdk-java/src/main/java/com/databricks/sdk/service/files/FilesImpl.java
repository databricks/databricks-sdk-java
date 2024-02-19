// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Files */
@Generated
class FilesImpl implements FilesService {
  private final ApiClient apiClient;

  public FilesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void createDirectory(CreateDirectoryRequest request) {
    String path = String.format("/api/2.0/fs/directories%s", request.getDirectoryPath());
    Map<String, String> headers = new HashMap<>();
    apiClient.PUT(path, null, Void.class, headers);
  }

  @Override
  public void delete(DeleteFileRequest request) {
    String path = String.format("/api/2.0/fs/files%s", request.getFilePath());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public void deleteDirectory(DeleteDirectoryRequest request) {
    String path = String.format("/api/2.0/fs/directories%s", request.getDirectoryPath());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public DownloadResponse download(DownloadRequest request) {
    String path = String.format("/api/2.0/fs/files%s", request.getFilePath());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/octet-stream");
    return apiClient.GET(path, request, DownloadResponse.class, headers);
  }

  @Override
  public void getDirectoryMetadata(GetDirectoryMetadataRequest request) {
    String path = String.format("/api/2.0/fs/directories%s", request.getDirectoryPath());
    Map<String, String> headers = new HashMap<>();
    apiClient.HEAD(path, request, Void.class, headers);
  }

  @Override
  public GetMetadataResponse getMetadata(GetMetadataRequest request) {
    String path = String.format("/api/2.0/fs/files%s", request.getFilePath());
    Map<String, String> headers = new HashMap<>();
    return apiClient.HEAD(path, request, GetMetadataResponse.class, headers);
  }

  @Override
  public ListDirectoryResponse listDirectoryContents(ListDirectoryContentsRequest request) {
    String path = String.format("/api/2.0/fs/directories%s", request.getDirectoryPath());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListDirectoryResponse.class, headers);
  }

  @Override
  public void upload(UploadRequest request) {
    String path = String.format("/api/2.0/fs/files%s", request.getFilePath());
    Map<String, String> headers = new HashMap<>();
    headers.put("Content-Type", "application/octet-stream");
    apiClient.PUT(path, request.getContents(), Void.class, headers);
  }
}
