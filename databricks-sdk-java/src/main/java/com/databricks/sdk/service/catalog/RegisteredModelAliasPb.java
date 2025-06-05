// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Registered model alias. */
@Generated
class RegisteredModelAliasPb {
  @JsonProperty("alias_name")
  private String aliasName;

  @JsonProperty("version_num")
  private Long versionNum;

  public RegisteredModelAliasPb setAliasName(String aliasName) {
    this.aliasName = aliasName;
    return this;
  }

  public String getAliasName() {
    return aliasName;
  }

  public RegisteredModelAliasPb setVersionNum(Long versionNum) {
    this.versionNum = versionNum;
    return this;
  }

  public Long getVersionNum() {
    return versionNum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegisteredModelAliasPb that = (RegisteredModelAliasPb) o;
    return Objects.equals(aliasName, that.aliasName) && Objects.equals(versionNum, that.versionNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliasName, versionNum);
  }

  @Override
  public String toString() {
    return new ToStringer(RegisteredModelAliasPb.class)
        .add("aliasName", aliasName)
        .add("versionNum", versionNum)
        .toString();
  }
}
