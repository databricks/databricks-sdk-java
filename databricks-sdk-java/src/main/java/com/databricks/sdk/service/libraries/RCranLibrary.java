// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
