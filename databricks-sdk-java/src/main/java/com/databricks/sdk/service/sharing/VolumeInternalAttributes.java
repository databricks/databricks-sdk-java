// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Internal information for D2D sharing that should not be disclosed to external users. */
@Generated
public class VolumeInternalAttributes {
  /** The cloud storage location of the volume */
  @JsonProperty("storage_location")
  private String storageLocation;

  /** The type of the shared volume. */
  @JsonProperty("type")
  private String typeValue;

  public VolumeInternalAttributes setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public VolumeInternalAttributes setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VolumeInternalAttributes that = (VolumeInternalAttributes) o;
    return Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageLocation, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(VolumeInternalAttributes.class)
        .add("storageLocation", storageLocation)
        .add("typeValue", typeValue)
        .toString();
  }
}
