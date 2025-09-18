package com.databricks.sdk.service.sharing;

interface SharesExtService {
  /**
   * Gets an array of data object shares from the metastore. The caller must be a metastore admin or
   * the owner of the share. There is no guarantee of a specific ordering of the elements in the
   * array.
   */
  ListSharesResponse list(ListSharesRequest listSharesRequest);
}
