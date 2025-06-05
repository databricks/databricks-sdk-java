// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DockerImagePb {
  @JsonProperty("basic_auth")
  private DockerBasicAuth basicAuth;

  @JsonProperty("url")
  private String url;

  public DockerImagePb setBasicAuth(DockerBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
    return this;
  }

  public DockerBasicAuth getBasicAuth() {
    return basicAuth;
  }

  public DockerImagePb setUrl(String url) {
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
    DockerImagePb that = (DockerImagePb) o;
    return Objects.equals(basicAuth, that.basicAuth) && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicAuth, url);
  }

  @Override
  public String toString() {
    return new ToStringer(DockerImagePb.class)
        .add("basicAuth", basicAuth)
        .add("url", url)
        .toString();
  }
}
