// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Outlook specific options for ingestion */
@Generated
public class OutlookOptions {
  /** (Optional) Controls which attachments to ingest. If not specified, defaults to ALL. */
  @JsonProperty("attachment_mode")
  private OutlookAttachmentMode attachmentMode;

  /**
   * (Optional) Defines how the body_content column is populated. TEXT_HTML: Preserves full
   * formatting, links, and styling. TEXT_PLAIN: Converts body to plain text. Recommended for AI/RAG
   * pipelines to reduce token usage and noise.
   */
  @JsonProperty("body_format")
  private OutlookBodyFormat bodyFormat;

  /** Deprecated. Use include_folders instead. */
  @JsonProperty("folder_filter")
  private Collection<String> folderFilter;

  /**
   * (Optional) Filter mail folders to include in the sync. If not specified, all folders will be
   * synced. Examples: Inbox, Sent Items, Custom_Folder Filter semantics: OR between different
   * folders.
   */
  @JsonProperty("include_folders")
  private Collection<String> includeFolders;

  /**
   * (Optional) List of mailboxes to sync (e.g. mailbox email addresses or identifiers). If not
   * specified, all accessible mailboxes are ingested. Filter semantics: OR between different
   * mailboxes.
   */
  @JsonProperty("include_mailboxes")
  private Collection<String> includeMailboxes;

  /**
   * (Optional) Filter emails by sender address. Uses exact email match. Examples: user@vendor.com,
   * alerts@system.io, noreply@company.com If not specified, emails from all senders will be synced.
   * Filter semantics: OR between different senders.
   */
  @JsonProperty("include_senders")
  private Collection<String> includeSenders;

  /**
   * (Optional) Filter emails by subject line. Values ending with "*" use prefix match (subject
   * starts with the part before "*"); otherwise substring match (subject contains the value).
   * Examples: "Invoice" (substring), "Re:*" (prefix), "Support Ticket", "URGENT*" If not specified,
   * emails with all subjects will be synced. Filter semantics: OR between different subjects.
   */
  @JsonProperty("include_subjects")
  private Collection<String> includeSubjects;

  /** Deprecated. Use include_senders instead. */
  @JsonProperty("sender_filter")
  private Collection<String> senderFilter;

  /**
   * (Optional) Start date for the initial sync in YYYY-MM-DD format. Format: YYYY-MM-DD (e.g.,
   * 2024-01-01) This determines the earliest date from which to sync historical data. If not
   * specified, complete history is ingested.
   */
  @JsonProperty("start_date")
  private String startDate;

  /** Deprecated. Use include_subjects instead. */
  @JsonProperty("subject_filter")
  private Collection<String> subjectFilter;

  public OutlookOptions setAttachmentMode(OutlookAttachmentMode attachmentMode) {
    this.attachmentMode = attachmentMode;
    return this;
  }

  public OutlookAttachmentMode getAttachmentMode() {
    return attachmentMode;
  }

  public OutlookOptions setBodyFormat(OutlookBodyFormat bodyFormat) {
    this.bodyFormat = bodyFormat;
    return this;
  }

  public OutlookBodyFormat getBodyFormat() {
    return bodyFormat;
  }

  public OutlookOptions setFolderFilter(Collection<String> folderFilter) {
    this.folderFilter = folderFilter;
    return this;
  }

  public Collection<String> getFolderFilter() {
    return folderFilter;
  }

  public OutlookOptions setIncludeFolders(Collection<String> includeFolders) {
    this.includeFolders = includeFolders;
    return this;
  }

  public Collection<String> getIncludeFolders() {
    return includeFolders;
  }

  public OutlookOptions setIncludeMailboxes(Collection<String> includeMailboxes) {
    this.includeMailboxes = includeMailboxes;
    return this;
  }

  public Collection<String> getIncludeMailboxes() {
    return includeMailboxes;
  }

  public OutlookOptions setIncludeSenders(Collection<String> includeSenders) {
    this.includeSenders = includeSenders;
    return this;
  }

  public Collection<String> getIncludeSenders() {
    return includeSenders;
  }

  public OutlookOptions setIncludeSubjects(Collection<String> includeSubjects) {
    this.includeSubjects = includeSubjects;
    return this;
  }

  public Collection<String> getIncludeSubjects() {
    return includeSubjects;
  }

  public OutlookOptions setSenderFilter(Collection<String> senderFilter) {
    this.senderFilter = senderFilter;
    return this;
  }

  public Collection<String> getSenderFilter() {
    return senderFilter;
  }

  public OutlookOptions setStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public String getStartDate() {
    return startDate;
  }

  public OutlookOptions setSubjectFilter(Collection<String> subjectFilter) {
    this.subjectFilter = subjectFilter;
    return this;
  }

  public Collection<String> getSubjectFilter() {
    return subjectFilter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OutlookOptions that = (OutlookOptions) o;
    return Objects.equals(attachmentMode, that.attachmentMode)
        && Objects.equals(bodyFormat, that.bodyFormat)
        && Objects.equals(folderFilter, that.folderFilter)
        && Objects.equals(includeFolders, that.includeFolders)
        && Objects.equals(includeMailboxes, that.includeMailboxes)
        && Objects.equals(includeSenders, that.includeSenders)
        && Objects.equals(includeSubjects, that.includeSubjects)
        && Objects.equals(senderFilter, that.senderFilter)
        && Objects.equals(startDate, that.startDate)
        && Objects.equals(subjectFilter, that.subjectFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attachmentMode,
        bodyFormat,
        folderFilter,
        includeFolders,
        includeMailboxes,
        includeSenders,
        includeSubjects,
        senderFilter,
        startDate,
        subjectFilter);
  }

  @Override
  public String toString() {
    return new ToStringer(OutlookOptions.class)
        .add("attachmentMode", attachmentMode)
        .add("bodyFormat", bodyFormat)
        .add("folderFilter", folderFilter)
        .add("includeFolders", includeFolders)
        .add("includeMailboxes", includeMailboxes)
        .add("includeSenders", includeSenders)
        .add("includeSubjects", includeSubjects)
        .add("senderFilter", senderFilter)
        .add("startDate", startDate)
        .add("subjectFilter", subjectFilter)
        .toString();
  }
}
