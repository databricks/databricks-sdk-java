// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class UpdateConnection {
  /** Name of the connection. */
  private String nameArg;

  /** New name for the connection. */
  @JsonProperty("new_name")
  private String newName;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("options")
  private Map<String, String> options;

  /** Username of current owner of the connection. */
  @JsonProperty("owner")
  private String owner;

  public UpdateConnection setNameArg(String nameArg) {
    this.nameArg = nameArg;
    return this;
  }

  public String getNameArg() {
    return nameArg;
  }

  public UpdateConnection setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateConnection setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public UpdateConnection setOwner(String owner) {
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
    UpdateConnection that = (UpdateConnection) o;
    return Objects.equals(nameArg, that.nameArg)
        && Objects.equals(newName, that.newName)
        && Objects.equals(options, that.options)
        && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameArg, newName, options, owner);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateConnection.class)
        .add("nameArg", nameArg)
        .add("newName", newName)
        .add("options", options)
        .add("owner", owner)
        .toString();
  }
}
