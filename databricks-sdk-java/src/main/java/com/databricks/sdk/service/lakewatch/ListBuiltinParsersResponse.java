// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A page of built-in parsers, without their specs. */
@Generated
public class ListBuiltinParsersResponse {
  /**
   * Summary rows: the container fields only, without the spec. Read a spec with
   * `GetBuiltinParserVersion`.
   */
  @JsonProperty("builtin_parsers")
  private Collection<BuiltinParser> builtinParsers;

  /**
   * Opaque token for fetching the next page; pass it as `page_token` on the next call. It is empty
   * only when there are no more results. Page size is best-effort, so a short or even empty page
   * does not mean the end; keep paging until this token is empty, which is the only reliable
   * end-of-results signal.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListBuiltinParsersResponse setBuiltinParsers(Collection<BuiltinParser> builtinParsers) {
    this.builtinParsers = builtinParsers;
    return this;
  }

  public Collection<BuiltinParser> getBuiltinParsers() {
    return builtinParsers;
  }

  public ListBuiltinParsersResponse setNextPageToken(String nextPageToken) {
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
    ListBuiltinParsersResponse that = (ListBuiltinParsersResponse) o;
    return Objects.equals(builtinParsers, that.builtinParsers)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(builtinParsers, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBuiltinParsersResponse.class)
        .add("builtinParsers", builtinParsers)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
