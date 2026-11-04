// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListDatasourcesResponse {
  /** */
  @JsonProperty("datasources")
  private Collection<Datasource> datasources;

  /**
   * Opaque token for fetching the next page; pass it as `page_token` on the next call. It is empty
   * only when there are no more results. Page size is best-effort, so a short or even empty page
   * does not mean the end; keep paging until this token is empty, which is the only reliable
   * end-of-results signal.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDatasourcesResponse setDatasources(Collection<Datasource> datasources) {
    this.datasources = datasources;
    return this;
  }

  public Collection<Datasource> getDatasources() {
    return datasources;
  }

  public ListDatasourcesResponse setNextPageToken(String nextPageToken) {
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
    ListDatasourcesResponse that = (ListDatasourcesResponse) o;
    return Objects.equals(datasources, that.datasources)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasources, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatasourcesResponse.class)
        .add("datasources", datasources)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
