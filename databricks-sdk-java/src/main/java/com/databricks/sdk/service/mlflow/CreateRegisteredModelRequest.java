// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateRegisteredModelRequest {
  /** Optional description for registered model. */
  @JsonProperty("description")
  private String description;

  /** Register models under this name */
  @JsonProperty("name")
  private String name;

  /** Additional metadata for registered model. */
  @JsonProperty("tags")
  private java.util.List<RegisteredModelTag> tags;

  public CreateRegisteredModelRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateRegisteredModelRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateRegisteredModelRequest setTags(java.util.List<RegisteredModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public java.util.List<RegisteredModelTag> getTags() {
    return tags;
  }
}
