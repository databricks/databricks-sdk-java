// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CleanRoomAssetTableLocalDetails {
  /**
   * The fully qualified name of the table in its owner's local metastore, in the format of
   * *catalog*.*schema*.*table_name*
   */
  @JsonProperty("local_name")
  private String localName;

  /** Partition filtering specification for a shared table. */
  @JsonProperty("partitions")
  private Collection<com.databricks.sdk.service.sharing.PartitionSpecificationPartition> partitions;

  public CleanRoomAssetTableLocalDetails setLocalName(String localName) {
    this.localName = localName;
    return this;
  }

  public String getLocalName() {
    return localName;
  }

  public CleanRoomAssetTableLocalDetails setPartitions(
      Collection<com.databricks.sdk.service.sharing.PartitionSpecificationPartition> partitions) {
    this.partitions = partitions;
    return this;
  }

  public Collection<com.databricks.sdk.service.sharing.PartitionSpecificationPartition>
      getPartitions() {
    return partitions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomAssetTableLocalDetails that = (CleanRoomAssetTableLocalDetails) o;
    return Objects.equals(localName, that.localName) && Objects.equals(partitions, that.partitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localName, partitions);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetTableLocalDetails.class)
        .add("localName", localName)
        .add("partitions", partitions)
        .toString();
  }
}
