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

  public void delete(String filePath) {
    delete(new DeleteFileRequest().setFilePath(filePath));
  }

  /**
   * Delete a file or directory.
   *
   * <p>Deletes a file or directory.
   */
  public void delete(DeleteFileRequest request) {
    impl.delete(request);
  }

  public DownloadResponse download(String filePath) {
    return download(new DownloadRequest().setFilePath(filePath));
  }

  /**
   * Download a file.
   *
   * <p>Downloads a file of up to 2 GiB.
   */
  public DownloadResponse download(DownloadRequest request) {
    return impl.download(request);
  }

  public FileInfo getStatus(String path) {
    return getStatus(new GetStatusRequest().setPath(path));
  }

  /**
   * Get file or directory status.
   *
   * <p>Returns the status of a file or directory.
   */
  public FileInfo getStatus(GetStatusRequest request) {
    return impl.getStatus(request);
  }

  public void upload(String filePath, InputStream contents) {
    upload(new UploadRequest().setFilePath(filePath).setContents(contents));
  }

  /**
   * Upload a file.
   *
   * <p>Uploads a file of up to 2 GiB.
   */
  public void upload(UploadRequest request) {
    impl.upload(request);
  }

  public FilesService impl() {
    return impl;
  }
}
