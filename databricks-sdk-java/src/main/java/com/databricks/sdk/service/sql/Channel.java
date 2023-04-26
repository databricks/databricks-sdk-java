// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Channel class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Channel {
  /** */
  @JsonProperty("dbsql_version")
  private String dbsqlVersion;

  /** */
  @JsonProperty("name")
  private ChannelName name;

  /**
   * <p>Setter for the field <code>dbsqlVersion</code>.</p>
   *
   * @param dbsqlVersion a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Channel} object
   */
  public Channel setDbsqlVersion(String dbsqlVersion) {
    this.dbsqlVersion = dbsqlVersion;
    return this;
  }

  /**
   * <p>Getter for the field <code>dbsqlVersion</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDbsqlVersion() {
    return dbsqlVersion;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link com.databricks.sdk.service.sql.ChannelName} object
   * @return a {@link com.databricks.sdk.service.sql.Channel} object
   */
  public Channel setName(ChannelName name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.ChannelName} object
   */
  public ChannelName getName() {
    return name;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Channel that = (Channel) o;
    return Objects.equals(dbsqlVersion, that.dbsqlVersion) && Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(dbsqlVersion, name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Channel.class)
        .add("dbsqlVersion", dbsqlVersion)
        .add("name", name)
        .toString();
  }
}
