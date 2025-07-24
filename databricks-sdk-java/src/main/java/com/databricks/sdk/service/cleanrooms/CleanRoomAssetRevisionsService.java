// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;

/**
 * Clean Room Asset Revisions denote new versions of uploaded assets (e.g. notebooks) in the clean
 * room.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CleanRoomAssetRevisionsService {
  /** Get a specific revision of an asset */
  CleanRoomAsset get(GetCleanRoomAssetRevisionRequest getCleanRoomAssetRevisionRequest);

  /** List revisions for an asset */
  ListCleanRoomAssetRevisionsResponse list(
      ListCleanRoomAssetRevisionsRequest listCleanRoomAssetRevisionsRequest);
}
