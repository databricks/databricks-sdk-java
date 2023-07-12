// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateModelRequest {
  /** Optional description for registered model. */
  @JsonProperty("description")
  private String description;

  /** Register models under this name */
  @JsonProperty("name")
  private String name;

  /** Additional metadata for registered model. */
  @JsonProperty("tags")
  private Collection<ModelTag> tags;

  public CreateModelRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateModelRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateModelRequest setTags(Collection<ModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ModelTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateModelRequest that = (CreateModelRequest) o;
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
    return new ToStringer(CreateModelRequest.class)
        .add("description", description)
        .add("name", name)
        .add("tags", tags)
        .toString();
  }
}
