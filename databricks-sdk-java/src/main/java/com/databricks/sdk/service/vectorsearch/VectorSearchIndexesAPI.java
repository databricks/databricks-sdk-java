// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * **Index**: An efficient representation of your embedding vectors that supports real-time and
 * efficient approximate nearest neighbor (ANN) search queries.
 *
 * <p>There are 2 types of Vector Search indexes: - **Delta Sync Index**: An index that
 * automatically syncs with a source Delta Table, automatically and incrementally updating the index
 * as the underlying data in the Delta Table changes. - **Direct Vector Access Index**: An index
 * that supports direct read and write of vectors and metadata through our REST and SDK APIs. With
 * this model, the user manages index updates.
 */
@Generated
public class VectorSearchIndexesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(VectorSearchIndexesAPI.class);

  private final VectorSearchIndexesService impl;

  /** Regular-use constructor */
  public VectorSearchIndexesAPI(ApiClient apiClient) {
    impl = new VectorSearchIndexesImpl(apiClient);
  }

  /** Constructor for mocks */
  public VectorSearchIndexesAPI(VectorSearchIndexesService mock) {
    impl = mock;
  }

  /** Create a new index. */
  public VectorIndex createIndex(CreateVectorIndexRequest request) {
    return impl.createIndex(request);
  }

  public DeleteDataVectorIndexResponse deleteDataVectorIndex(String indexName) {
    return deleteDataVectorIndex(new DeleteDataVectorIndexRequest().setIndexName(indexName));
  }

  /** Handles the deletion of data from a specified vector index. */
  public DeleteDataVectorIndexResponse deleteDataVectorIndex(DeleteDataVectorIndexRequest request) {
    return impl.deleteDataVectorIndex(request);
  }

  public void deleteIndex(String indexName) {
    deleteIndex(new DeleteIndexRequest().setIndexName(indexName));
  }

  /** Delete an index. */
  public void deleteIndex(DeleteIndexRequest request) {
    impl.deleteIndex(request);
  }

  public VectorIndex getIndex(String indexName) {
    return getIndex(new GetIndexRequest().setIndexName(indexName));
  }

  /** Get an index. */
  public VectorIndex getIndex(GetIndexRequest request) {
    return impl.getIndex(request);
  }

  public Iterable<MiniVectorIndex> listIndexes(String endpointName) {
    return listIndexes(new ListIndexesRequest().setEndpointName(endpointName));
  }

  /** List all indexes in the given endpoint. */
  public Iterable<MiniVectorIndex> listIndexes(ListIndexesRequest request) {
    return new Paginator<>(
        request,
        impl::listIndexes,
        ListVectorIndexesResponse::getVectorIndexes,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Query the specified vector index. */
  public QueryVectorIndexResponse queryIndex(QueryVectorIndexRequest request) {
    return impl.queryIndex(request);
  }

  /**
   * Use `next_page_token` returned from previous `QueryVectorIndex` or `QueryVectorIndexNextPage`
   * request to fetch next page of results.
   */
  public QueryVectorIndexResponse queryNextPage(QueryVectorIndexNextPageRequest request) {
    return impl.queryNextPage(request);
  }

  /**
   * Scan the specified vector index and return the first `num_results` entries after the exclusive
   * `primary_key`.
   */
  public ScanVectorIndexResponse scanIndex(ScanVectorIndexRequest request) {
    return impl.scanIndex(request);
  }

  /** Triggers a synchronization process for a specified vector index. */
  public void syncIndex(SyncIndexRequest request) {
    impl.syncIndex(request);
  }

  /** Handles the upserting of data into a specified vector index. */
  public UpsertDataVectorIndexResponse upsertDataVectorIndex(UpsertDataVectorIndexRequest request) {
    return impl.upsertDataVectorIndex(request);
  }

  public VectorSearchIndexesService impl() {
    return impl;
  }
}
