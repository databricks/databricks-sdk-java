// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ColumnInfo {
  /** The name of the column. */
  @JsonProperty("name")
  private String name;

  /** The ordinal position of the column (starting at position 0). */
  @JsonProperty("position")
  private Long position;

  /** The format of the interval type. */
  @JsonProperty("type_interval_type")
  private String typeIntervalType;

  /**
   * The name of the base data type. This doesn't include details for complex types such as STRUCT,
   * MAP or ARRAY.
   */
  @JsonProperty("type_name")
  private ColumnInfoTypeName typeName;

  /** Specifies the number of digits in a number. This applies to the DECIMAL type. */
  @JsonProperty("type_precision")
  private Long typePrecision;

  /**
   * Specifies the number of digits to the right of the decimal point in a number. This applies to
   * the DECIMAL type.
   */
  @JsonProperty("type_scale")
  private Long typeScale;

  /** The full SQL type specification. */
  @JsonProperty("type_text")
  private String typeText;

  public ColumnInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ColumnInfo setPosition(Long position) {
    this.position = position;
    return this;
  }

  public Long getPosition() {
    return position;
  }

  public ColumnInfo setTypeIntervalType(String typeIntervalType) {
    this.typeIntervalType = typeIntervalType;
    return this;
  }

  public String getTypeIntervalType() {
    return typeIntervalType;
  }

  public ColumnInfo setTypeName(ColumnInfoTypeName typeName) {
    this.typeName = typeName;
    return this;
  }

  public ColumnInfoTypeName getTypeName() {
    return typeName;
  }

  public ColumnInfo setTypePrecision(Long typePrecision) {
    this.typePrecision = typePrecision;
    return this;
  }

  public Long getTypePrecision() {
    return typePrecision;
  }

  public ColumnInfo setTypeScale(Long typeScale) {
    this.typeScale = typeScale;
    return this;
  }

  public Long getTypeScale() {
    return typeScale;
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
    return Objects.equals(name, that.name)
        && Objects.equals(position, that.position)
        && Objects.equals(typeIntervalType, that.typeIntervalType)
        && Objects.equals(typeName, that.typeName)
        && Objects.equals(typePrecision, that.typePrecision)
        && Objects.equals(typeScale, that.typeScale)
        && Objects.equals(typeText, that.typeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        name, position, typeIntervalType, typeName, typePrecision, typeScale, typeText);
  }

  @Override
  public String toString() {
    return new ToStringer(ColumnInfo.class)
        .add("name", name)
        .add("position", position)
        .add("typeIntervalType", typeIntervalType)
        .add("typeName", typeName)
        .add("typePrecision", typePrecision)
        .add("typeScale", typeScale)
        .add("typeText", typeText)
        .toString();
  }
}
