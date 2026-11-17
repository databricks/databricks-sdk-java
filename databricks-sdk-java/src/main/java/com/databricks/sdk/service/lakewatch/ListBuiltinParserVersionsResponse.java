// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A page of built-in version metadata, without the specs. */
@Generated
public class ListBuiltinParserVersionsResponse {
  /** Version metadata only, oldest first, without the spec. */
  @JsonProperty("builtin_parser_versions")
  private Collection<BuiltinParserVersion> builtinParserVersions;

  /**
   * Opaque token for fetching the next page; pass it as `page_token` on the next call. It is empty
   * when there are no more results.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListBuiltinParserVersionsResponse setBuiltinParserVersions(
      Collection<BuiltinParserVersion> builtinParserVersions) {
    this.builtinParserVersions = builtinParserVersions;
    return this;
  }

  public Collection<BuiltinParserVersion> getBuiltinParserVersions() {
    return builtinParserVersions;
  }

  public ListBuiltinParserVersionsResponse setNextPageToken(String nextPageToken) {
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
    ListBuiltinParserVersionsResponse that = (ListBuiltinParserVersionsResponse) o;
    return Objects.equals(builtinParserVersions, that.builtinParserVersions)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(builtinParserVersions, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBuiltinParserVersionsResponse.class)
        .add("builtinParserVersions", builtinParserVersions)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
