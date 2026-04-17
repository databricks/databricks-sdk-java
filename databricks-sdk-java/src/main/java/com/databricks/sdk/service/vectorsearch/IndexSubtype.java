// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;

/**
 * The subtype of the vector search index, determining the indexing and retrieval strategy. -
 * `VECTOR`: Not supported. Use `HYBRID` instead. - `FULL_TEXT`: An index that uses full-text search
 * without vector embeddings. - `HYBRID`: An index that uses vector embeddings for similarity search
 * and hybrid search.
 */
@Generated
public enum IndexSubtype {
  FULL_TEXT, // An index that uses full-text search without vector embeddings.
  HYBRID, // An index that uses vector embeddings for similarity search and hybrid search.
  VECTOR, // Not supported. Use `HYBRID` instead.
}
