// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Channel information for the SQL warehouse at the time of query execution */
@Generated
public class ChannelInfo {
  /** DBSQL Version the channel is mapped to */
  @JsonProperty("dbsql_version")
  private String dbsqlVersion;

  /** Name of the channel */
  @JsonProperty("name")
  private ChannelName name;

  public ChannelInfo setDbsqlVersion(String dbsqlVersion) {
    this.dbsqlVersion = dbsqlVersion;
    return this;
  }

  public String getDbsqlVersion() {
    return dbsqlVersion;
  }

  public ChannelInfo setName(ChannelName name) {
    this.name = name;
    return this;
  }

  public ChannelName getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChannelInfo that = (ChannelInfo) o;
    return Objects.equals(dbsqlVersion, that.dbsqlVersion) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbsqlVersion, name);
  }

  @Override
  public String toString() {
    return new ToStringer(ChannelInfo.class)
        .add("dbsqlVersion", dbsqlVersion)
        .add("name", name)
        .toString();
  }
}
