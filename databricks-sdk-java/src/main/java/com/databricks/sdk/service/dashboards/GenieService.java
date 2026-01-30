// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;

/**
 * Genie provides a no-code experience for business users, powered by AI/BI. Analysts set up spaces
 * that business users can use to ask questions using natural language. Genie uses data registered
 * to Unity Catalog and requires at least CAN USE permission on a Pro or Serverless SQL warehouse.
 * Also, Databricks Assistant must be enabled.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface GenieService {
  /**
   * Create new message in a [conversation](:method:genie/startconversation). The AI response uses
   * all previously created messages in the conversation to respond.
   */
  GenieMessage createMessage(
      GenieCreateConversationMessageRequest genieCreateConversationMessageRequest);

  /** Creates a Genie space from a serialized payload. */
  GenieSpace createSpace(GenieCreateSpaceRequest genieCreateSpaceRequest);

  /** Delete a conversation. */
  void deleteConversation(GenieDeleteConversationRequest genieDeleteConversationRequest);

  /** Delete a conversation message. */
  void deleteConversationMessage(
      GenieDeleteConversationMessageRequest genieDeleteConversationMessageRequest);

  /**
   * Execute the SQL for a message query attachment. Use this API when the query attachment has
   * expired and needs to be re-executed.
   */
  GenieGetMessageQueryResultResponse executeMessageAttachmentQuery(
      GenieExecuteMessageAttachmentQueryRequest genieExecuteMessageAttachmentQueryRequest);

  /**
   * DEPRECATED: Use [Execute Message Attachment Query](:method:genie/executemessageattachmentquery)
   * instead.
   */
  GenieGetMessageQueryResultResponse executeMessageQuery(
      GenieExecuteMessageQueryRequest genieExecuteMessageQueryRequest);

  /**
   * Initiates a new SQL execution and returns a `download_id` that you can use to track the
   * progress of the download. The query result is stored in an external link and can be retrieved
   * using the [Get Download Full Query Result](:method:genie/getdownloadfullqueryresult) API.
   * Warning: Databricks strongly recommends that you protect the URLs that are returned by the
   * `EXTERNAL_LINKS` disposition. See [Execute
   * Statement](:method:statementexecution/executestatement) for more details.
   */
  GenieGenerateDownloadFullQueryResultResponse generateDownloadFullQueryResult(
      GenieGenerateDownloadFullQueryResultRequest genieGenerateDownloadFullQueryResultRequest);

  /**
   * After [Generating a Full Query Result Download](:method:genie/getdownloadfullqueryresult) and
   * successfully receiving a `download_id`, use this API to poll the download progress. When the
   * download is complete, the API returns one or more external links to the query result files.
   * Warning: Databricks strongly recommends that you protect the URLs that are returned by the
   * `EXTERNAL_LINKS` disposition. You must not set an Authorization header in download requests.
   * When using the `EXTERNAL_LINKS` disposition, Databricks returns presigned URLs that grant
   * temporary access to data. See [Execute Statement](:method:statementexecution/executestatement)
   * for more details.
   */
  GenieGetDownloadFullQueryResultResponse getDownloadFullQueryResult(
      GenieGetDownloadFullQueryResultRequest genieGetDownloadFullQueryResultRequest);

  /** Get message from conversation. */
  GenieMessage getMessage(GenieGetConversationMessageRequest genieGetConversationMessageRequest);

  /**
   * Get the result of SQL query if the message has a query attachment. This is only available if a
   * message has a query attachment and the message status is `EXECUTING_QUERY` OR `COMPLETED`.
   */
  GenieGetMessageQueryResultResponse getMessageAttachmentQueryResult(
      GenieGetMessageAttachmentQueryResultRequest genieGetMessageAttachmentQueryResultRequest);

  /**
   * DEPRECATED: Use [Get Message Attachment Query
   * Result](:method:genie/getmessageattachmentqueryresult) instead.
   */
  GenieGetMessageQueryResultResponse getMessageQueryResult(
      GenieGetMessageQueryResultRequest genieGetMessageQueryResultRequest);

  /**
   * DEPRECATED: Use [Get Message Attachment Query
   * Result](:method:genie/getmessageattachmentqueryresult) instead.
   */
  GenieGetMessageQueryResultResponse getMessageQueryResultByAttachment(
      GenieGetQueryResultByAttachmentRequest genieGetQueryResultByAttachmentRequest);

  /** Get details of a Genie Space. */
  GenieSpace getSpace(GenieGetSpaceRequest genieGetSpaceRequest);

  /** List messages in a conversation */
  GenieListConversationMessagesResponse listConversationMessages(
      GenieListConversationMessagesRequest genieListConversationMessagesRequest);

  /** Get a list of conversations in a Genie Space. */
  GenieListConversationsResponse listConversations(
      GenieListConversationsRequest genieListConversationsRequest);

  /** Get list of Genie Spaces. */
  GenieListSpacesResponse listSpaces(GenieListSpacesRequest genieListSpacesRequest);

  /** Send feedback for a message. */
  void sendMessageFeedback(GenieSendMessageFeedbackRequest genieSendMessageFeedbackRequest);

  /** Start a new conversation. */
  GenieStartConversationResponse startConversation(
      GenieStartConversationMessageRequest genieStartConversationMessageRequest);

  /** Move a Genie Space to the trash. */
  void trashSpace(GenieTrashSpaceRequest genieTrashSpaceRequest);

  /** Updates a Genie space with a serialized payload. */
  GenieSpace updateSpace(GenieUpdateSpaceRequest genieUpdateSpaceRequest);
}
