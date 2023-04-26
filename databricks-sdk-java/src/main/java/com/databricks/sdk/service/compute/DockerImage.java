// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>DockerImage class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DockerImage {
  /** */
  @JsonProperty("basic_auth")
  private DockerBasicAuth basicAuth;

  /** URL of the docker image. */
  @JsonProperty("url")
  private String url;

  /**
   * <p>Setter for the field <code>basicAuth</code>.</p>
   *
   * @param basicAuth a {@link com.databricks.sdk.service.compute.DockerBasicAuth} object
   * @return a {@link com.databricks.sdk.service.compute.DockerImage} object
   */
  public DockerImage setBasicAuth(DockerBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
    return this;
  }

  /**
   * <p>Getter for the field <code>basicAuth</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.DockerBasicAuth} object
   */
  public DockerBasicAuth getBasicAuth() {
    return basicAuth;
  }

  /**
   * <p>Setter for the field <code>url</code>.</p>
   *
   * @param url a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.DockerImage} object
   */
  public DockerImage setUrl(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>Getter for the field <code>url</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DockerImage that = (DockerImage) o;
    return Objects.equals(basicAuth, that.basicAuth) && Objects.equals(url, that.url);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(basicAuth, url);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DockerImage.class).add("basicAuth", basicAuth).add("url", url).toString();
  }
}
