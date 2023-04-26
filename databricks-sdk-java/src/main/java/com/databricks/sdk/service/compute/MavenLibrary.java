// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>MavenLibrary class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>coordinates</code>.</p>
   *
   * @param coordinates a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.MavenLibrary} object
   */
  public MavenLibrary setCoordinates(String coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  /**
   * <p>Getter for the field <code>coordinates</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCoordinates() {
    return coordinates;
  }

  /**
   * <p>Setter for the field <code>exclusions</code>.</p>
   *
   * @param exclusions a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.MavenLibrary} object
   */
  public MavenLibrary setExclusions(Collection<String> exclusions) {
    this.exclusions = exclusions;
    return this;
  }

  /**
   * <p>Getter for the field <code>exclusions</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getExclusions() {
    return exclusions;
  }

  /**
   * <p>Setter for the field <code>repo</code>.</p>
   *
   * @param repo a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.MavenLibrary} object
   */
  public MavenLibrary setRepo(String repo) {
    this.repo = repo;
    return this;
  }

  /**
   * <p>Getter for the field <code>repo</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRepo() {
    return repo;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MavenLibrary that = (MavenLibrary) o;
    return Objects.equals(coordinates, that.coordinates)
        && Objects.equals(exclusions, that.exclusions)
        && Objects.equals(repo, that.repo);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(coordinates, exclusions, repo);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(MavenLibrary.class)
        .add("coordinates", coordinates)
        .add("exclusions", exclusions)
        .add("repo", repo)
        .toString();
  }
}
