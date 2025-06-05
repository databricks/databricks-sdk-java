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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = InstallationDetail.InstallationDetailSerializer.class)
@JsonDeserialize(using = InstallationDetail.InstallationDetailDeserializer.class)
public class InstallationDetail {
  /** */
  private String catalogName;

  /** */
  private String errorMessage;

  /** */
  private String id;

  /** */
  private Long installedOn;

  /** */
  private String listingId;

  /** */
  private String listingName;

  /** */
  private DeltaSharingRecipientType recipientType;

  /** */
  private String repoName;

  /** */
  private String repoPath;

  /** */
  private String shareName;

  /** */
  private InstallationStatus status;

  /** */
  private TokenDetail tokenDetail;

  /** */
  private Collection<TokenInfo> tokens;

  public InstallationDetail setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public InstallationDetail setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public InstallationDetail setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public InstallationDetail setInstalledOn(Long installedOn) {
    this.installedOn = installedOn;
    return this;
  }

  public Long getInstalledOn() {
    return installedOn;
  }

  public InstallationDetail setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public InstallationDetail setListingName(String listingName) {
    this.listingName = listingName;
    return this;
  }

  public String getListingName() {
    return listingName;
  }

  public InstallationDetail setRecipientType(DeltaSharingRecipientType recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  public DeltaSharingRecipientType getRecipientType() {
    return recipientType;
  }

  public InstallationDetail setRepoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

  public String getRepoName() {
    return repoName;
  }

  public InstallationDetail setRepoPath(String repoPath) {
    this.repoPath = repoPath;
    return this;
  }

  public String getRepoPath() {
    return repoPath;
  }

  public InstallationDetail setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  public String getShareName() {
    return shareName;
  }

  public InstallationDetail setStatus(InstallationStatus status) {
    this.status = status;
    return this;
  }

  public InstallationStatus getStatus() {
    return status;
  }

  public InstallationDetail setTokenDetail(TokenDetail tokenDetail) {
    this.tokenDetail = tokenDetail;
    return this;
  }

  public TokenDetail getTokenDetail() {
    return tokenDetail;
  }

  public InstallationDetail setTokens(Collection<TokenInfo> tokens) {
    this.tokens = tokens;
    return this;
  }

  public Collection<TokenInfo> getTokens() {
    return tokens;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstallationDetail that = (InstallationDetail) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(id, that.id)
        && Objects.equals(installedOn, that.installedOn)
        && Objects.equals(listingId, that.listingId)
        && Objects.equals(listingName, that.listingName)
        && Objects.equals(recipientType, that.recipientType)
        && Objects.equals(repoName, that.repoName)
        && Objects.equals(repoPath, that.repoPath)
        && Objects.equals(shareName, that.shareName)
        && Objects.equals(status, that.status)
        && Objects.equals(tokenDetail, that.tokenDetail)
        && Objects.equals(tokens, that.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catalogName,
        errorMessage,
        id,
        installedOn,
        listingId,
        listingName,
        recipientType,
        repoName,
        repoPath,
        shareName,
        status,
        tokenDetail,
        tokens);
  }

  @Override
  public String toString() {
    return new ToStringer(InstallationDetail.class)
        .add("catalogName", catalogName)
        .add("errorMessage", errorMessage)
        .add("id", id)
        .add("installedOn", installedOn)
        .add("listingId", listingId)
        .add("listingName", listingName)
        .add("recipientType", recipientType)
        .add("repoName", repoName)
        .add("repoPath", repoPath)
        .add("shareName", shareName)
        .add("status", status)
        .add("tokenDetail", tokenDetail)
        .add("tokens", tokens)
        .toString();
  }

  InstallationDetailPb toPb() {
    InstallationDetailPb pb = new InstallationDetailPb();
    pb.setCatalogName(catalogName);
    pb.setErrorMessage(errorMessage);
    pb.setId(id);
    pb.setInstalledOn(installedOn);
    pb.setListingId(listingId);
    pb.setListingName(listingName);
    pb.setRecipientType(recipientType);
    pb.setRepoName(repoName);
    pb.setRepoPath(repoPath);
    pb.setShareName(shareName);
    pb.setStatus(status);
    pb.setTokenDetail(tokenDetail);
    pb.setTokens(tokens);

    return pb;
  }

  static InstallationDetail fromPb(InstallationDetailPb pb) {
    InstallationDetail model = new InstallationDetail();
    model.setCatalogName(pb.getCatalogName());
    model.setErrorMessage(pb.getErrorMessage());
    model.setId(pb.getId());
    model.setInstalledOn(pb.getInstalledOn());
    model.setListingId(pb.getListingId());
    model.setListingName(pb.getListingName());
    model.setRecipientType(pb.getRecipientType());
    model.setRepoName(pb.getRepoName());
    model.setRepoPath(pb.getRepoPath());
    model.setShareName(pb.getShareName());
    model.setStatus(pb.getStatus());
    model.setTokenDetail(pb.getTokenDetail());
    model.setTokens(pb.getTokens());

    return model;
  }

  public static class InstallationDetailSerializer extends JsonSerializer<InstallationDetail> {
    @Override
    public void serialize(InstallationDetail value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstallationDetailPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstallationDetailDeserializer extends JsonDeserializer<InstallationDetail> {
    @Override
    public InstallationDetail deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstallationDetailPb pb = mapper.readValue(p, InstallationDetailPb.class);
      return InstallationDetail.fromPb(pb);
    }
  }
}
