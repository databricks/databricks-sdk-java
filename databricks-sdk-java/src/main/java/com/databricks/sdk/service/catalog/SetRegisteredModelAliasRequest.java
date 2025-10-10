// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SetRegisteredModelAliasRequest {
  /** The name of the alias */
  @JsonIgnore private String alias;

  /** The three-level (fully qualified) name of the registered model */
  @JsonIgnore private String fullName;

  /** The version number of the model version to which the alias points */
  @JsonProperty("version_num")
  private Long versionNum;

  public SetRegisteredModelAliasRequest setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public SetRegisteredModelAliasRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public SetRegisteredModelAliasRequest setVersionNum(Long versionNum) {
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
    SetRegisteredModelAliasRequest that = (SetRegisteredModelAliasRequest) o;
    return Objects.equals(alias, that.alias)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(versionNum, that.versionNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, fullName, versionNum);
  }

  @Override
  public String toString() {
    return new ToStringer(SetRegisteredModelAliasRequest.class)
        .add("alias", alias)
        .add("fullName", fullName)
        .add("versionNum", versionNum)
        .toString();
  }
}
