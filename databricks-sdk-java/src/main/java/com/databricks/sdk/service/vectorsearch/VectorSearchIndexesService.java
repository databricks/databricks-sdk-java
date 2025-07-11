// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;

/**
 * **Index**: An efficient representation of your embedding vectors that supports real-time and
 * efficient approximate nearest neighbor (ANN) search queries.
 *
 * <p>There are 2 types of Vector Search indexes: - **Delta Sync Index**: An index that
 * automatically syncs with a source Delta Table, automatically and incrementally updating the index
 * as the underlying data in the Delta Table changes. - **Direct Vector Access Index**: An index
 * that supports direct read and write of vectors and metadata through our REST and SDK APIs. With
 * this model, the user manages index updates.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface VectorSearchIndexesService {
  /** Create a new index. */
  VectorIndex createIndex(CreateVectorIndexRequest createVectorIndexRequest);

  /** Handles the deletion of data from a specified vector index. */
  DeleteDataVectorIndexResponse deleteDataVectorIndex(
      DeleteDataVectorIndexRequest deleteDataVectorIndexRequest);

  /** Delete an index. */
  void deleteIndex(DeleteIndexRequest deleteIndexRequest);

  /** Get an index. */
  VectorIndex getIndex(GetIndexRequest getIndexRequest);

  /** List all indexes in the given endpoint. */
  ListVectorIndexesResponse listIndexes(ListIndexesRequest listIndexesRequest);

  /** Query the specified vector index. */
  QueryVectorIndexResponse queryIndex(QueryVectorIndexRequest queryVectorIndexRequest);

  /**
   * Use `next_page_token` returned from previous `QueryVectorIndex` or `QueryVectorIndexNextPage`
   * request to fetch next page of results.
   */
  QueryVectorIndexResponse queryNextPage(
      QueryVectorIndexNextPageRequest queryVectorIndexNextPageRequest);

  /**
   * Scan the specified vector index and return the first `num_results` entries after the exclusive
   * `primary_key`.
   */
  ScanVectorIndexResponse scanIndex(ScanVectorIndexRequest scanVectorIndexRequest);

  /** Triggers a synchronization process for a specified vector index. */
  void syncIndex(SyncIndexRequest syncIndexRequest);

  /** Handles the upserting of data into a specified vector index. */
  UpsertDataVectorIndexResponse upsertDataVectorIndex(
      UpsertDataVectorIndexRequest upsertDataVectorIndexRequest);
}
