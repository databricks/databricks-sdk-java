// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>OdbcParams class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class OdbcParams {
  /** */
  @JsonProperty("hostname")
  private String hostname;

  /** */
  @JsonProperty("path")
  private String path;

  /** */
  @JsonProperty("port")
  private Long port;

  /** */
  @JsonProperty("protocol")
  private String protocol;

  /**
   * <p>Setter for the field <code>hostname</code>.</p>
   *
   * @param hostname a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.OdbcParams} object
   */
  public OdbcParams setHostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * <p>Getter for the field <code>hostname</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * <p>Setter for the field <code>path</code>.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.OdbcParams} object
   */
  public OdbcParams setPath(String path) {
    this.path = path;
    return this;
  }

  /**
   * <p>Getter for the field <code>path</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPath() {
    return path;
  }

  /**
   * <p>Setter for the field <code>port</code>.</p>
   *
   * @param port a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.OdbcParams} object
   */
  public OdbcParams setPort(Long port) {
    this.port = port;
    return this;
  }

  /**
   * <p>Getter for the field <code>port</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getPort() {
    return port;
  }

  /**
   * <p>Setter for the field <code>protocol</code>.</p>
   *
   * @param protocol a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.OdbcParams} object
   */
  public OdbcParams setProtocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * <p>Getter for the field <code>protocol</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getProtocol() {
    return protocol;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OdbcParams that = (OdbcParams) o;
    return Objects.equals(hostname, that.hostname)
        && Objects.equals(path, that.path)
        && Objects.equals(port, that.port)
        && Objects.equals(protocol, that.protocol);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(hostname, path, port, protocol);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(OdbcParams.class)
        .add("hostname", hostname)
        .add("path", path)
        .add("port", port)
        .add("protocol", protocol)
        .toString();
  }
}
