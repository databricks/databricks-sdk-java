// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SetModelVersionTagRequestPb {
  @JsonProperty("key")
  private String key;

  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  @JsonProperty("version")
  private String version;

  public SetModelVersionTagRequestPb setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SetModelVersionTagRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SetModelVersionTagRequestPb setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  public SetModelVersionTagRequestPb setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SetModelVersionTagRequestPb that = (SetModelVersionTagRequestPb) o;
    return Objects.equals(key, that.key)
        && Objects.equals(name, that.name)
        && Objects.equals(value, that.value)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, value, version);
  }

  @Override
  public String toString() {
    return new ToStringer(SetModelVersionTagRequestPb.class)
        .add("key", key)
        .add("name", name)
        .add("value", value)
        .add("version", version)
        .toString();
  }
}
