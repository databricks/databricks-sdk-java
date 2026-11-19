// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdatePersonalizationRequestRequest {
  /** ID of the listing that the request was made for. */
  @JsonIgnore private String listingId;

  /** Message for the consumer that explains the status change, at most 255 characters. */
  @JsonProperty("reason")
  private String reason;

  /** ID of the personalization request. */
  @JsonIgnore private String requestId;

  /**
   * Share to grant the consumer access to. Required when fulfilling a request for a listing with
   * data assets and not allowed with other statuses. Ignored for app and MCP server listings.
   */
  @JsonProperty("share")
  private ShareInfo share;

  /**
   * New status of the request. Allowed transitions: NEW or REQUEST_PENDING to REQUEST_PENDING,
   * FULFILLED or DENIED; FULFILLED to DENIED; DENIED to REQUEST_PENDING.
   */
  @JsonProperty("status")
  private PersonalizationRequestStatus status;

  public UpdatePersonalizationRequestRequest setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public UpdatePersonalizationRequestRequest setReason(String reason) {
    this.reason = reason;
    return this;
  }

  public String getReason() {
    return reason;
  }

  public UpdatePersonalizationRequestRequest setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  public UpdatePersonalizationRequestRequest setShare(ShareInfo share) {
    this.share = share;
    return this;
  }

  public ShareInfo getShare() {
    return share;
  }

  public UpdatePersonalizationRequestRequest setStatus(PersonalizationRequestStatus status) {
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
    UpdatePersonalizationRequestRequest that = (UpdatePersonalizationRequestRequest) o;
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
    return new ToStringer(UpdatePersonalizationRequestRequest.class)
        .add("listingId", listingId)
        .add("reason", reason)
        .add("requestId", requestId)
        .add("share", share)
        .add("status", status)
        .toString();
  }
}
