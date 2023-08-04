// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.io.InputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** TBD */
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

  public void uploadFile(String filePath) {
    uploadFile(new UploadFileRequest().setFilePath(filePath));
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
