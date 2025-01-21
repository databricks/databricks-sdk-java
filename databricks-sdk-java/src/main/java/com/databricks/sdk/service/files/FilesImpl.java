// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.http.Encoding;
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
    String path =
        String.format(
            "/api/2.0/fs/directories%s",
            Encoding.encodeMultiSegmentPathParameter(request.getDirectoryPath()));
    Map<String, String> headers = new HashMap<>();
    apiClient.execute("PUT", path, null, CreateDirectoryResponse.class, headers);
  }

  @Override
  public void delete(DeleteFileRequest request) {
    String path =
        String.format(
            "/api/2.0/fs/files%s", Encoding.encodeMultiSegmentPathParameter(request.getFilePath()));
    Map<String, String> headers = new HashMap<>();
    apiClient.execute("DELETE", path, request, DeleteResponse.class, headers);
  }

  @Override
  public void deleteDirectory(DeleteDirectoryRequest request) {
    String path =
        String.format(
            "/api/2.0/fs/directories%s",
            Encoding.encodeMultiSegmentPathParameter(request.getDirectoryPath()));
    Map<String, String> headers = new HashMap<>();
    apiClient.execute("DELETE", path, request, DeleteDirectoryResponse.class, headers);
  }

  @Override
  public DownloadResponse download(DownloadRequest request) {
    String path =
        String.format(
            "/api/2.0/fs/files%s", Encoding.encodeMultiSegmentPathParameter(request.getFilePath()));
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/octet-stream");
    return apiClient.execute("GET", path, request, DownloadResponse.class, headers);
  }

  @Override
  public void getDirectoryMetadata(GetDirectoryMetadataRequest request) {
    String path =
        String.format(
            "/api/2.0/fs/directories%s",
            Encoding.encodeMultiSegmentPathParameter(request.getDirectoryPath()));
    Map<String, String> headers = new HashMap<>();
    apiClient.execute("HEAD", path, request, GetDirectoryMetadataResponse.class, headers);
  }

  @Override
  public GetMetadataResponse getMetadata(GetMetadataRequest request) {
    String path =
        String.format(
            "/api/2.0/fs/files%s", Encoding.encodeMultiSegmentPathParameter(request.getFilePath()));
    Map<String, String> headers = new HashMap<>();
    return apiClient.execute("HEAD", path, request, GetMetadataResponse.class, headers);
  }

  @Override
  public ListDirectoryResponse listDirectoryContents(ListDirectoryContentsRequest request) {
    String path =
        String.format(
            "/api/2.0/fs/directories%s",
            Encoding.encodeMultiSegmentPathParameter(request.getDirectoryPath()));
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListDirectoryResponse.class, headers);
  }

  @Override
  public void upload(UploadRequest request) {
    String path =
        String.format(
            "/api/2.0/fs/files%s", Encoding.encodeMultiSegmentPathParameter(request.getFilePath()));
    Map<String, String> headers = new HashMap<>();
    headers.put("Content-Type", "application/octet-stream");
    apiClient.execute("PUT", path, request.getContents(), UploadResponse.class, headers);
  }
}
