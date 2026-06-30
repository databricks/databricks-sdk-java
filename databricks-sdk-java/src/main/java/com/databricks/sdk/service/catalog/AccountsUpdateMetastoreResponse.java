// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The metastore update request succeeded. */
@Generated
public class AccountsUpdateMetastoreResponse {
  /** */
  @JsonProperty("metastore_info")
  private MetastoreInfo metastoreInfo;

  public AccountsUpdateMetastoreResponse setMetastoreInfo(MetastoreInfo metastoreInfo) {
    this.metastoreInfo = metastoreInfo;
    return this;
  }

  public MetastoreInfo getMetastoreInfo() {
    return metastoreInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsUpdateMetastoreResponse that = (AccountsUpdateMetastoreResponse) o;
    return Objects.equals(metastoreInfo, that.metastoreInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsUpdateMetastoreResponse.class)
        .add("metastoreInfo", metastoreInfo)
        .toString();
  }
}
