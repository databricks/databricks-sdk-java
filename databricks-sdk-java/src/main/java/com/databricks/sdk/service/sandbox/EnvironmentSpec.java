// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EnvironmentSpec {
  /**
   * The Unity Catalog container image to run the sandbox from, in the form
   * `catalog.schema.artifact:tag`, or `catalog.schema.artifact@sha256:<digest>` to pin an exact
   * version. When omitted, the sandbox runs the default sandbox image. See [custom images].
   *
   * <p>[custom images]: https://docs.databricks.com/en/compute/serverless/sandbox-custom-image
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
