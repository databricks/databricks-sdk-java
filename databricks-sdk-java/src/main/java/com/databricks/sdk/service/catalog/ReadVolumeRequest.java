// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a Volume */
public class ReadVolumeRequest {
  /** The three-level (fully qualified) name of the volume */
  private String fullNameArg;

  public ReadVolumeRequest setFullNameArg(String fullNameArg) {
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
    ReadVolumeRequest that = (ReadVolumeRequest) o;
    return Objects.equals(fullNameArg, that.fullNameArg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullNameArg);
  }

  @Override
  public String toString() {
    return new ToStringer(ReadVolumeRequest.class).add("fullNameArg", fullNameArg).toString();
  }
}
