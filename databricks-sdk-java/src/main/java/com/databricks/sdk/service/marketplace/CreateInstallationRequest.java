// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateInstallationRequest {
  /** */
  @JsonProperty("accepted_consumer_terms")
  private ConsumerTerms acceptedConsumerTerms;

  /** */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** */
  private String listingId;

  /** */
  @JsonProperty("recipient_type")
  private DeltaSharingRecipientType recipientType;

  /** for git repo installations */
  @JsonProperty("repo_detail")
  private RepoInstallation repoDetail;

  /** */
  @JsonProperty("share_name")
  private String shareName;

  public CreateInstallationRequest setAcceptedConsumerTerms(ConsumerTerms acceptedConsumerTerms) {
    this.acceptedConsumerTerms = acceptedConsumerTerms;
    return this;
  }

  public ConsumerTerms getAcceptedConsumerTerms() {
    return acceptedConsumerTerms;
  }

  public CreateInstallationRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CreateInstallationRequest setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public CreateInstallationRequest setRecipientType(DeltaSharingRecipientType recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  public DeltaSharingRecipientType getRecipientType() {
    return recipientType;
  }

  public CreateInstallationRequest setRepoDetail(RepoInstallation repoDetail) {
    this.repoDetail = repoDetail;
    return this;
  }

  public RepoInstallation getRepoDetail() {
    return repoDetail;
  }

  public CreateInstallationRequest setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  public String getShareName() {
    return shareName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateInstallationRequest that = (CreateInstallationRequest) o;
    return Objects.equals(acceptedConsumerTerms, that.acceptedConsumerTerms)
        && Objects.equals(catalogName, that.catalogName)
        && Objects.equals(listingId, that.listingId)
        && Objects.equals(recipientType, that.recipientType)
        && Objects.equals(repoDetail, that.repoDetail)
        && Objects.equals(shareName, that.shareName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        acceptedConsumerTerms, catalogName, listingId, recipientType, repoDetail, shareName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateInstallationRequest.class)
        .add("acceptedConsumerTerms", acceptedConsumerTerms)
        .add("catalogName", catalogName)
        .add("listingId", listingId)
        .add("recipientType", recipientType)
        .add("repoDetail", repoDetail)
        .add("shareName", shareName)
        .toString();
  }
}
