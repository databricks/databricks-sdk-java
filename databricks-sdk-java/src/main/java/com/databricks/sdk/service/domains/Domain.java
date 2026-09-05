// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.domains;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Domain {
  /** Principal IDs of the business owners (users, groups, or service principals). */
  @JsonProperty("business_owner_ids")
  private Collection<Long> businessOwnerIds;

  /** Timestamp when the domain was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Full description (max 4096 chars) */
  @JsonProperty("description")
  private String description;

  /** Unique identifier for the domain. If omitted at Create, the server generates one. */
  @JsonProperty("domain_id")
  private String domainId;

  /**
   * Whether to mark the domain as a draft. If omitted on Create, the server applies a default; the
   * resolved value is returned in `effective_draft`.
   */
  @JsonProperty("draft")
  private Boolean draft;

  /** Resolved draft state of the domain. */
  @JsonProperty("effective_draft")
  private Boolean effectiveDraft;

  /** Icon to display for the domain. */
  @JsonProperty("icon")
  private DomainIcon icon;

  /**
   * Full resource name of the domain. The primary identifier for this resource. Format:
   * `domains/{domain_id}` Identifies the domain on get, update, and delete. Not an input on create
   * — to choose the id, set `CreateDomainRequest.domain_id`.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Domain ID of the parent. If absent, this is a top-level domain. If present, this domain is a
   * subdomain of the specified parent.
   */
  @JsonProperty("parent_domain_id")
  private String parentDomainId;

  /** Short description (max 280 chars) */
  @JsonProperty("subtitle")
  private String subtitle;

  /** Governed tag key associated with this domain. */
  @JsonProperty("tag_key")
  private String tagKey;

  /** Principal IDs of the technical owners (users, groups, or service principals). */
  @JsonProperty("technical_owner_ids")
  private Collection<Long> technicalOwnerIds;

  /** Timestamp when the domain was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Domain setBusinessOwnerIds(Collection<Long> businessOwnerIds) {
    this.businessOwnerIds = businessOwnerIds;
    return this;
  }

  public Collection<Long> getBusinessOwnerIds() {
    return businessOwnerIds;
  }

  public Domain setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Domain setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Domain setDomainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

  public String getDomainId() {
    return domainId;
  }

  public Domain setDraft(Boolean draft) {
    this.draft = draft;
    return this;
  }

  public Boolean getDraft() {
    return draft;
  }

  public Domain setEffectiveDraft(Boolean effectiveDraft) {
    this.effectiveDraft = effectiveDraft;
    return this;
  }

  public Boolean getEffectiveDraft() {
    return effectiveDraft;
  }

  public Domain setIcon(DomainIcon icon) {
    this.icon = icon;
    return this;
  }

  public DomainIcon getIcon() {
    return icon;
  }

  public Domain setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Domain setParentDomainId(String parentDomainId) {
    this.parentDomainId = parentDomainId;
    return this;
  }

  public String getParentDomainId() {
    return parentDomainId;
  }

  public Domain setSubtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  public String getSubtitle() {
    return subtitle;
  }

  public Domain setTagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  public String getTagKey() {
    return tagKey;
  }

  public Domain setTechnicalOwnerIds(Collection<Long> technicalOwnerIds) {
    this.technicalOwnerIds = technicalOwnerIds;
    return this;
  }

  public Collection<Long> getTechnicalOwnerIds() {
    return technicalOwnerIds;
  }

  public Domain setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Domain that = (Domain) o;
    return Objects.equals(businessOwnerIds, that.businessOwnerIds)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(description, that.description)
        && Objects.equals(domainId, that.domainId)
        && Objects.equals(draft, that.draft)
        && Objects.equals(effectiveDraft, that.effectiveDraft)
        && Objects.equals(icon, that.icon)
        && Objects.equals(name, that.name)
        && Objects.equals(parentDomainId, that.parentDomainId)
        && Objects.equals(subtitle, that.subtitle)
        && Objects.equals(tagKey, that.tagKey)
        && Objects.equals(technicalOwnerIds, that.technicalOwnerIds)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        businessOwnerIds,
        createTime,
        description,
        domainId,
        draft,
        effectiveDraft,
        icon,
        name,
        parentDomainId,
        subtitle,
        tagKey,
        technicalOwnerIds,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Domain.class)
        .add("businessOwnerIds", businessOwnerIds)
        .add("createTime", createTime)
        .add("description", description)
        .add("domainId", domainId)
        .add("draft", draft)
        .add("effectiveDraft", effectiveDraft)
        .add("icon", icon)
        .add("name", name)
        .add("parentDomainId", parentDomainId)
        .add("subtitle", subtitle)
        .add("tagKey", tagKey)
        .add("technicalOwnerIds", technicalOwnerIds)
        .add("updateTime", updateTime)
        .toString();
  }
}
