// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ipaccesslists;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class GetIpAccessListResponse {
  /** */
  @JsonProperty("ip_access_lists")
  private Collection<IpAccessListInfo> ipAccessLists;

  public GetIpAccessListResponse setIpAccessLists(Collection<IpAccessListInfo> ipAccessLists) {
    this.ipAccessLists = ipAccessLists;
    return this;
  }

  public Collection<IpAccessListInfo> getIpAccessLists() {
    return ipAccessLists;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetIpAccessListResponse that = (GetIpAccessListResponse) o;
    return Objects.equals(ipAccessLists, that.ipAccessLists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessLists);
  }

  @Override
  public String toString() {
    return new ToStringer(GetIpAccessListResponse.class)
        .add("ipAccessLists", ipAccessLists)
        .toString();
  }
}
