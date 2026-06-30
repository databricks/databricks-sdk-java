// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** IP access lists were successfully returned. */
@Generated
public class GetIpAccessListsResponse {
  /** */
  @JsonProperty("ip_access_lists")
  private Collection<IpAccessListInfo> ipAccessLists;

  public GetIpAccessListsResponse setIpAccessLists(Collection<IpAccessListInfo> ipAccessLists) {
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
    GetIpAccessListsResponse that = (GetIpAccessListsResponse) o;
    return Objects.equals(ipAccessLists, that.ipAccessLists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessLists);
  }

  @Override
  public String toString() {
    return new ToStringer(GetIpAccessListsResponse.class)
        .add("ipAccessLists", ipAccessLists)
        .toString();
  }
}
