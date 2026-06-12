// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class IngestionPipelineDefinitionWorkdayReportParametersQueryKeyValue {
  /** Key for the report parameter, can be a column name or other metadata */
  @JsonProperty("key")
  private String key;

  /**
   * Value for the report parameter. Possible values it can take are these sql functions:
   *
   * <ol>
   *   <li>coalesce(current_offset(), date("YYYY-MM-DD")) -&gt; if current_offset() is null, then
   *       the passed date, else current_offset()
   *   <li>current_date()
   *   <li>date_sub(current_date(), x) -&gt; subtract x (some non-negative integer) days from
   *       current date
   * </ol>
   */
  @JsonProperty("value")
  private String value;

  public IngestionPipelineDefinitionWorkdayReportParametersQueryKeyValue setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public IngestionPipelineDefinitionWorkdayReportParametersQueryKeyValue setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IngestionPipelineDefinitionWorkdayReportParametersQueryKeyValue that =
        (IngestionPipelineDefinitionWorkdayReportParametersQueryKeyValue) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(IngestionPipelineDefinitionWorkdayReportParametersQueryKeyValue.class)
        .add("key", key)
        .add("value", value)
        .toString();
  }
}
