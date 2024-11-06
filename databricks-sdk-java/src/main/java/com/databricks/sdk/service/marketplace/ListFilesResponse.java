// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListFilesResponse {
  /** */
  @JsonProperty("file_infos")
  private Collection<FileInfo> fileInfos;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListFilesResponse setFileInfos(Collection<FileInfo> fileInfos) {
    this.fileInfos = fileInfos;
    return this;
  }

  public Collection<FileInfo> getFileInfos() {
    return fileInfos;
  }

  public ListFilesResponse setNextPageToken(String nextPageToken) {
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
    ListFilesResponse that = (ListFilesResponse) o;
    return Objects.equals(fileInfos, that.fileInfos)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfos, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFilesResponse.class)
        .add("fileInfos", fileInfos)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
