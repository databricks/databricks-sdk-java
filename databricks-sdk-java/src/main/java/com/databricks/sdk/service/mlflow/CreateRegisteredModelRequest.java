// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class CreateRegisteredModelRequest {
  /** Optional description for registered model. */
  @JsonProperty("description")
  private String description;

  /** Register models under this name */
  @JsonProperty("name")
  private String name;

  /** Additional metadata for registered model. */
  @JsonProperty("tags")
  private Collection<RegisteredModelTag> tags;

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

  public CreateRegisteredModelRequest setTags(Collection<RegisteredModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<RegisteredModelTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateRegisteredModelRequest that = (CreateRegisteredModelRequest) o;
    return Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRegisteredModelRequest.class)
        .add("description", description)
        .add("name", name)
        .add("tags", tags)
        .toString();
  }
}
