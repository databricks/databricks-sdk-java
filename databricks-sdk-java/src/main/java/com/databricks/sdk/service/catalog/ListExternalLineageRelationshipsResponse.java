// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListExternalLineageRelationshipsResponse {
  /**
   * Relationships that match the query. Each entry describes the object at the other end of the
   * relationship in one of `table_info`, `file_info`, `model_info`, or `external_metadata_info`,
   * together with the relationship itself in `external_lineage_info`.
   */
  @JsonProperty("external_lineage_relationships")
  private Collection<ExternalLineageInfo> externalLineageRelationships;

  /** Opaque token to retrieve the next page of results. Omitted when there are no more results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListExternalLineageRelationshipsResponse setExternalLineageRelationships(
      Collection<ExternalLineageInfo> externalLineageRelationships) {
    this.externalLineageRelationships = externalLineageRelationships;
    return this;
  }

  public Collection<ExternalLineageInfo> getExternalLineageRelationships() {
    return externalLineageRelationships;
  }

  public ListExternalLineageRelationshipsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListExternalLineageRelationshipsResponse that = (ListExternalLineageRelationshipsResponse) o;
    return Objects.equals(externalLineageRelationships, that.externalLineageRelationships)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalLineageRelationships, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExternalLineageRelationshipsResponse.class)
        .add("externalLineageRelationships", externalLineageRelationships)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
