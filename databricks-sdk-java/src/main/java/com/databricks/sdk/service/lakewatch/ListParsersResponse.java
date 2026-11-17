// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A page of parsers, without their specs. */
@Generated
public class ListParsersResponse {
  /**
   * Opaque token for fetching the next page; pass it as `page_token` on the next call. It is empty
   * only when there are no more results. Page size is best-effort, so a short or even empty page
   * does not mean the end; keep paging until this token is empty, which is the only reliable
   * end-of-results signal.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /**
   * Summary rows: the container fields only, without the spec. Read a spec with `GetParserVersion`.
   */
  @JsonProperty("parsers")
  private Collection<Parser> parsers;

  public ListParsersResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListParsersResponse setParsers(Collection<Parser> parsers) {
    this.parsers = parsers;
    return this;
  }

  public Collection<Parser> getParsers() {
    return parsers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListParsersResponse that = (ListParsersResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(parsers, that.parsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, parsers);
  }

  @Override
  public String toString() {
    return new ToStringer(ListParsersResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("parsers", parsers)
        .toString();
  }
}
