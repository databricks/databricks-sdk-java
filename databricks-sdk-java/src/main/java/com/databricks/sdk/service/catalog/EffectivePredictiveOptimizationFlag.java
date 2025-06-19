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
@JsonSerialize(
    using = EffectivePredictiveOptimizationFlag.EffectivePredictiveOptimizationFlagSerializer.class)
@JsonDeserialize(
    using =
        EffectivePredictiveOptimizationFlag.EffectivePredictiveOptimizationFlagDeserializer.class)
public class EffectivePredictiveOptimizationFlag {
  /**
   * The name of the object from which the flag was inherited. If there was no inheritance, this
   * field is left blank.
   */
  private String inheritedFromName;

  /**
   * The type of the object from which the flag was inherited. If there was no inheritance, this
   * field is left blank.
   */
  private EffectivePredictiveOptimizationFlagInheritedFromType inheritedFromType;

  /** Whether predictive optimization should be enabled for this object and objects under it. */
  private EnablePredictiveOptimization value;

  public EffectivePredictiveOptimizationFlag setInheritedFromName(String inheritedFromName) {
    this.inheritedFromName = inheritedFromName;
    return this;
  }

  public String getInheritedFromName() {
    return inheritedFromName;
  }

  public EffectivePredictiveOptimizationFlag setInheritedFromType(
      EffectivePredictiveOptimizationFlagInheritedFromType inheritedFromType) {
    this.inheritedFromType = inheritedFromType;
    return this;
  }

  public EffectivePredictiveOptimizationFlagInheritedFromType getInheritedFromType() {
    return inheritedFromType;
  }

  public EffectivePredictiveOptimizationFlag setValue(EnablePredictiveOptimization value) {
    this.value = value;
    return this;
  }

  public EnablePredictiveOptimization getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EffectivePredictiveOptimizationFlag that = (EffectivePredictiveOptimizationFlag) o;
    return Objects.equals(inheritedFromName, that.inheritedFromName)
        && Objects.equals(inheritedFromType, that.inheritedFromType)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inheritedFromName, inheritedFromType, value);
  }

  @Override
  public String toString() {
    return new ToStringer(EffectivePredictiveOptimizationFlag.class)
        .add("inheritedFromName", inheritedFromName)
        .add("inheritedFromType", inheritedFromType)
        .add("value", value)
        .toString();
  }

  EffectivePredictiveOptimizationFlagPb toPb() {
    EffectivePredictiveOptimizationFlagPb pb = new EffectivePredictiveOptimizationFlagPb();
    pb.setInheritedFromName(inheritedFromName);
    pb.setInheritedFromType(inheritedFromType);
    pb.setValue(value);

    return pb;
  }

  static EffectivePredictiveOptimizationFlag fromPb(EffectivePredictiveOptimizationFlagPb pb) {
    EffectivePredictiveOptimizationFlag model = new EffectivePredictiveOptimizationFlag();
    model.setInheritedFromName(pb.getInheritedFromName());
    model.setInheritedFromType(pb.getInheritedFromType());
    model.setValue(pb.getValue());

    return model;
  }

  public static class EffectivePredictiveOptimizationFlagSerializer
      extends JsonSerializer<EffectivePredictiveOptimizationFlag> {
    @Override
    public void serialize(
        EffectivePredictiveOptimizationFlag value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EffectivePredictiveOptimizationFlagPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EffectivePredictiveOptimizationFlagDeserializer
      extends JsonDeserializer<EffectivePredictiveOptimizationFlag> {
    @Override
    public EffectivePredictiveOptimizationFlag deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EffectivePredictiveOptimizationFlagPb pb =
          mapper.readValue(p, EffectivePredictiveOptimizationFlagPb.class);
      return EffectivePredictiveOptimizationFlag.fromPb(pb);
    }
  }
}
