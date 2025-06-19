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
@JsonSerialize(
    using = UpdatePersonalizationRequestRequest.UpdatePersonalizationRequestRequestSerializer.class)
@JsonDeserialize(
    using =
        UpdatePersonalizationRequestRequest.UpdatePersonalizationRequestRequestDeserializer.class)
public class UpdatePersonalizationRequestRequest {
  /** */
  private String listingId;

  /** */
  private String reason;

  /** */
  private String requestId;

  /** */
  private ShareInfo share;

  /** */
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

  UpdatePersonalizationRequestRequestPb toPb() {
    UpdatePersonalizationRequestRequestPb pb = new UpdatePersonalizationRequestRequestPb();
    pb.setListingId(listingId);
    pb.setReason(reason);
    pb.setRequestId(requestId);
    pb.setShare(share);
    pb.setStatus(status);

    return pb;
  }

  static UpdatePersonalizationRequestRequest fromPb(UpdatePersonalizationRequestRequestPb pb) {
    UpdatePersonalizationRequestRequest model = new UpdatePersonalizationRequestRequest();
    model.setListingId(pb.getListingId());
    model.setReason(pb.getReason());
    model.setRequestId(pb.getRequestId());
    model.setShare(pb.getShare());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class UpdatePersonalizationRequestRequestSerializer
      extends JsonSerializer<UpdatePersonalizationRequestRequest> {
    @Override
    public void serialize(
        UpdatePersonalizationRequestRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdatePersonalizationRequestRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdatePersonalizationRequestRequestDeserializer
      extends JsonDeserializer<UpdatePersonalizationRequestRequest> {
    @Override
    public UpdatePersonalizationRequestRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdatePersonalizationRequestRequestPb pb =
          mapper.readValue(p, UpdatePersonalizationRequestRequestPb.class);
      return UpdatePersonalizationRequestRequest.fromPb(pb);
    }
  }
}
