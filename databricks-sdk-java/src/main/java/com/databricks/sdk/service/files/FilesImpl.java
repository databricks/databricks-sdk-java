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
  public void deleteFile(DeleteFileRequest request) {
    String path = String.format("/api/2.0/fs/files/%s", request.getFilePath());
    Map<String, String> headers = new HashMap<>();

    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public void downloadFile(DownloadFileRequest request) {
    String path = String.format("/api/2.0/fs/files/%s", request.getFilePath());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/octet-stream");

    apiClient.GET(path, request, Void.class, headers);
  }

  @Override
  public FileInfo getStatus(GetStatusRequest request) {
    String path = "/api/2.0/fs/get-status";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, FileInfo.class, headers);
  }

  @Override
  public void uploadFile(UploadFileRequest request) {
    String path = String.format("/api/2.0/fs/files/%s", request.getFilePath());
    Map<String, String> headers = new HashMap<>();
    headers.put("Content-Type", "application/octet-stream");

    apiClient.PUT(path, request.getContents(), Void.class, headers);
  }
}
