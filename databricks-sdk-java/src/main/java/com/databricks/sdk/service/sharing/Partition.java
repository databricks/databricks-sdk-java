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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = Partition.PartitionSerializer.class)
@JsonDeserialize(using = Partition.PartitionDeserializer.class)
public class Partition {
  /** An array of partition values. */
  private Collection<PartitionValue> values;

  public Partition setValues(Collection<PartitionValue> values) {
    this.values = values;
    return this;
  }

  public Collection<PartitionValue> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Partition that = (Partition) o;
    return Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    return new ToStringer(Partition.class).add("values", values).toString();
  }

  PartitionPb toPb() {
    PartitionPb pb = new PartitionPb();
    pb.setValues(values);

    return pb;
  }

  static Partition fromPb(PartitionPb pb) {
    Partition model = new Partition();
    model.setValues(pb.getValues());

    return model;
  }

  public static class PartitionSerializer extends JsonSerializer<Partition> {
    @Override
    public void serialize(Partition value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PartitionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PartitionDeserializer extends JsonDeserializer<Partition> {
    @Override
    public Partition deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PartitionPb pb = mapper.readValue(p, PartitionPb.class);
      return Partition.fromPb(pb);
    }
  }
}
