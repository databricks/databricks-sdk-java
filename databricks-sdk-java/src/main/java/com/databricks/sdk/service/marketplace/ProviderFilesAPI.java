// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

  public CreateFileResponse create(
      FileParent fileParent, MarketplaceFileType marketplaceFileType, String mimeType) {
    return create(
        new CreateFileRequest()
            .setFileParent(fileParent)
            .setMarketplaceFileType(marketplaceFileType)
            .setMimeType(mimeType));
  }

  /** Create a file. Currently, only provider icons and attached notebooks are supported. */
  public CreateFileResponse create(CreateFileRequest request) {
    return impl.create(request);
  }

  public void delete(String fileId) {
    delete(new DeleteFileRequest().setFileId(fileId));
  }

  /** Delete a file */
  public void delete(DeleteFileRequest request) {
    impl.delete(request);
  }

  public GetFileResponse get(String fileId) {
    return get(new GetFileRequest().setFileId(fileId));
  }

  /** Get a file */
  public GetFileResponse get(GetFileRequest request) {
    return impl.get(request);
  }

  public Iterable<FileInfo> list(FileParent fileParent) {
    return list(new ListFilesRequest().setFileParent(fileParent));
  }

  /** List files attached to a parent entity. */
  public Iterable<FileInfo> list(ListFilesRequest request) {
    return new Paginator<>(
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
