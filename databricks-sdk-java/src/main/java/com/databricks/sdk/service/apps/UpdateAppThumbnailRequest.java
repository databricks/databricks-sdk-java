// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateAppThumbnailRequest {
  /** The app thumbnail to set. */
  @JsonProperty("app_thumbnail")
  private AppThumbnail appThumbnail;

  /** The name of the app. */
  @JsonIgnore private String name;

  public UpdateAppThumbnailRequest setAppThumbnail(AppThumbnail appThumbnail) {
    this.appThumbnail = appThumbnail;
    return this;
  }

  public AppThumbnail getAppThumbnail() {
    return appThumbnail;
  }

  public UpdateAppThumbnailRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateAppThumbnailRequest that = (UpdateAppThumbnailRequest) o;
    return Objects.equals(appThumbnail, that.appThumbnail) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appThumbnail, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAppThumbnailRequest.class)
        .add("appThumbnail", appThumbnail)
        .add("name", name)
        .toString();
  }
}
