// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>FunctionParameterInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class FunctionParameterInfo {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Name of parameter. */
  @JsonProperty("name")
  private String name;

  /** Default value of the parameter. */
  @JsonProperty("parameter_default")
  private String parameterDefault;

  /** The mode of the function parameter. */
  @JsonProperty("parameter_mode")
  private FunctionParameterMode parameterMode;

  /** The type of function parameter. */
  @JsonProperty("parameter_type")
  private FunctionParameterType parameterType;

  /** Ordinal position of column (starting at position 0). */
  @JsonProperty("position")
  private Long position;

  /** Format of IntervalType. */
  @JsonProperty("type_interval_type")
  private String typeIntervalType;

  /** Full data type spec, JSON-serialized. */
  @JsonProperty("type_json")
  private String typeJson;

  /** Name of type (INT, STRUCT, MAP, etc.). */
  @JsonProperty("type_name")
  private ColumnTypeName typeName;

  /** Digits of precision; required on Create for DecimalTypes. */
  @JsonProperty("type_precision")
  private Long typePrecision;

  /** Digits to right of decimal; Required on Create for DecimalTypes. */
  @JsonProperty("type_scale")
  private Long typeScale;

  /** Full data type spec, SQL/catalogString text. */
  @JsonProperty("type_text")
  private String typeText;

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.FunctionParameterInfo} object
   */
  public FunctionParameterInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.FunctionParameterInfo} object
   */
  public FunctionParameterInfo setName(String name) {
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
   * <p>Setter for the field <code>parameterDefault</code>.</p>
   *
   * @param parameterDefault a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.FunctionParameterInfo} object
   */
  public FunctionParameterInfo setParameterDefault(String parameterDefault) {
    this.parameterDefault = parameterDefault;
    return this;
  }

  /**
   * <p>Getter for the field <code>parameterDefault</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getParameterDefault() {
    return parameterDefault;
  }

  /**
   * <p>Setter for the field <code>parameterMode</code>.</p>
   *
   * @param parameterMode a {@link com.databricks.sdk.service.catalog.FunctionParameterMode} object
   * @return a {@link com.databricks.sdk.service.catalog.FunctionParameterInfo} object
   */
  public FunctionParameterInfo setParameterMode(FunctionParameterMode parameterMode) {
    this.parameterMode = parameterMode;
    return this;
  }

  /**
   * <p>Getter for the field <code>parameterMode</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.FunctionParameterMode} object
   */
  public FunctionParameterMode getParameterMode() {
    return parameterMode;
  }

  /**
   * <p>Setter for the field <code>parameterType</code>.</p>
   *
   * @param parameterType a {@link com.databricks.sdk.service.catalog.FunctionParameterType} object
   * @return a {@link com.databricks.sdk.service.catalog.FunctionParameterInfo} object
   */
  public FunctionParameterInfo setParameterType(FunctionParameterType parameterType) {
    this.parameterType = parameterType;
    return this;
  }

  /**
   * <p>Getter for the field <code>parameterType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.FunctionParameterType} object
   */
  public FunctionParameterType getParameterType() {
    return parameterType;
  }

  /**
   * <p>Setter for the field <code>position</code>.</p>
   *
   * @param position a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.FunctionParameterInfo} object
   */
  public FunctionParameterInfo setPosition(Long position) {
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
   * @return a {@link com.databricks.sdk.service.catalog.FunctionParameterInfo} object
   */
  public FunctionParameterInfo setTypeIntervalType(String typeIntervalType) {
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
   * <p>Setter for the field <code>typeJson</code>.</p>
   *
   * @param typeJson a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.FunctionParameterInfo} object
   */
  public FunctionParameterInfo setTypeJson(String typeJson) {
    this.typeJson = typeJson;
    return this;
  }

  /**
   * <p>Getter for the field <code>typeJson</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTypeJson() {
    return typeJson;
  }

  /**
   * <p>Setter for the field <code>typeName</code>.</p>
   *
   * @param typeName a {@link com.databricks.sdk.service.catalog.ColumnTypeName} object
   * @return a {@link com.databricks.sdk.service.catalog.FunctionParameterInfo} object
   */
  public FunctionParameterInfo setTypeName(ColumnTypeName typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * <p>Getter for the field <code>typeName</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.ColumnTypeName} object
   */
  public ColumnTypeName getTypeName() {
    return typeName;
  }

  /**
   * <p>Setter for the field <code>typePrecision</code>.</p>
   *
   * @param typePrecision a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.FunctionParameterInfo} object
   */
  public FunctionParameterInfo setTypePrecision(Long typePrecision) {
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
   * @return a {@link com.databricks.sdk.service.catalog.FunctionParameterInfo} object
   */
  public FunctionParameterInfo setTypeScale(Long typeScale) {
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
   * @return a {@link com.databricks.sdk.service.catalog.FunctionParameterInfo} object
   */
  public FunctionParameterInfo setTypeText(String typeText) {
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
    FunctionParameterInfo that = (FunctionParameterInfo) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(parameterDefault, that.parameterDefault)
        && Objects.equals(parameterMode, that.parameterMode)
        && Objects.equals(parameterType, that.parameterType)
        && Objects.equals(position, that.position)
        && Objects.equals(typeIntervalType, that.typeIntervalType)
        && Objects.equals(typeJson, that.typeJson)
        && Objects.equals(typeName, that.typeName)
        && Objects.equals(typePrecision, that.typePrecision)
        && Objects.equals(typeScale, that.typeScale)
        && Objects.equals(typeText, that.typeText);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        name,
        parameterDefault,
        parameterMode,
        parameterType,
        position,
        typeIntervalType,
        typeJson,
        typeName,
        typePrecision,
        typeScale,
        typeText);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(FunctionParameterInfo.class)
        .add("comment", comment)
        .add("name", name)
        .add("parameterDefault", parameterDefault)
        .add("parameterMode", parameterMode)
        .add("parameterType", parameterType)
        .add("position", position)
        .add("typeIntervalType", typeIntervalType)
        .add("typeJson", typeJson)
        .add("typeName", typeName)
        .add("typePrecision", typePrecision)
        .add("typeScale", typeScale)
        .add("typeText", typeText)
        .toString();
  }
}
