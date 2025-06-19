// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
@JsonSerialize(using = PartitionValue.PartitionValueSerializer.class)
@JsonDeserialize(using = PartitionValue.PartitionValueDeserializer.class)
public class PartitionValue {
  /** The name of the partition column. */
  private String name;

  /** The operator to apply for the value. */
  private PartitionValueOp op;

  /**
   * The key of a Delta Sharing recipient's property. For example "databricks-account-id". When this
   * field is set, field `value` can not be set.
   */
  private String recipientPropertyKey;

  /**
   * The value of the partition column. When this value is not set, it means `null` value. When this
   * field is set, field `recipient_property_key` can not be set.
   */
  private String value;

  public PartitionValue setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PartitionValue setOp(PartitionValueOp op) {
    this.op = op;
    return this;
  }

  public PartitionValueOp getOp() {
    return op;
  }

  public PartitionValue setRecipientPropertyKey(String recipientPropertyKey) {
    this.recipientPropertyKey = recipientPropertyKey;
    return this;
  }

  public String getRecipientPropertyKey() {
    return recipientPropertyKey;
  }

  public PartitionValue setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PartitionValue that = (PartitionValue) o;
    return Objects.equals(name, that.name)
        && Objects.equals(op, that.op)
        && Objects.equals(recipientPropertyKey, that.recipientPropertyKey)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, op, recipientPropertyKey, value);
  }

  @Override
  public String toString() {
    return new ToStringer(PartitionValue.class)
        .add("name", name)
        .add("op", op)
        .add("recipientPropertyKey", recipientPropertyKey)
        .add("value", value)
        .toString();
  }

  PartitionValuePb toPb() {
    PartitionValuePb pb = new PartitionValuePb();
    pb.setName(name);
    pb.setOp(op);
    pb.setRecipientPropertyKey(recipientPropertyKey);
    pb.setValue(value);

    return pb;
  }

  static PartitionValue fromPb(PartitionValuePb pb) {
    PartitionValue model = new PartitionValue();
    model.setName(pb.getName());
    model.setOp(pb.getOp());
    model.setRecipientPropertyKey(pb.getRecipientPropertyKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class PartitionValueSerializer extends JsonSerializer<PartitionValue> {
    @Override
    public void serialize(PartitionValue value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PartitionValuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PartitionValueDeserializer extends JsonDeserializer<PartitionValue> {
    @Override
    public PartitionValue deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PartitionValuePb pb = mapper.readValue(p, PartitionValuePb.class);
      return PartitionValue.fromPb(pb);
    }
  }
}
