// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
@JsonSerialize(using = MicrosoftTeamsConfig.MicrosoftTeamsConfigSerializer.class)
@JsonDeserialize(using = MicrosoftTeamsConfig.MicrosoftTeamsConfigDeserializer.class)
public class MicrosoftTeamsConfig {
  /** [Input-Only] URL for Microsoft Teams. */
  private String url;

  /** [Output-Only] Whether URL is set. */
  private Boolean urlSet;

  public MicrosoftTeamsConfig setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public MicrosoftTeamsConfig setUrlSet(Boolean urlSet) {
    this.urlSet = urlSet;
    return this;
  }

  public Boolean getUrlSet() {
    return urlSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MicrosoftTeamsConfig that = (MicrosoftTeamsConfig) o;
    return Objects.equals(url, that.url) && Objects.equals(urlSet, that.urlSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, urlSet);
  }

  @Override
  public String toString() {
    return new ToStringer(MicrosoftTeamsConfig.class)
        .add("url", url)
        .add("urlSet", urlSet)
        .toString();
  }

  MicrosoftTeamsConfigPb toPb() {
    MicrosoftTeamsConfigPb pb = new MicrosoftTeamsConfigPb();
    pb.setUrl(url);
    pb.setUrlSet(urlSet);

    return pb;
  }

  static MicrosoftTeamsConfig fromPb(MicrosoftTeamsConfigPb pb) {
    MicrosoftTeamsConfig model = new MicrosoftTeamsConfig();
    model.setUrl(pb.getUrl());
    model.setUrlSet(pb.getUrlSet());

    return model;
  }

  public static class MicrosoftTeamsConfigSerializer extends JsonSerializer<MicrosoftTeamsConfig> {
    @Override
    public void serialize(
        MicrosoftTeamsConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MicrosoftTeamsConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MicrosoftTeamsConfigDeserializer
      extends JsonDeserializer<MicrosoftTeamsConfig> {
    @Override
    public MicrosoftTeamsConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MicrosoftTeamsConfigPb pb = mapper.readValue(p, MicrosoftTeamsConfigPb.class);
      return MicrosoftTeamsConfig.fromPb(pb);
    }
  }
}
