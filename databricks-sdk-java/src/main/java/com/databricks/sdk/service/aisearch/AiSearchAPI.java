// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * **AI Search Endpoint**: Represents the compute resources to host AI Search indexes.
 * AIP-conformant replacement for the legacy VectorSearchEndpoints API; functionally equivalent.
 */
@Generated
public class AiSearchAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AiSearchAPI.class);

  private final AiSearchService impl;

  /** Regular-use constructor */
  public AiSearchAPI(ApiClient apiClient) {
    impl = new AiSearchImpl(apiClient);
  }

  /** Constructor for mocks */
  public AiSearchAPI(AiSearchService mock) {
    impl = mock;
  }

  /** Create a new AI Search endpoint. */
  public Endpoint createEndpoint(CreateEndpointRequest request) {
    return impl.createEndpoint(request);
  }

  /** Create a new AI Search index. */
  public Index createIndex(CreateIndexRequest request) {
    return impl.createIndex(request);
  }

  public void deleteEndpoint(String name) {
    deleteEndpoint(new DeleteEndpointRequest().setName(name));
  }

  /** Delete an AI Search endpoint. */
  public void deleteEndpoint(DeleteEndpointRequest request) {
    impl.deleteEndpoint(request);
  }

  public void deleteIndex(String name) {
    deleteIndex(new DeleteIndexRequest().setName(name));
  }

  /** Delete an AI Search index. */
  public void deleteIndex(DeleteIndexRequest request) {
    impl.deleteIndex(request);
  }

  public Endpoint getEndpoint(String name) {
    return getEndpoint(new GetEndpointRequest().setName(name));
  }

  /** Get details for a single AI Search endpoint. */
  public Endpoint getEndpoint(GetEndpointRequest request) {
    return impl.getEndpoint(request);
  }

  public Index getIndex(String name) {
    return getIndex(new GetIndexRequest().setName(name));
  }

  /** Get details for a single AI Search index. */
  public Index getIndex(GetIndexRequest request) {
    return impl.getIndex(request);
  }

  public Iterable<Endpoint> listEndpoints(String parent) {
    return listEndpoints(new ListEndpointsRequest().setParent(parent));
  }

  /** List AI Search endpoints in a workspace. */
  public Iterable<Endpoint> listEndpoints(ListEndpointsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listEndpoints,
        ListEndpointsResponse::getEndpoints,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Index> listIndexes(String parent) {
    return listIndexes(new ListIndexesRequest().setParent(parent));
  }

  /** List AI Search indexes on an endpoint. */
  public Iterable<Index> listIndexes(ListIndexesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listIndexes,
        ListIndexesResponse::getIndexes,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Query (search) an AI Search index. Read-only, so a read-scoped token may invoke it. */
  public QueryIndexResponse queryIndex(QueryIndexRequest request) {
    return impl.queryIndex(request);
  }

  /** Remove rows by primary key from a Direct Access AI Search index. */
  public RemoveDataResponse removeData(RemoveDataRequest request) {
    return impl.removeData(request);
  }

  /** Scan (paginate over) the rows of an AI Search index. */
  public ScanIndexResponse scanIndex(ScanIndexRequest request) {
    return impl.scanIndex(request);
  }

  /**
   * Synchronize a Delta Sync AI Search index with its source Delta table. Applies only to Delta
   * Sync indexes; Direct Access indexes are written via the data-plane upsert path.
   */
  public SyncIndexResponse syncIndex(SyncIndexRequest request) {
    return impl.syncIndex(request);
  }

  /**
   * Update an existing AI Search endpoint. Multi-bucket masks are supported and dispatched in
   * deterministic bucket order: budget policy, custom tags, throughput, then scaling/replicas.
   * Per-bucket dispatch is not atomic across buckets — if a later bucket fails, earlier buckets may
   * already have been applied.
   */
  public Endpoint updateEndpoint(UpdateEndpointRequest request) {
    return impl.updateEndpoint(request);
  }

  /** Upsert rows into a Direct Access AI Search index. */
  public UpsertDataResponse upsertData(UpsertDataRequest request) {
    return impl.upsertData(request);
  }

  public AiSearchService impl() {
    return impl;
  }
}
