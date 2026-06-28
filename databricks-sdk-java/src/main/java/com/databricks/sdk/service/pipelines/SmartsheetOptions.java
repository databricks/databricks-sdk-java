// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Smartsheet specific options for ingestion */
@Generated
public class SmartsheetOptions {
  /**
   * (Optional) When true, maps each column to its Smartsheet-declared type (Text/Number/Date/
   * Checkbox/etc.). Cells that do not conform to the declared type are set to NULL. When false, all
   * columns land as STRING. Use false for sheets with irregular data or columns that frequently
   * violate their own declared type. If not specified, defaults to true.
   */
  @JsonProperty("enforce_schema")
  private Boolean enforceSchema;

  public SmartsheetOptions setEnforceSchema(Boolean enforceSchema) {
    this.enforceSchema = enforceSchema;
    return this;
  }

  public Boolean getEnforceSchema() {
    return enforceSchema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SmartsheetOptions that = (SmartsheetOptions) o;
    return Objects.equals(enforceSchema, that.enforceSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enforceSchema);
  }

  @Override
  public String toString() {
    return new ToStringer(SmartsheetOptions.class).add("enforceSchema", enforceSchema).toString();
  }
}
