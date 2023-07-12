// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Transfer object ownership
 */
@Generated
public class TransferOwnershipRequest {
  /**
   * Email address for the new owner, who must exist in the workspace.
   */
  @JsonProperty("new_owner")
  private String newOwner;
  
  /**
   * The ID of the object on which to change ownership.
   */
  
  private TransferOwnershipObjectId objectId;
  
  /**
   * The type of object on which to change ownership.
   */
  
  private OwnableObjectType objectType;
  
  public TransferOwnershipRequest setNewOwner(String newOwner) {
    this.newOwner = newOwner;
    return this;
  }

  public String getNewOwner() {
    return newOwner;
  }
  
  public TransferOwnershipRequest setObjectId(TransferOwnershipObjectId objectId) {
    this.objectId = objectId;
    return this;
  }

  public TransferOwnershipObjectId getObjectId() {
    return objectId;
  }
  
  public TransferOwnershipRequest setObjectType(OwnableObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

  public OwnableObjectType getObjectType() {
    return objectType;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransferOwnershipRequest that = (TransferOwnershipRequest) o;
    return Objects.equals(newOwner, that.newOwner)
    && Objects.equals(objectId, that.objectId)
    && Objects.equals(objectType, that.objectType)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(newOwner, objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(TransferOwnershipRequest.class)
      .add("newOwner", newOwner)
      .add("objectId", objectId)
      .add("objectType", objectType).toString();
  }
}
