// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Represents a parameter of a function. The same message is used for both input and output columns.
 */
@Generated
public class FunctionParameterInfo {
  /** The comment of the parameter. */
  @JsonProperty("comment")
  private String comment;

  /** The name of the parameter. */
  @JsonProperty("name")
  private String name;

  /** The default value of the parameter. */
  @JsonProperty("parameter_default")
  private String parameterDefault;

  /** The mode of the function parameter. */
  @JsonProperty("parameter_mode")
  private FunctionParameterMode parameterMode;

  /** The type of the function parameter. */
  @JsonProperty("parameter_type")
  private FunctionParameterType parameterType;

  /** The position of the parameter. */
  @JsonProperty("position")
  private Long position;

  /** The interval type of the parameter type. */
  @JsonProperty("type_interval_type")
  private String typeIntervalType;

  /** The type of the parameter in JSON format. */
  @JsonProperty("type_json")
  private String typeJson;

  /** The type of the parameter in Enum format. */
  @JsonProperty("type_name")
  private ColumnTypeName typeName;

  /** The precision of the parameter type. */
  @JsonProperty("type_precision")
  private Long typePrecision;

  /** The scale of the parameter type. */
  @JsonProperty("type_scale")
  private Long typeScale;

  /** The type of the parameter in text format. */
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
