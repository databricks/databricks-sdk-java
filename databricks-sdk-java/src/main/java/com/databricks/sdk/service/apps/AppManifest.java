// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** App manifest definition */
@Generated
public class AppManifest {
  /** Description of the app defined by manifest author / publisher */
  @JsonProperty("description")
  private String description;

  /** Name of the app defined by manifest author / publisher */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("resource_specs")
  private Collection<AppManifestAppResourceSpec> resourceSpecs;

  /** The manifest schema version, for now only 1 is allowed */
  @JsonProperty("version")
  private Long version;

  public AppManifest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public AppManifest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AppManifest setResourceSpecs(Collection<AppManifestAppResourceSpec> resourceSpecs) {
    this.resourceSpecs = resourceSpecs;
    return this;
  }

  public Collection<AppManifestAppResourceSpec> getResourceSpecs() {
    return resourceSpecs;
  }

  public AppManifest setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppManifest that = (AppManifest) o;
    return Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(resourceSpecs, that.resourceSpecs)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, resourceSpecs, version);
  }

  @Override
  public String toString() {
    return new ToStringer(AppManifest.class)
        .add("description", description)
        .add("name", name)
        .add("resourceSpecs", resourceSpecs)
        .add("version", version)
        .toString();
  }
}
