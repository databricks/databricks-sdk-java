// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;

/**
 * **Index**: An efficient representation of your embedding vectors that supports real-time and
 * efficient approximate nearest neighbor (ANN) search queries.
 *
 * <p>There are 2 types of AI Search indexes: - **Delta Sync Index**: An index that automatically
 * syncs with a source Delta Table, automatically and incrementally updating the index as the
 * underlying data in the Delta Table changes. - **Direct Vector Access Index**: An index that
 * supports direct read and write of vectors and metadata through our REST and SDK APIs. With this
 * model, the user manages index updates.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface VectorSearchIndexesService {
  /**
   * Create a new index on an endpoint. Creating a Delta Sync index also creates the pipeline that
   * populates it from the source table; a Direct Vector Access index starts empty and is populated
   * through Upsert data into an index.
   */
  VectorIndex createIndex(CreateVectorIndexRequest createVectorIndexRequest);

  /**
   * Delete rows from a Direct Vector Access index by primary key. The response reports how many
   * rows were deleted and the primary keys of the rows that failed.
   */
  DeleteDataVectorIndexResponse deleteDataVectorIndex(
      DeleteDataVectorIndexRequest deleteDataVectorIndexRequest);

  /**
   * Delete an index and the data it holds. The source table of a Delta Sync index is not affected.
   */
  void deleteIndex(DeleteIndexRequest deleteIndexRequest);

  /** Get an index. */
  VectorIndex getIndex(GetIndexRequest getIndexRequest);

  /** List all indexes in the given endpoint. */
  ListVectorIndexesResponse listIndexes(ListIndexesRequest listIndexesRequest);

  /**
   * Query an index with a vector, text, or both, and return the requested columns of the
   * best-matching rows.
   */
  QueryVectorIndexResponse queryIndex(QueryVectorIndexRequest queryVectorIndexRequest);

  /**
   * Use `next_page_token` returned from previous `QueryVectorIndex` or `QueryVectorIndexNextPage`
   * request to fetch next page of results.
   */
  QueryVectorIndexResponse queryNextPage(
      QueryVectorIndexNextPageRequest queryVectorIndexNextPageRequest);

  /**
   * Scan an index and return the first `num_results` rows after the exclusive `last_primary_key`.
   * Repeat the call with the returned `last_primary_key` to read the whole index.
   */
  ScanVectorIndexResponse scanIndex(ScanVectorIndexRequest scanVectorIndexRequest);

  /**
   * Start a sync of a Delta Sync index with a `TRIGGERED` pipeline from its source table. An index
   * with a `CONTINUOUS` pipeline syncs automatically and rejects manual syncs.
   */
  void syncIndex(SyncIndexRequest syncIndexRequest);

  /**
   * Insert rows into a Direct Vector Access index, replacing existing rows that have the same
   * primary key. The response reports how many rows succeeded and the primary keys of the rows that
   * failed.
   */
  UpsertDataVectorIndexResponse upsertDataVectorIndex(
      UpsertDataVectorIndexRequest upsertDataVectorIndexRequest);
}
