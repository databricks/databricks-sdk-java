// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Materialized Environment information enables environment sharing and reuse via Environment
 * Caching during library installations. Currently this feature is only supported for Python
 * libraries.
 *
 * <p>- If the env cache entry in LMv2 DB doesn't exist or invalid, library installations and
 * environment materialization will occur. A new Materialized Environment metadata will be sent from
 * DP upon successful library installations and env materialization, and is persisted into database
 * by LMv2. - If the env cache entry in LMv2 DB is valid, the Materialized Environment will be sent
 * to DP by LMv2, and DP will restore the cached environment from a store instead of reinstalling
 * libraries from scratch.
 *
 * <p>If changed, also update estore/namespaces/defaultbaseenvironments/latest.proto with new
 * version
 */
@Generated
public class MaterializedEnvironment {
  /** The timestamp (in epoch milliseconds) when the materialized env is updated. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  public MaterializedEnvironment setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaterializedEnvironment that = (MaterializedEnvironment) o;
    return Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdatedTimestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializedEnvironment.class)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .toString();
  }
}
