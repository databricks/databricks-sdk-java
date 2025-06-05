// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** Attributes specific to AWS for a Spark node. */
@Generated
@JsonSerialize(using = SparkNodeAwsAttributes.SparkNodeAwsAttributesSerializer.class)
@JsonDeserialize(using = SparkNodeAwsAttributes.SparkNodeAwsAttributesDeserializer.class)
public class SparkNodeAwsAttributes {
  /** Whether this node is on an Amazon spot instance. */
  private Boolean isSpot;

  public SparkNodeAwsAttributes setIsSpot(Boolean isSpot) {
    this.isSpot = isSpot;
    return this;
  }

  public Boolean getIsSpot() {
    return isSpot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkNodeAwsAttributes that = (SparkNodeAwsAttributes) o;
    return Objects.equals(isSpot, that.isSpot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSpot);
  }

  @Override
  public String toString() {
    return new ToStringer(SparkNodeAwsAttributes.class).add("isSpot", isSpot).toString();
  }

  SparkNodeAwsAttributesPb toPb() {
    SparkNodeAwsAttributesPb pb = new SparkNodeAwsAttributesPb();
    pb.setIsSpot(isSpot);

    return pb;
  }

  static SparkNodeAwsAttributes fromPb(SparkNodeAwsAttributesPb pb) {
    SparkNodeAwsAttributes model = new SparkNodeAwsAttributes();
    model.setIsSpot(pb.getIsSpot());

    return model;
  }

  public static class SparkNodeAwsAttributesSerializer
      extends JsonSerializer<SparkNodeAwsAttributes> {
    @Override
    public void serialize(
        SparkNodeAwsAttributes value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SparkNodeAwsAttributesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SparkNodeAwsAttributesDeserializer
      extends JsonDeserializer<SparkNodeAwsAttributes> {
    @Override
    public SparkNodeAwsAttributes deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SparkNodeAwsAttributesPb pb = mapper.readValue(p, SparkNodeAwsAttributesPb.class);
      return SparkNodeAwsAttributes.fromPb(pb);
    }
  }
}
