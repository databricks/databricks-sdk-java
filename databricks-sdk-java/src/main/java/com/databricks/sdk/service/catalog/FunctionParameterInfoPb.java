// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class FunctionParameterInfoPb {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("name")
  private String name;

  @JsonProperty("parameter_default")
  private String parameterDefault;

  @JsonProperty("parameter_mode")
  private FunctionParameterMode parameterMode;

  @JsonProperty("parameter_type")
  private FunctionParameterType parameterType;

  @JsonProperty("position")
  private Long position;

  @JsonProperty("type_interval_type")
  private String typeIntervalType;

  @JsonProperty("type_json")
  private String typeJson;

  @JsonProperty("type_name")
  private ColumnTypeName typeName;

  @JsonProperty("type_precision")
  private Long typePrecision;

  @JsonProperty("type_scale")
  private Long typeScale;

  @JsonProperty("type_text")
  private String typeText;

  public FunctionParameterInfoPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public FunctionParameterInfoPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public FunctionParameterInfoPb setParameterDefault(String parameterDefault) {
    this.parameterDefault = parameterDefault;
    return this;
  }

  public String getParameterDefault() {
    return parameterDefault;
  }

  public FunctionParameterInfoPb setParameterMode(FunctionParameterMode parameterMode) {
    this.parameterMode = parameterMode;
    return this;
  }

  public FunctionParameterMode getParameterMode() {
    return parameterMode;
  }

  public FunctionParameterInfoPb setParameterType(FunctionParameterType parameterType) {
    this.parameterType = parameterType;
    return this;
  }

  public FunctionParameterType getParameterType() {
    return parameterType;
  }

  public FunctionParameterInfoPb setPosition(Long position) {
    this.position = position;
    return this;
  }

  public Long getPosition() {
    return position;
  }

  public FunctionParameterInfoPb setTypeIntervalType(String typeIntervalType) {
    this.typeIntervalType = typeIntervalType;
    return this;
  }

  public String getTypeIntervalType() {
    return typeIntervalType;
  }

  public FunctionParameterInfoPb setTypeJson(String typeJson) {
    this.typeJson = typeJson;
    return this;
  }

  public String getTypeJson() {
    return typeJson;
  }

  public FunctionParameterInfoPb setTypeName(ColumnTypeName typeName) {
    this.typeName = typeName;
    return this;
  }

  public ColumnTypeName getTypeName() {
    return typeName;
  }

  public FunctionParameterInfoPb setTypePrecision(Long typePrecision) {
    this.typePrecision = typePrecision;
    return this;
  }

  public Long getTypePrecision() {
    return typePrecision;
  }

  public FunctionParameterInfoPb setTypeScale(Long typeScale) {
    this.typeScale = typeScale;
    return this;
  }

  public Long getTypeScale() {
    return typeScale;
  }

  public FunctionParameterInfoPb setTypeText(String typeText) {
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
    FunctionParameterInfoPb that = (FunctionParameterInfoPb) o;
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
    return new ToStringer(FunctionParameterInfoPb.class)
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
