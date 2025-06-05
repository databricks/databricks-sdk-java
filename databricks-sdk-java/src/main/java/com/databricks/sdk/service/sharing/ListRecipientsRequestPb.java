// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List share recipients */
@Generated
class ListRecipientsRequestPb {
  @JsonIgnore
  @QueryParam("data_recipient_global_metastore_id")
  private String dataRecipientGlobalMetastoreId;

  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListRecipientsRequestPb setDataRecipientGlobalMetastoreId(
      String dataRecipientGlobalMetastoreId) {
    this.dataRecipientGlobalMetastoreId = dataRecipientGlobalMetastoreId;
    return this;
  }

  public String getDataRecipientGlobalMetastoreId() {
    return dataRecipientGlobalMetastoreId;
  }

  public ListRecipientsRequestPb setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListRecipientsRequestPb setPageToken(String pageToken) {
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
    ListRecipientsRequestPb that = (ListRecipientsRequestPb) o;
    return Objects.equals(dataRecipientGlobalMetastoreId, that.dataRecipientGlobalMetastoreId)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataRecipientGlobalMetastoreId, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRecipientsRequestPb.class)
        .add("dataRecipientGlobalMetastoreId", dataRecipientGlobalMetastoreId)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
