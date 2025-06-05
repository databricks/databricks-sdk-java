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
@JsonSerialize(using = ListingFulfillment.ListingFulfillmentSerializer.class)
@JsonDeserialize(using = ListingFulfillment.ListingFulfillmentDeserializer.class)
public class ListingFulfillment {
  /** */
  private FulfillmentType fulfillmentType;

  /** */
  private String listingId;

  /** */
  private DeltaSharingRecipientType recipientType;

  /** */
  private RepoInfo repoInfo;

  /** */
  private ShareInfo shareInfo;

  public ListingFulfillment setFulfillmentType(FulfillmentType fulfillmentType) {
    this.fulfillmentType = fulfillmentType;
    return this;
  }

  public FulfillmentType getFulfillmentType() {
    return fulfillmentType;
  }

  public ListingFulfillment setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public ListingFulfillment setRecipientType(DeltaSharingRecipientType recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  public DeltaSharingRecipientType getRecipientType() {
    return recipientType;
  }

  public ListingFulfillment setRepoInfo(RepoInfo repoInfo) {
    this.repoInfo = repoInfo;
    return this;
  }

  public RepoInfo getRepoInfo() {
    return repoInfo;
  }

  public ListingFulfillment setShareInfo(ShareInfo shareInfo) {
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
    ListingFulfillment that = (ListingFulfillment) o;
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
    return new ToStringer(ListingFulfillment.class)
        .add("fulfillmentType", fulfillmentType)
        .add("listingId", listingId)
        .add("recipientType", recipientType)
        .add("repoInfo", repoInfo)
        .add("shareInfo", shareInfo)
        .toString();
  }

  ListingFulfillmentPb toPb() {
    ListingFulfillmentPb pb = new ListingFulfillmentPb();
    pb.setFulfillmentType(fulfillmentType);
    pb.setListingId(listingId);
    pb.setRecipientType(recipientType);
    pb.setRepoInfo(repoInfo);
    pb.setShareInfo(shareInfo);

    return pb;
  }

  static ListingFulfillment fromPb(ListingFulfillmentPb pb) {
    ListingFulfillment model = new ListingFulfillment();
    model.setFulfillmentType(pb.getFulfillmentType());
    model.setListingId(pb.getListingId());
    model.setRecipientType(pb.getRecipientType());
    model.setRepoInfo(pb.getRepoInfo());
    model.setShareInfo(pb.getShareInfo());

    return model;
  }

  public static class ListingFulfillmentSerializer extends JsonSerializer<ListingFulfillment> {
    @Override
    public void serialize(ListingFulfillment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListingFulfillmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListingFulfillmentDeserializer extends JsonDeserializer<ListingFulfillment> {
    @Override
    public ListingFulfillment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListingFulfillmentPb pb = mapper.readValue(p, ListingFulfillmentPb.class);
      return ListingFulfillment.fromPb(pb);
    }
  }
}
