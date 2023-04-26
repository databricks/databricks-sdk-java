// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>GetIpAccessListResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetIpAccessListResponse {
  /** */
  @JsonProperty("ip_access_lists")
  private Collection<IpAccessListInfo> ipAccessLists;

  /**
   * <p>Setter for the field <code>ipAccessLists</code>.</p>
   *
   * @param ipAccessLists a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.settings.GetIpAccessListResponse} object
   */
  public GetIpAccessListResponse setIpAccessLists(Collection<IpAccessListInfo> ipAccessLists) {
    this.ipAccessLists = ipAccessLists;
    return this;
  }

  /**
   * <p>Getter for the field <code>ipAccessLists</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<IpAccessListInfo> getIpAccessLists() {
    return ipAccessLists;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetIpAccessListResponse that = (GetIpAccessListResponse) o;
    return Objects.equals(ipAccessLists, that.ipAccessLists);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(ipAccessLists);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetIpAccessListResponse.class)
        .add("ipAccessLists", ipAccessLists)
        .toString();
  }
}
