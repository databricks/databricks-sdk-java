// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PersonalizationRequestPb {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("consumer_region")
  private RegionInfo consumerRegion;

  @JsonProperty("contact_info")
  private ContactInfo contactInfo;

  @JsonProperty("created_at")
  private Long createdAt;

  @JsonProperty("id")
  private String id;

  @JsonProperty("intended_use")
  private String intendedUse;

  @JsonProperty("is_from_lighthouse")
  private Boolean isFromLighthouse;

  @JsonProperty("listing_id")
  private String listingId;

  @JsonProperty("listing_name")
  private String listingName;

  @JsonProperty("metastore_id")
  private String metastoreId;

  @JsonProperty("provider_id")
  private String providerId;

  @JsonProperty("recipient_type")
  private DeltaSharingRecipientType recipientType;

  @JsonProperty("share")
  private ShareInfo share;

  @JsonProperty("status")
  private PersonalizationRequestStatus status;

  @JsonProperty("status_message")
  private String statusMessage;

  @JsonProperty("updated_at")
  private Long updatedAt;

  public PersonalizationRequestPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public PersonalizationRequestPb setConsumerRegion(RegionInfo consumerRegion) {
    this.consumerRegion = consumerRegion;
    return this;
  }

  public RegionInfo getConsumerRegion() {
    return consumerRegion;
  }

  public PersonalizationRequestPb setContactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

  public ContactInfo getContactInfo() {
    return contactInfo;
  }

  public PersonalizationRequestPb setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public PersonalizationRequestPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public PersonalizationRequestPb setIntendedUse(String intendedUse) {
    this.intendedUse = intendedUse;
    return this;
  }

  public String getIntendedUse() {
    return intendedUse;
  }

  public PersonalizationRequestPb setIsFromLighthouse(Boolean isFromLighthouse) {
    this.isFromLighthouse = isFromLighthouse;
    return this;
  }

  public Boolean getIsFromLighthouse() {
    return isFromLighthouse;
  }

  public PersonalizationRequestPb setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public PersonalizationRequestPb setListingName(String listingName) {
    this.listingName = listingName;
    return this;
  }

  public String getListingName() {
    return listingName;
  }

  public PersonalizationRequestPb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public PersonalizationRequestPb setProviderId(String providerId) {
    this.providerId = providerId;
    return this;
  }

  public String getProviderId() {
    return providerId;
  }

  public PersonalizationRequestPb setRecipientType(DeltaSharingRecipientType recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  public DeltaSharingRecipientType getRecipientType() {
    return recipientType;
  }

  public PersonalizationRequestPb setShare(ShareInfo share) {
    this.share = share;
    return this;
  }

  public ShareInfo getShare() {
    return share;
  }

  public PersonalizationRequestPb setStatus(PersonalizationRequestStatus status) {
    this.status = status;
    return this;
  }

  public PersonalizationRequestStatus getStatus() {
    return status;
  }

  public PersonalizationRequestPb setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  public PersonalizationRequestPb setUpdatedAt(Long updatedAt) {
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
    PersonalizationRequestPb that = (PersonalizationRequestPb) o;
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
    return new ToStringer(PersonalizationRequestPb.class)
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
}
