// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class QuerySchemaColumn {
  /** Populated from https://docs.databricks.com/sql/language-manual/sql-ref-datatypes.html */
  @JsonProperty("data_type")
  private DataType dataType;

  /** */
  @JsonProperty("name")
  private String name;

  /** Corresponds to type desc */
  @JsonProperty("type_text")
  private String typeText;

  public QuerySchemaColumn setDataType(DataType dataType) {
    this.dataType = dataType;
    return this;
  }

  public DataType getDataType() {
    return dataType;
  }

  public QuerySchemaColumn setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public QuerySchemaColumn setTypeText(String typeText) {
    this.typeText = typeText;
    return this;
  }

  public String getTypeText() {
    return typeText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuerySchemaColumn that = (QuerySchemaColumn) o;
    return Objects.equals(dataType, that.dataType)
        && Objects.equals(name, that.name)
        && Objects.equals(typeText, that.typeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, name, typeText);
  }

  @Override
  public String toString() {
    return new ToStringer(QuerySchemaColumn.class)
        .add("dataType", dataType)
        .add("name", name)
        .add("typeText", typeText)
        .toString();
  }
}
