// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>TransferOwnershipObjectId class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TransferOwnershipObjectId {
  /** Email address for the new owner, who must exist in the workspace. */
  @JsonProperty("new_owner")
  private String newOwner;

  /**
   * <p>Setter for the field <code>newOwner</code>.</p>
   *
   * @param newOwner a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.TransferOwnershipObjectId} object
   */
  public TransferOwnershipObjectId setNewOwner(String newOwner) {
    this.newOwner = newOwner;
    return this;
  }

  /**
   * <p>Getter for the field <code>newOwner</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNewOwner() {
    return newOwner;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransferOwnershipObjectId that = (TransferOwnershipObjectId) o;
    return Objects.equals(newOwner, that.newOwner);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(newOwner);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TransferOwnershipObjectId.class).add("newOwner", newOwner).toString();
  }
}
