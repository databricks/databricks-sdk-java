// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;

/**
 * Transform and enrich data with AI on Databricks.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AiFunctionsService {
  /**
   * Classifies content according to a set of provided labels. For REST API requests, the default
   * rate limit is 1,200 requests per minute per workspace. Contact your Databricks account team to
   * request a higher limit.
   */
  AiClassifyResponse aiClassify(AiClassifyRequest aiClassifyRequest);

  /**
   * Turn text and structured data into decisions your application can use. Define questions and
   * criteria to choose an option, estimate a probability, or assign a score given a provided state.
   */
  AiDecideResponse aiDecide(AiDecideRequest aiDecideRequest);

  /**
   * Extracts structured data from text and documents according to a provided schema. For REST API
   * requests, the default rate limit is 120 requests per minute per workspace. Contact your
   * Databricks account team to request a higher limit.
   */
  AiExtractResponse aiExtract(AiExtractRequest aiExtractRequest);

  /** Parse structured content from unstructured documents. */
  AiParseDocumentResponse aiParseDocument(AiParseDocumentRequest aiParseDocumentRequest);

  /**
   * Starts the asynchronous cancellation of a batch. Requests in progress are drained first.
   * Cancellation is best effort, so the batch can still complete.
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
