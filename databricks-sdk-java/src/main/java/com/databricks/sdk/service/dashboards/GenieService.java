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
   * Sends a new message in a chat-mode [conversation](:method:genie/startconversation). The AI
   * response uses all previously created messages in the conversation to respond. The message is
   * processed asynchronously. Poll [Get a conversation message](:method:genie/getmessage) until its
   * `status` is `COMPLETED`, `FAILED`, or `CANCELLED`.
   */
  GenieMessage createMessage(
      GenieCreateConversationMessageRequest genieCreateConversationMessageRequest);

  /** Create a comment on a conversation message. */
  GenieMessageComment createMessageComment(
      GenieCreateMessageCommentRequest genieCreateMessageCommentRequest);

  /** Creates a Genie space from a serialized payload. */
  GenieSpace createSpace(GenieCreateSpaceRequest genieCreateSpaceRequest);

  /**
   * Deletes a conversation and all of its messages. Users can delete their own conversations.
   * Deleting another user's conversation requires at least CAN MANAGE permission on the space.
   */
  void deleteConversation(GenieDeleteConversationRequest genieDeleteConversationRequest);

  /** Delete a conversation message. */
  void deleteConversationMessage(
      GenieDeleteConversationMessageRequest genieDeleteConversationMessageRequest);

  /**
   * Download a rendered image of a message visualization attachment. The response body is the raw
   * PNG image, not a JSON payload. This is only available if the attachment is a visualization and
   * the message status is `COMPLETED`.
   */
  DownloadMessageAttachmentVisualizationResponse downloadMessageAttachmentVisualization(
      DownloadMessageAttachmentVisualizationRequest downloadMessageAttachmentVisualizationRequest);

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
   * <p>When you use the `EXTERNAL_LINKS` disposition, a short-lived cloud-storage URL is generated
   * to download the results. The URL contains temporary access credentials, so protect it and do
   * not set an `Authorization` header in the download request.
   *
   * <p>See [Execute Statement](:method:statementexecution/executestatement) for more details.
   *
   * <p>----
   */
  GenieGenerateDownloadFullQueryResultResponse generateDownloadFullQueryResult(
      GenieGenerateDownloadFullQueryResultRequest genieGenerateDownloadFullQueryResultRequest);

  /**
   * Cancels an in-flight agent-mode response. `response_id` is the id returned in the
   * `response.created` event from the agent-mode responses endpoint. The response stops at the next
   * agent boundary and its terminal state is returned.
   */
  GenieMessage genieCancelResponse(GenieCancelResponseRequest genieCancelResponseRequest);

  /**
   * Starts a benchmark evaluation run that asks Genie each selected benchmark question in a Genie
   * space and compares every response with the benchmark SQL. The run executes asynchronously: the
   * response is the new run with its current status. If it is still running, poll with the get
   * method until the status is terminal.
   */
  GenieEvalRunResponse genieCreateEvalRun(GenieCreateEvalRunRequest genieCreateEvalRunRequest);

  /**
   * Gets the full result for one benchmark question in an evaluation run: its assessment and the
   * reasons for it, Genie's response with the SQL execution result, and the expected response from
   * the benchmark. The result must belong to the given run.
   */
  GenieEvalResultDetails genieGetEvalResultDetails(
      GenieGetEvalResultDetailsRequest genieGetEvalResultDetailsRequest);

  /**
   * Gets the current status and summary counts of a benchmark evaluation run. Poll this method
   * until `eval_run_status` is terminal: DONE, EVALUATION_CANCELLED or EVALUATION_TIMEOUT.
   */
  GenieEvalRunResponse genieGetEvalRun(GenieGetEvalRunRequest genieGetEvalRunRequest);

  /**
   * Lists the results of a benchmark evaluation run, one per benchmark question. Each entry carries
   * the result status and a snapshot of the question and benchmark answer; the assessment and
   * Genie's response are available through the result details method.
   */
  GenieListEvalResultsResponse genieListEvalResults(
      GenieListEvalResultsRequest genieListEvalResultsRequest);

  /**
   * Lists the benchmark evaluation runs in a Genie space with the current status and summary counts
   * of each run.
   */
  GenieListEvalRunsResponse genieListEvalRuns(GenieListEvalRunsRequest genieListEvalRunsRequest);

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
   * <p>When you use the `EXTERNAL_LINKS` disposition, a short-lived cloud-storage URL is generated
   * to download the results. The URL contains temporary access credentials, so protect it and do
   * not set an `Authorization` header in the download request.
   *
   * <p>See [Execute Statement](:method:statementexecution/executestatement) for more details.
   *
   * <p>----
   */
  GenieGetDownloadFullQueryResultResponse getDownloadFullQueryResult(
      GenieGetDownloadFullQueryResultRequest genieGetDownloadFullQueryResultRequest);

  /**
   * Gets a message from a chat-mode or agent-mode conversation. For a complete agent-mode
   * transcript, use the List conversation items endpoint.
   */
  GenieMessage getMessage(GenieGetConversationMessageRequest genieGetConversationMessageRequest);

  /**
   * Gets the result of the SQL query in a message's query attachment. The result is available only
   * while the message status is `EXECUTING_QUERY` or `COMPLETED`.
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

  /** List all comments across all messages in a conversation. */
  GenieListConversationCommentsResponse listConversationComments(
      GenieListConversationCommentsRequest genieListConversationCommentsRequest);

  /**
   * Lists messages in a chat-mode or agent-mode conversation. Agent-mode messages are returned as
   * GenieMessage projections. Use the List conversation items endpoint for the complete reasoning
   * and tool-call history.
   */
  GenieListConversationMessagesResponse listConversationMessages(
      GenieListConversationMessagesRequest genieListConversationMessagesRequest);

  /**
   * Lists the conversations in a Genie space. By default the list contains only the caller's own
   * conversations, ordered by most recent activity. With `include_all`, it contains every user's
   * conversations in the space, ordered by creation time with the newest first.
   */
  GenieListConversationsResponse listConversations(
      GenieListConversationsRequest genieListConversationsRequest);

  /** List comments on a specific conversation message. */
  GenieListMessageCommentsResponse listMessageComments(
      GenieListMessageCommentsRequest genieListMessageCommentsRequest);

  /** Lists the Genie spaces that the caller can access, most recently updated first. */
  GenieListSpacesResponse listSpaces(GenieListSpacesRequest genieListSpacesRequest);

  /** Sends feedback for a message in a chat-mode or agent-mode conversation. */
  void sendMessageFeedback(GenieSendMessageFeedbackRequest genieSendMessageFeedbackRequest);

  /**
   * Starts a new chat-mode conversation and sends its first message. The message is processed
   * asynchronously. Poll [Get a conversation message](:method:genie/getmessage) until its `status`
   * is `COMPLETED`, `FAILED`, or `CANCELLED`.
   */
  GenieStartConversationResponse startConversation(
      GenieStartConversationMessageRequest genieStartConversationMessageRequest);

  /** Move a Genie Space to the trash. */
  void trashSpace(GenieTrashSpaceRequest genieTrashSpaceRequest);

  /**
   * Updates a Genie space. Replaces the whole configuration when `serialized_space` is set and
   * changes the title, description, warehouse or folder when those fields are set; omitted fields
   * keep their current values.
   */
  GenieSpace updateSpace(GenieUpdateSpaceRequest genieUpdateSpaceRequest);
}
