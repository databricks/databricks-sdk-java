// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ColumnInfoPb {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("mask")
  private ColumnMask mask;

  @JsonProperty("name")
  private String name;

  @JsonProperty("nullable")
  private Boolean nullable;

  @JsonProperty("partition_index")
  private Long partitionIndex;

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

  public ColumnInfoPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ColumnInfoPb setMask(ColumnMask mask) {
    this.mask = mask;
    return this;
  }

  public ColumnMask getMask() {
    return mask;
  }

  public ColumnInfoPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ColumnInfoPb setNullable(Boolean nullable) {
    this.nullable = nullable;
    return this;
  }

  public Boolean getNullable() {
    return nullable;
  }

  public ColumnInfoPb setPartitionIndex(Long partitionIndex) {
    this.partitionIndex = partitionIndex;
    return this;
  }

  public Long getPartitionIndex() {
    return partitionIndex;
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

  public ColumnInfoPb setTypeJson(String typeJson) {
    this.typeJson = typeJson;
    return this;
  }

  public String getTypeJson() {
    return typeJson;
  }

  public ColumnInfoPb setTypeName(ColumnTypeName typeName) {
    this.typeName = typeName;
    return this;
  }

  public ColumnTypeName getTypeName() {
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
    return Objects.equals(comment, that.comment)
        && Objects.equals(mask, that.mask)
        && Objects.equals(name, that.name)
        && Objects.equals(nullable, that.nullable)
        && Objects.equals(partitionIndex, that.partitionIndex)
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
        mask,
        name,
        nullable,
        partitionIndex,
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
    return new ToStringer(ColumnInfoPb.class)
        .add("comment", comment)
        .add("mask", mask)
        .add("name", name)
        .add("nullable", nullable)
        .add("partitionIndex", partitionIndex)
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
