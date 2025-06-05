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
@JsonSerialize(using = MultiValuesOptions.MultiValuesOptionsSerializer.class)
@JsonDeserialize(using = MultiValuesOptions.MultiValuesOptionsDeserializer.class)
public class MultiValuesOptions {
  /** Character that prefixes each selected parameter value. */
  private String prefix;

  /** Character that separates each selected parameter value. Defaults to a comma. */
  private String separator;

  /** Character that suffixes each selected parameter value. */
  private String suffix;

  public MultiValuesOptions setPrefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  public String getPrefix() {
    return prefix;
  }

  public MultiValuesOptions setSeparator(String separator) {
    this.separator = separator;
    return this;
  }

  public String getSeparator() {
    return separator;
  }

  public MultiValuesOptions setSuffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  public String getSuffix() {
    return suffix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MultiValuesOptions that = (MultiValuesOptions) o;
    return Objects.equals(prefix, that.prefix)
        && Objects.equals(separator, that.separator)
        && Objects.equals(suffix, that.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, separator, suffix);
  }

  @Override
  public String toString() {
    return new ToStringer(MultiValuesOptions.class)
        .add("prefix", prefix)
        .add("separator", separator)
        .add("suffix", suffix)
        .toString();
  }

  MultiValuesOptionsPb toPb() {
    MultiValuesOptionsPb pb = new MultiValuesOptionsPb();
    pb.setPrefix(prefix);
    pb.setSeparator(separator);
    pb.setSuffix(suffix);

    return pb;
  }

  static MultiValuesOptions fromPb(MultiValuesOptionsPb pb) {
    MultiValuesOptions model = new MultiValuesOptions();
    model.setPrefix(pb.getPrefix());
    model.setSeparator(pb.getSeparator());
    model.setSuffix(pb.getSuffix());

    return model;
  }

  public static class MultiValuesOptionsSerializer extends JsonSerializer<MultiValuesOptions> {
    @Override
    public void serialize(MultiValuesOptions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MultiValuesOptionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MultiValuesOptionsDeserializer extends JsonDeserializer<MultiValuesOptions> {
    @Override
    public MultiValuesOptions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MultiValuesOptionsPb pb = mapper.readValue(p, MultiValuesOptionsPb.class);
      return MultiValuesOptions.fromPb(pb);
    }
  }
}
