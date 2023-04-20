// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class DockerImage {
  /** */
  @JsonProperty("basic_auth")
  private DockerBasicAuth basicAuth;

  /** URL of the docker image. */
  @JsonProperty("url")
  private String url;

  public DockerImage setBasicAuth(DockerBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
    return this;
  }

  public DockerBasicAuth getBasicAuth() {
    return basicAuth;
  }

  public DockerImage setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DockerImage that = (DockerImage) o;
    return Objects.equals(basicAuth, that.basicAuth) && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicAuth, url);
  }

  @Override
  public String toString() {
    return new ToStringer(DockerImage.class).add("basicAuth", basicAuth).add("url", url).toString();
  }
}
