// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** An output name for a looked-up feature. */
@Generated
public class RenameOutput {
  /** Name of the feature in the feature table. */
  @JsonProperty("feature")
  private String feature;

  /** Output name for the feature. */
  @JsonProperty("output")
  private String output;

  public RenameOutput setFeature(String feature) {
    this.feature = feature;
    return this;
  }

  public String getFeature() {
    return feature;
  }

  public RenameOutput setOutput(String output) {
    this.output = output;
    return this;
  }

  public String getOutput() {
    return output;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RenameOutput that = (RenameOutput) o;
    return Objects.equals(feature, that.feature) && Objects.equals(output, that.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feature, output);
  }

  @Override
  public String toString() {
    return new ToStringer(RenameOutput.class)
        .add("feature", feature)
        .add("output", output)
        .toString();
  }
}
