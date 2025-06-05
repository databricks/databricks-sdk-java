// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class InstallationDetailPb {
  @JsonProperty("catalog_name")
  private String catalogName;

  @JsonProperty("error_message")
  private String errorMessage;

  @JsonProperty("id")
  private String id;

  @JsonProperty("installed_on")
  private Long installedOn;

  @JsonProperty("listing_id")
  private String listingId;

  @JsonProperty("listing_name")
  private String listingName;

  @JsonProperty("recipient_type")
  private DeltaSharingRecipientType recipientType;

  @JsonProperty("repo_name")
  private String repoName;

  @JsonProperty("repo_path")
  private String repoPath;

  @JsonProperty("share_name")
  private String shareName;

  @JsonProperty("status")
  private InstallationStatus status;

  @JsonProperty("token_detail")
  private TokenDetail tokenDetail;

  @JsonProperty("tokens")
  private Collection<TokenInfo> tokens;

  public InstallationDetailPb setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public InstallationDetailPb setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public InstallationDetailPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public InstallationDetailPb setInstalledOn(Long installedOn) {
    this.installedOn = installedOn;
    return this;
  }

  public Long getInstalledOn() {
    return installedOn;
  }

  public InstallationDetailPb setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public InstallationDetailPb setListingName(String listingName) {
    this.listingName = listingName;
    return this;
  }

  public String getListingName() {
    return listingName;
  }

  public InstallationDetailPb setRecipientType(DeltaSharingRecipientType recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  public DeltaSharingRecipientType getRecipientType() {
    return recipientType;
  }

  public InstallationDetailPb setRepoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

  public String getRepoName() {
    return repoName;
  }

  public InstallationDetailPb setRepoPath(String repoPath) {
    this.repoPath = repoPath;
    return this;
  }

  public String getRepoPath() {
    return repoPath;
  }

  public InstallationDetailPb setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  public String getShareName() {
    return shareName;
  }

  public InstallationDetailPb setStatus(InstallationStatus status) {
    this.status = status;
    return this;
  }

  public InstallationStatus getStatus() {
    return status;
  }

  public InstallationDetailPb setTokenDetail(TokenDetail tokenDetail) {
    this.tokenDetail = tokenDetail;
    return this;
  }

  public TokenDetail getTokenDetail() {
    return tokenDetail;
  }

  public InstallationDetailPb setTokens(Collection<TokenInfo> tokens) {
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
    InstallationDetailPb that = (InstallationDetailPb) o;
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
    return new ToStringer(InstallationDetailPb.class)
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
}
