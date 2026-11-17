// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;

/**
 * **AI Search Endpoint**: Represents the compute resources to host AI Search indexes.
 * AIP-conformant replacement for the legacy VectorSearchEndpoints API; functionally equivalent.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AiSearchService {
  /** Create a new AI Search endpoint. */
  Endpoint createEndpoint(CreateEndpointRequest createEndpointRequest);

  /**
   * Create a new AI Search index. The index is provisioned asynchronously; `status.ready` on
   * GetIndex reports when it can serve queries.
   */
  Index createIndex(CreateIndexRequest createIndexRequest);

  /** Delete an AI Search endpoint. */
  void deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest);

  /** Delete an AI Search index. */
  void deleteIndex(DeleteIndexRequest deleteIndexRequest);

  /** Get details for a single AI Search endpoint. */
  Endpoint getEndpoint(GetEndpointRequest getEndpointRequest);

  /** Get details for a single AI Search index. */
  Index getIndex(GetIndexRequest getIndexRequest);

  /** List AI Search endpoints in a workspace. */
  ListEndpointsResponse listEndpoints(ListEndpointsRequest listEndpointsRequest);

  /** List AI Search indexes on an endpoint. */
  ListIndexesResponse listIndexes(ListIndexesRequest listIndexesRequest);

  /** Query (search) an AI Search index. Read-only, so a read-scoped token may invoke it. */
  QueryIndexResponse queryIndex(QueryIndexRequest queryIndexRequest);

  /** Remove rows by primary key from a Direct Access AI Search index. */
  RemoveDataResponse removeData(RemoveDataRequest removeDataRequest);

  /** Scan (paginate over) the rows of an AI Search index. */
  ScanIndexResponse scanIndex(ScanIndexRequest scanIndexRequest);

  /**
   * Start a sync of a Delta Sync AI Search index with its source Delta table. Use it with
   * `TRIGGERED` pipelines; `CONTINUOUS` pipelines sync automatically. Direct Access indexes are
   * written through UpsertData instead.
   */
  SyncIndexResponse syncIndex(SyncIndexRequest syncIndexRequest);

  /**
   * Update an existing AI Search endpoint. Only the fields named in `update_mask` change. The
   * server applies a mask that spans several settings, such as `budget_policy_id` and
   * `custom_tags`, one setting at a time, so if a later setting fails, the earlier ones may already
   * have been applied.
   */
  Endpoint updateEndpoint(UpdateEndpointRequest updateEndpointRequest);

  /** Upsert rows into a Direct Access AI Search index. */
  UpsertDataResponse upsertData(UpsertDataRequest upsertDataRequest);
}
