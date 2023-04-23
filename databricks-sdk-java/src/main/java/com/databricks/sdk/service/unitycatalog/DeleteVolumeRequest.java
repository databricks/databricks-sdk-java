// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete a Volume */
public class DeleteVolumeRequest {
  /** The three-level (fully qualified) name of the volume */
  private String fullNameArg;

  public DeleteVolumeRequest setFullNameArg(String fullNameArg) {
    this.fullNameArg = fullNameArg;
    return this;
  }

  public String getFullNameArg() {
    return fullNameArg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteVolumeRequest that = (DeleteVolumeRequest) o;
    return Objects.equals(fullNameArg, that.fullNameArg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullNameArg);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteVolumeRequest.class).add("fullNameArg", fullNameArg).toString();
  }
}
