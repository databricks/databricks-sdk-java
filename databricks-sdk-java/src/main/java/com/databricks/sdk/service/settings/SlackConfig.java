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
@JsonSerialize(using = SlackConfig.SlackConfigSerializer.class)
@JsonDeserialize(using = SlackConfig.SlackConfigDeserializer.class)
public class SlackConfig {
  /** [Input-Only] URL for Slack destination. */
  private String url;

  /** [Output-Only] Whether URL is set. */
  private Boolean urlSet;

  public SlackConfig setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public SlackConfig setUrlSet(Boolean urlSet) {
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
    SlackConfig that = (SlackConfig) o;
    return Objects.equals(url, that.url) && Objects.equals(urlSet, that.urlSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, urlSet);
  }

  @Override
  public String toString() {
    return new ToStringer(SlackConfig.class).add("url", url).add("urlSet", urlSet).toString();
  }

  SlackConfigPb toPb() {
    SlackConfigPb pb = new SlackConfigPb();
    pb.setUrl(url);
    pb.setUrlSet(urlSet);

    return pb;
  }

  static SlackConfig fromPb(SlackConfigPb pb) {
    SlackConfig model = new SlackConfig();
    model.setUrl(pb.getUrl());
    model.setUrlSet(pb.getUrlSet());

    return model;
  }

  public static class SlackConfigSerializer extends JsonSerializer<SlackConfig> {
    @Override
    public void serialize(SlackConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SlackConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SlackConfigDeserializer extends JsonDeserializer<SlackConfig> {
    @Override
    public SlackConfig deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SlackConfigPb pb = mapper.readValue(p, SlackConfigPb.class);
      return SlackConfig.fromPb(pb);
    }
  }
}
