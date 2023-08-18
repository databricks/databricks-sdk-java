// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.io.InputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Files API allows you to read, write, and delete files and directories in Unity Catalog
 * volumes.
 */
@Generated
public class FilesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(FilesAPI.class);

  private final FilesService impl;

  /** Regular-use constructor */
  public FilesAPI(ApiClient apiClient) {
    impl = new FilesImpl(apiClient);
  }

  /** Constructor for mocks */
  public FilesAPI(FilesService mock) {
    impl = mock;
  }

  public void deleteFile(String filePath) {
    deleteFile(new DeleteFileRequest().setFilePath(filePath));
  }

  /**
   * Delete a file or directory.
   *
   * <p>Deletes a file or directory.
   */
  public void deleteFile(DeleteFileRequest request) {
    impl.deleteFile(request);
  }

  public InputStream downloadFile(String filePath) {
    return downloadFile(new DownloadFileRequest().setFilePath(filePath));
  }

  /**
   * Download a file.
   *
   * <p>Downloads a file of up to 2 GiB.
   */
  public InputStream downloadFile(DownloadFileRequest request) {
    return impl.downloadFile(request);
  }

  public FileInfo getStatus(String path) {
    return getStatus(new GetStatusRequest().setPath(path));
  }

  /**
   * Get the status of a file or directory.
   *
   * <p>Returns the status of a file or directory.
   */
  public FileInfo getStatus(GetStatusRequest request) {
    return impl.getStatus(request);
  }

  public void uploadFile(InputStream contents, String filePath) {
    uploadFile(new UploadFileRequest().setContents(contents).setFilePath(filePath));
  }

  /**
   * Upload a file.
   *
   * <p>Uploads a file of up to 2 GiB.
   */
  public void uploadFile(UploadFileRequest request) {
    impl.uploadFile(request);
  }

  public FilesService impl() {
    return impl;
  }
}
