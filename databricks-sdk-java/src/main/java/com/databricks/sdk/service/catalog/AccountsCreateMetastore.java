// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Properties of the new metastore. */
@Generated
public class AccountsCreateMetastore {
  /** */
  @JsonProperty("metastore_info")
  private CreateAccountsMetastore metastoreInfo;

  public AccountsCreateMetastore setMetastoreInfo(CreateAccountsMetastore metastoreInfo) {
    this.metastoreInfo = metastoreInfo;
    return this;
  }

  public CreateAccountsMetastore getMetastoreInfo() {
    return metastoreInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsCreateMetastore that = (AccountsCreateMetastore) o;
    return Objects.equals(metastoreInfo, that.metastoreInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsCreateMetastore.class)
        .add("metastoreInfo", metastoreInfo)
        .toString();
  }
}
