// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListDirectoryResponse {
  /** Array of DirectoryEntry. */
  @JsonProperty("contents")
  private Collection<DirectoryEntry> contents;

  /** A token, which can be sent as `page_token` to retrieve the next page. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDirectoryResponse setContents(Collection<DirectoryEntry> contents) {
    this.contents = contents;
    return this;
  }

  public Collection<DirectoryEntry> getContents() {
    return contents;
  }

  public ListDirectoryResponse setNextPageToken(String nextPageToken) {
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
    ListDirectoryResponse that = (ListDirectoryResponse) o;
    return Objects.equals(contents, that.contents)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDirectoryResponse.class)
        .add("contents", contents)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
