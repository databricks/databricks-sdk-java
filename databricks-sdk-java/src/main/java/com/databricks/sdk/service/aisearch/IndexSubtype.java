// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;

/**
 * The subtype of the AI Search index, determining the indexing and retrieval strategy. - `VECTOR`:
 * Not a supported create value — do not select it. Use `HYBRID` (vector + hybrid search) or
 * `FULL_TEXT` (full-text only). It is the proto2 default (`= 0`) solely to mirror the legacy
 * `index_v2.proto` enum value-for-value; it is not an offered index subtype. - `FULL_TEXT`: An
 * index that uses full-text search without vector embeddings. - `HYBRID`: An index that uses vector
 * embeddings for similarity search and hybrid search.
 */
@Generated
public enum IndexSubtype {
  FULL_TEXT, // An index that uses full-text search without vector embeddings.
  HYBRID, // An index that uses vector embeddings for similarity search and hybrid search.
  VECTOR, // Not a supported create value — do not select it. Use `HYBRID` (vector +
  // hybrid

}
