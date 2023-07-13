// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete a clean room */
@Generated
public class DeleteCleanRoomRequest {
  /** The name of the clean room. */
  private String nameArg;

  public DeleteCleanRoomRequest setNameArg(String nameArg) {
    this.nameArg = nameArg;
    return this;
  }

  public String getNameArg() {
    return nameArg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteCleanRoomRequest that = (DeleteCleanRoomRequest) o;
    return Objects.equals(nameArg, that.nameArg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameArg);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCleanRoomRequest.class).add("nameArg", nameArg).toString();
  }
}
