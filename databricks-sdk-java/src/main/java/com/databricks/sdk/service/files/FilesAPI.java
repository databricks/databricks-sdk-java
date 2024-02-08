// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
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

  public void createDirectory(String directoryPath) {
    createDirectory(new CreateDirectoryRequest().setDirectoryPath(directoryPath));
  }

  /**
   * Create a directory.
   *
   * <p>Creates an empty directory. If called on an existing directory, the API returns a success
   * response.
   */
  public void createDirectory(CreateDirectoryRequest request) {
    impl.createDirectory(request);
  }

  public void delete(String filePath) {
    delete(new DeleteFileRequest().setFilePath(filePath));
  }

  /**
   * Delete a file.
   *
   * <p>Deletes a file.
   */
  public void delete(DeleteFileRequest request) {
    impl.delete(request);
  }

  public void deleteDirectory(String directoryPath) {
    deleteDirectory(new DeleteDirectoryRequest().setDirectoryPath(directoryPath));
  }

  /**
   * Delete a directory.
   *
   * <p>Deletes an empty directory. If the directory is not empty, the API returns a HTTP 400 error.
   */
  public void deleteDirectory(DeleteDirectoryRequest request) {
    impl.deleteDirectory(request);
  }

  public DownloadResponse download(String filePath) {
    return download(new DownloadRequest().setFilePath(filePath));
  }

  /**
   * Download a file.
   *
   * <p>Downloads a file of up to 5 GiB.
   */
  public DownloadResponse download(DownloadRequest request) {
    return impl.download(request);
  }

  public Iterable<DirectoryEntry> listDirectoryContents(String directoryPath) {
    return listDirectoryContents(
        new ListDirectoryContentsRequest().setDirectoryPath(directoryPath));
  }

  /**
   * List directory contents.
   *
   * <p>Returns the contents of a directory. If there is no directory at the specified path, the API
   * returns a HTTP 404 error.
   */
  public Iterable<DirectoryEntry> listDirectoryContents(ListDirectoryContentsRequest request) {
    return new Paginator<>(
        request,
        impl::listDirectoryContents,
        ListDirectoryResponse::getContents,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public void upload(String filePath, InputStream contents) {
    upload(new UploadRequest().setFilePath(filePath).setContents(contents));
  }

  /**
   * Upload a file.
   *
   * <p>Uploads a file of up to 5 GiB.
   */
  public void upload(UploadRequest request) {
    impl.upload(request);
  }

  public FilesService impl() {
    return impl;
  }
}
