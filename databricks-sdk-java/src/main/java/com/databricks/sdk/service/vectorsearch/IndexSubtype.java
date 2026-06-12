// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;

/**
 * The subtype of the AI Search index, determining the indexing and retrieval strategy.
 *
 * <ul>
 *   <li>{@code VECTOR}: Not supported. Use {@code HYBRID} instead.
 *   <li>{@code FULL_TEXT}: An index that uses full-text search without vector embeddings.
 *   <li>{@code HYBRID}: An index that uses vector embeddings for similarity search and hybrid
 *       search.
 * </ul>
 */
@Generated
public enum IndexSubtype {
  FULL_TEXT, // An index that uses full-text search without vector embeddings.
  HYBRID, // An index that uses vector embeddings for similarity search and hybrid search.
  VECTOR, // Not supported. Use `HYBRID` instead.
}
