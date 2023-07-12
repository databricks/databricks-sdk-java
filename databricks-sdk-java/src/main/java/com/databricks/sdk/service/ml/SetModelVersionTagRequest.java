// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SetModelVersionTagRequest {
  /**
   * Name of the tag. Maximum size depends on storage backend. If a tag with this name already
   * exists, its preexisting value will be replaced by the specified `value`. All storage backends
   * are guaranteed to support key values up to 250 bytes in size.
   */
  @JsonProperty("key")
  private String key;

  /** Unique name of the model. */
  @JsonProperty("name")
  private String name;

  /**
   * String value of the tag being logged. Maximum size depends on storage backend. All storage
   * backends are guaranteed to support key values up to 5000 bytes in size.
   */
  @JsonProperty("value")
  private String value;

  /** Model version number. */
  @JsonProperty("version")
  private String version;

  public SetModelVersionTagRequest setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SetModelVersionTagRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SetModelVersionTagRequest setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  public SetModelVersionTagRequest setVersion(String version) {
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
    SetModelVersionTagRequest that = (SetModelVersionTagRequest) o;
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
    return new ToStringer(SetModelVersionTagRequest.class)
        .add("key", key)
        .add("name", name)
        .add("value", value)
        .add("version", version)
        .toString();
  }
}
