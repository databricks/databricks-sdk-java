// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** PG-specific catalog-level configuration parameters */
@Generated
public class PostgresCatalogConfig {
  /** Optional. The Postgres slot configuration to use for logical replication */
  @JsonProperty("slot_config")
  private PostgresSlotConfig slotConfig;

  public PostgresCatalogConfig setSlotConfig(PostgresSlotConfig slotConfig) {
    this.slotConfig = slotConfig;
    return this;
  }

  public PostgresSlotConfig getSlotConfig() {
    return slotConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PostgresCatalogConfig that = (PostgresCatalogConfig) o;
    return Objects.equals(slotConfig, that.slotConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slotConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(PostgresCatalogConfig.class).add("slotConfig", slotConfig).toString();
  }
}
