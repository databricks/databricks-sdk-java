// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * KnowledgeSource represents a source of knowledge for the KnowledgeAssistant. Used in
 * create/update requests and returned in Get/List responses. Note: REQUIRED annotations below
 * represent create-time requirements. For updates, required fields are determined by the update
 * mask.
 */
@Generated
public class KnowledgeSource {
  /** Timestamp when this knowledge source was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * Description of the knowledge source. Required when creating a Knowledge Source. When updating a
   * Knowledge Source, optional unless included in update_mask.
   */
  @JsonProperty("description")
  private String description;

  /**
   * Human-readable display name of the knowledge source. Required when creating a Knowledge Source.
   * When updating a Knowledge Source, optional unless included in update_mask.
   */
  @JsonProperty("display_name")
  private String displayName;

  /** */
  @JsonProperty("file_table")
  private FileTableSpec fileTable;

  /** */
  @JsonProperty("files")
  private FilesSpec files;

  /** */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("index")
  private IndexSpec index;

  /**
   * Timestamp representing the cutoff before which content in this knowledge source is being
   * ingested.
   */
  @JsonProperty("knowledge_cutoff_time")
  private Timestamp knowledgeCutoffTime;

  /**
   * Full resource name:
   * knowledge-assistants/{knowledge_assistant_id}/knowledge-sources/{knowledge_source_id}
   */
  @JsonProperty("name")
  private String name;

  /**
   * The type of the source: "index", "files", or "file_table". Required when creating a Knowledge
   * Source. When updating a Knowledge Source, this field is ignored.
   */
  @JsonProperty("source_type")
  private String sourceType;

  /** */
  @JsonProperty("state")
  private KnowledgeSourceState state;

  public KnowledgeSource setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public KnowledgeSource setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public KnowledgeSource setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public KnowledgeSource setFileTable(FileTableSpec fileTable) {
    this.fileTable = fileTable;
    return this;
  }

  public FileTableSpec getFileTable() {
    return fileTable;
  }

  public KnowledgeSource setFiles(FilesSpec files) {
    this.files = files;
    return this;
  }

  public FilesSpec getFiles() {
    return files;
  }

  public KnowledgeSource setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public KnowledgeSource setIndex(IndexSpec index) {
    this.index = index;
    return this;
  }

  public IndexSpec getIndex() {
    return index;
  }

  public KnowledgeSource setKnowledgeCutoffTime(Timestamp knowledgeCutoffTime) {
    this.knowledgeCutoffTime = knowledgeCutoffTime;
    return this;
  }

  public Timestamp getKnowledgeCutoffTime() {
    return knowledgeCutoffTime;
  }

  public KnowledgeSource setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public KnowledgeSource setSourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  public String getSourceType() {
    return sourceType;
  }

  public KnowledgeSource setState(KnowledgeSourceState state) {
    this.state = state;
    return this;
  }

  public KnowledgeSourceState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KnowledgeSource that = (KnowledgeSource) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(description, that.description)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(fileTable, that.fileTable)
        && Objects.equals(files, that.files)
        && Objects.equals(id, that.id)
        && Objects.equals(index, that.index)
        && Objects.equals(knowledgeCutoffTime, that.knowledgeCutoffTime)
        && Objects.equals(name, that.name)
        && Objects.equals(sourceType, that.sourceType)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        description,
        displayName,
        fileTable,
        files,
        id,
        index,
        knowledgeCutoffTime,
        name,
        sourceType,
        state);
  }

  @Override
  public String toString() {
    return new ToStringer(KnowledgeSource.class)
        .add("createTime", createTime)
        .add("description", description)
        .add("displayName", displayName)
        .add("fileTable", fileTable)
        .add("files", files)
        .add("id", id)
        .add("index", index)
        .add("knowledgeCutoffTime", knowledgeCutoffTime)
        .add("name", name)
        .add("sourceType", sourceType)
        .add("state", state)
        .toString();
  }
}
