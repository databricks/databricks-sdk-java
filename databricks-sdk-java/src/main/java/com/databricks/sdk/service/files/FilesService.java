// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;

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
 * one for working with directories (`/fs/directories`). Both endpoints use the standard HTTP
 * methods GET, HEAD, PUT, and DELETE to manage files and directories specified using their URI
 * path. The path is always absolute.
 *
 * <p>Some Files API client features are currently experimental. To enable them, set
 * `enable_experimental_files_api_client = True` in your configuration profile or use the
 * environment variable `DATABRICKS_ENABLE_EXPERIMENTAL_FILES_API_CLIENT=True`.
 *
 * <p>[Unity Catalog volumes]: https://docs.databricks.com/en/connect/unity-catalog/volumes.html
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
   * <p>Creates an empty directory. If necessary, also creates any parent directories of the new,
   * empty directory (like the shell command `mkdir -p`). If called on an existing directory,
   * returns a success response; this method is idempotent (it will succeed if the directory already
   * exists).
   */
  void createDirectory(CreateDirectoryRequest createDirectoryRequest);

  /**
   * Delete a file.
   *
   * <p>Deletes a file. If the request is successful, there is no response body.
   */
  void delete(DeleteFileRequest deleteFileRequest);

  /**
   * Delete a directory.
   *
   * <p>Deletes an empty directory.
   *
   * <p>To delete a non-empty directory, first delete all of its contents. This can be done by
   * listing the directory contents and deleting each file and subdirectory recursively.
   */
  void deleteDirectory(DeleteDirectoryRequest deleteDirectoryRequest);

  /**
   * Download a file.
   *
   * <p>Downloads a file. The file contents are the response body. This is a standard HTTP file
   * download, not a JSON RPC. It supports the Range and If-Unmodified-Since HTTP headers.
   */
  DownloadResponse download(DownloadRequest downloadRequest);

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
  void getDirectoryMetadata(GetDirectoryMetadataRequest getDirectoryMetadataRequest);

  /**
   * Get file metadata.
   *
   * <p>Get the metadata of a file. The response HTTP headers contain the metadata. There is no
   * response body.
   */
  GetMetadataResponse getMetadata(GetMetadataRequest getMetadataRequest);

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
   * <p>Uploads a file of up to 5 GiB. The file contents should be sent as the request body as raw
   * bytes (an octet stream); do not encode or otherwise modify the bytes before sending. The
   * contents of the resulting file will be exactly the bytes sent in the request body. If the
   * request is successful, there is no response body.
   */
  void upload(UploadRequest uploadRequest);
}
