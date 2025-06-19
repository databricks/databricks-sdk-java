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

/**
 * Represents a change to the cluster settings required for the cluster to become compliant with its
 * policy.
 */
@Generated
@JsonSerialize(using = ClusterSettingsChange.ClusterSettingsChangeSerializer.class)
@JsonDeserialize(using = ClusterSettingsChange.ClusterSettingsChangeDeserializer.class)
public class ClusterSettingsChange {
  /** The field where this change would be made. */
  private String field;

  /**
   * The new value of this field after enforcing policy compliance (either a number, a boolean, or a
   * string) converted to a string. This is intended to be read by a human. The typed new value of
   * this field can be retrieved by reading the settings field in the API response.
   */
  private String newValue;

  /**
   * The previous value of this field before enforcing policy compliance (either a number, a
   * boolean, or a string) converted to a string. This is intended to be read by a human. The type
   * of the field can be retrieved by reading the settings field in the API response.
   */
  private String previousValue;

  public ClusterSettingsChange setField(String field) {
    this.field = field;
    return this;
  }

  public String getField() {
    return field;
  }

  public ClusterSettingsChange setNewValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

  public String getNewValue() {
    return newValue;
  }

  public ClusterSettingsChange setPreviousValue(String previousValue) {
    this.previousValue = previousValue;
    return this;
  }

  public String getPreviousValue() {
    return previousValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterSettingsChange that = (ClusterSettingsChange) o;
    return Objects.equals(field, that.field)
        && Objects.equals(newValue, that.newValue)
        && Objects.equals(previousValue, that.previousValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, newValue, previousValue);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterSettingsChange.class)
        .add("field", field)
        .add("newValue", newValue)
        .add("previousValue", previousValue)
        .toString();
  }

  ClusterSettingsChangePb toPb() {
    ClusterSettingsChangePb pb = new ClusterSettingsChangePb();
    pb.setField(field);
    pb.setNewValue(newValue);
    pb.setPreviousValue(previousValue);

    return pb;
  }

  static ClusterSettingsChange fromPb(ClusterSettingsChangePb pb) {
    ClusterSettingsChange model = new ClusterSettingsChange();
    model.setField(pb.getField());
    model.setNewValue(pb.getNewValue());
    model.setPreviousValue(pb.getPreviousValue());

    return model;
  }

  public static class ClusterSettingsChangeSerializer
      extends JsonSerializer<ClusterSettingsChange> {
    @Override
    public void serialize(
        ClusterSettingsChange value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterSettingsChangePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterSettingsChangeDeserializer
      extends JsonDeserializer<ClusterSettingsChange> {
    @Override
    public ClusterSettingsChange deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterSettingsChangePb pb = mapper.readValue(p, ClusterSettingsChangePb.class);
      return ClusterSettingsChange.fromPb(pb);
    }
  }
}
