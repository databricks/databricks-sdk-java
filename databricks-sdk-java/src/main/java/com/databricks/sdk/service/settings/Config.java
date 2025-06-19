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
@JsonSerialize(using = Config.ConfigSerializer.class)
@JsonDeserialize(using = Config.ConfigDeserializer.class)
public class Config {
  /** */
  private EmailConfig email;

  /** */
  private GenericWebhookConfig genericWebhook;

  /** */
  private MicrosoftTeamsConfig microsoftTeams;

  /** */
  private PagerdutyConfig pagerduty;

  /** */
  private SlackConfig slack;

  public Config setEmail(EmailConfig email) {
    this.email = email;
    return this;
  }

  public EmailConfig getEmail() {
    return email;
  }

  public Config setGenericWebhook(GenericWebhookConfig genericWebhook) {
    this.genericWebhook = genericWebhook;
    return this;
  }

  public GenericWebhookConfig getGenericWebhook() {
    return genericWebhook;
  }

  public Config setMicrosoftTeams(MicrosoftTeamsConfig microsoftTeams) {
    this.microsoftTeams = microsoftTeams;
    return this;
  }

  public MicrosoftTeamsConfig getMicrosoftTeams() {
    return microsoftTeams;
  }

  public Config setPagerduty(PagerdutyConfig pagerduty) {
    this.pagerduty = pagerduty;
    return this;
  }

  public PagerdutyConfig getPagerduty() {
    return pagerduty;
  }

  public Config setSlack(SlackConfig slack) {
    this.slack = slack;
    return this;
  }

  public SlackConfig getSlack() {
    return slack;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Config that = (Config) o;
    return Objects.equals(email, that.email)
        && Objects.equals(genericWebhook, that.genericWebhook)
        && Objects.equals(microsoftTeams, that.microsoftTeams)
        && Objects.equals(pagerduty, that.pagerduty)
        && Objects.equals(slack, that.slack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, genericWebhook, microsoftTeams, pagerduty, slack);
  }

  @Override
  public String toString() {
    return new ToStringer(Config.class)
        .add("email", email)
        .add("genericWebhook", genericWebhook)
        .add("microsoftTeams", microsoftTeams)
        .add("pagerduty", pagerduty)
        .add("slack", slack)
        .toString();
  }

  ConfigPb toPb() {
    ConfigPb pb = new ConfigPb();
    pb.setEmail(email);
    pb.setGenericWebhook(genericWebhook);
    pb.setMicrosoftTeams(microsoftTeams);
    pb.setPagerduty(pagerduty);
    pb.setSlack(slack);

    return pb;
  }

  static Config fromPb(ConfigPb pb) {
    Config model = new Config();
    model.setEmail(pb.getEmail());
    model.setGenericWebhook(pb.getGenericWebhook());
    model.setMicrosoftTeams(pb.getMicrosoftTeams());
    model.setPagerduty(pb.getPagerduty());
    model.setSlack(pb.getSlack());

    return model;
  }

  public static class ConfigSerializer extends JsonSerializer<Config> {
    @Override
    public void serialize(Config value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ConfigDeserializer extends JsonDeserializer<Config> {
    @Override
    public Config deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ConfigPb pb = mapper.readValue(p, ConfigPb.class);
      return Config.fromPb(pb);
    }
  }
}
