// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AccountsUpdateMetastorePb {
  @JsonIgnore private String metastoreId;

  @JsonProperty("metastore_info")
  private UpdateMetastore metastoreInfo;

  public AccountsUpdateMetastorePb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public AccountsUpdateMetastorePb setMetastoreInfo(UpdateMetastore metastoreInfo) {
    this.metastoreInfo = metastoreInfo;
    return this;
  }

  public UpdateMetastore getMetastoreInfo() {
    return metastoreInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsUpdateMetastorePb that = (AccountsUpdateMetastorePb) o;
    return Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(metastoreInfo, that.metastoreInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId, metastoreInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsUpdateMetastorePb.class)
        .add("metastoreId", metastoreId)
        .add("metastoreInfo", metastoreInfo)
        .toString();
  }
}
