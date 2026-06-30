// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** PostgresSlotConfig contains the configuration for a Postgres logical replication slot */
@Generated
public class PostgresSlotConfig {
  /** The name of the publication to use for the Postgres source */
  @JsonProperty("publication_name")
  private String publicationName;

  /** The name of the logical replication slot to use for the Postgres source */
  @JsonProperty("slot_name")
  private String slotName;

  public PostgresSlotConfig setPublicationName(String publicationName) {
    this.publicationName = publicationName;
    return this;
  }

  public String getPublicationName() {
    return publicationName;
  }

  public PostgresSlotConfig setSlotName(String slotName) {
    this.slotName = slotName;
    return this;
  }

  public String getSlotName() {
    return slotName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PostgresSlotConfig that = (PostgresSlotConfig) o;
    return Objects.equals(publicationName, that.publicationName)
        && Objects.equals(slotName, that.slotName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicationName, slotName);
  }

  @Override
  public String toString() {
    return new ToStringer(PostgresSlotConfig.class)
        .add("publicationName", publicationName)
        .add("slotName", slotName)
        .toString();
  }
}
