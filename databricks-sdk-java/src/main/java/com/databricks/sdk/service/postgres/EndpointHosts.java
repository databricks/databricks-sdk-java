// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Encapsulates various hostnames (r/w or r/o, pooled or not) for an endpoint. */
@Generated
public class EndpointHosts {
  /**
   * The hostname to connect to this endpoint. For read-write endpoints, this is a read-write
   * hostname which connects to the primary compute. For read-only endpoints, this is a read-only
   * hostname which allows read-only operations.
   */
  @JsonProperty("host")
  private String host;

  /**
   * An optionally defined read-only host for the endpoint, without pooling. For read-only
   * endpoints, this attribute is always defined and is equivalent to host. For read-write
   * endpoints, this attribute is defined if the enclosing endpoint is a group with greater than 1
   * computes configured, and has readable secondaries enabled.
   */
  @JsonProperty("read_only_host")
  private String readOnlyHost;

  /**
   * The read-only hostname of the compute endpoint, with pooling. This attribute is always defined
   * for read-only endpoints, and may be defined for read-write endpoints if configured with read
   * replicas and allow read-only connections.
   */
  @JsonProperty("read_only_pooled_host")
  private String readOnlyPooledHost;

  /**
   * The read-write hostname of the compute endpoint, with pooling. This attribute is only defined
   * for read-write endpoints.
   */
  @JsonProperty("read_write_pooled_host")
  private String readWritePooledHost;

  public EndpointHosts setHost(String host) {
    this.host = host;
    return this;
  }

  public String getHost() {
    return host;
  }

  public EndpointHosts setReadOnlyHost(String readOnlyHost) {
    this.readOnlyHost = readOnlyHost;
    return this;
  }

  public String getReadOnlyHost() {
    return readOnlyHost;
  }

  public EndpointHosts setReadOnlyPooledHost(String readOnlyPooledHost) {
    this.readOnlyPooledHost = readOnlyPooledHost;
    return this;
  }

  public String getReadOnlyPooledHost() {
    return readOnlyPooledHost;
  }

  public EndpointHosts setReadWritePooledHost(String readWritePooledHost) {
    this.readWritePooledHost = readWritePooledHost;
    return this;
  }

  public String getReadWritePooledHost() {
    return readWritePooledHost;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointHosts that = (EndpointHosts) o;
    return Objects.equals(host, that.host)
        && Objects.equals(readOnlyHost, that.readOnlyHost)
        && Objects.equals(readOnlyPooledHost, that.readOnlyPooledHost)
        && Objects.equals(readWritePooledHost, that.readWritePooledHost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, readOnlyHost, readOnlyPooledHost, readWritePooledHost);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointHosts.class)
        .add("host", host)
        .add("readOnlyHost", readOnlyHost)
        .add("readOnlyPooledHost", readOnlyPooledHost)
        .add("readWritePooledHost", readWritePooledHost)
        .toString();
  }
}
