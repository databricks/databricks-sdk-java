// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;

/**
 * The Files API allows you to read, write, and delete files and directories in Unity Catalog
 * volumes.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface FilesService {
  /**
   * Delete a file or directory.
   *
   * <p>Deletes a file or directory.
   */
  void deleteFile(DeleteFileRequest deleteFileRequest);

  /**
   * Download a file.
   *
   * <p>Downloads a file of up to 2 GiB.
   */
  void downloadFile(DownloadFileRequest downloadFileRequest);

  /**
   * Get the status of a file or directory.
   *
   * <p>Returns the status of a file or directory.
   */
  FileInfo getStatus(GetStatusRequest getStatusRequest);

  /**
   * Upload a file.
   *
   * <p>Uploads a file of up to 2 GiB.
   */
  void uploadFile(UploadFileRequest uploadFileRequest);
}
