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

@Generated
@JsonSerialize(using = PersonalizationRequest.PersonalizationRequestSerializer.class)
@JsonDeserialize(using = PersonalizationRequest.PersonalizationRequestDeserializer.class)
public class PersonalizationRequest {
  /** */
  private String comment;

  /** */
  private RegionInfo consumerRegion;

  /** contact info for the consumer requesting data or performing a listing installation */
  private ContactInfo contactInfo;

  /** */
  private Long createdAt;

  /** */
  private String id;

  /** */
  private String intendedUse;

  /** */
  private Boolean isFromLighthouse;

  /** */
  private String listingId;

  /** */
  private String listingName;

  /** */
  private String metastoreId;

  /** */
  private String providerId;

  /** */
  private DeltaSharingRecipientType recipientType;

  /** */
  private ShareInfo share;

  /** */
  private PersonalizationRequestStatus status;

  /** */
  private String statusMessage;

  /** */
  private Long updatedAt;

  public PersonalizationRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public PersonalizationRequest setConsumerRegion(RegionInfo consumerRegion) {
    this.consumerRegion = consumerRegion;
    return this;
  }

  public RegionInfo getConsumerRegion() {
    return consumerRegion;
  }

  public PersonalizationRequest setContactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

  public ContactInfo getContactInfo() {
    return contactInfo;
  }

  public PersonalizationRequest setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public PersonalizationRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public PersonalizationRequest setIntendedUse(String intendedUse) {
    this.intendedUse = intendedUse;
    return this;
  }

  public String getIntendedUse() {
    return intendedUse;
  }

  public PersonalizationRequest setIsFromLighthouse(Boolean isFromLighthouse) {
    this.isFromLighthouse = isFromLighthouse;
    return this;
  }

  public Boolean getIsFromLighthouse() {
    return isFromLighthouse;
  }

  public PersonalizationRequest setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public PersonalizationRequest setListingName(String listingName) {
    this.listingName = listingName;
    return this;
  }

  public String getListingName() {
    return listingName;
  }

  public PersonalizationRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public PersonalizationRequest setProviderId(String providerId) {
    this.providerId = providerId;
    return this;
  }

  public String getProviderId() {
    return providerId;
  }

  public PersonalizationRequest setRecipientType(DeltaSharingRecipientType recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  public DeltaSharingRecipientType getRecipientType() {
    return recipientType;
  }

  public PersonalizationRequest setShare(ShareInfo share) {
    this.share = share;
    return this;
  }

  public ShareInfo getShare() {
    return share;
  }

  public PersonalizationRequest setStatus(PersonalizationRequestStatus status) {
    this.status = status;
    return this;
  }

  public PersonalizationRequestStatus getStatus() {
    return status;
  }

  public PersonalizationRequest setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  public PersonalizationRequest setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PersonalizationRequest that = (PersonalizationRequest) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(consumerRegion, that.consumerRegion)
        && Objects.equals(contactInfo, that.contactInfo)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(id, that.id)
        && Objects.equals(intendedUse, that.intendedUse)
        && Objects.equals(isFromLighthouse, that.isFromLighthouse)
        && Objects.equals(listingId, that.listingId)
        && Objects.equals(listingName, that.listingName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(providerId, that.providerId)
        && Objects.equals(recipientType, that.recipientType)
        && Objects.equals(share, that.share)
        && Objects.equals(status, that.status)
        && Objects.equals(statusMessage, that.statusMessage)
        && Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        consumerRegion,
        contactInfo,
        createdAt,
        id,
        intendedUse,
        isFromLighthouse,
        listingId,
        listingName,
        metastoreId,
        providerId,
        recipientType,
        share,
        status,
        statusMessage,
        updatedAt);
  }

  @Override
  public String toString() {
    return new ToStringer(PersonalizationRequest.class)
        .add("comment", comment)
        .add("consumerRegion", consumerRegion)
        .add("contactInfo", contactInfo)
        .add("createdAt", createdAt)
        .add("id", id)
        .add("intendedUse", intendedUse)
        .add("isFromLighthouse", isFromLighthouse)
        .add("listingId", listingId)
        .add("listingName", listingName)
        .add("metastoreId", metastoreId)
        .add("providerId", providerId)
        .add("recipientType", recipientType)
        .add("share", share)
        .add("status", status)
        .add("statusMessage", statusMessage)
        .add("updatedAt", updatedAt)
        .toString();
  }

  PersonalizationRequestPb toPb() {
    PersonalizationRequestPb pb = new PersonalizationRequestPb();
    pb.setComment(comment);
    pb.setConsumerRegion(consumerRegion);
    pb.setContactInfo(contactInfo);
    pb.setCreatedAt(createdAt);
    pb.setId(id);
    pb.setIntendedUse(intendedUse);
    pb.setIsFromLighthouse(isFromLighthouse);
    pb.setListingId(listingId);
    pb.setListingName(listingName);
    pb.setMetastoreId(metastoreId);
    pb.setProviderId(providerId);
    pb.setRecipientType(recipientType);
    pb.setShare(share);
    pb.setStatus(status);
    pb.setStatusMessage(statusMessage);
    pb.setUpdatedAt(updatedAt);

    return pb;
  }

  static PersonalizationRequest fromPb(PersonalizationRequestPb pb) {
    PersonalizationRequest model = new PersonalizationRequest();
    model.setComment(pb.getComment());
    model.setConsumerRegion(pb.getConsumerRegion());
    model.setContactInfo(pb.getContactInfo());
    model.setCreatedAt(pb.getCreatedAt());
    model.setId(pb.getId());
    model.setIntendedUse(pb.getIntendedUse());
    model.setIsFromLighthouse(pb.getIsFromLighthouse());
    model.setListingId(pb.getListingId());
    model.setListingName(pb.getListingName());
    model.setMetastoreId(pb.getMetastoreId());
    model.setProviderId(pb.getProviderId());
    model.setRecipientType(pb.getRecipientType());
    model.setShare(pb.getShare());
    model.setStatus(pb.getStatus());
    model.setStatusMessage(pb.getStatusMessage());
    model.setUpdatedAt(pb.getUpdatedAt());

    return model;
  }

  public static class PersonalizationRequestSerializer
      extends JsonSerializer<PersonalizationRequest> {
    @Override
    public void serialize(
        PersonalizationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PersonalizationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PersonalizationRequestDeserializer
      extends JsonDeserializer<PersonalizationRequest> {
    @Override
    public PersonalizationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PersonalizationRequestPb pb = mapper.readValue(p, PersonalizationRequestPb.class);
      return PersonalizationRequest.fromPb(pb);
    }
  }
}
