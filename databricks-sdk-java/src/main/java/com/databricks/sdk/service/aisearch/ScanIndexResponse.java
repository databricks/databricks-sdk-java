// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/** Response for ScanIndex carrying a page of rows and an optional continuation token. */
@Generated
public class ScanIndexResponse {
  /** The rows in this page, each a struct of column name to value. */
  @JsonProperty("data")
  private Collection<Map<String, JsonNode>> data;

  /** Token for the next page; empty when the scan is exhausted. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ScanIndexResponse setData(Collection<Map<String, JsonNode>> data) {
    this.data = data;
    return this;
  }

  public Collection<Map<String, JsonNode>> getData() {
    return data;
  }

  public ScanIndexResponse setNextPageToken(String nextPageToken) {
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
    ScanIndexResponse that = (ScanIndexResponse) o;
    return Objects.equals(data, that.data) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ScanIndexResponse.class)
        .add("data", data)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
