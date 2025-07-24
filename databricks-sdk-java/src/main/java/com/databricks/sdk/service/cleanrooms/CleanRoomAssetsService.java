// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;

/**
 * Clean room assets are data and code objects — Tables, volumes, and notebooks that are shared with
 * the clean room.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CleanRoomAssetsService {
  /**
   * Create a clean room asset —share an asset like a notebook or table into the clean room. For
   * each UC asset that is added through this method, the clean room owner must also have enough
   * privilege on the asset to consume it. The privilege must be maintained indefinitely for the
   * clean room to be able to access the asset. Typically, you should use a group as the clean room
   * owner.
   */
  CleanRoomAsset create(CreateCleanRoomAssetRequest createCleanRoomAssetRequest);

  /** submit an asset review */
  CreateCleanRoomAssetReviewResponse createCleanRoomAssetReview(
      CreateCleanRoomAssetReviewRequest createCleanRoomAssetReviewRequest);

  /** Delete a clean room asset - unshare/remove the asset from the clean room */
  void delete(DeleteCleanRoomAssetRequest deleteCleanRoomAssetRequest);

  /** Get the details of a clean room asset by its type and full name. */
  CleanRoomAsset get(GetCleanRoomAssetRequest getCleanRoomAssetRequest);

  /** List assets. */
  ListCleanRoomAssetsResponse list(ListCleanRoomAssetsRequest listCleanRoomAssetsRequest);

  /**
   * Update a clean room asset. For example, updating the content of a notebook; changing the shared
   * partitions of a table; etc.
   */
  CleanRoomAsset update(UpdateCleanRoomAssetRequest updateCleanRoomAssetRequest);
}
