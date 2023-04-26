// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateIpAccessListResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateIpAccessListResponse {
  /** */
  @JsonProperty("ip_access_list")
  private IpAccessListInfo ipAccessList;

  /**
   * <p>Setter for the field <code>ipAccessList</code>.</p>
   *
   * @param ipAccessList a {@link com.databricks.sdk.service.settings.IpAccessListInfo} object
   * @return a {@link com.databricks.sdk.service.settings.CreateIpAccessListResponse} object
   */
  public CreateIpAccessListResponse setIpAccessList(IpAccessListInfo ipAccessList) {
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
    CreateIpAccessListResponse that = (CreateIpAccessListResponse) o;
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
    return new ToStringer(CreateIpAccessListResponse.class)
        .add("ipAccessList", ipAccessList)
        .toString();
  }
}
