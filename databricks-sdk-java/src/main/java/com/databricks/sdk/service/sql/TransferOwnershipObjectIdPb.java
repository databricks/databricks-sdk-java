// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class TransferOwnershipObjectIdPb {
  @JsonProperty("new_owner")
  private String newOwner;

  public TransferOwnershipObjectIdPb setNewOwner(String newOwner) {
    this.newOwner = newOwner;
    return this;
  }

  public String getNewOwner() {
    return newOwner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransferOwnershipObjectIdPb that = (TransferOwnershipObjectIdPb) o;
    return Objects.equals(newOwner, that.newOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newOwner);
  }

  @Override
  public String toString() {
    return new ToStringer(TransferOwnershipObjectIdPb.class).add("newOwner", newOwner).toString();
  }
}
