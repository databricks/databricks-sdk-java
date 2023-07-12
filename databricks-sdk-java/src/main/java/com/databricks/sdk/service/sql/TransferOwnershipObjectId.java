// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class TransferOwnershipObjectId {
  /**
   * Email address for the new owner, who must exist in the workspace.
   */
  @JsonProperty("new_owner")
  private String newOwner;
  
  public TransferOwnershipObjectId setNewOwner(String newOwner) {
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
    TransferOwnershipObjectId that = (TransferOwnershipObjectId) o;
    return Objects.equals(newOwner, that.newOwner)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(newOwner);
  }

  @Override
  public String toString() {
    return new ToStringer(TransferOwnershipObjectId.class)
      .add("newOwner", newOwner).toString();
  }
}
