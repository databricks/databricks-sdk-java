// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RenameModelRequestPb {
  @JsonProperty("name")
  private String name;

  @JsonProperty("new_name")
  private String newName;

  public RenameModelRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RenameModelRequestPb setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RenameModelRequestPb that = (RenameModelRequestPb) o;
    return Objects.equals(name, that.name) && Objects.equals(newName, that.newName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, newName);
  }

  @Override
  public String toString() {
    return new ToStringer(RenameModelRequestPb.class)
        .add("name", name)
        .add("newName", newName)
        .toString();
  }
}
