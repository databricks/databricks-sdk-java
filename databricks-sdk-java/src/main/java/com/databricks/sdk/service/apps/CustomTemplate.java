// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CustomTemplate {
  /** */
  @JsonProperty("creator")
  private String creator;

  /** The description of the template. */
  @JsonProperty("description")
  private String description;

  /** The Git provider of the template. */
  @JsonProperty("git_provider")
  private String gitProvider;

  /** The Git repository URL that the template resides in. */
  @JsonProperty("git_repo")
  private String gitRepo;

  /**
   * The manifest of the template. It defines fields and default values when installing the
   * template.
   */
  @JsonProperty("manifest")
  private AppManifest manifest;

  /**
   * The name of the template. It must contain only alphanumeric characters, hyphens, underscores,
   * and whitespaces. It must be unique within the workspace.
   */
  @JsonProperty("name")
  private String name;

  /** The path to the template within the Git repository. */
  @JsonProperty("path")
  private String path;

  public CustomTemplate setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public CustomTemplate setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CustomTemplate setGitProvider(String gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  public String getGitProvider() {
    return gitProvider;
  }

  public CustomTemplate setGitRepo(String gitRepo) {
    this.gitRepo = gitRepo;
    return this;
  }

  public String getGitRepo() {
    return gitRepo;
  }

  public CustomTemplate setManifest(AppManifest manifest) {
    this.manifest = manifest;
    return this;
  }

  public AppManifest getManifest() {
    return manifest;
  }

  public CustomTemplate setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CustomTemplate setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomTemplate that = (CustomTemplate) o;
    return Objects.equals(creator, that.creator)
        && Objects.equals(description, that.description)
        && Objects.equals(gitProvider, that.gitProvider)
        && Objects.equals(gitRepo, that.gitRepo)
        && Objects.equals(manifest, that.manifest)
        && Objects.equals(name, that.name)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, description, gitProvider, gitRepo, manifest, name, path);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomTemplate.class)
        .add("creator", creator)
        .add("description", description)
        .add("gitProvider", gitProvider)
        .add("gitRepo", gitRepo)
        .add("manifest", manifest)
        .add("name", name)
        .add("path", path)
        .toString();
  }
}
