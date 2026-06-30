// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class MavenLibrary {
  /** Gradle-style maven coordinates. For example: "org.jsoup:jsoup:1.7.2". */
  @JsonProperty("coordinates")
  private String coordinates;

  /**
   * List of dependences to exclude. For example: `["slf4j:slf4j", "*:hadoop-client"]`.
   *
   * <p>Maven dependency exclusions:
   * https://maven.apache.org/guides/introduction/introduction-to-optional-and-excludes-dependencies.html.
   */
  @JsonProperty("exclusions")
  private Collection<String> exclusions;

  /**
   * Maven repo to install the Maven package from. If omitted, both Maven Central Repository and
   * Spark Packages are searched.
   */
  @JsonProperty("repo")
  private String repo;

  public MavenLibrary setCoordinates(String coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public String getCoordinates() {
    return coordinates;
  }

  public MavenLibrary setExclusions(Collection<String> exclusions) {
    this.exclusions = exclusions;
    return this;
  }

  public Collection<String> getExclusions() {
    return exclusions;
  }

  public MavenLibrary setRepo(String repo) {
    this.repo = repo;
    return this;
  }

  public String getRepo() {
    return repo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MavenLibrary that = (MavenLibrary) o;
    return Objects.equals(coordinates, that.coordinates)
        && Objects.equals(exclusions, that.exclusions)
        && Objects.equals(repo, that.repo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, exclusions, repo);
  }

  @Override
  public String toString() {
    return new ToStringer(MavenLibrary.class)
        .add("coordinates", coordinates)
        .add("exclusions", exclusions)
        .add("repo", repo)
        .toString();
  }
}
