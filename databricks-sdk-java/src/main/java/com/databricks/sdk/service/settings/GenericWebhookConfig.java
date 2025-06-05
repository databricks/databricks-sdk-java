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
@JsonSerialize(using = GenericWebhookConfig.GenericWebhookConfigSerializer.class)
@JsonDeserialize(using = GenericWebhookConfig.GenericWebhookConfigDeserializer.class)
public class GenericWebhookConfig {
  /** [Input-Only][Optional] Password for webhook. */
  private String password;

  /** [Output-Only] Whether password is set. */
  private Boolean passwordSet;

  /** [Input-Only] URL for webhook. */
  private String url;

  /** [Output-Only] Whether URL is set. */
  private Boolean urlSet;

  /** [Input-Only][Optional] Username for webhook. */
  private String username;

  /** [Output-Only] Whether username is set. */
  private Boolean usernameSet;

  public GenericWebhookConfig setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public GenericWebhookConfig setPasswordSet(Boolean passwordSet) {
    this.passwordSet = passwordSet;
    return this;
  }

  public Boolean getPasswordSet() {
    return passwordSet;
  }

  public GenericWebhookConfig setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public GenericWebhookConfig setUrlSet(Boolean urlSet) {
    this.urlSet = urlSet;
    return this;
  }

  public Boolean getUrlSet() {
    return urlSet;
  }

  public GenericWebhookConfig setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getUsername() {
    return username;
  }

  public GenericWebhookConfig setUsernameSet(Boolean usernameSet) {
    this.usernameSet = usernameSet;
    return this;
  }

  public Boolean getUsernameSet() {
    return usernameSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenericWebhookConfig that = (GenericWebhookConfig) o;
    return Objects.equals(password, that.password)
        && Objects.equals(passwordSet, that.passwordSet)
        && Objects.equals(url, that.url)
        && Objects.equals(urlSet, that.urlSet)
        && Objects.equals(username, that.username)
        && Objects.equals(usernameSet, that.usernameSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, passwordSet, url, urlSet, username, usernameSet);
  }

  @Override
  public String toString() {
    return new ToStringer(GenericWebhookConfig.class)
        .add("password", password)
        .add("passwordSet", passwordSet)
        .add("url", url)
        .add("urlSet", urlSet)
        .add("username", username)
        .add("usernameSet", usernameSet)
        .toString();
  }

  GenericWebhookConfigPb toPb() {
    GenericWebhookConfigPb pb = new GenericWebhookConfigPb();
    pb.setPassword(password);
    pb.setPasswordSet(passwordSet);
    pb.setUrl(url);
    pb.setUrlSet(urlSet);
    pb.setUsername(username);
    pb.setUsernameSet(usernameSet);

    return pb;
  }

  static GenericWebhookConfig fromPb(GenericWebhookConfigPb pb) {
    GenericWebhookConfig model = new GenericWebhookConfig();
    model.setPassword(pb.getPassword());
    model.setPasswordSet(pb.getPasswordSet());
    model.setUrl(pb.getUrl());
    model.setUrlSet(pb.getUrlSet());
    model.setUsername(pb.getUsername());
    model.setUsernameSet(pb.getUsernameSet());

    return model;
  }

  public static class GenericWebhookConfigSerializer extends JsonSerializer<GenericWebhookConfig> {
    @Override
    public void serialize(
        GenericWebhookConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenericWebhookConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenericWebhookConfigDeserializer
      extends JsonDeserializer<GenericWebhookConfig> {
    @Override
    public GenericWebhookConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenericWebhookConfigPb pb = mapper.readValue(p, GenericWebhookConfigPb.class);
      return GenericWebhookConfig.fromPb(pb);
    }
  }
}
