// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class UpdateConnectionPb {
  @JsonIgnore private String name;

  @JsonProperty("new_name")
  private String newName;

  @JsonProperty("options")
  private Map<String, String> options;

  @JsonProperty("owner")
  private String owner;

  public UpdateConnectionPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateConnectionPb setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateConnectionPb setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public UpdateConnectionPb setOwner(String owner) {
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
    UpdateConnectionPb that = (UpdateConnectionPb) o;
    return Objects.equals(name, that.name)
        && Objects.equals(newName, that.newName)
        && Objects.equals(options, that.options)
        && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, newName, options, owner);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateConnectionPb.class)
        .add("name", name)
        .add("newName", newName)
        .add("options", options)
        .add("owner", owner)
        .toString();
  }
}
