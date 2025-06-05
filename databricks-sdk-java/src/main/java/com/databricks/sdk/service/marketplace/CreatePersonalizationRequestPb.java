// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Data request messages also creates a lead (maybe) */
@Generated
class CreatePersonalizationRequestPb {
  @JsonProperty("accepted_consumer_terms")
  private ConsumerTerms acceptedConsumerTerms;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("company")
  private String company;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("intended_use")
  private String intendedUse;

  @JsonProperty("is_from_lighthouse")
  private Boolean isFromLighthouse;

  @JsonProperty("last_name")
  private String lastName;

  @JsonIgnore private String listingId;

  @JsonProperty("recipient_type")
  private DeltaSharingRecipientType recipientType;

  public CreatePersonalizationRequestPb setAcceptedConsumerTerms(
      ConsumerTerms acceptedConsumerTerms) {
    this.acceptedConsumerTerms = acceptedConsumerTerms;
    return this;
  }

  public ConsumerTerms getAcceptedConsumerTerms() {
    return acceptedConsumerTerms;
  }

  public CreatePersonalizationRequestPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreatePersonalizationRequestPb setCompany(String company) {
    this.company = company;
    return this;
  }

  public String getCompany() {
    return company;
  }

  public CreatePersonalizationRequestPb setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public CreatePersonalizationRequestPb setIntendedUse(String intendedUse) {
    this.intendedUse = intendedUse;
    return this;
  }

  public String getIntendedUse() {
    return intendedUse;
  }

  public CreatePersonalizationRequestPb setIsFromLighthouse(Boolean isFromLighthouse) {
    this.isFromLighthouse = isFromLighthouse;
    return this;
  }

  public Boolean getIsFromLighthouse() {
    return isFromLighthouse;
  }

  public CreatePersonalizationRequestPb setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public CreatePersonalizationRequestPb setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public CreatePersonalizationRequestPb setRecipientType(DeltaSharingRecipientType recipientType) {
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
    CreatePersonalizationRequestPb that = (CreatePersonalizationRequestPb) o;
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
    return new ToStringer(CreatePersonalizationRequestPb.class)
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
}
