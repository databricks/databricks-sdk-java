// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateFunction {
  /**
   * The fully-qualified name of the function (of the form
   * __catalog_name__.__schema_name__.__function__name__).
   */
  @JsonIgnore private String name;

  /** Username of current owner of function. */
  @JsonProperty("owner")
  private String owner;

  public UpdateFunction setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateFunction setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateFunction that = (UpdateFunction) o;
    return Objects.equals(name, that.name) && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, owner);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateFunction.class).add("name", name).add("owner", owner).toString();
  }
}
