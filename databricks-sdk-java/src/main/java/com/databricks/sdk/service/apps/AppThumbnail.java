// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The thumbnail for an app. */
@Generated
public class AppThumbnail {
  /** The thumbnail image bytes. */
  @JsonProperty("thumbnail")
  private String thumbnail;

  public AppThumbnail setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  public String getThumbnail() {
    return thumbnail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppThumbnail that = (AppThumbnail) o;
    return Objects.equals(thumbnail, that.thumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thumbnail);
  }

  @Override
  public String toString() {
    return new ToStringer(AppThumbnail.class).add("thumbnail", thumbnail).toString();
  }
}
