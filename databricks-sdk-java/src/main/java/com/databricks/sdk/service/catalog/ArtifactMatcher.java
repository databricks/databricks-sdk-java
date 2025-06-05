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
@JsonSerialize(using = ArtifactMatcher.ArtifactMatcherSerializer.class)
@JsonDeserialize(using = ArtifactMatcher.ArtifactMatcherDeserializer.class)
public class ArtifactMatcher {
  /** The artifact path or maven coordinate */
  private String artifact;

  /** The pattern matching type of the artifact */
  private MatchType matchType;

  public ArtifactMatcher setArtifact(String artifact) {
    this.artifact = artifact;
    return this;
  }

  public String getArtifact() {
    return artifact;
  }

  public ArtifactMatcher setMatchType(MatchType matchType) {
    this.matchType = matchType;
    return this;
  }

  public MatchType getMatchType() {
    return matchType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArtifactMatcher that = (ArtifactMatcher) o;
    return Objects.equals(artifact, that.artifact) && Objects.equals(matchType, that.matchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifact, matchType);
  }

  @Override
  public String toString() {
    return new ToStringer(ArtifactMatcher.class)
        .add("artifact", artifact)
        .add("matchType", matchType)
        .toString();
  }

  ArtifactMatcherPb toPb() {
    ArtifactMatcherPb pb = new ArtifactMatcherPb();
    pb.setArtifact(artifact);
    pb.setMatchType(matchType);

    return pb;
  }

  static ArtifactMatcher fromPb(ArtifactMatcherPb pb) {
    ArtifactMatcher model = new ArtifactMatcher();
    model.setArtifact(pb.getArtifact());
    model.setMatchType(pb.getMatchType());

    return model;
  }

  public static class ArtifactMatcherSerializer extends JsonSerializer<ArtifactMatcher> {
    @Override
    public void serialize(ArtifactMatcher value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ArtifactMatcherPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ArtifactMatcherDeserializer extends JsonDeserializer<ArtifactMatcher> {
    @Override
    public ArtifactMatcher deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ArtifactMatcherPb pb = mapper.readValue(p, ArtifactMatcherPb.class);
      return ArtifactMatcher.fromPb(pb);
    }
  }
}
