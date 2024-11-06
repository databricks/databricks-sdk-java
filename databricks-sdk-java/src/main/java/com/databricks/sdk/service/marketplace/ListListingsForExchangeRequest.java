// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List listings for exchange */
@Generated
public class ListListingsForExchangeRequest {
  /** */
  @JsonIgnore
  @QueryParam("exchange_id")
  private String exchangeId;

  /** */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListListingsForExchangeRequest setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

  public String getExchangeId() {
    return exchangeId;
  }

  public ListListingsForExchangeRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListListingsForExchangeRequest setPageToken(String pageToken) {
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
    ListListingsForExchangeRequest that = (ListListingsForExchangeRequest) o;
    return Objects.equals(exchangeId, that.exchangeId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeId, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListListingsForExchangeRequest.class)
        .add("exchangeId", exchangeId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
