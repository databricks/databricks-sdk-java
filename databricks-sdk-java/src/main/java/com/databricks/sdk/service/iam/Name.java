// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
@JsonSerialize(using = Name.NameSerializer.class)
@JsonDeserialize(using = Name.NameDeserializer.class)
public class Name {
  /** Family name of the Databricks user. */
  private String familyName;

  /** Given name of the Databricks user. */
  private String givenName;

  public Name setFamilyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  public String getFamilyName() {
    return familyName;
  }

  public Name setGivenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  public String getGivenName() {
    return givenName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Name that = (Name) o;
    return Objects.equals(familyName, that.familyName) && Objects.equals(givenName, that.givenName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(familyName, givenName);
  }

  @Override
  public String toString() {
    return new ToStringer(Name.class)
        .add("familyName", familyName)
        .add("givenName", givenName)
        .toString();
  }

  NamePb toPb() {
    NamePb pb = new NamePb();
    pb.setFamilyName(familyName);
    pb.setGivenName(givenName);

    return pb;
  }

  static Name fromPb(NamePb pb) {
    Name model = new Name();
    model.setFamilyName(pb.getFamilyName());
    model.setGivenName(pb.getGivenName());

    return model;
  }

  public static class NameSerializer extends JsonSerializer<Name> {
    @Override
    public void serialize(Name value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NamePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NameDeserializer extends JsonDeserializer<Name> {
    @Override
    public Name deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NamePb pb = mapper.readValue(p, NamePb.class);
      return Name.fromPb(pb);
    }
  }
}
