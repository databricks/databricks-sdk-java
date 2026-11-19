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
   * Creates a file and returns a short-lived URL for uploading its content with an HTTP PUT
   * request. Only provider icons (PROVIDER_ICON files on a PROVIDER parent) and sample notebooks
   * (EMBEDDED_NOTEBOOK files on a LISTING parent) are supported.
   */
  CreateFileResponse create(CreateFileRequest createFileRequest);

  /** Deletes a file. Fails if the file is still in use. */
  void delete(DeleteFileRequest deleteFileRequest);

  /** Gets a file's metadata, including a short-lived download URL. */
  GetFileResponse get(GetFileRequest getFileRequest);

  /** Lists the files attached to a provider profile or a listing. */
  ListFilesResponse list(ListFilesRequest listFilesRequest);
}
