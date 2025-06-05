// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class MavenLibraryPb {
  @JsonProperty("coordinates")
  private String coordinates;

  @JsonProperty("exclusions")
  private Collection<String> exclusions;

  @JsonProperty("repo")
  private String repo;

  public MavenLibraryPb setCoordinates(String coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public String getCoordinates() {
    return coordinates;
  }

  public MavenLibraryPb setExclusions(Collection<String> exclusions) {
    this.exclusions = exclusions;
    return this;
  }

  public Collection<String> getExclusions() {
    return exclusions;
  }

  public MavenLibraryPb setRepo(String repo) {
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
    MavenLibraryPb that = (MavenLibraryPb) o;
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
    return new ToStringer(MavenLibraryPb.class)
        .add("coordinates", coordinates)
        .add("exclusions", exclusions)
        .add("repo", repo)
        .toString();
  }
}
