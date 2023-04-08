// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ipaccesslists;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetIpAccessListResponse {
  /** */
  @JsonProperty("ip_access_lists")
  private java.util.List<IpAccessListInfo> ipAccessLists;

  public GetIpAccessListResponse setIpAccessLists(java.util.List<IpAccessListInfo> ipAccessLists) {
    this.ipAccessLists = ipAccessLists;
    return this;
  }

  public java.util.List<IpAccessListInfo> getIpAccessLists() {
    return ipAccessLists;
  }
}
