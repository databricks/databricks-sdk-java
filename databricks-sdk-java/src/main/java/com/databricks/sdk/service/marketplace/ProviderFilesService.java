// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;

/**
 * Marketplace offers a set of file APIs for various purposes such as preview notebooks and provider
 * icons.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ProviderFilesService {
  /**
   * Create a file.
   *
   * <p>Create a file. Currently, only provider icons and attached notebooks are supported.
   */
  CreateFileResponse create(CreateFileRequest createFileRequest);

  /**
   * Delete a file.
   *
   * <p>Delete a file
   */
  void delete(DeleteFileRequest deleteFileRequest);

  /**
   * Get a file.
   *
   * <p>Get a file
   */
  GetFileResponse get(GetFileRequest getFileRequest);

  /**
   * List files.
   *
   * <p>List files attached to a parent entity.
   */
  ListFilesResponse list(ListFilesRequest listFilesRequest);
}
