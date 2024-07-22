// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GenieMessage {
  /** AI produced response to the message */
  @JsonProperty("attachments")
  private Collection<GenieAttachment> attachments;

  /** User message content */
  @JsonProperty("content")
  private String content;

  /** Conversation ID */
  @JsonProperty("conversation_id")
  private String conversationId;

  /** Timestamp when the message was created */
  @JsonProperty("created_timestamp")
  private Long createdTimestamp;

  /** Error message if AI failed to respond to the message */
  @JsonProperty("error")
  private MessageError error;

  /** Message ID */
  @JsonProperty("id")
  private String id;

  /** Timestamp when the message was last updated */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** The result of SQL query if the message has a query attachment */
  @JsonProperty("query_result")
  private Result queryResult;

  /** Genie space ID */
  @JsonProperty("space_id")
  private String spaceId;

  /**
   * MesssageStatus. The possible values are: * `FETCHING_METADATA`: Fetching metadata from the data
   * sources. * `ASKING_AI`: Waiting for the LLM to respond to the users question. *
   * `EXECUTING_QUERY`: Executing AI provided SQL query. Get the SQL query result by calling
   * [getMessageQueryResult](:method:genie/getMessageQueryResult) API. * `FAILED`: Generating a
   * response or the executing the query failed. Please see `error` field. * `COMPLETED`: Message
   * processing is completed. Results are in the `attachments` field. Get the SQL query result by
   * calling [getMessageQueryResult](:method:genie/getMessageQueryResult) API. * `SUBMITTED`:
   * Message has been submitted. * `QUERY_RESULT_EXPIRED`: SQL result is not available anymore. The
   * user needs to execute the query again. * `CANCELLED`: Message has been cancelled.
   */
  @JsonProperty("status")
  private MessageStatus status;

  /** ID of the user who created the message */
  @JsonProperty("user_id")
  private Long userId;

  public GenieMessage setAttachments(Collection<GenieAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public Collection<GenieAttachment> getAttachments() {
    return attachments;
  }

  public GenieMessage setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public GenieMessage setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieMessage setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public GenieMessage setError(MessageError error) {
    this.error = error;
    return this;
  }

  public MessageError getError() {
    return error;
  }

  public GenieMessage setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GenieMessage setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public GenieMessage setQueryResult(Result queryResult) {
    this.queryResult = queryResult;
    return this;
  }

  public Result getQueryResult() {
    return queryResult;
  }

  public GenieMessage setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public GenieMessage setStatus(MessageStatus status) {
    this.status = status;
    return this;
  }

  public MessageStatus getStatus() {
    return status;
  }

  public GenieMessage setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieMessage that = (GenieMessage) o;
    return Objects.equals(attachments, that.attachments)
        && Objects.equals(content, that.content)
        && Objects.equals(conversationId, that.conversationId)
        && Objects.equals(createdTimestamp, that.createdTimestamp)
        && Objects.equals(error, that.error)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(queryResult, that.queryResult)
        && Objects.equals(spaceId, that.spaceId)
        && Objects.equals(status, that.status)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attachments,
        content,
        conversationId,
        createdTimestamp,
        error,
        id,
        lastUpdatedTimestamp,
        queryResult,
        spaceId,
        status,
        userId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieMessage.class)
        .add("attachments", attachments)
        .add("content", content)
        .add("conversationId", conversationId)
        .add("createdTimestamp", createdTimestamp)
        .add("error", error)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("queryResult", queryResult)
        .add("spaceId", spaceId)
        .add("status", status)
        .add("userId", userId)
        .toString();
  }
}
