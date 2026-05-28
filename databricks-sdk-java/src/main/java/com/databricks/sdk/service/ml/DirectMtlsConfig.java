// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Direct connection configs for mTLS, as Kafka Connections do not support mTLS yet (XTA-18030).
 * Temporarily used until UC Kafka Connections gain mTLS support.
 */
@Generated
public class DirectMtlsConfig {
  /** A comma-separated list of host:port pairs for the Kafka bootstrap servers. */
  @JsonProperty("bootstrap_servers")
  private String bootstrapServers;

  /** Mutual-TLS authentication configuration. */
  @JsonProperty("mtls_config")
  private MtlsConfig mtlsConfig;

  public DirectMtlsConfig setBootstrapServers(String bootstrapServers) {
    this.bootstrapServers = bootstrapServers;
    return this;
  }

  public String getBootstrapServers() {
    return bootstrapServers;
  }

  public DirectMtlsConfig setMtlsConfig(MtlsConfig mtlsConfig) {
    this.mtlsConfig = mtlsConfig;
    return this;
  }

  public MtlsConfig getMtlsConfig() {
    return mtlsConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DirectMtlsConfig that = (DirectMtlsConfig) o;
    return Objects.equals(bootstrapServers, that.bootstrapServers)
        && Objects.equals(mtlsConfig, that.mtlsConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootstrapServers, mtlsConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(DirectMtlsConfig.class)
        .add("bootstrapServers", bootstrapServers)
        .add("mtlsConfig", mtlsConfig)
        .toString();
  }
}
