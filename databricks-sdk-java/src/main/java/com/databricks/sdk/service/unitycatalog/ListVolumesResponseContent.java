// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListVolumesResponseContent {
  /** */
  @JsonProperty("volumes")
  private Collection<VolumeInfo> volumes;

  public ListVolumesResponseContent setVolumes(Collection<VolumeInfo> volumes) {
    this.volumes = volumes;
    return this;
  }

  public Collection<VolumeInfo> getVolumes() {
    return volumes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListVolumesResponseContent that = (ListVolumesResponseContent) o;
    return Objects.equals(volumes, that.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListVolumesResponseContent.class).add("volumes", volumes).toString();
  }
}
