// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A page of version metadata, without the specs. */
@Generated
public class ListParserVersionsResponse {
  /**
   * Opaque token for fetching the next page; pass it as `page_token` on the next call. It is empty
   * only when there are no more results. Page size is best-effort, so a short or even empty page
   * does not mean the end; keep paging until this token is empty, which is the only reliable
   * end-of-results signal.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /**
   * Version metadata only, oldest first, without the spec. Each row's `create_time` and
   * `created_by` are that version's own.
   */
  @JsonProperty("parser_versions")
  private Collection<ParserVersion> parserVersions;

  public ListParserVersionsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListParserVersionsResponse setParserVersions(Collection<ParserVersion> parserVersions) {
    this.parserVersions = parserVersions;
    return this;
  }

  public Collection<ParserVersion> getParserVersions() {
    return parserVersions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListParserVersionsResponse that = (ListParserVersionsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(parserVersions, that.parserVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, parserVersions);
  }

  @Override
  public String toString() {
    return new ToStringer(ListParserVersionsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("parserVersions", parserVersions)
        .toString();
  }
}
