// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListMetastoresResponsePb {
  @JsonProperty("metastores")
  private Collection<MetastoreInfo> metastores;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListMetastoresResponsePb setMetastores(Collection<MetastoreInfo> metastores) {
    this.metastores = metastores;
    return this;
  }

  public Collection<MetastoreInfo> getMetastores() {
    return metastores;
  }

  public ListMetastoresResponsePb setNextPageToken(String nextPageToken) {
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
    ListMetastoresResponsePb that = (ListMetastoresResponsePb) o;
    return Objects.equals(metastores, that.metastores)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastores, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListMetastoresResponsePb.class)
        .add("metastores", metastores)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
