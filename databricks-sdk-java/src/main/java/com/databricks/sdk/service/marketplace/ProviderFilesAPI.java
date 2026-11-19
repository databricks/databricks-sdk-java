// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * Marketplace offers a set of file APIs for various purposes such as preview notebooks and provider
 * icons.
 */
@Generated
public class ProviderFilesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ProviderFilesAPI.class);

  private final ProviderFilesService impl;

  /** Regular-use constructor */
  public ProviderFilesAPI(ApiClient apiClient) {
    impl = new ProviderFilesImpl(apiClient);
  }

  /** Constructor for mocks */
  public ProviderFilesAPI(ProviderFilesService mock) {
    impl = mock;
  }

  /**
   * Creates a file and returns a short-lived URL for uploading its content with an HTTP PUT
   * request. Only provider icons (PROVIDER_ICON files on a PROVIDER parent) and sample notebooks
   * (EMBEDDED_NOTEBOOK files on a LISTING parent) are supported.
   */
  public CreateFileResponse create(CreateFileRequest request) {
    return impl.create(request);
  }

  public void delete(String fileId) {
    delete(new DeleteFileRequest().setFileId(fileId));
  }

  /** Deletes a file. Fails if the file is still in use. */
  public void delete(DeleteFileRequest request) {
    impl.delete(request);
  }

  public GetFileResponse get(String fileId) {
    return get(new GetFileRequest().setFileId(fileId));
  }

  /** Gets a file's metadata, including a short-lived download URL. */
  public GetFileResponse get(GetFileRequest request) {
    return impl.get(request);
  }

  public Iterable<FileInfo> list(FileParent fileParent) {
    return list(new ListFilesRequest().setFileParent(fileParent));
  }

  /** Lists the files attached to a provider profile or a listing. */
  public Iterable<FileInfo> list(ListFilesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::list,
        ListFilesResponse::getFileInfos,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public ProviderFilesService impl() {
    return impl;
  }
}
