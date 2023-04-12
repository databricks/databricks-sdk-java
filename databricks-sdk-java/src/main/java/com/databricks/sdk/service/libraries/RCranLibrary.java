// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class RCranLibrary {
  /** The name of the CRAN package to install. */
  @JsonProperty("package")
  private String packageValue;

  /**
   * The repository where the package can be found. If not specified, the default CRAN repo is used.
   */
  @JsonProperty("repo")
  private String repo;

  public RCranLibrary setPackage(String packageValue) {
    this.packageValue = packageValue;
    return this;
  }

  public String getPackage() {
    return packageValue;
  }

  public RCranLibrary setRepo(String repo) {
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
    RCranLibrary that = (RCranLibrary) o;
    return Objects.equals(packageValue, that.packageValue) && Objects.equals(repo, that.repo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageValue, repo);
  }

  @Override
  public String toString() {
    return new ToStringer(RCranLibrary.class)
        .add("packageValue", packageValue)
        .add("repo", repo)
        .toString();
  }
}
