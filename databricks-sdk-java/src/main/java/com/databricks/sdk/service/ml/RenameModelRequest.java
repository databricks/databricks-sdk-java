// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RenameModelRequest {
  /** Registered model unique name identifier. */
  @JsonProperty("name")
  private String name;

  /** If provided, updates the name for this `registered_model`. */
  @JsonProperty("new_name")
  private String newName;

  public RenameModelRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RenameModelRequest setNewName(String newName) {
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
    RenameModelRequest that = (RenameModelRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(newName, that.newName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, newName);
  }

  @Override
  public String toString() {
    return new ToStringer(RenameModelRequest.class)
        .add("name", name)
        .add("newName", newName)
        .toString();
  }
}
