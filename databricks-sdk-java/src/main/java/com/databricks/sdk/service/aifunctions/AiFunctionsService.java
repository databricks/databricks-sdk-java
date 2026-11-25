// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;

/**
 * Transform and enrich data with AI.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AiFunctionsService {
  /**
   * Classifies content according to a set of provided labels. The AI Classify REST API has a
   * default rate limit of 1,200 requests per minute per workspace. Contact your account team to
   * request a higher limit.
   */
  AiClassifyResponse aiClassify(AiClassifyRequest aiClassifyRequest);

  /**
   * Turn text and structured data into decisions your application can use. Define questions and
   * criteria to choose an option, estimate a probability, or assign a score given a provided state.
   * The AI Decide REST API has a default rate limit of 1,200 requests per minute per workspace.
   * Contact your account team to request a higher limit.
   *
   * <p>> **Note:** The v1 AI Decide syntax supporting strings and objects in `state` and objects
   * and arrays in `instructions` will no longer be supported starting February 1, 2027. To use AI
   * Decide, you must set `options.version` to `"2.0"`, pass an array of typed content objects to
   * `state`, and a nonblank string to `instructions`.
   */
  AiDecideResponse aiDecide(AiDecideRequest aiDecideRequest);

  /**
   * Extracts structured data from text and documents according to a provided schema. The AI Extract
   * REST API has a default rate limit of 120 requests per minute per workspace. Contact your
   * account team to request a higher limit.
   */
  AiExtractResponse aiExtract(AiExtractRequest aiExtractRequest);

  /** Parse structured content from unstructured documents. */
  AiParseDocumentResponse aiParseDocument(AiParseDocumentRequest aiParseDocumentRequest);

  /**
   * Starts the asynchronous cancellation of a batch. Requests in progress are stopped, and the
   * results of the requests that finished are kept. Cancellation is best effort, so the batch can
   * still complete.
   */
  CancelBatchResponse cancelBatch(CancelBatchRequest cancelBatchRequest);

  /**
   * Creates a batch that runs an AI function on every request in a JSONL file on a Unity Catalog
   * volume. The batch runs asynchronously. To follow its progress, get the batch.
   */
  Batch createBatch(CreateBatchRequest createBatchRequest);

  /** Gets the latest status and progress of a batch. */
  Batch getBatch(GetBatchRequest getBatchRequest);

  /** Lists the batches that the caller created in this workspace. */
  ListBatchesResponse listBatches(ListBatchesRequest listBatchesRequest);
}
