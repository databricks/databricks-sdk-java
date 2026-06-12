// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Request to scan (paginate over) the rows of an AI Search index. Models the legacy {@code
 * num_results} / {@code last_primary_key} cursor as AIP-158 {@code page_size} / {@code page_token}.
 */
@Generated
public class ScanIndexRequest {
  /**
   * Full resource name of the index to scan. Format: {@code
   * workspaces/{workspace_id}/endpoints/{endpoint_id}/indexes/{index_id}}
   */
  @JsonIgnore private String name;

  /** Maximum number of rows to return in this page. */
  @JsonProperty("page_size")
  private Long pageSize;

  /** Page token from a previous response; if unset, scanning starts from the beginning. */
  @JsonProperty("page_token")
  private String pageToken;

  public ScanIndexRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ScanIndexRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ScanIndexRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScanIndexRequest that = (ScanIndexRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ScanIndexRequest.class)
        .add("name", name)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
