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

  /**
   * Create new message in a [conversation](:method:genie/startconversation). The AI response uses
   * all previously created messages in the conversation to respond.
   */
  public Wait<GenieMessage, GenieMessage> createMessage(
      GenieCreateConversationMessageRequest request) {
    GenieMessage response = impl.createMessage(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetMessageGenieCompleted(
                request.getConversationId(),
                response.getMessageId(),
                request.getSpaceId(),
                timeout,
                callback),
        response);
  }

  /** Creates a Genie space from a serialized payload. */
  public GenieSpace createSpace(GenieCreateSpaceRequest request) {
    return impl.createSpace(request);
  }

  public void deleteConversation(String spaceId, String conversationId) {
    deleteConversation(
        new GenieDeleteConversationRequest().setSpaceId(spaceId).setConversationId(conversationId));
  }

  /** Delete a conversation. */
  public void deleteConversation(GenieDeleteConversationRequest request) {
    impl.deleteConversation(request);
  }

  public void deleteConversationMessage(String spaceId, String conversationId, String messageId) {
    deleteConversationMessage(
        new GenieDeleteConversationMessageRequest()
            .setSpaceId(spaceId)
            .setConversationId(conversationId)
            .setMessageId(messageId));
  }

  /** Delete a conversation message. */
  public void deleteConversationMessage(GenieDeleteConversationMessageRequest request) {
    impl.deleteConversationMessage(request);
  }

  /**
   * Execute the SQL for a message query attachment. Use this API when the query attachment has
   * expired and needs to be re-executed.
   */
  public GenieGetMessageQueryResultResponse executeMessageAttachmentQuery(
      GenieExecuteMessageAttachmentQueryRequest request) {
    return impl.executeMessageAttachmentQuery(request);
  }

  /**
   * DEPRECATED: Use [Execute Message Attachment Query](:method:genie/executemessageattachmentquery)
   * instead.
   */
  public GenieGetMessageQueryResultResponse executeMessageQuery(
      GenieExecuteMessageQueryRequest request) {
    return impl.executeMessageQuery(request);
  }

  /**
   * Initiates a new SQL execution and returns a `download_id` and `download_id_signature` that you
   * can use to track the progress of the download. The query result is stored in an external link
   * and can be retrieved using the [Get Download Full Query
   * Result](:method:genie/getdownloadfullqueryresult) API. Both `download_id` and
   * `download_id_signature` must be provided when calling the Get endpoint.
   *
   * <p>----
   *
   * <p>### **Warning: Databricks strongly recommends that you protect the URLs that are returned by
   * the `EXTERNAL_LINKS` disposition.**
   *
   * <p>When you use the `EXTERNAL_LINKS` disposition, a short-lived, URL is generated, which can be
   * used to download the results directly from . As a short-lived is embedded in this URL, you
   * should protect the URL.
   *
   * <p>Because URLs are already generated with embedded temporary s, you must not set an
   * `Authorization` header in the download requests.
   *
   * <p>See [Execute Statement](:method:statementexecution/executestatement) for more details.
   *
   * <p>----
   */
  public GenieGenerateDownloadFullQueryResultResponse generateDownloadFullQueryResult(
      GenieGenerateDownloadFullQueryResultRequest request) {
    return impl.generateDownloadFullQueryResult(request);
  }

  public GenieGetDownloadFullQueryResultResponse getDownloadFullQueryResult(
      String spaceId,
      String conversationId,
      String messageId,
      String attachmentId,
      String downloadId) {
    return getDownloadFullQueryResult(
        new GenieGetDownloadFullQueryResultRequest()
            .setSpaceId(spaceId)
            .setConversationId(conversationId)
            .setMessageId(messageId)
            .setAttachmentId(attachmentId)
            .setDownloadId(downloadId));
  }

  /**
   * After [Generating a Full Query Result Download](:method:genie/generatedownloadfullqueryresult)
   * and successfully receiving a `download_id` and `download_id_signature`, use this API to poll
   * the download progress. Both `download_id` and `download_id_signature` are required to call this
   * endpoint. When the download is complete, the API returns the result in the `EXTERNAL_LINKS`
   * disposition, containing one or more external links to the query result files.
   *
   * <p>----
   *
   * <p>### **Warning: Databricks strongly recommends that you protect the URLs that are returned by
   * the `EXTERNAL_LINKS` disposition.**
   *
   * <p>When you use the `EXTERNAL_LINKS` disposition, a short-lived, URL is generated, which can be
   * used to download the results directly from . As a short-lived is embedded in this URL, you
   * should protect the URL.
   *
   * <p>Because URLs are already generated with embedded temporary s, you must not set an
   * `Authorization` header in the download requests.
   *
   * <p>See [Execute Statement](:method:statementexecution/executestatement) for more details.
   *
   * <p>----
   */
  public GenieGetDownloadFullQueryResultResponse getDownloadFullQueryResult(
      GenieGetDownloadFullQueryResultRequest request) {
    return impl.getDownloadFullQueryResult(request);
  }

  public GenieMessage getMessage(String spaceId, String conversationId, String messageId) {
    return getMessage(
        new GenieGetConversationMessageRequest()
            .setSpaceId(spaceId)
            .setConversationId(conversationId)
            .setMessageId(messageId));
  }

  /** Get message from conversation. */
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
   * Get the result of SQL query if the message has a query attachment. This is only available if a
   * message has a query attachment and the message status is `EXECUTING_QUERY` OR `COMPLETED`.
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
   * DEPRECATED: Use [Get Message Attachment Query
   * Result](:method:genie/getmessageattachmentqueryresult) instead.
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
   * DEPRECATED: Use [Get Message Attachment Query
   * Result](:method:genie/getmessageattachmentqueryresult) instead.
   */
  public GenieGetMessageQueryResultResponse getMessageQueryResultByAttachment(
      GenieGetQueryResultByAttachmentRequest request) {
    return impl.getMessageQueryResultByAttachment(request);
  }

  public GenieSpace getSpace(String spaceId) {
    return getSpace(new GenieGetSpaceRequest().setSpaceId(spaceId));
  }

  /** Get details of a Genie Space. */
  public GenieSpace getSpace(GenieGetSpaceRequest request) {
    return impl.getSpace(request);
  }

  public GenieListConversationMessagesResponse listConversationMessages(
      String spaceId, String conversationId) {
    return listConversationMessages(
        new GenieListConversationMessagesRequest()
            .setSpaceId(spaceId)
            .setConversationId(conversationId));
  }

  /** List messages in a conversation */
  public GenieListConversationMessagesResponse listConversationMessages(
      GenieListConversationMessagesRequest request) {
    return impl.listConversationMessages(request);
  }

  public GenieListConversationsResponse listConversations(String spaceId) {
    return listConversations(new GenieListConversationsRequest().setSpaceId(spaceId));
  }

  /** Get a list of conversations in a Genie Space. */
  public GenieListConversationsResponse listConversations(GenieListConversationsRequest request) {
    return impl.listConversations(request);
  }

  /** Get list of Genie Spaces. */
  public GenieListSpacesResponse listSpaces(GenieListSpacesRequest request) {
    return impl.listSpaces(request);
  }

  /** Send feedback for a message. */
  public void sendMessageFeedback(GenieSendMessageFeedbackRequest request) {
    impl.sendMessageFeedback(request);
  }

  /** Start a new conversation. */
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

  public void trashSpace(String spaceId) {
    trashSpace(new GenieTrashSpaceRequest().setSpaceId(spaceId));
  }

  /** Move a Genie Space to the trash. */
  public void trashSpace(GenieTrashSpaceRequest request) {
    impl.trashSpace(request);
  }

  /** Updates a Genie space with a serialized payload. */
  public GenieSpace updateSpace(GenieUpdateSpaceRequest request) {
    return impl.updateSpace(request);
  }

  public GenieService impl() {
    return impl;
  }
}
