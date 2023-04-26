// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RCranLibrary class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RCranLibrary {
  /** The name of the CRAN package to install. */
  @JsonProperty("package")
  private String packageValue;

  /**
   * The repository where the package can be found. If not specified, the default CRAN repo is used.
   */
  @JsonProperty("repo")
  private String repo;

  /**
   * <p>setPackage.</p>
   *
   * @param packageValue a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.RCranLibrary} object
   */
  public RCranLibrary setPackage(String packageValue) {
    this.packageValue = packageValue;
    return this;
  }

  /**
   * <p>getPackage.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPackage() {
    return packageValue;
  }

  /**
   * <p>Setter for the field <code>repo</code>.</p>
   *
   * @param repo a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.RCranLibrary} object
   */
  public RCranLibrary setRepo(String repo) {
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
    RCranLibrary that = (RCranLibrary) o;
    return Objects.equals(packageValue, that.packageValue) && Objects.equals(repo, that.repo);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(packageValue, repo);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RCranLibrary.class)
        .add("packageValue", packageValue)
        .add("repo", repo)
        .toString();
  }
}
