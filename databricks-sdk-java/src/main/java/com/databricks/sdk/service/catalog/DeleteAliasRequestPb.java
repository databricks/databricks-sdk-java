// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a Registered Model Alias */
@Generated
class DeleteAliasRequestPb {
  @JsonIgnore private String alias;

  @JsonIgnore private String fullName;

  public DeleteAliasRequestPb setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public DeleteAliasRequestPb setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteAliasRequestPb that = (DeleteAliasRequestPb) o;
    return Objects.equals(alias, that.alias) && Objects.equals(fullName, that.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, fullName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAliasRequestPb.class)
        .add("alias", alias)
        .add("fullName", fullName)
        .toString();
  }
}
