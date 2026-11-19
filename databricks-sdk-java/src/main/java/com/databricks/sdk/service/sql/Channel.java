// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Configures the channel name and DBSQL version of the warehouse. CHANNEL_NAME_CUSTOM should be
 * chosen only when `dbsql_version` is specified.
 */
@Generated
public class Channel {
  /** Databricks SQL version to pin to. Set it if and only if name is CHANNEL_NAME_CUSTOM. */
  @JsonProperty("dbsql_version")
  private String dbsqlVersion;

  /**
   * Channel to follow. CHANNEL_NAME_CURRENT is the default, and CHANNEL_NAME_PREVIEW carries the
   * upcoming Databricks SQL release for testing.
   */
  @JsonProperty("name")
  private ChannelName name;

  public Channel setDbsqlVersion(String dbsqlVersion) {
    this.dbsqlVersion = dbsqlVersion;
    return this;
  }

  public String getDbsqlVersion() {
    return dbsqlVersion;
  }

  public Channel setName(ChannelName name) {
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
    Channel that = (Channel) o;
    return Objects.equals(dbsqlVersion, that.dbsqlVersion) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbsqlVersion, name);
  }

  @Override
  public String toString() {
    return new ToStringer(Channel.class)
        .add("dbsqlVersion", dbsqlVersion)
        .add("name", name)
        .toString();
  }
}
