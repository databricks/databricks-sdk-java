// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateAppRequest {
  /** The description of the app. */
  @JsonProperty("description")
  private String description;

  /**
   * The name of the app. The name must contain only lowercase alphanumeric characters and hyphens
   * and be between 2 and 30 characters long. It must be unique within the workspace.
   */
  @JsonProperty("name")
  private String name;

  public CreateAppRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateAppRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAppRequest that = (CreateAppRequest) o;
    return Objects.equals(description, that.description) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAppRequest.class)
        .add("description", description)
        .add("name", name)
        .toString();
  }
}
