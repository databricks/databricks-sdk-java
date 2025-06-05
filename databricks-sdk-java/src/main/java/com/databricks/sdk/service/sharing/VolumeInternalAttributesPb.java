// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Internal information for D2D sharing that should not be disclosed to external users. */
@Generated
class VolumeInternalAttributesPb {
  @JsonProperty("storage_location")
  private String storageLocation;

  @JsonProperty("type")
  private String typeValue;

  public VolumeInternalAttributesPb setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public VolumeInternalAttributesPb setType(String typeValue) {
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
    VolumeInternalAttributesPb that = (VolumeInternalAttributesPb) o;
    return Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageLocation, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(VolumeInternalAttributesPb.class)
        .add("storageLocation", storageLocation)
        .add("typeValue", typeValue)
        .toString();
  }
}
