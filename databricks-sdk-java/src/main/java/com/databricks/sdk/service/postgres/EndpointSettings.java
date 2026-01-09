// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/** A collection of settings for a compute endpoint. */
@Generated
public class EndpointSettings {
  /** A raw representation of Postgres settings. */
  @JsonProperty("pg_settings")
  private Map<String, String> pgSettings;

  public EndpointSettings setPgSettings(Map<String, String> pgSettings) {
    this.pgSettings = pgSettings;
    return this;
  }

  public Map<String, String> getPgSettings() {
    return pgSettings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointSettings that = (EndpointSettings) o;
    return Objects.equals(pgSettings, that.pgSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pgSettings);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointSettings.class).add("pgSettings", pgSettings).toString();
  }
}
