// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Encoding;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("PUT", path);
      ApiClient.setQuery(req, request);
      apiClient.execute(req, CreateDirectoryResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteFileRequest request) {
    String path =
        String.format(
            "/api/2.0/fs/files%s", Encoding.encodeMultiSegmentPathParameter(request.getFilePath()));
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      apiClient.execute(req, DeleteResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteDirectory(DeleteDirectoryRequest request) {
    String path =
        String.format(
            "/api/2.0/fs/directories%s",
            Encoding.encodeMultiSegmentPathParameter(request.getDirectoryPath()));
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      apiClient.execute(req, DeleteDirectoryResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DownloadResponse download(DownloadRequest request) {
    String path =
        String.format(
            "/api/2.0/fs/files%s", Encoding.encodeMultiSegmentPathParameter(request.getFilePath()));
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/octet-stream");
      return apiClient.execute(req, DownloadResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void getDirectoryMetadata(GetDirectoryMetadataRequest request) {
    String path =
        String.format(
            "/api/2.0/fs/directories%s",
            Encoding.encodeMultiSegmentPathParameter(request.getDirectoryPath()));
    try {
      Request req = new Request("HEAD", path);
      ApiClient.setQuery(req, request);
      apiClient.execute(req, GetDirectoryMetadataResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetMetadataResponse getMetadata(GetMetadataRequest request) {
    String path =
        String.format(
            "/api/2.0/fs/files%s", Encoding.encodeMultiSegmentPathParameter(request.getFilePath()));
    try {
      Request req = new Request("HEAD", path);
      ApiClient.setQuery(req, request);
      return apiClient.execute(req, GetMetadataResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListDirectoryResponse listDirectoryContents(ListDirectoryContentsRequest request) {
    String path =
        String.format(
            "/api/2.0/fs/directories%s",
            Encoding.encodeMultiSegmentPathParameter(request.getDirectoryPath()));
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListDirectoryResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void upload(UploadRequest request) {
    String path =
        String.format(
            "/api/2.0/fs/files%s", Encoding.encodeMultiSegmentPathParameter(request.getFilePath()));
    try {
      Request req = new Request("PUT", path, request.getContents());
      ApiClient.setQuery(req, request);
      req.withHeader("Content-Type", "application/octet-stream");
      apiClient.execute(req, UploadResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
