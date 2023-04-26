// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListVolumesResponseContent class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListVolumesResponseContent {
  /** */
  @JsonProperty("volumes")
  private Collection<VolumeInfo> volumes;

  /**
   * <p>Setter for the field <code>volumes</code>.</p>
   *
   * @param volumes a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.ListVolumesResponseContent} object
   */
  public ListVolumesResponseContent setVolumes(Collection<VolumeInfo> volumes) {
    this.volumes = volumes;
    return this;
  }

  /**
   * <p>Getter for the field <code>volumes</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<VolumeInfo> getVolumes() {
    return volumes;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListVolumesResponseContent that = (ListVolumesResponseContent) o;
    return Objects.equals(volumes, that.volumes);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(volumes);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListVolumesResponseContent.class).add("volumes", volumes).toString();
  }
}
