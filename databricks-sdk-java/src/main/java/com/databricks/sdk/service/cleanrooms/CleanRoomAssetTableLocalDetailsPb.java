// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CleanRoomAssetTableLocalDetailsPb {
  @JsonProperty("local_name")
  private String localName;

  @JsonProperty("partitions")
  private Collection<com.databricks.sdk.service.sharing.Partition> partitions;

  public CleanRoomAssetTableLocalDetailsPb setLocalName(String localName) {
    this.localName = localName;
    return this;
  }

  public String getLocalName() {
    return localName;
  }

  public CleanRoomAssetTableLocalDetailsPb setPartitions(
      Collection<com.databricks.sdk.service.sharing.Partition> partitions) {
    this.partitions = partitions;
    return this;
  }

  public Collection<com.databricks.sdk.service.sharing.Partition> getPartitions() {
    return partitions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomAssetTableLocalDetailsPb that = (CleanRoomAssetTableLocalDetailsPb) o;
    return Objects.equals(localName, that.localName) && Objects.equals(partitions, that.partitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localName, partitions);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetTableLocalDetailsPb.class)
        .add("localName", localName)
        .add("partitions", partitions)
        .toString();
  }
}
