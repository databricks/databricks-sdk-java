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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = EmailConfig.EmailConfigSerializer.class)
@JsonDeserialize(using = EmailConfig.EmailConfigDeserializer.class)
public class EmailConfig {
  /** Email addresses to notify. */
  private Collection<String> addresses;

  public EmailConfig setAddresses(Collection<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Collection<String> getAddresses() {
    return addresses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmailConfig that = (EmailConfig) o;
    return Objects.equals(addresses, that.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses);
  }

  @Override
  public String toString() {
    return new ToStringer(EmailConfig.class).add("addresses", addresses).toString();
  }

  EmailConfigPb toPb() {
    EmailConfigPb pb = new EmailConfigPb();
    pb.setAddresses(addresses);

    return pb;
  }

  static EmailConfig fromPb(EmailConfigPb pb) {
    EmailConfig model = new EmailConfig();
    model.setAddresses(pb.getAddresses());

    return model;
  }

  public static class EmailConfigSerializer extends JsonSerializer<EmailConfig> {
    @Override
    public void serialize(EmailConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EmailConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EmailConfigDeserializer extends JsonDeserializer<EmailConfig> {
    @Override
    public EmailConfig deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EmailConfigPb pb = mapper.readValue(p, EmailConfigPb.class);
      return EmailConfig.fromPb(pb);
    }
  }
}
