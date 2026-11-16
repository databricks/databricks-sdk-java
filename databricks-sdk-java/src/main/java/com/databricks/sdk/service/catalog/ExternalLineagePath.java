// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A cloud storage path at one end of an external lineage relationship. */
@Generated
public class ExternalLineagePath {
  /**
   * URL of the cloud storage path. The path must be registered in Unity Catalog, i.e. under a
   * table, volume, or external location.
   */
  @JsonProperty("url")
  @QueryParam("url")
  private String url;

  public ExternalLineagePath setUrl(String url) {
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
    ExternalLineagePath that = (ExternalLineagePath) o;
    return Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalLineagePath.class).add("url", url).toString();
  }
}
