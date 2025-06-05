// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = ColumnInfo.ColumnInfoSerializer.class)
@JsonDeserialize(using = ColumnInfo.ColumnInfoDeserializer.class)
public class ColumnInfo {
  /** User-provided free-form text description. */
  private String comment;

  /** */
  private ColumnMask mask;

  /** Name of Column. */
  private String name;

  /** Whether field may be Null (default: true). */
  private Boolean nullable;

  /** Partition index for column. */
  private Long partitionIndex;

  /** Ordinal position of column (starting at position 0). */
  private Long position;

  /** Format of IntervalType. */
  private String typeIntervalType;

  /** Full data type specification, JSON-serialized. */
  private String typeJson;

  /** */
  private ColumnTypeName typeName;

  /** Digits of precision; required for DecimalTypes. */
  private Long typePrecision;

  /** Digits to right of decimal; Required for DecimalTypes. */
  private Long typeScale;

  /** Full data type specification as SQL/catalogString text. */
  private String typeText;

  public ColumnInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ColumnInfo setMask(ColumnMask mask) {
    this.mask = mask;
    return this;
  }

  public ColumnMask getMask() {
    return mask;
  }

  public ColumnInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ColumnInfo setNullable(Boolean nullable) {
    this.nullable = nullable;
    return this;
  }

  public Boolean getNullable() {
    return nullable;
  }

  public ColumnInfo setPartitionIndex(Long partitionIndex) {
    this.partitionIndex = partitionIndex;
    return this;
  }

  public Long getPartitionIndex() {
    return partitionIndex;
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

  public ColumnInfo setTypeJson(String typeJson) {
    this.typeJson = typeJson;
    return this;
  }

  public String getTypeJson() {
    return typeJson;
  }

  public ColumnInfo setTypeName(ColumnTypeName typeName) {
    this.typeName = typeName;
    return this;
  }

  public ColumnTypeName getTypeName() {
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

  ColumnInfoPb toPb() {
    ColumnInfoPb pb = new ColumnInfoPb();
    pb.setComment(comment);
    pb.setMask(mask);
    pb.setName(name);
    pb.setNullable(nullable);
    pb.setPartitionIndex(partitionIndex);
    pb.setPosition(position);
    pb.setTypeIntervalType(typeIntervalType);
    pb.setTypeJson(typeJson);
    pb.setTypeName(typeName);
    pb.setTypePrecision(typePrecision);
    pb.setTypeScale(typeScale);
    pb.setTypeText(typeText);

    return pb;
  }

  static ColumnInfo fromPb(ColumnInfoPb pb) {
    ColumnInfo model = new ColumnInfo();
    model.setComment(pb.getComment());
    model.setMask(pb.getMask());
    model.setName(pb.getName());
    model.setNullable(pb.getNullable());
    model.setPartitionIndex(pb.getPartitionIndex());
    model.setPosition(pb.getPosition());
    model.setTypeIntervalType(pb.getTypeIntervalType());
    model.setTypeJson(pb.getTypeJson());
    model.setTypeName(pb.getTypeName());
    model.setTypePrecision(pb.getTypePrecision());
    model.setTypeScale(pb.getTypeScale());
    model.setTypeText(pb.getTypeText());

    return model;
  }

  public static class ColumnInfoSerializer extends JsonSerializer<ColumnInfo> {
    @Override
    public void serialize(ColumnInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ColumnInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ColumnInfoDeserializer extends JsonDeserializer<ColumnInfo> {
    @Override
    public ColumnInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ColumnInfoPb pb = mapper.readValue(p, ColumnInfoPb.class);
      return ColumnInfo.fromPb(pb);
    }
  }
}
