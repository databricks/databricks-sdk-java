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
@JsonSerialize(using = CreateInstallationRequest.CreateInstallationRequestSerializer.class)
@JsonDeserialize(using = CreateInstallationRequest.CreateInstallationRequestDeserializer.class)
public class CreateInstallationRequest {
  /** */
  private ConsumerTerms acceptedConsumerTerms;

  /** */
  private String catalogName;

  /** */
  private String listingId;

  /** */
  private DeltaSharingRecipientType recipientType;

  /** for git repo installations */
  private RepoInstallation repoDetail;

  /** */
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

  CreateInstallationRequestPb toPb() {
    CreateInstallationRequestPb pb = new CreateInstallationRequestPb();
    pb.setAcceptedConsumerTerms(acceptedConsumerTerms);
    pb.setCatalogName(catalogName);
    pb.setListingId(listingId);
    pb.setRecipientType(recipientType);
    pb.setRepoDetail(repoDetail);
    pb.setShareName(shareName);

    return pb;
  }

  static CreateInstallationRequest fromPb(CreateInstallationRequestPb pb) {
    CreateInstallationRequest model = new CreateInstallationRequest();
    model.setAcceptedConsumerTerms(pb.getAcceptedConsumerTerms());
    model.setCatalogName(pb.getCatalogName());
    model.setListingId(pb.getListingId());
    model.setRecipientType(pb.getRecipientType());
    model.setRepoDetail(pb.getRepoDetail());
    model.setShareName(pb.getShareName());

    return model;
  }

  public static class CreateInstallationRequestSerializer
      extends JsonSerializer<CreateInstallationRequest> {
    @Override
    public void serialize(
        CreateInstallationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateInstallationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateInstallationRequestDeserializer
      extends JsonDeserializer<CreateInstallationRequest> {
    @Override
    public CreateInstallationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateInstallationRequestPb pb = mapper.readValue(p, CreateInstallationRequestPb.class);
      return CreateInstallationRequest.fromPb(pb);
    }
  }
}
