// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ColumnInfoPb {
  @JsonProperty("name")
  private String name;

  @JsonProperty("position")
  private Long position;

  @JsonProperty("type_interval_type")
  private String typeIntervalType;

  @JsonProperty("type_name")
  private ColumnInfoTypeName typeName;

  @JsonProperty("type_precision")
  private Long typePrecision;

  @JsonProperty("type_scale")
  private Long typeScale;

  @JsonProperty("type_text")
  private String typeText;

  public ColumnInfoPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ColumnInfoPb setPosition(Long position) {
    this.position = position;
    return this;
  }

  public Long getPosition() {
    return position;
  }

  public ColumnInfoPb setTypeIntervalType(String typeIntervalType) {
    this.typeIntervalType = typeIntervalType;
    return this;
  }

  public String getTypeIntervalType() {
    return typeIntervalType;
  }

  public ColumnInfoPb setTypeName(ColumnInfoTypeName typeName) {
    this.typeName = typeName;
    return this;
  }

  public ColumnInfoTypeName getTypeName() {
    return typeName;
  }

  public ColumnInfoPb setTypePrecision(Long typePrecision) {
    this.typePrecision = typePrecision;
    return this;
  }

  public Long getTypePrecision() {
    return typePrecision;
  }

  public ColumnInfoPb setTypeScale(Long typeScale) {
    this.typeScale = typeScale;
    return this;
  }

  public Long getTypeScale() {
    return typeScale;
  }

  public ColumnInfoPb setTypeText(String typeText) {
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
    ColumnInfoPb that = (ColumnInfoPb) o;
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
    return new ToStringer(ColumnInfoPb.class)
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
