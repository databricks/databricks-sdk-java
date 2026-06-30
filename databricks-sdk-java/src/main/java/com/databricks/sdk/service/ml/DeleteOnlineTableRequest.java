// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteOnlineTableRequest {
  /** The full three-part (catalog, schema, table) name of the online table. */
  @JsonIgnore private String onlineTableName;

  public DeleteOnlineTableRequest setOnlineTableName(String onlineTableName) {
    this.onlineTableName = onlineTableName;
    return this;
  }

  public String getOnlineTableName() {
    return onlineTableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteOnlineTableRequest that = (DeleteOnlineTableRequest) o;
    return Objects.equals(onlineTableName, that.onlineTableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineTableName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteOnlineTableRequest.class)
        .add("onlineTableName", onlineTableName)
        .toString();
  }
}
