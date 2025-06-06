// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clean room assets are data and code objects — Tables, volumes, and notebooks that are shared with
 * the clean room.
 */
@Generated
public class CleanRoomAssetsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CleanRoomAssetsAPI.class);

  private final CleanRoomAssetsService impl;

  /** Regular-use constructor */
  public CleanRoomAssetsAPI(ApiClient apiClient) {
    impl = new CleanRoomAssetsImpl(apiClient);
  }

  /** Constructor for mocks */
  public CleanRoomAssetsAPI(CleanRoomAssetsService mock) {
    impl = mock;
  }

  public CleanRoomAsset create(String cleanRoomName, CleanRoomAsset asset) {
    return create(
        new CreateCleanRoomAssetRequest().setCleanRoomName(cleanRoomName).setAsset(asset));
  }

  /**
   * Create an asset.
   *
   * <p>Create a clean room asset —share an asset like a notebook or table into the clean room. For
   * each UC asset that is added through this method, the clean room owner must also have enough
   * privilege on the asset to consume it. The privilege must be maintained indefinitely for the
   * clean room to be able to access the asset. Typically, you should use a group as the clean room
   * owner.
   */
  public CleanRoomAsset create(CreateCleanRoomAssetRequest request) {
    return impl.create(request);
  }

  public void delete(String cleanRoomName, CleanRoomAssetAssetType assetType, String name) {
    delete(
        new DeleteCleanRoomAssetRequest()
            .setCleanRoomName(cleanRoomName)
            .setAssetType(assetType)
            .setName(name));
  }

  /**
   * Delete an asset.
   *
   * <p>Delete a clean room asset - unshare/remove the asset from the clean room
   */
  public void delete(DeleteCleanRoomAssetRequest request) {
    impl.delete(request);
  }

  public CleanRoomAsset get(String cleanRoomName, CleanRoomAssetAssetType assetType, String name) {
    return get(
        new GetCleanRoomAssetRequest()
            .setCleanRoomName(cleanRoomName)
            .setAssetType(assetType)
            .setName(name));
  }

  /**
   * Get an asset.
   *
   * <p>Get the details of a clean room asset by its type and full name.
   */
  public CleanRoomAsset get(GetCleanRoomAssetRequest request) {
    return impl.get(request);
  }

  public Iterable<CleanRoomAsset> list(String cleanRoomName) {
    return list(new ListCleanRoomAssetsRequest().setCleanRoomName(cleanRoomName));
  }

  /** List assets. */
  public Iterable<CleanRoomAsset> list(ListCleanRoomAssetsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListCleanRoomAssetsResponse::getAssets,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public CleanRoomAsset update(
      String cleanRoomName, CleanRoomAssetAssetType assetType, String name, CleanRoomAsset asset) {
    return update(
        new UpdateCleanRoomAssetRequest()
            .setCleanRoomName(cleanRoomName)
            .setAssetType(assetType)
            .setName(name)
            .setAsset(asset));
  }

  /**
   * Update an asset.
   *
   * <p>Update a clean room asset. For example, updating the content of a notebook; changing the
   * shared partitions of a table; etc.
   */
  public CleanRoomAsset update(UpdateCleanRoomAssetRequest request) {
    return impl.update(request);
  }

  public CleanRoomAssetsService impl() {
    return impl;
  }
}
