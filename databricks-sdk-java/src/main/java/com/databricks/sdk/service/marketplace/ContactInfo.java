// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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

/** contact info for the consumer requesting data or performing a listing installation */
@Generated
@JsonSerialize(using = ContactInfo.ContactInfoSerializer.class)
@JsonDeserialize(using = ContactInfo.ContactInfoDeserializer.class)
public class ContactInfo {
  /** */
  private String company;

  /** */
  private String email;

  /** */
  private String firstName;

  /** */
  private String lastName;

  public ContactInfo setCompany(String company) {
    this.company = company;
    return this;
  }

  public String getCompany() {
    return company;
  }

  public ContactInfo setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public ContactInfo setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public ContactInfo setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactInfo that = (ContactInfo) o;
    return Objects.equals(company, that.company)
        && Objects.equals(email, that.email)
        && Objects.equals(firstName, that.firstName)
        && Objects.equals(lastName, that.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, email, firstName, lastName);
  }

  @Override
  public String toString() {
    return new ToStringer(ContactInfo.class)
        .add("company", company)
        .add("email", email)
        .add("firstName", firstName)
        .add("lastName", lastName)
        .toString();
  }

  ContactInfoPb toPb() {
    ContactInfoPb pb = new ContactInfoPb();
    pb.setCompany(company);
    pb.setEmail(email);
    pb.setFirstName(firstName);
    pb.setLastName(lastName);

    return pb;
  }

  static ContactInfo fromPb(ContactInfoPb pb) {
    ContactInfo model = new ContactInfo();
    model.setCompany(pb.getCompany());
    model.setEmail(pb.getEmail());
    model.setFirstName(pb.getFirstName());
    model.setLastName(pb.getLastName());

    return model;
  }

  public static class ContactInfoSerializer extends JsonSerializer<ContactInfo> {
    @Override
    public void serialize(ContactInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ContactInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ContactInfoDeserializer extends JsonDeserializer<ContactInfo> {
    @Override
    public ContactInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ContactInfoPb pb = mapper.readValue(p, ContactInfoPb.class);
      return ContactInfo.fromPb(pb);
    }
  }
}
