// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

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

  public FunctionParameterInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public FunctionParameterInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public FunctionParameterInfo setParameterDefault(String parameterDefault) {
    this.parameterDefault = parameterDefault;
    return this;
  }

  public String getParameterDefault() {
    return parameterDefault;
  }

  public FunctionParameterInfo setParameterMode(FunctionParameterMode parameterMode) {
    this.parameterMode = parameterMode;
    return this;
  }

  public FunctionParameterMode getParameterMode() {
    return parameterMode;
  }

  public FunctionParameterInfo setParameterType(FunctionParameterType parameterType) {
    this.parameterType = parameterType;
    return this;
  }

  public FunctionParameterType getParameterType() {
    return parameterType;
  }

  public FunctionParameterInfo setPosition(Long position) {
    this.position = position;
    return this;
  }

  public Long getPosition() {
    return position;
  }

  public FunctionParameterInfo setTypeIntervalType(String typeIntervalType) {
    this.typeIntervalType = typeIntervalType;
    return this;
  }

  public String getTypeIntervalType() {
    return typeIntervalType;
  }

  public FunctionParameterInfo setTypeJson(String typeJson) {
    this.typeJson = typeJson;
    return this;
  }

  public String getTypeJson() {
    return typeJson;
  }

  public FunctionParameterInfo setTypeName(ColumnTypeName typeName) {
    this.typeName = typeName;
    return this;
  }

  public ColumnTypeName getTypeName() {
    return typeName;
  }

  public FunctionParameterInfo setTypePrecision(Long typePrecision) {
    this.typePrecision = typePrecision;
    return this;
  }

  public Long getTypePrecision() {
    return typePrecision;
  }

  public FunctionParameterInfo setTypeScale(Long typeScale) {
    this.typeScale = typeScale;
    return this;
  }

  public Long getTypeScale() {
    return typeScale;
  }

  public FunctionParameterInfo setTypeText(String typeText) {
    this.typeText = typeText;
    return this;
  }

  public String getTypeText() {
    return typeText;
  }
}
