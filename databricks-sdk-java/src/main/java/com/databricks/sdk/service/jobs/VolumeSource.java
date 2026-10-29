// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A Unity Catalog volume input source. The function is applied to each file. */
@Generated
public class VolumeSource {
  /**
   * Unity Catalog volume path to the input files (e.g. `/Volumes/<catalog>/<schema>/<volume>/...`).
   */
  @JsonProperty("volume_path")
  private String volumePath;

  public VolumeSource setVolumePath(String volumePath) {
    this.volumePath = volumePath;
    return this;
  }

  public String getVolumePath() {
    return volumePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VolumeSource that = (VolumeSource) o;
    return Objects.equals(volumePath, that.volumePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumePath);
  }

  @Override
  public String toString() {
    return new ToStringer(VolumeSource.class).add("volumePath", volumePath).toString();
  }
}
