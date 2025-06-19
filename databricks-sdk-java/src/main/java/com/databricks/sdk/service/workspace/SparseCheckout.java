// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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

/** Sparse checkout configuration, it contains options like cone patterns. */
@Generated
@JsonSerialize(using = SparseCheckout.SparseCheckoutSerializer.class)
@JsonDeserialize(using = SparseCheckout.SparseCheckoutDeserializer.class)
public class SparseCheckout {
  /**
   * List of sparse checkout cone patterns, see [cone mode handling] for details.
   *
   * <p>[cone mode handling]:
   * https://git-scm.com/docs/git-sparse-checkout#_internalscone_mode_handling
   */
  private Collection<String> patterns;

  public SparseCheckout setPatterns(Collection<String> patterns) {
    this.patterns = patterns;
    return this;
  }

  public Collection<String> getPatterns() {
    return patterns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparseCheckout that = (SparseCheckout) o;
    return Objects.equals(patterns, that.patterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patterns);
  }

  @Override
  public String toString() {
    return new ToStringer(SparseCheckout.class).add("patterns", patterns).toString();
  }

  SparseCheckoutPb toPb() {
    SparseCheckoutPb pb = new SparseCheckoutPb();
    pb.setPatterns(patterns);

    return pb;
  }

  static SparseCheckout fromPb(SparseCheckoutPb pb) {
    SparseCheckout model = new SparseCheckout();
    model.setPatterns(pb.getPatterns());

    return model;
  }

  public static class SparseCheckoutSerializer extends JsonSerializer<SparseCheckout> {
    @Override
    public void serialize(SparseCheckout value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SparseCheckoutPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SparseCheckoutDeserializer extends JsonDeserializer<SparseCheckout> {
    @Override
    public SparseCheckout deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SparseCheckoutPb pb = mapper.readValue(p, SparseCheckoutPb.class);
      return SparseCheckout.fromPb(pb);
    }
  }
}
