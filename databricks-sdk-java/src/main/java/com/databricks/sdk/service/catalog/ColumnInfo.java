// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** */
  @JsonProperty("mask")
  private ColumnMask mask;

  /** Name of Column. */
  @JsonProperty("name")
  private String name;

  /** Whether field may be Null (default: true). */
  @JsonProperty("nullable")
  private Boolean nullable;

  /** Partition index for column. */
  @JsonProperty("partition_index")
  private Long partitionIndex;

  /** Ordinal position of column (starting at position 0). */
  @JsonProperty("position")
  private Long position;

  /** Format of IntervalType. */
  @JsonProperty("type_interval_type")
  private String typeIntervalType;

  /** Full data type specification, JSON-serialized. */
  @JsonProperty("type_json")
  private String typeJson;

  /** Name of type (INT, STRUCT, MAP, etc.). */
  @JsonProperty("type_name")
  private ColumnTypeName typeName;

  /** Digits of precision; required for DecimalTypes. */
  @JsonProperty("type_precision")
  private Long typePrecision;

  /** Digits to right of decimal; Required for DecimalTypes. */
  @JsonProperty("type_scale")
  private Long typeScale;

  /** Full data type specification as SQL/catalogString text. */
  @JsonProperty("type_text")
  private String typeText;

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ColumnInfo} object
   */
  public ColumnInfo setComment(String comment) {
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
   * <p>Setter for the field <code>mask</code>.</p>
   *
   * @param mask a {@link com.databricks.sdk.service.catalog.ColumnMask} object
   * @return a {@link com.databricks.sdk.service.catalog.ColumnInfo} object
   */
  public ColumnInfo setMask(ColumnMask mask) {
    this.mask = mask;
    return this;
  }

  /**
   * <p>Getter for the field <code>mask</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.ColumnMask} object
   */
  public ColumnMask getMask() {
    return mask;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ColumnInfo} object
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
   * <p>Setter for the field <code>nullable</code>.</p>
   *
   * @param nullable a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.ColumnInfo} object
   */
  public ColumnInfo setNullable(Boolean nullable) {
    this.nullable = nullable;
    return this;
  }

  /**
   * <p>Getter for the field <code>nullable</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getNullable() {
    return nullable;
  }

  /**
   * <p>Setter for the field <code>partitionIndex</code>.</p>
   *
   * @param partitionIndex a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.ColumnInfo} object
   */
  public ColumnInfo setPartitionIndex(Long partitionIndex) {
    this.partitionIndex = partitionIndex;
    return this;
  }

  /**
   * <p>Getter for the field <code>partitionIndex</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getPartitionIndex() {
    return partitionIndex;
  }

  /**
   * <p>Setter for the field <code>position</code>.</p>
   *
   * @param position a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.ColumnInfo} object
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
   * @return a {@link com.databricks.sdk.service.catalog.ColumnInfo} object
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
   * <p>Setter for the field <code>typeJson</code>.</p>
   *
   * @param typeJson a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ColumnInfo} object
   */
  public ColumnInfo setTypeJson(String typeJson) {
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
   * @return a {@link com.databricks.sdk.service.catalog.ColumnInfo} object
   */
  public ColumnInfo setTypeName(ColumnTypeName typeName) {
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
   * @return a {@link com.databricks.sdk.service.catalog.ColumnInfo} object
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
   * @return a {@link com.databricks.sdk.service.catalog.ColumnInfo} object
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
   * @return a {@link com.databricks.sdk.service.catalog.ColumnInfo} object
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ColumnInfo.class)
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
