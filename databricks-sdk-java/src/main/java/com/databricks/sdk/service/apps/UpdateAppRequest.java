// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class UpdateAppRequest {
  /** The description of the app. */
  @JsonProperty("description")
  private String description;

  /**
   * The name of the app. The name must contain only lowercase alphanumeric characters and hyphens.
   * It must be unique within the workspace.
   */
  @JsonProperty("name")
  private String name;

  /** Resources for the app. */
  @JsonProperty("resources")
  private Collection<AppResource> resources;

  public UpdateAppRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public UpdateAppRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateAppRequest setResources(Collection<AppResource> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<AppResource> getResources() {
    return resources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateAppRequest that = (UpdateAppRequest) o;
    return Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(resources, that.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, resources);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAppRequest.class)
        .add("description", description)
        .add("name", name)
        .add("resources", resources)
        .toString();
  }
}
