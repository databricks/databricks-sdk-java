// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
  /** The name of the column. */
  private String name;

  /** The ordinal position of the column (starting at position 0). */
  private Long position;

  /** The format of the interval type. */
  private String typeIntervalType;

  /**
   * The name of the base data type. This doesn't include details for complex types such as STRUCT,
   * MAP or ARRAY.
   */
  private ColumnInfoTypeName typeName;

  /** Specifies the number of digits in a number. This applies to the DECIMAL type. */
  private Long typePrecision;

  /**
   * Specifies the number of digits to the right of the decimal point in a number. This applies to
   * the DECIMAL type.
   */
  private Long typeScale;

  /** The full SQL type specification. */
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
        && Objects.equals(typeText, that.typeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        name, position, typeIntervalType, typeName, typePrecision, typeScale, typeText);
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
        .add("typeText", typeText)
        .toString();
  }

  ColumnInfoPb toPb() {
    ColumnInfoPb pb = new ColumnInfoPb();
    pb.setName(name);
    pb.setPosition(position);
    pb.setTypeIntervalType(typeIntervalType);
    pb.setTypeName(typeName);
    pb.setTypePrecision(typePrecision);
    pb.setTypeScale(typeScale);
    pb.setTypeText(typeText);

    return pb;
  }

  static ColumnInfo fromPb(ColumnInfoPb pb) {
    ColumnInfo model = new ColumnInfo();
    model.setName(pb.getName());
    model.setPosition(pb.getPosition());
    model.setTypeIntervalType(pb.getTypeIntervalType());
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
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ColumnInfoPb pb = mapper.readValue(p, ColumnInfoPb.class);
      return ColumnInfo.fromPb(pb);
    }
  }
}
