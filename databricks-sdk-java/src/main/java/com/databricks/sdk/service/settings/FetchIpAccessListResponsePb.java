// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** An IP access list was successfully returned. */
@Generated
class FetchIpAccessListResponsePb {
  @JsonProperty("ip_access_list")
  private IpAccessListInfo ipAccessList;

  public FetchIpAccessListResponsePb setIpAccessList(IpAccessListInfo ipAccessList) {
    this.ipAccessList = ipAccessList;
    return this;
  }

  public IpAccessListInfo getIpAccessList() {
    return ipAccessList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FetchIpAccessListResponsePb that = (FetchIpAccessListResponsePb) o;
    return Objects.equals(ipAccessList, that.ipAccessList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessList);
  }

  @Override
  public String toString() {
    return new ToStringer(FetchIpAccessListResponsePb.class)
        .add("ipAccessList", ipAccessList)
        .toString();
  }
}
