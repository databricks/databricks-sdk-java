// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>GetRecipientSharePermissionsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetRecipientSharePermissionsResponse {
  /** An array of data share permissions for a recipient. */
  @JsonProperty("permissions_out")
  private Collection<ShareToPrivilegeAssignment> permissionsOut;

  /**
   * <p>Setter for the field <code>permissionsOut</code>.</p>
   *
   * @param permissionsOut a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sharing.GetRecipientSharePermissionsResponse} object
   */
  public GetRecipientSharePermissionsResponse setPermissionsOut(
      Collection<ShareToPrivilegeAssignment> permissionsOut) {
    this.permissionsOut = permissionsOut;
    return this;
  }

  /**
   * <p>Getter for the field <code>permissionsOut</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ShareToPrivilegeAssignment> getPermissionsOut() {
    return permissionsOut;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRecipientSharePermissionsResponse that = (GetRecipientSharePermissionsResponse) o;
    return Objects.equals(permissionsOut, that.permissionsOut);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(permissionsOut);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetRecipientSharePermissionsResponse.class)
        .add("permissionsOut", permissionsOut)
        .toString();
  }
}
