// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.io.InputStream;

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
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public InputStream downloadFile(DownloadFileRequest request) {
    String path = String.format("/api/2.0/fs/files/%s", request.getFilePath());
    return apiClient.GET(path, request, InputStream.class);
  }

  @Override
  public void uploadFile(UploadFileRequest request) {
    String path = String.format("/api/2.0/fs/files/%s", request.getFilePath());
    apiClient.PUT(path, request.getBody(), Void.class);
  }
}