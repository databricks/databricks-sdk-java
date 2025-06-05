// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SqlStatementOutputPb {
  @JsonProperty("lookup_key")
  private String lookupKey;

  public SqlStatementOutputPb setLookupKey(String lookupKey) {
    this.lookupKey = lookupKey;
    return this;
  }

  public String getLookupKey() {
    return lookupKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlStatementOutputPb that = (SqlStatementOutputPb) o;
    return Objects.equals(lookupKey, that.lookupKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lookupKey);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlStatementOutputPb.class).add("lookupKey", lookupKey).toString();
  }
}
