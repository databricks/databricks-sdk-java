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
   * <p>Create new message in a [conversation](:method:genie/startconversation). The AI response
   * uses all previously created messages in the conversation to respond.
   */
  GenieMessage createMessage(
      GenieCreateConversationMessageRequest genieCreateConversationMessageRequest);

  /**
   * Execute message attachment SQL query.
   *
   * <p>Execute the SQL for a message query attachment. Use this API when the query attachment has
   * expired and needs to be re-executed.
   */
  GenieGetMessageQueryResultResponse executeMessageAttachmentQuery(
      GenieExecuteMessageAttachmentQueryRequest genieExecuteMessageAttachmentQueryRequest);

  /**
   * [Deprecated] Execute SQL query in a conversation message.
   *
   * <p>Execute the SQL query in the message.
   */
  GenieGetMessageQueryResultResponse executeMessageQuery(
      GenieExecuteMessageQueryRequest genieExecuteMessageQueryRequest);

  /**
   * Generate full query result download.
   *
   * <p>Initiate full SQL query result download and obtain a `download_id` to track the download
   * progress. This call initiates a new SQL execution to generate the query result. The result is
   * stored in an external link can be retrieved using the [Get Download Full Query
   * Result](:method:genie/getdownloadfullqueryresult) API. Warning: Databricks strongly recommends
   * that you protect the URLs that are returned by the `EXTERNAL_LINKS` disposition. See [Execute
   * Statement](:method:statementexecution/executestatement) for more details.
   */
  GenieGenerateDownloadFullQueryResultResponse generateDownloadFullQueryResult(
      GenieGenerateDownloadFullQueryResultRequest genieGenerateDownloadFullQueryResultRequest);

  /**
   * Get download full query result.
   *
   * <p>After [Generating a Full Query Result Download](:method:genie/getdownloadfullqueryresult)
   * and successfully receiving a `download_id`, use this API to Poll download progress and retrieve
   * the SQL query result external link(s) upon completion. Warning: Databricks strongly recommends
   * that you protect the URLs that are returned by the `EXTERNAL_LINKS` disposition. When you use
   * the `EXTERNAL_LINKS` disposition, a short-lived, presigned URL is generated, which can be used
   * to download the results directly from Amazon S3. As a short-lived access credential is embedded
   * in this presigned URL, you should protect the URL. Because presigned URLs are already generated
   * with embedded temporary access credentials, you must not set an Authorization header in the
   * download requests. See [Execute Statement](:method:statementexecution/executestatement) for
   * more details.
   */
  GenieGetDownloadFullQueryResultResponse getDownloadFullQueryResult(
      GenieGetDownloadFullQueryResultRequest genieGetDownloadFullQueryResultRequest);

  /**
   * Get conversation message.
   *
   * <p>Get message from conversation.
   */
  GenieMessage getMessage(GenieGetConversationMessageRequest genieGetConversationMessageRequest);

  /**
   * Get message attachment SQL query result.
   *
   * <p>Get the result of SQL query if the message has a query attachment. This is only available if
   * a message has a query attachment and the message status is `EXECUTING_QUERY` OR `COMPLETED`.
   */
  GenieGetMessageQueryResultResponse getMessageAttachmentQueryResult(
      GenieGetMessageAttachmentQueryResultRequest genieGetMessageAttachmentQueryResultRequest);

  /**
   * [Deprecated] Get conversation message SQL query result.
   *
   * <p>Get the result of SQL query if the message has a query attachment. This is only available if
   * a message has a query attachment and the message status is `EXECUTING_QUERY`.
   */
  GenieGetMessageQueryResultResponse getMessageQueryResult(
      GenieGetMessageQueryResultRequest genieGetMessageQueryResultRequest);

  /**
   * [Deprecated] Get conversation message SQL query result.
   *
   * <p>Get the result of SQL query if the message has a query attachment. This is only available if
   * a message has a query attachment and the message status is `EXECUTING_QUERY` OR `COMPLETED`.
   */
  GenieGetMessageQueryResultResponse getMessageQueryResultByAttachment(
      GenieGetQueryResultByAttachmentRequest genieGetQueryResultByAttachmentRequest);

  /**
   * Get Genie Space.
   *
   * <p>Get details of a Genie Space.
   */
  GenieSpace getSpace(GenieGetSpaceRequest genieGetSpaceRequest);

  /**
   * Start conversation.
   *
   * <p>Start a new conversation.
   */
  GenieStartConversationResponse startConversation(
      GenieStartConversationMessageRequest genieStartConversationMessageRequest);
}
