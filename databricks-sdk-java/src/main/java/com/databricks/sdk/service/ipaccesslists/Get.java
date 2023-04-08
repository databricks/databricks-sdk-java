// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ipaccesslists;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get access list */
public class Get {
  /** The ID for the corresponding IP access list to modify. */
  private String ipAccessListId;

  public Get setIpAccessListId(String ipAccessListId) {
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
    Get that = (Get) o;
    return Objects.equals(ipAccessListId, that.ipAccessListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessListId);
  }

  @Override
  public String toString() {
    return new ToStringer(Get.class).add("ipAccessListId", ipAccessListId).toString();
  }
}
