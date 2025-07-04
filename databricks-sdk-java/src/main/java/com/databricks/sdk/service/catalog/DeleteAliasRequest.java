// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteAliasRequest {
  /** The name of the alias */
  @JsonIgnore private String alias;

  /** The three-level (fully qualified) name of the registered model */
  @JsonIgnore private String fullName;

  public DeleteAliasRequest setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public DeleteAliasRequest setFullName(String fullName) {
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
    DeleteAliasRequest that = (DeleteAliasRequest) o;
    return Objects.equals(alias, that.alias) && Objects.equals(fullName, that.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, fullName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAliasRequest.class)
        .add("alias", alias)
        .add("fullName", fullName)
        .toString();
  }
}
