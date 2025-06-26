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

  /** Delete a conversation. */
  void deleteConversation(GenieDeleteConversationRequest genieDeleteConversationRequest);

  /**
   * Execute the SQL for a message query attachment. Use this API when the query attachment has
   * expired and needs to be re-executed.
   */
  GenieGetMessageQueryResultResponse executeMessageAttachmentQuery(
      GenieExecuteMessageAttachmentQueryRequest genieExecuteMessageAttachmentQueryRequest);

  /** Execute the SQL query in the message. */
  GenieGetMessageQueryResultResponse executeMessageQuery(
      GenieExecuteMessageQueryRequest genieExecuteMessageQueryRequest);

  /** Get message from conversation. */
  GenieMessage getMessage(GenieGetConversationMessageRequest genieGetConversationMessageRequest);

  /**
   * Get the result of SQL query if the message has a query attachment. This is only available if a
   * message has a query attachment and the message status is `EXECUTING_QUERY` OR `COMPLETED`.
   */
  GenieGetMessageQueryResultResponse getMessageAttachmentQueryResult(
      GenieGetMessageAttachmentQueryResultRequest genieGetMessageAttachmentQueryResultRequest);

  /**
   * Get the result of SQL query if the message has a query attachment. This is only available if a
   * message has a query attachment and the message status is `EXECUTING_QUERY`.
   */
  GenieGetMessageQueryResultResponse getMessageQueryResult(
      GenieGetMessageQueryResultRequest genieGetMessageQueryResultRequest);

  /**
   * Get the result of SQL query if the message has a query attachment. This is only available if a
   * message has a query attachment and the message status is `EXECUTING_QUERY` OR `COMPLETED`.
   */
  GenieGetMessageQueryResultResponse getMessageQueryResultByAttachment(
      GenieGetQueryResultByAttachmentRequest genieGetQueryResultByAttachmentRequest);

  /** Get details of a Genie Space. */
  GenieSpace getSpace(GenieGetSpaceRequest genieGetSpaceRequest);

  /** Get a list of conversations in a Genie Space. */
  GenieListConversationsResponse listConversations(
      GenieListConversationsRequest genieListConversationsRequest);

  /** Get list of Genie Spaces. */
  GenieListSpacesResponse listSpaces(GenieListSpacesRequest genieListSpacesRequest);

  /** Start a new conversation. */
  GenieStartConversationResponse startConversation(
      GenieStartConversationMessageRequest genieStartConversationMessageRequest);

  /** Trash a Genie Space. */
  void trashSpace(GenieTrashSpaceRequest genieTrashSpaceRequest);
}
