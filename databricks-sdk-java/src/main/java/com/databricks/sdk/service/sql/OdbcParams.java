// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  public OdbcParams setHostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  public String getHostname() {
    return hostname;
  }

  public OdbcParams setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public OdbcParams setPort(Long port) {
    this.port = port;
    return this;
  }

  public Long getPort() {
    return port;
  }

  public OdbcParams setProtocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  public String getProtocol() {
    return protocol;
  }

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

  @Override
  public int hashCode() {
    return Objects.hash(hostname, path, port, protocol);
  }

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
