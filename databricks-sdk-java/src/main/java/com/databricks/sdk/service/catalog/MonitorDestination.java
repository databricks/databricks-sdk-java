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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = MonitorDestination.MonitorDestinationSerializer.class)
@JsonDeserialize(using = MonitorDestination.MonitorDestinationDeserializer.class)
public class MonitorDestination {
  /**
   * The list of email addresses to send the notification to. A maximum of 5 email addresses is
   * supported.
   */
  private Collection<String> emailAddresses;

  public MonitorDestination setEmailAddresses(Collection<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public Collection<String> getEmailAddresses() {
    return emailAddresses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorDestination that = (MonitorDestination) o;
    return Objects.equals(emailAddresses, that.emailAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddresses);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorDestination.class)
        .add("emailAddresses", emailAddresses)
        .toString();
  }

  MonitorDestinationPb toPb() {
    MonitorDestinationPb pb = new MonitorDestinationPb();
    pb.setEmailAddresses(emailAddresses);

    return pb;
  }

  static MonitorDestination fromPb(MonitorDestinationPb pb) {
    MonitorDestination model = new MonitorDestination();
    model.setEmailAddresses(pb.getEmailAddresses());

    return model;
  }

  public static class MonitorDestinationSerializer extends JsonSerializer<MonitorDestination> {
    @Override
    public void serialize(MonitorDestination value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MonitorDestinationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MonitorDestinationDeserializer extends JsonDeserializer<MonitorDestination> {
    @Override
    public MonitorDestination deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MonitorDestinationPb pb = mapper.readValue(p, MonitorDestinationPb.class);
      return MonitorDestination.fromPb(pb);
    }
  }
}
