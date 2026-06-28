// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Specifies how to connect and authenticate to the stream platform. */
@Generated
public class StreamConnectionConfig {
  /**
   * Direct mTLS configuration for stream platform access. This is only used in the short term until
   * UC Kafka Connections support mTLS . Once UC Kafka Connections support mTLS, this will be
   * deprecated.
   */
  @JsonProperty("direct_mtls_config")
  private DirectMtlsConfig directMtlsConfig;

  /**
   * Name of an existing UC Connection for stream platform access. Must be the correct type for the
   * streaming platform (e.g. a Kafka Connection for a Kafka Stream).
   */
  @JsonProperty("uc_connection_name")
  private String ucConnectionName;

  public StreamConnectionConfig setDirectMtlsConfig(DirectMtlsConfig directMtlsConfig) {
    this.directMtlsConfig = directMtlsConfig;
    return this;
  }

  public DirectMtlsConfig getDirectMtlsConfig() {
    return directMtlsConfig;
  }

  public StreamConnectionConfig setUcConnectionName(String ucConnectionName) {
    this.ucConnectionName = ucConnectionName;
    return this;
  }

  public String getUcConnectionName() {
    return ucConnectionName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StreamConnectionConfig that = (StreamConnectionConfig) o;
    return Objects.equals(directMtlsConfig, that.directMtlsConfig)
        && Objects.equals(ucConnectionName, that.ucConnectionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directMtlsConfig, ucConnectionName);
  }

  @Override
  public String toString() {
    return new ToStringer(StreamConnectionConfig.class)
        .add("directMtlsConfig", directMtlsConfig)
        .add("ucConnectionName", ucConnectionName)
        .toString();
  }
}
