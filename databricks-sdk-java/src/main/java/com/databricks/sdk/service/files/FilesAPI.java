// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import java.io.InputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Files API is a standard HTTP API that allows you to read, write, list, and delete files and
 * directories by referring to their URI. The API makes working with file content as raw bytes
 * easier and more efficient.
 *
 * <p>The API supports [Unity Catalog volumes], where files and directories to operate on are
 * specified using their volume URI path, which follows the format
 * /Volumes/&lt;catalog_name&gt;/&lt;schema_name&gt;/&lt;volume_name&gt;/&lt;path_to_file&gt;.
 *
 * <p>The Files API has two distinct endpoints, one for working with files (`/fs/files`) and another
 * one for working with directories (`/fs/directories`). Both endpoints, use the standard HTTP
 * methods GET, HEAD, PUT, and DELETE to manage files and directories specified using their URI
 * path. The path is always absolute.
 *
 * <p>[Unity Catalog volumes]: https://docs.databricks.com/en/connect/unity-catalog/volumes.html
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
   * <p>Creates an empty directory. If necessary, also creates any parent directories of the new,
   * empty directory (like the shell command `mkdir -p`). If called on an existing directory,
   * returns a success response; this method is idempotent (it will succeed if the directory already
   * exists).
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
   * <p>Deletes a file. If the request is successful, there is no response body.
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
   * <p>Deletes an empty directory.
   *
   * <p>To delete a non-empty directory, first delete all of its contents. This can be done by
   * listing the directory contents and deleting each file and subdirectory recursively.
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
   * <p>Downloads a file. The file contents are the response body. This is a standard HTTP file
   * download, not a JSON RPC. It supports the Range and If-Unmodified-Since HTTP headers.
   */
  public DownloadResponse download(DownloadRequest request) {
    return impl.download(request);
  }

  public void getDirectoryMetadata(String directoryPath) {
    getDirectoryMetadata(new GetDirectoryMetadataRequest().setDirectoryPath(directoryPath));
  }

  /**
   * Get directory metadata.
   *
   * <p>Get the metadata of a directory. The response HTTP headers contain the metadata. There is no
   * response body.
   *
   * <p>This method is useful to check if a directory exists and the caller has access to it.
   *
   * <p>If you wish to ensure the directory exists, you can instead use `PUT`, which will create the
   * directory if it does not exist, and is idempotent (it will succeed if the directory already
   * exists).
   */
  public void getDirectoryMetadata(GetDirectoryMetadataRequest request) {
    impl.getDirectoryMetadata(request);
  }

  public GetMetadataResponse getMetadata(String filePath) {
    return getMetadata(new GetMetadataRequest().setFilePath(filePath));
  }

  /**
   * Get file metadata.
   *
   * <p>Get the metadata of a file. The response HTTP headers contain the metadata. There is no
   * response body.
   */
  public GetMetadataResponse getMetadata(GetMetadataRequest request) {
    return impl.getMetadata(request);
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
          if (token == null || token.isEmpty()) {
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
   * <p>Uploads a file of up to 5 GiB. The file contents should be sent as the request body as raw
   * bytes (an octet stream); do not encode or otherwise modify the bytes before sending. The
   * contents of the resulting file will be exactly the bytes sent in the request body. If the
   * request is successful, there is no response body.
   */
  public void upload(UploadRequest request) {
    impl.upload(request);
  }

  public FilesService impl() {
    return impl;
  }
}
