// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EnvironmentSpec {
  /**
   * A Unity Catalog container artifact (e.g. `catalog.schema.folder.image:tag`) to run as the
   * sandbox environment. When set, this image is used as the environment instead of resolving a
   * managed image from `environment_version`.
   */
  @JsonProperty("image_uri")
  private String imageUri;

  public EnvironmentSpec setImageUri(String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

  public String getImageUri() {
    return imageUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnvironmentSpec that = (EnvironmentSpec) o;
    return Objects.equals(imageUri, that.imageUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUri);
  }

  @Override
  public String toString() {
    return new ToStringer(EnvironmentSpec.class).add("imageUri", imageUri).toString();
  }
}
