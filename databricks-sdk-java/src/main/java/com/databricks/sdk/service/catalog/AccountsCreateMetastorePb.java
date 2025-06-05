// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AccountsCreateMetastorePb {
  @JsonProperty("metastore_info")
  private CreateMetastore metastoreInfo;

  public AccountsCreateMetastorePb setMetastoreInfo(CreateMetastore metastoreInfo) {
    this.metastoreInfo = metastoreInfo;
    return this;
  }

  public CreateMetastore getMetastoreInfo() {
    return metastoreInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsCreateMetastorePb that = (AccountsCreateMetastorePb) o;
    return Objects.equals(metastoreInfo, that.metastoreInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsCreateMetastorePb.class)
        .add("metastoreInfo", metastoreInfo)
        .toString();
  }
}
