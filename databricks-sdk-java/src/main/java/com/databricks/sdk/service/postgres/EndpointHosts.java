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

  public EndpointHosts setHost(String host) {
    this.host = host;
    return this;
  }

  public String getHost() {
    return host;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointHosts that = (EndpointHosts) o;
    return Objects.equals(host, that.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointHosts.class).add("host", host).toString();
  }
}
