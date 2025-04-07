// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Genie provides a no-code experience for business users, powered by AI/BI. Analysts set up spaces
 * that business users can use to ask questions using natural language. Genie uses data registered
 * to Unity Catalog and requires at least CAN USE permission on a Pro or Serverless SQL warehouse.
 * Also, Databricks Assistant must be enabled.
 */
@Generated
public class GenieAPI {
  private static final Logger LOG = LoggerFactory.getLogger(GenieAPI.class);

  private final GenieService impl;

  /** Regular-use constructor */
  public GenieAPI(ApiClient apiClient) {
    impl = new GenieImpl(apiClient);
  }

  /** Constructor for mocks */
  public GenieAPI(GenieService mock) {
    impl = mock;
  }

  public GenieMessage waitGetMessageGenieCompleted(
      String conversationId, String messageId, String spaceId) throws TimeoutException {
    return waitGetMessageGenieCompleted(
        conversationId, messageId, spaceId, Duration.ofMinutes(20), null);
  }

  public GenieMessage waitGetMessageGenieCompleted(
      String conversationId,
      String messageId,
      String spaceId,
      Duration timeout,
      Consumer<GenieMessage> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<MessageStatus> targetStates = Arrays.asList(MessageStatus.COMPLETED);
    java.util.List<MessageStatus> failureStates = Arrays.asList(MessageStatus.FAILED);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      GenieMessage poll =
          getMessage(
              new GenieGetConversationMessageRequest()
                  .setConversationId(conversationId)
                  .setMessageId(messageId)
                  .setSpaceId(spaceId));
      MessageStatus status = poll.getStatus();
      statusMessage = String.format("current status: %s", status);
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg = String.format("failed to reach COMPLETED, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix =
          String.format(
              "conversationId=%s, messageId=%s, spaceId=%s", conversationId, messageId, spaceId);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        throw new DatabricksException("Current thread was interrupted", e);
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  public Wait<GenieMessage, GenieMessage> createMessage(
      String spaceId, String conversationId, String content) {
    return createMessage(
        new GenieCreateConversationMessageRequest()
            .setSpaceId(spaceId)
            .setConversationId(conversationId)
            .setContent(content));
  }

  /**
   * Create conversation message.
   *
   * <p>Create new message in a [conversation](:method:genie/startconversation). The AI response
   * uses all previously created messages in the conversation to respond.
   */
  public Wait<GenieMessage, GenieMessage> createMessage(
      GenieCreateConversationMessageRequest request) {
    GenieMessage response = impl.createMessage(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetMessageGenieCompleted(
                request.getConversationId(),
                response.getId(),
                request.getSpaceId(),
                timeout,
                callback),
        response);
  }

  public GenieGetMessageQueryResultResponse executeMessageAttachmentQuery(
      String spaceId, String conversationId, String messageId, String attachmentId) {
    return executeMessageAttachmentQuery(
        new GenieExecuteMessageAttachmentQueryRequest()
            .setSpaceId(spaceId)
            .setConversationId(conversationId)
            .setMessageId(messageId)
            .setAttachmentId(attachmentId));
  }

  /**
   * Execute message attachment SQL query.
   *
   * <p>Execute the SQL for a message query attachment. Use this API when the query attachment has
   * expired and needs to be re-executed.
   */
  public GenieGetMessageQueryResultResponse executeMessageAttachmentQuery(
      GenieExecuteMessageAttachmentQueryRequest request) {
    return impl.executeMessageAttachmentQuery(request);
  }

  public GenieGetMessageQueryResultResponse executeMessageQuery(
      String spaceId, String conversationId, String messageId) {
    return executeMessageQuery(
        new GenieExecuteMessageQueryRequest()
            .setSpaceId(spaceId)
            .setConversationId(conversationId)
            .setMessageId(messageId));
  }

  /**
   * [Deprecated] Execute SQL query in a conversation message.
   *
   * <p>Execute the SQL query in the message.
   */
  public GenieGetMessageQueryResultResponse executeMessageQuery(
      GenieExecuteMessageQueryRequest request) {
    return impl.executeMessageQuery(request);
  }

  public GenieGenerateDownloadFullQueryResultResponse generateDownloadFullQueryResult(
      String spaceId, String conversationId, String messageId, String attachmentId) {
    return generateDownloadFullQueryResult(
        new GenieGenerateDownloadFullQueryResultRequest()
            .setSpaceId(spaceId)
            .setConversationId(conversationId)
            .setMessageId(messageId)
            .setAttachmentId(attachmentId));
  }

  /**
   * Generate full query result download.
   *
   * <p>Initiate full SQL query result download and obtain a transient ID for tracking the download
   * progress. This call initiates a new SQL execution to generate the query result.
   */
  public GenieGenerateDownloadFullQueryResultResponse generateDownloadFullQueryResult(
      GenieGenerateDownloadFullQueryResultRequest request) {
    return impl.generateDownloadFullQueryResult(request);
  }

  public GenieMessage getMessage(String spaceId, String conversationId, String messageId) {
    return getMessage(
        new GenieGetConversationMessageRequest()
            .setSpaceId(spaceId)
            .setConversationId(conversationId)
            .setMessageId(messageId));
  }

  /**
   * Get conversation message.
   *
   * <p>Get message from conversation.
   */
  public GenieMessage getMessage(GenieGetConversationMessageRequest request) {
    return impl.getMessage(request);
  }

  public GenieGetMessageQueryResultResponse getMessageAttachmentQueryResult(
      String spaceId, String conversationId, String messageId, String attachmentId) {
    return getMessageAttachmentQueryResult(
        new GenieGetMessageAttachmentQueryResultRequest()
            .setSpaceId(spaceId)
            .setConversationId(conversationId)
            .setMessageId(messageId)
            .setAttachmentId(attachmentId));
  }

  /**
   * Get message attachment SQL query result.
   *
   * <p>Get the result of SQL query if the message has a query attachment. This is only available if
   * a message has a query attachment and the message status is `EXECUTING_QUERY` OR `COMPLETED`.
   */
  public GenieGetMessageQueryResultResponse getMessageAttachmentQueryResult(
      GenieGetMessageAttachmentQueryResultRequest request) {
    return impl.getMessageAttachmentQueryResult(request);
  }

  public GenieGetMessageQueryResultResponse getMessageQueryResult(
      String spaceId, String conversationId, String messageId) {
    return getMessageQueryResult(
        new GenieGetMessageQueryResultRequest()
            .setSpaceId(spaceId)
            .setConversationId(conversationId)
            .setMessageId(messageId));
  }

  /**
   * [Deprecated] Get conversation message SQL query result.
   *
   * <p>Get the result of SQL query if the message has a query attachment. This is only available if
   * a message has a query attachment and the message status is `EXECUTING_QUERY`.
   */
  public GenieGetMessageQueryResultResponse getMessageQueryResult(
      GenieGetMessageQueryResultRequest request) {
    return impl.getMessageQueryResult(request);
  }

  public GenieGetMessageQueryResultResponse getMessageQueryResultByAttachment(
      String spaceId, String conversationId, String messageId, String attachmentId) {
    return getMessageQueryResultByAttachment(
        new GenieGetQueryResultByAttachmentRequest()
            .setSpaceId(spaceId)
            .setConversationId(conversationId)
            .setMessageId(messageId)
            .setAttachmentId(attachmentId));
  }

  /**
   * [Deprecated] Get conversation message SQL query result.
   *
   * <p>Get the result of SQL query if the message has a query attachment. This is only available if
   * a message has a query attachment and the message status is `EXECUTING_QUERY` OR `COMPLETED`.
   */
  public GenieGetMessageQueryResultResponse getMessageQueryResultByAttachment(
      GenieGetQueryResultByAttachmentRequest request) {
    return impl.getMessageQueryResultByAttachment(request);
  }

  public GenieSpace getSpace(String spaceId) {
    return getSpace(new GenieGetSpaceRequest().setSpaceId(spaceId));
  }

  /**
   * Get Genie Space.
   *
   * <p>Get details of a Genie Space.
   */
  public GenieSpace getSpace(GenieGetSpaceRequest request) {
    return impl.getSpace(request);
  }

  public Wait<GenieMessage, GenieStartConversationResponse> startConversation(
      String spaceId, String content) {
    return startConversation(
        new GenieStartConversationMessageRequest().setSpaceId(spaceId).setContent(content));
  }

  /**
   * Start conversation.
   *
   * <p>Start a new conversation.
   */
  public Wait<GenieMessage, GenieStartConversationResponse> startConversation(
      GenieStartConversationMessageRequest request) {
    GenieStartConversationResponse response = impl.startConversation(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetMessageGenieCompleted(
                response.getConversationId(),
                response.getMessageId(),
                request.getSpaceId(),
                timeout,
                callback),
        response);
  }

  public GenieService impl() {
    return impl;
  }
}
