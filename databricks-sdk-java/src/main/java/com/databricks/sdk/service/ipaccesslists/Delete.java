// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ipaccesslists;

/** Delete access list */
public class Delete {
  /** The ID for the corresponding IP access list to modify. */
  private String ipAccessListId;

  public Delete setIpAccessListId(String ipAccessListId) {
    this.ipAccessListId = ipAccessListId;
    return this;
  }

  public String getIpAccessListId() {
    return ipAccessListId;
  }
}
