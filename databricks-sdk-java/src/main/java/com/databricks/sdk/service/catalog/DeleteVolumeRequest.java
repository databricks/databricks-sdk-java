// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete a Volume
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteVolumeRequest {
  /** The three-level (fully qualified) name of the volume */
  private String fullNameArg;

  /**
   * <p>Setter for the field <code>fullNameArg</code>.</p>
   *
   * @param fullNameArg a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.DeleteVolumeRequest} object
   */
  public DeleteVolumeRequest setFullNameArg(String fullNameArg) {
    this.fullNameArg = fullNameArg;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullNameArg</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFullNameArg() {
    return fullNameArg;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteVolumeRequest that = (DeleteVolumeRequest) o;
    return Objects.equals(fullNameArg, that.fullNameArg);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(fullNameArg);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteVolumeRequest.class).add("fullNameArg", fullNameArg).toString();
  }
}
