// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PythonPyPiLibraryPb {
  @JsonProperty("package")
  private String packageValue;

  @JsonProperty("repo")
  private String repo;

  public PythonPyPiLibraryPb setPackage(String packageValue) {
    this.packageValue = packageValue;
    return this;
  }

  public String getPackage() {
    return packageValue;
  }

  public PythonPyPiLibraryPb setRepo(String repo) {
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
    PythonPyPiLibraryPb that = (PythonPyPiLibraryPb) o;
    return Objects.equals(packageValue, that.packageValue) && Objects.equals(repo, that.repo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageValue, repo);
  }

  @Override
  public String toString() {
    return new ToStringer(PythonPyPiLibraryPb.class)
        .add("packageValue", packageValue)
        .add("repo", repo)
        .toString();
  }
}
