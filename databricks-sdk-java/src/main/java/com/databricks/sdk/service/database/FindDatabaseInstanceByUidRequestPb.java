// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Find a Database Instance by uid */
@Generated
class FindDatabaseInstanceByUidRequestPb {
  @JsonIgnore
  @QueryParam("uid")
  private String uid;

  public FindDatabaseInstanceByUidRequestPb setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FindDatabaseInstanceByUidRequestPb that = (FindDatabaseInstanceByUidRequestPb) o;
    return Objects.equals(uid, that.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid);
  }

  @Override
  public String toString() {
    return new ToStringer(FindDatabaseInstanceByUidRequestPb.class).add("uid", uid).toString();
  }
}
