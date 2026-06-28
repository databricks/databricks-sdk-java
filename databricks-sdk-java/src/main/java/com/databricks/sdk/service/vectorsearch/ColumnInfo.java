// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ColumnInfo {
  /** Name of the column. */
  @JsonProperty("name")
  private String name;

  /** Data type of the column (e.g., "string", "int", "array<float>") */
  @JsonProperty("type_text")
  private String typeText;

  public ColumnInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ColumnInfo setTypeText(String typeText) {
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
    ColumnInfo that = (ColumnInfo) o;
    return Objects.equals(name, that.name) && Objects.equals(typeText, that.typeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, typeText);
  }

  @Override
  public String toString() {
    return new ToStringer(ColumnInfo.class).add("name", name).add("typeText", typeText).toString();
  }
}
