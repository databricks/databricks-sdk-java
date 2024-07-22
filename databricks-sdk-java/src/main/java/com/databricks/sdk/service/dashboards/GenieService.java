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
   * Create conversation message.
   *
   * <p>Create new message in [conversation](:method:genie/startconversation). The AI response uses
   * all previously created messages in the conversation to respond.
   */
  GenieMessage createMessage(
      GenieCreateConversationMessageRequest genieCreateConversationMessageRequest);

  /**
   * Execute SQL query in a conversation message.
   *
   * <p>Execute the SQL query in the message.
   */
  GenieGetMessageQueryResultResponse executeMessageQuery(
      ExecuteMessageQueryRequest executeMessageQueryRequest);

  /**
   * Get conversation message.
   *
   * <p>Get message from conversation.
   */
  GenieMessage getMessage(GenieGetConversationMessageRequest genieGetConversationMessageRequest);

  /**
   * Get conversation message SQL query result.
   *
   * <p>Get the result of SQL query if the message has a query attachment. This is only available if
   * a message has a query attachment and the message status is `EXECUTING_QUERY`.
   */
  GenieGetMessageQueryResultResponse getMessageQueryResult(
      GenieGetMessageQueryResultRequest genieGetMessageQueryResultRequest);

  /**
   * Start conversation.
   *
   * <p>Start a new conversation.
   */
  GenieStartConversationResponse startConversation(
      GenieStartConversationMessageRequest genieStartConversationMessageRequest);
}
