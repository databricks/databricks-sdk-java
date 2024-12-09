// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CleanRoomAssetViewLocalDetails {
  /**
   * The fully qualified name of the view in its owner's local metastore, in the format of
   * *catalog*.*schema*.*view_name*
   */
  @JsonProperty("local_name")
  private String localName;

  public CleanRoomAssetViewLocalDetails setLocalName(String localName) {
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
    CleanRoomAssetViewLocalDetails that = (CleanRoomAssetViewLocalDetails) o;
    return Objects.equals(localName, that.localName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localName);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetViewLocalDetails.class)
        .add("localName", localName)
        .toString();
  }
}
