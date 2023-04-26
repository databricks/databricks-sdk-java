// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get a model version URI
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetModelVersionDownloadUriRequest {
  /** Name of the registered model */
  @QueryParam("name")
  private String name;

  /** Model version number */
  @QueryParam("version")
  private String version;

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.GetModelVersionDownloadUriRequest} object
   */
  public GetModelVersionDownloadUriRequest setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>version</code>.</p>
   *
   * @param version a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.GetModelVersionDownloadUriRequest} object
   */
  public GetModelVersionDownloadUriRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  /**
   * <p>Getter for the field <code>version</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getVersion() {
    return version;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelVersionDownloadUriRequest that = (GetModelVersionDownloadUriRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(version, that.version);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetModelVersionDownloadUriRequest.class)
        .add("name", name)
        .add("version", version)
        .toString();
  }
}
