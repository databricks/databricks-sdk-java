// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * **Index**: An efficient representation of your embedding vectors that supports real-time and
 * efficient approximate nearest neighbor (ANN) search queries.
 *
 * <p>There are 2 types of Vector Search indexes: * **Delta Sync Index**: An index that
 * automatically syncs with a source Delta Table, automatically and incrementally updating the index
 * as the underlying data in the Delta Table changes. * **Direct Vector Access Index**: An index
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

  public CreateVectorIndexResponse createIndex(
      String name, String endpointName, String primaryKey, VectorIndexType indexType) {
    return createIndex(
        new CreateVectorIndexRequest()
            .setName(name)
            .setEndpointName(endpointName)
            .setPrimaryKey(primaryKey)
            .setIndexType(indexType));
  }

  /**
   * Create an index.
   *
   * <p>Create a new index.
   */
  public CreateVectorIndexResponse createIndex(CreateVectorIndexRequest request) {
    return impl.createIndex(request);
  }

  public DeleteDataVectorIndexResponse deleteDataVectorIndex(
      String indexName, Collection<String> primaryKeys) {
    return deleteDataVectorIndex(
        new DeleteDataVectorIndexRequest().setIndexName(indexName).setPrimaryKeys(primaryKeys));
  }

  /**
   * Delete data from index.
   *
   * <p>Handles the deletion of data from a specified vector index.
   */
  public DeleteDataVectorIndexResponse deleteDataVectorIndex(DeleteDataVectorIndexRequest request) {
    return impl.deleteDataVectorIndex(request);
  }

  public void deleteIndex(String indexName) {
    deleteIndex(new DeleteIndexRequest().setIndexName(indexName));
  }

  /**
   * Delete an index.
   *
   * <p>Delete an index.
   */
  public void deleteIndex(DeleteIndexRequest request) {
    impl.deleteIndex(request);
  }

  public VectorIndex getIndex(String indexName) {
    return getIndex(new GetIndexRequest().setIndexName(indexName));
  }

  /**
   * Get an index.
   *
   * <p>Get an index.
   */
  public VectorIndex getIndex(GetIndexRequest request) {
    return impl.getIndex(request);
  }

  public Iterable<MiniVectorIndex> listIndexes(String endpointName) {
    return listIndexes(new ListIndexesRequest().setEndpointName(endpointName));
  }

  /**
   * List indexes.
   *
   * <p>List all indexes in the given endpoint.
   */
  public Iterable<MiniVectorIndex> listIndexes(ListIndexesRequest request) {
    return new Paginator<>(
        request,
        impl::listIndexes,
        ListVectorIndexesResponse::getVectorIndexes,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public QueryVectorIndexResponse queryIndex(String indexName, Collection<String> columns) {
    return queryIndex(new QueryVectorIndexRequest().setIndexName(indexName).setColumns(columns));
  }

  /**
   * Query an index.
   *
   * <p>Query the specified vector index.
   */
  public QueryVectorIndexResponse queryIndex(QueryVectorIndexRequest request) {
    return impl.queryIndex(request);
  }

  public ScanVectorIndexResponse scanIndex(String indexName) {
    return scanIndex(new ScanVectorIndexRequest().setIndexName(indexName));
  }

  /**
   * Scan an index.
   *
   * <p>Scan the specified vector index and return the first `num_results` entries after the
   * exclusive `primary_key`.
   */
  public ScanVectorIndexResponse scanIndex(ScanVectorIndexRequest request) {
    return impl.scanIndex(request);
  }

  public void syncIndex(String indexName) {
    syncIndex(new SyncIndexRequest().setIndexName(indexName));
  }

  /**
   * Synchronize an index.
   *
   * <p>Triggers a synchronization process for a specified vector index.
   */
  public void syncIndex(SyncIndexRequest request) {
    impl.syncIndex(request);
  }

  public UpsertDataVectorIndexResponse upsertDataVectorIndex(String indexName, String inputsJson) {
    return upsertDataVectorIndex(
        new UpsertDataVectorIndexRequest().setIndexName(indexName).setInputsJson(inputsJson));
  }

  /**
   * Upsert data into an index.
   *
   * <p>Handles the upserting of data into a specified vector index.
   */
  public UpsertDataVectorIndexResponse upsertDataVectorIndex(UpsertDataVectorIndexRequest request) {
    return impl.upsertDataVectorIndex(request);
  }

  public VectorSearchIndexesService impl() {
    return impl;
  }
}
