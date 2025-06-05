// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListQuotasResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("quotas")
  private Collection<QuotaInfo> quotas;

  public ListQuotasResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListQuotasResponsePb setQuotas(Collection<QuotaInfo> quotas) {
    this.quotas = quotas;
    return this;
  }

  public Collection<QuotaInfo> getQuotas() {
    return quotas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListQuotasResponsePb that = (ListQuotasResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(quotas, that.quotas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, quotas);
  }

  @Override
  public String toString() {
    return new ToStringer(ListQuotasResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("quotas", quotas)
        .toString();
  }
}
