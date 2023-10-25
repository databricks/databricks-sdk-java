// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AppManifest {
  /** Workspace dependencies. */
  @JsonProperty("dependencies")
  private Collection<Object> dependencies;

  /** application description */
  @JsonProperty("description")
  private String description;

  /** Ingress rules for app public endpoints */
  @JsonProperty("ingress")
  private Object ingress;

  /** Only a-z and dashes (-). Max length of 30. */
  @JsonProperty("name")
  private String name;

  /** Container private registry */
  @JsonProperty("registry")
  private Object registry;

  /** list of app services. Restricted to one for now. */
  @JsonProperty("services")
  private Object services;

  /** The manifest format version. Must be set to 1. */
  @JsonProperty("version")
  private Long version;

  public AppManifest setDependencies(Collection<Object> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public Collection<Object> getDependencies() {
    return dependencies;
  }

  public AppManifest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public AppManifest setIngress(Object ingress) {
    this.ingress = ingress;
    return this;
  }

  public Object getIngress() {
    return ingress;
  }

  public AppManifest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AppManifest setRegistry(Object registry) {
    this.registry = registry;
    return this;
  }

  public Object getRegistry() {
    return registry;
  }

  public AppManifest setServices(Object services) {
    this.services = services;
    return this;
  }

  public Object getServices() {
    return services;
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
    return Objects.equals(dependencies, that.dependencies)
        && Objects.equals(description, that.description)
        && Objects.equals(ingress, that.ingress)
        && Objects.equals(name, that.name)
        && Objects.equals(registry, that.registry)
        && Objects.equals(services, that.services)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies, description, ingress, name, registry, services, version);
  }

  @Override
  public String toString() {
    return new ToStringer(AppManifest.class)
        .add("dependencies", dependencies)
        .add("description", description)
        .add("ingress", ingress)
        .add("name", name)
        .add("registry", registry)
        .add("services", services)
        .add("version", version)
        .toString();
  }
}
