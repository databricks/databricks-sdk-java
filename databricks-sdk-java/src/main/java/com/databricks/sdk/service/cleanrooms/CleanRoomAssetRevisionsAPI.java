// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clean Room Asset Revisions denote new versions of uploaded assets (e.g. notebooks) in the clean
 * room.
 */
@Generated
public class CleanRoomAssetRevisionsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CleanRoomAssetRevisionsAPI.class);

  private final CleanRoomAssetRevisionsService impl;

  /** Regular-use constructor */
  public CleanRoomAssetRevisionsAPI(ApiClient apiClient) {
    impl = new CleanRoomAssetRevisionsImpl(apiClient);
  }

  /** Constructor for mocks */
  public CleanRoomAssetRevisionsAPI(CleanRoomAssetRevisionsService mock) {
    impl = mock;
  }

  public CleanRoomAsset get(
      String cleanRoomName, CleanRoomAssetAssetType assetType, String name, String etag) {
    return get(
        new GetCleanRoomAssetRevisionRequest()
            .setCleanRoomName(cleanRoomName)
            .setAssetType(assetType)
            .setName(name)
            .setEtag(etag));
  }

  /** Get a specific revision of an asset */
  public CleanRoomAsset get(GetCleanRoomAssetRevisionRequest request) {
    return impl.get(request);
  }

  public Iterable<CleanRoomAsset> list(
      String cleanRoomName, CleanRoomAssetAssetType assetType, String name) {
    return list(
        new ListCleanRoomAssetRevisionsRequest()
            .setCleanRoomName(cleanRoomName)
            .setAssetType(assetType)
            .setName(name));
  }

  /** List revisions for an asset */
  public Iterable<CleanRoomAsset> list(ListCleanRoomAssetRevisionsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListCleanRoomAssetRevisionsResponse::getRevisions,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public CleanRoomAssetRevisionsService impl() {
    return impl;
  }
}
