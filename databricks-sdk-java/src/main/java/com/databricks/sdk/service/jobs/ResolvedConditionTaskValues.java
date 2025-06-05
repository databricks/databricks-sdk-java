// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = ResolvedConditionTaskValues.ResolvedConditionTaskValuesSerializer.class)
@JsonDeserialize(using = ResolvedConditionTaskValues.ResolvedConditionTaskValuesDeserializer.class)
public class ResolvedConditionTaskValues {
  /** */
  private String left;

  /** */
  private String right;

  public ResolvedConditionTaskValues setLeft(String left) {
    this.left = left;
    return this;
  }

  public String getLeft() {
    return left;
  }

  public ResolvedConditionTaskValues setRight(String right) {
    this.right = right;
    return this;
  }

  public String getRight() {
    return right;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedConditionTaskValues that = (ResolvedConditionTaskValues) o;
    return Objects.equals(left, that.left) && Objects.equals(right, that.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, right);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedConditionTaskValues.class)
        .add("left", left)
        .add("right", right)
        .toString();
  }

  ResolvedConditionTaskValuesPb toPb() {
    ResolvedConditionTaskValuesPb pb = new ResolvedConditionTaskValuesPb();
    pb.setLeft(left);
    pb.setRight(right);

    return pb;
  }

  static ResolvedConditionTaskValues fromPb(ResolvedConditionTaskValuesPb pb) {
    ResolvedConditionTaskValues model = new ResolvedConditionTaskValues();
    model.setLeft(pb.getLeft());
    model.setRight(pb.getRight());

    return model;
  }

  public static class ResolvedConditionTaskValuesSerializer
      extends JsonSerializer<ResolvedConditionTaskValues> {
    @Override
    public void serialize(
        ResolvedConditionTaskValues value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResolvedConditionTaskValuesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResolvedConditionTaskValuesDeserializer
      extends JsonDeserializer<ResolvedConditionTaskValues> {
    @Override
    public ResolvedConditionTaskValues deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResolvedConditionTaskValuesPb pb = mapper.readValue(p, ResolvedConditionTaskValuesPb.class);
      return ResolvedConditionTaskValues.fromPb(pb);
    }
  }
}
