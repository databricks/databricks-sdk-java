// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SetRegisteredModelTagRequest {
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

  public SetRegisteredModelTagRequest setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SetRegisteredModelTagRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SetRegisteredModelTagRequest setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }
}
