package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Paginator;

class SharesExtAPI {

  final SharesService impl;

  public SharesExtAPI(ApiClient apiClient) {
    impl = new SharesImpl(apiClient);
  }

  public SharesExtAPI(SharesService mock) {
    impl = mock;
  }

  public Iterable<ShareInfo> list(String name) {
    return list(new ListSharesRequest().setName(name));
  }

  /**
   * Gets an array of data object shares from the metastore. The caller must be a metastore admin or
   * the owner of the share. There is no guarantee of a specific ordering of the elements in the
   * array.
   */
  public Iterable<ShareInfo> list(ListSharesRequest request) {

    if (request.getMaxResults() == null) {
      request.setMaxResults(0L);
    }
    return new Paginator<>(
        request,
        impl::list,
        ListSharesResponse::getShares,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }
}
