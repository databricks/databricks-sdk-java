// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PythonPyPiLibrary {
  /**
   * The name of the pypi package to install. An optional exact version specification is also
   * supported. Examples: "simplejson" and "simplejson==3.8.0".
   */
  @JsonProperty("package")
  private String packageValue;

  /**
   * The repository where the package can be found. If not specified, the default pip index is used.
   */
  @JsonProperty("repo")
  private String repo;

  public PythonPyPiLibrary setPackage(String packageValue) {
    this.packageValue = packageValue;
    return this;
  }

  public String getPackage() {
    return packageValue;
  }

  public PythonPyPiLibrary setRepo(String repo) {
    this.repo = repo;
    return this;
  }

  public String getRepo() {
    return repo;
  }
}
