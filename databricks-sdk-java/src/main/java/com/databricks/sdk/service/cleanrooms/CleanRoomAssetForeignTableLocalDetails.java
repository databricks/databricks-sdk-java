// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CleanRoomAssetForeignTableLocalDetails {
  /**
   * The fully qualified name of the foreign table in its owner's local metastore, in the format of
   * <i>catalog</i>.<i>schema</i>.<i>foreign_table_name</i>
   */
  @JsonProperty("local_name")
  private String localName;

  public CleanRoomAssetForeignTableLocalDetails setLocalName(String localName) {
    this.localName = localName;
    return this;
  }

  public String getLocalName() {
    return localName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomAssetForeignTableLocalDetails that = (CleanRoomAssetForeignTableLocalDetails) o;
    return Objects.equals(localName, that.localName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localName);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetForeignTableLocalDetails.class)
        .add("localName", localName)
        .toString();
  }
}
