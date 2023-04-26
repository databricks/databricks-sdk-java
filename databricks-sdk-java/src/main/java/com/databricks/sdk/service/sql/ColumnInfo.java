// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ColumnInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ColumnInfo {
  /** Name of Column. */
  @JsonProperty("name")
  private String name;

  /** Ordinal position of column (starting at position 0). */
  @JsonProperty("position")
  private Long position;

  /** Format of interval type. */
  @JsonProperty("type_interval_type")
  private String typeIntervalType;

  /** Name of type (INT, STRUCT, MAP, and so on) */
  @JsonProperty("type_name")
  private ColumnInfoTypeName typeName;

  /** Digits of precision. */
  @JsonProperty("type_precision")
  private Long typePrecision;

  /** Digits to right of decimal. */
  @JsonProperty("type_scale")
  private Long typeScale;

  /** Full data type spec, SQL/catalogString text. */
  @JsonProperty("type_text")
  private String typeText;

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.ColumnInfo} object
   */
  public ColumnInfo setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>position</code>.</p>
   *
   * @param position a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ColumnInfo} object
   */
  public ColumnInfo setPosition(Long position) {
    this.position = position;
    return this;
  }

  /**
   * <p>Getter for the field <code>position</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getPosition() {
    return position;
  }

  /**
   * <p>Setter for the field <code>typeIntervalType</code>.</p>
   *
   * @param typeIntervalType a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.ColumnInfo} object
   */
  public ColumnInfo setTypeIntervalType(String typeIntervalType) {
    this.typeIntervalType = typeIntervalType;
    return this;
  }

  /**
   * <p>Getter for the field <code>typeIntervalType</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTypeIntervalType() {
    return typeIntervalType;
  }

  /**
   * <p>Setter for the field <code>typeName</code>.</p>
   *
   * @param typeName a {@link com.databricks.sdk.service.sql.ColumnInfoTypeName} object
   * @return a {@link com.databricks.sdk.service.sql.ColumnInfo} object
   */
  public ColumnInfo setTypeName(ColumnInfoTypeName typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * <p>Getter for the field <code>typeName</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.ColumnInfoTypeName} object
   */
  public ColumnInfoTypeName getTypeName() {
    return typeName;
  }

  /**
   * <p>Setter for the field <code>typePrecision</code>.</p>
   *
   * @param typePrecision a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ColumnInfo} object
   */
  public ColumnInfo setTypePrecision(Long typePrecision) {
    this.typePrecision = typePrecision;
    return this;
  }

  /**
   * <p>Getter for the field <code>typePrecision</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTypePrecision() {
    return typePrecision;
  }

  /**
   * <p>Setter for the field <code>typeScale</code>.</p>
   *
   * @param typeScale a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ColumnInfo} object
   */
  public ColumnInfo setTypeScale(Long typeScale) {
    this.typeScale = typeScale;
    return this;
  }

  /**
   * <p>Getter for the field <code>typeScale</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTypeScale() {
    return typeScale;
  }

  /**
   * <p>Setter for the field <code>typeText</code>.</p>
   *
   * @param typeText a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.ColumnInfo} object
   */
  public ColumnInfo setTypeText(String typeText) {
    this.typeText = typeText;
    return this;
  }

  /**
   * <p>Getter for the field <code>typeText</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTypeText() {
    return typeText;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        name, position, typeIntervalType, typeName, typePrecision, typeScale, typeText);
  }

  /** {@inheritDoc} */
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
