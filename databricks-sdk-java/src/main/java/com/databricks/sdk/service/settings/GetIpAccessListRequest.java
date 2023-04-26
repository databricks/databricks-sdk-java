// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get access list
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetIpAccessListRequest {
  /** The ID for the corresponding IP access list to modify. */
  private String ipAccessListId;

  /**
   * <p>Setter for the field <code>ipAccessListId</code>.</p>
   *
   * @param ipAccessListId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.GetIpAccessListRequest} object
   */
  public GetIpAccessListRequest setIpAccessListId(String ipAccessListId) {
    this.ipAccessListId = ipAccessListId;
    return this;
  }

  /**
   * <p>Getter for the field <code>ipAccessListId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getIpAccessListId() {
    return ipAccessListId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetIpAccessListRequest that = (GetIpAccessListRequest) o;
    return Objects.equals(ipAccessListId, that.ipAccessListId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(ipAccessListId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetIpAccessListRequest.class)
        .add("ipAccessListId", ipAccessListId)
        .toString();
  }
}
