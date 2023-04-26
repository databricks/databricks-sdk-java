// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>FetchIpAccessListResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class FetchIpAccessListResponse {
  /** */
  @JsonProperty("ip_access_list")
  private IpAccessListInfo ipAccessList;

  /**
   * <p>Setter for the field <code>ipAccessList</code>.</p>
   *
   * @param ipAccessList a {@link com.databricks.sdk.service.settings.IpAccessListInfo} object
   * @return a {@link com.databricks.sdk.service.settings.FetchIpAccessListResponse} object
   */
  public FetchIpAccessListResponse setIpAccessList(IpAccessListInfo ipAccessList) {
    this.ipAccessList = ipAccessList;
    return this;
  }

  /**
   * <p>Getter for the field <code>ipAccessList</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.settings.IpAccessListInfo} object
   */
  public IpAccessListInfo getIpAccessList() {
    return ipAccessList;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FetchIpAccessListResponse that = (FetchIpAccessListResponse) o;
    return Objects.equals(ipAccessList, that.ipAccessList);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(ipAccessList);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(FetchIpAccessListResponse.class)
        .add("ipAccessList", ipAccessList)
        .toString();
  }
}
