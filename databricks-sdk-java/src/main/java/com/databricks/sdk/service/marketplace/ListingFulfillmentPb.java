// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ListingFulfillmentPb {
  @JsonProperty("fulfillment_type")
  private FulfillmentType fulfillmentType;

  @JsonProperty("listing_id")
  private String listingId;

  @JsonProperty("recipient_type")
  private DeltaSharingRecipientType recipientType;

  @JsonProperty("repo_info")
  private RepoInfo repoInfo;

  @JsonProperty("share_info")
  private ShareInfo shareInfo;

  public ListingFulfillmentPb setFulfillmentType(FulfillmentType fulfillmentType) {
    this.fulfillmentType = fulfillmentType;
    return this;
  }

  public FulfillmentType getFulfillmentType() {
    return fulfillmentType;
  }

  public ListingFulfillmentPb setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public ListingFulfillmentPb setRecipientType(DeltaSharingRecipientType recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  public DeltaSharingRecipientType getRecipientType() {
    return recipientType;
  }

  public ListingFulfillmentPb setRepoInfo(RepoInfo repoInfo) {
    this.repoInfo = repoInfo;
    return this;
  }

  public RepoInfo getRepoInfo() {
    return repoInfo;
  }

  public ListingFulfillmentPb setShareInfo(ShareInfo shareInfo) {
    this.shareInfo = shareInfo;
    return this;
  }

  public ShareInfo getShareInfo() {
    return shareInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListingFulfillmentPb that = (ListingFulfillmentPb) o;
    return Objects.equals(fulfillmentType, that.fulfillmentType)
        && Objects.equals(listingId, that.listingId)
        && Objects.equals(recipientType, that.recipientType)
        && Objects.equals(repoInfo, that.repoInfo)
        && Objects.equals(shareInfo, that.shareInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentType, listingId, recipientType, repoInfo, shareInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(ListingFulfillmentPb.class)
        .add("fulfillmentType", fulfillmentType)
        .add("listingId", listingId)
        .add("recipientType", recipientType)
        .add("repoInfo", repoInfo)
        .add("shareInfo", shareInfo)
        .toString();
  }
}
