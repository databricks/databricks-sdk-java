// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Contains a page of immediate directory entries and an optional continuation token. An empty token
 * marks the final page. Pages reflect concurrent directory changes.
 */
@Generated
public class ListDirectoryContentsResponse {
  /** */
  @JsonProperty("contents")
  private Collection<SandboxFileInfo> contents;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDirectoryContentsResponse setContents(Collection<SandboxFileInfo> contents) {
    this.contents = contents;
    return this;
  }

  public Collection<SandboxFileInfo> getContents() {
    return contents;
  }

  public ListDirectoryContentsResponse setNextPageToken(String nextPageToken) {
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
    ListDirectoryContentsResponse that = (ListDirectoryContentsResponse) o;
    return Objects.equals(contents, that.contents)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDirectoryContentsResponse.class)
        .add("contents", contents)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
