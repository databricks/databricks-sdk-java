// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdatePersonalizationRequestRequestPb {
  @JsonIgnore private String listingId;

  @JsonProperty("reason")
  private String reason;

  @JsonIgnore private String requestId;

  @JsonProperty("share")
  private ShareInfo share;

  @JsonProperty("status")
  private PersonalizationRequestStatus status;

  public UpdatePersonalizationRequestRequestPb setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public UpdatePersonalizationRequestRequestPb setReason(String reason) {
    this.reason = reason;
    return this;
  }

  public String getReason() {
    return reason;
  }

  public UpdatePersonalizationRequestRequestPb setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  public UpdatePersonalizationRequestRequestPb setShare(ShareInfo share) {
    this.share = share;
    return this;
  }

  public ShareInfo getShare() {
    return share;
  }

  public UpdatePersonalizationRequestRequestPb setStatus(PersonalizationRequestStatus status) {
    this.status = status;
    return this;
  }

  public PersonalizationRequestStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdatePersonalizationRequestRequestPb that = (UpdatePersonalizationRequestRequestPb) o;
    return Objects.equals(listingId, that.listingId)
        && Objects.equals(reason, that.reason)
        && Objects.equals(requestId, that.requestId)
        && Objects.equals(share, that.share)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingId, reason, requestId, share, status);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePersonalizationRequestRequestPb.class)
        .add("listingId", listingId)
        .add("reason", reason)
        .add("requestId", requestId)
        .add("share", share)
        .add("status", status)
        .toString();
  }
}
