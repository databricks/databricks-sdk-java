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
   * Create a directory.
   *
   * <p>Creates an empty directory. If called on an existing directory, the API returns a success
   * response.
   */
  void createDirectory(CreateDirectoryRequest createDirectoryRequest);

  /**
   * Delete a file.
   *
   * <p>Deletes a file.
   */
  void delete(DeleteFileRequest deleteFileRequest);

  /**
   * Delete a directory.
   *
   * <p>Deletes an empty directory. If the directory is not empty, the API returns a HTTP 400 error.
   */
  void deleteDirectory(DeleteDirectoryRequest deleteDirectoryRequest);

  /**
   * Download a file.
   *
   * <p>Downloads a file of up to 5 GiB.
   */
  DownloadResponse download(DownloadRequest downloadRequest);

  /**
   * List directory contents.
   *
   * <p>Returns the contents of a directory. If there is no directory at the specified path, the API
   * returns a HTTP 404 error.
   */
  ListDirectoryResponse listDirectoryContents(
      ListDirectoryContentsRequest listDirectoryContentsRequest);

  /**
   * Upload a file.
   *
   * <p>Uploads a file of up to 5 GiB.
   */
  void upload(UploadRequest uploadRequest);
}
