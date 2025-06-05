// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = ConsumerTerms.ConsumerTermsSerializer.class)
@JsonDeserialize(using = ConsumerTerms.ConsumerTermsDeserializer.class)
public class ConsumerTerms {
  /** */
  private String version;

  public ConsumerTerms setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConsumerTerms that = (ConsumerTerms) o;
    return Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version);
  }

  @Override
  public String toString() {
    return new ToStringer(ConsumerTerms.class).add("version", version).toString();
  }

  ConsumerTermsPb toPb() {
    ConsumerTermsPb pb = new ConsumerTermsPb();
    pb.setVersion(version);

    return pb;
  }

  static ConsumerTerms fromPb(ConsumerTermsPb pb) {
    ConsumerTerms model = new ConsumerTerms();
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class ConsumerTermsSerializer extends JsonSerializer<ConsumerTerms> {
    @Override
    public void serialize(ConsumerTerms value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ConsumerTermsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ConsumerTermsDeserializer extends JsonDeserializer<ConsumerTerms> {
    @Override
    public ConsumerTerms deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ConsumerTermsPb pb = mapper.readValue(p, ConsumerTermsPb.class);
      return ConsumerTerms.fromPb(pb);
    }
  }
}
