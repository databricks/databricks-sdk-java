// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * A trigger that disables automatic materialization, including the initial run at creation. Runs
 * are instead triggered through the `TriggerMaterializationSet` API. Supported only for batch
 * materializations in a materialization set.
 */
@Generated
public class ExternalTrigger {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalTrigger.class).toString();
  }
}
