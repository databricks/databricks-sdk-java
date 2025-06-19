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

/** Data request messages also creates a lead (maybe) */
@Generated
@JsonSerialize(using = CreatePersonalizationRequest.CreatePersonalizationRequestSerializer.class)
@JsonDeserialize(
    using = CreatePersonalizationRequest.CreatePersonalizationRequestDeserializer.class)
public class CreatePersonalizationRequest {
  /** */
  private ConsumerTerms acceptedConsumerTerms;

  /** */
  private String comment;

  /** */
  private String company;

  /** */
  private String firstName;

  /** */
  private String intendedUse;

  /** */
  private Boolean isFromLighthouse;

  /** */
  private String lastName;

  /** */
  private String listingId;

  /** */
  private DeltaSharingRecipientType recipientType;

  public CreatePersonalizationRequest setAcceptedConsumerTerms(
      ConsumerTerms acceptedConsumerTerms) {
    this.acceptedConsumerTerms = acceptedConsumerTerms;
    return this;
  }

  public ConsumerTerms getAcceptedConsumerTerms() {
    return acceptedConsumerTerms;
  }

  public CreatePersonalizationRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreatePersonalizationRequest setCompany(String company) {
    this.company = company;
    return this;
  }

  public String getCompany() {
    return company;
  }

  public CreatePersonalizationRequest setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public CreatePersonalizationRequest setIntendedUse(String intendedUse) {
    this.intendedUse = intendedUse;
    return this;
  }

  public String getIntendedUse() {
    return intendedUse;
  }

  public CreatePersonalizationRequest setIsFromLighthouse(Boolean isFromLighthouse) {
    this.isFromLighthouse = isFromLighthouse;
    return this;
  }

  public Boolean getIsFromLighthouse() {
    return isFromLighthouse;
  }

  public CreatePersonalizationRequest setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public CreatePersonalizationRequest setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public CreatePersonalizationRequest setRecipientType(DeltaSharingRecipientType recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  public DeltaSharingRecipientType getRecipientType() {
    return recipientType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreatePersonalizationRequest that = (CreatePersonalizationRequest) o;
    return Objects.equals(acceptedConsumerTerms, that.acceptedConsumerTerms)
        && Objects.equals(comment, that.comment)
        && Objects.equals(company, that.company)
        && Objects.equals(firstName, that.firstName)
        && Objects.equals(intendedUse, that.intendedUse)
        && Objects.equals(isFromLighthouse, that.isFromLighthouse)
        && Objects.equals(lastName, that.lastName)
        && Objects.equals(listingId, that.listingId)
        && Objects.equals(recipientType, that.recipientType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        acceptedConsumerTerms,
        comment,
        company,
        firstName,
        intendedUse,
        isFromLighthouse,
        lastName,
        listingId,
        recipientType);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePersonalizationRequest.class)
        .add("acceptedConsumerTerms", acceptedConsumerTerms)
        .add("comment", comment)
        .add("company", company)
        .add("firstName", firstName)
        .add("intendedUse", intendedUse)
        .add("isFromLighthouse", isFromLighthouse)
        .add("lastName", lastName)
        .add("listingId", listingId)
        .add("recipientType", recipientType)
        .toString();
  }

  CreatePersonalizationRequestPb toPb() {
    CreatePersonalizationRequestPb pb = new CreatePersonalizationRequestPb();
    pb.setAcceptedConsumerTerms(acceptedConsumerTerms);
    pb.setComment(comment);
    pb.setCompany(company);
    pb.setFirstName(firstName);
    pb.setIntendedUse(intendedUse);
    pb.setIsFromLighthouse(isFromLighthouse);
    pb.setLastName(lastName);
    pb.setListingId(listingId);
    pb.setRecipientType(recipientType);

    return pb;
  }

  static CreatePersonalizationRequest fromPb(CreatePersonalizationRequestPb pb) {
    CreatePersonalizationRequest model = new CreatePersonalizationRequest();
    model.setAcceptedConsumerTerms(pb.getAcceptedConsumerTerms());
    model.setComment(pb.getComment());
    model.setCompany(pb.getCompany());
    model.setFirstName(pb.getFirstName());
    model.setIntendedUse(pb.getIntendedUse());
    model.setIsFromLighthouse(pb.getIsFromLighthouse());
    model.setLastName(pb.getLastName());
    model.setListingId(pb.getListingId());
    model.setRecipientType(pb.getRecipientType());

    return model;
  }

  public static class CreatePersonalizationRequestSerializer
      extends JsonSerializer<CreatePersonalizationRequest> {
    @Override
    public void serialize(
        CreatePersonalizationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreatePersonalizationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreatePersonalizationRequestDeserializer
      extends JsonDeserializer<CreatePersonalizationRequest> {
    @Override
    public CreatePersonalizationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreatePersonalizationRequestPb pb = mapper.readValue(p, CreatePersonalizationRequestPb.class);
      return CreatePersonalizationRequest.fromPb(pb);
    }
  }
}
