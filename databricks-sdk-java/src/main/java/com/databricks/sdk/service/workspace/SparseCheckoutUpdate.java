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
@JsonSerialize(using = SparseCheckoutUpdate.SparseCheckoutUpdateSerializer.class)
@JsonDeserialize(using = SparseCheckoutUpdate.SparseCheckoutUpdateDeserializer.class)
public class SparseCheckoutUpdate {
  /**
   * List of sparse checkout cone patterns, see [cone mode handling] for details.
   *
   * <p>[cone mode handling]:
   * https://git-scm.com/docs/git-sparse-checkout#_internalscone_mode_handling
   */
  private Collection<String> patterns;

  public SparseCheckoutUpdate setPatterns(Collection<String> patterns) {
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
    SparseCheckoutUpdate that = (SparseCheckoutUpdate) o;
    return Objects.equals(patterns, that.patterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patterns);
  }

  @Override
  public String toString() {
    return new ToStringer(SparseCheckoutUpdate.class).add("patterns", patterns).toString();
  }

  SparseCheckoutUpdatePb toPb() {
    SparseCheckoutUpdatePb pb = new SparseCheckoutUpdatePb();
    pb.setPatterns(patterns);

    return pb;
  }

  static SparseCheckoutUpdate fromPb(SparseCheckoutUpdatePb pb) {
    SparseCheckoutUpdate model = new SparseCheckoutUpdate();
    model.setPatterns(pb.getPatterns());

    return model;
  }

  public static class SparseCheckoutUpdateSerializer extends JsonSerializer<SparseCheckoutUpdate> {
    @Override
    public void serialize(
        SparseCheckoutUpdate value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SparseCheckoutUpdatePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SparseCheckoutUpdateDeserializer
      extends JsonDeserializer<SparseCheckoutUpdate> {
    @Override
    public SparseCheckoutUpdate deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SparseCheckoutUpdatePb pb = mapper.readValue(p, SparseCheckoutUpdatePb.class);
      return SparseCheckoutUpdate.fromPb(pb);
    }
  }
}
