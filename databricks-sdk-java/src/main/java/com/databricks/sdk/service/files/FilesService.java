// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;

/**
 * The Files API allows you to read, write, list, and delete files and directories. We support Unity
 * Catalog volumes with paths starting with "/Volumes/<catalog>/<schema>/<volume>".
 *
 * <p>The Files API is designed like a standard HTTP API, rather than as a JSON RPC API. This is
 * intended to make it easier and more efficient to work with file contents as raw bytes.
 *
 * <p>Because the Files API is a standard HTTP API, the URI path is used to specify the file or
 * directory to operate on. The path is always absolute.
 *
 * <p>The Files API has separate endpoints for working with files, `/fs/files`, and working with
 * directories, `/fs/directories`. The standard HTTP methods `GET`, `HEAD`, `PUT`, and `DELETE` work
 * as expected on these endpoints.
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
   * returns a success response; this method is idempotent.
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
   * <p>Downloads a file of up to 5 GiB. The file contents are the response body. This is a standard
   * HTTP file download, not a JSON RPC.
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
