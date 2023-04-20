// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get access list */
public class GetIpAccessListRequest {
  /** The ID for the corresponding IP access list to modify. */
  private String ipAccessListId;

  public GetIpAccessListRequest setIpAccessListId(String ipAccessListId) {
    this.ipAccessListId = ipAccessListId;
    return this;
  }

  public String getIpAccessListId() {
    return ipAccessListId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetIpAccessListRequest that = (GetIpAccessListRequest) o;
    return Objects.equals(ipAccessListId, that.ipAccessListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessListId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetIpAccessListRequest.class)
        .add("ipAccessListId", ipAccessListId)
        .toString();
  }
}
