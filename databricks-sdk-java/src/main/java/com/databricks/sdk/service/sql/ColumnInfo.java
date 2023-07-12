// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class ColumnInfo {
  /**
   * Name of Column.
   */
  @JsonProperty("name")
  private String name;
  
  /**
   * Ordinal position of column (starting at position 0).
   */
  @JsonProperty("position")
  private Long position;
  
  /**
   * Format of interval type.
   */
  @JsonProperty("type_interval_type")
  private String typeIntervalType;
  
  /**
   * Name of type (INT, STRUCT, MAP, and so on)
   */
  @JsonProperty("type_name")
  private ColumnInfoTypeName typeName;
  
  /**
   * Digits of precision.
   */
  @JsonProperty("type_precision")
  private Long typePrecision;
  
  /**
   * Digits to right of decimal.
   */
  @JsonProperty("type_scale")
  private Long typeScale;
  
  /**
   * Full data type spec, SQL/catalogString text.
   */
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
    && Objects.equals(typeText, that.typeText)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, position, typeIntervalType, typeName, typePrecision, typeScale, typeText);
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
      .add("typeText", typeText).toString();
  }
}
