// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ipaccesslists;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateIpAccessListResponse {
  /** */
  @JsonProperty("ip_access_list")
  private IpAccessListInfo ipAccessList;

  public CreateIpAccessListResponse setIpAccessList(IpAccessListInfo ipAccessList) {
    this.ipAccessList = ipAccessList;
    return this;
  }

  public IpAccessListInfo getIpAccessList() {
    return ipAccessList;
  }
}
