// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RegisteredModelAlias {
  /** Name of the alias. */
  @JsonProperty("alias_name")
  private String aliasName;

  /** Numeric model version that alias will reference. */
  @JsonProperty("version_num")
  private Long versionNum;

  public RegisteredModelAlias setAliasName(String aliasName) {
    this.aliasName = aliasName;
    return this;
  }

  public String getAliasName() {
    return aliasName;
  }

  public RegisteredModelAlias setVersionNum(Long versionNum) {
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
    RegisteredModelAlias that = (RegisteredModelAlias) o;
    return Objects.equals(aliasName, that.aliasName) && Objects.equals(versionNum, that.versionNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliasName, versionNum);
  }

  @Override
  public String toString() {
    return new ToStringer(RegisteredModelAlias.class)
        .add("aliasName", aliasName)
        .add("versionNum", versionNum)
        .toString();
  }
}
