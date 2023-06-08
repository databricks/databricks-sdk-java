// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateConnection {
  /** Name of the connection. */
  @JsonProperty("name")
  private String name;

  /** Name of the connection. */
  private String nameArg;

  /** Object properties as map of string key-value pairs. */
  @JsonProperty("options_kvpairs")
  private OptionsKvPairs optionsKvpairs;

  public UpdateConnection setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateConnection setNameArg(String nameArg) {
    this.nameArg = nameArg;
    return this;
  }

  public String getNameArg() {
    return nameArg;
  }

  public UpdateConnection setOptionsKvpairs(OptionsKvPairs optionsKvpairs) {
    this.optionsKvpairs = optionsKvpairs;
    return this;
  }

  public OptionsKvPairs getOptionsKvpairs() {
    return optionsKvpairs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateConnection that = (UpdateConnection) o;
    return Objects.equals(name, that.name)
        && Objects.equals(nameArg, that.nameArg)
        && Objects.equals(optionsKvpairs, that.optionsKvpairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nameArg, optionsKvpairs);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateConnection.class)
        .add("name", name)
        .add("nameArg", nameArg)
        .add("optionsKvpairs", optionsKvpairs)
        .toString();
  }
}
