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
@JsonSerialize(using = PersonalComputeMessage.PersonalComputeMessageSerializer.class)
@JsonDeserialize(using = PersonalComputeMessage.PersonalComputeMessageDeserializer.class)
public class PersonalComputeMessage {
  /**
   * ON: Grants all users in all workspaces access to the Personal Compute default policy, allowing
   * all users to create single-machine compute resources. DELEGATE: Moves access control for the
   * Personal Compute default policy to individual workspaces and requires a workspace’s users or
   * groups to be added to the ACLs of that workspace’s Personal Compute default policy before they
   * will be able to create compute resources through that policy.
   */
  private PersonalComputeMessageEnum value;

  public PersonalComputeMessage setValue(PersonalComputeMessageEnum value) {
    this.value = value;
    return this;
  }

  public PersonalComputeMessageEnum getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PersonalComputeMessage that = (PersonalComputeMessage) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return new ToStringer(PersonalComputeMessage.class).add("value", value).toString();
  }

  PersonalComputeMessagePb toPb() {
    PersonalComputeMessagePb pb = new PersonalComputeMessagePb();
    pb.setValue(value);

    return pb;
  }

  static PersonalComputeMessage fromPb(PersonalComputeMessagePb pb) {
    PersonalComputeMessage model = new PersonalComputeMessage();
    model.setValue(pb.getValue());

    return model;
  }

  public static class PersonalComputeMessageSerializer
      extends JsonSerializer<PersonalComputeMessage> {
    @Override
    public void serialize(
        PersonalComputeMessage value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PersonalComputeMessagePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PersonalComputeMessageDeserializer
      extends JsonDeserializer<PersonalComputeMessage> {
    @Override
    public PersonalComputeMessage deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PersonalComputeMessagePb pb = mapper.readValue(p, PersonalComputeMessagePb.class);
      return PersonalComputeMessage.fromPb(pb);
    }
  }
}
