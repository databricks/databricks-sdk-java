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
   * Cancel a batch. Cancellation is asynchronous: requests in flight drain first, so read the batch
   * to observe the `CANCELLING` and `CANCELLED` statuses.
   */
  CancelBatchResponse cancelBatch(CancelBatchRequest cancelBatchRequest);

  /**
   * Run an AI function over every request in a file on a Unity Catalog volume. The batch runs
   * asynchronously; read it to follow its progress.
   */
  Batch createBatch(CreateBatchRequest createBatchRequest);

  /** Read one batch, with its status and progress. */
  Batch getBatch(GetBatchRequest getBatchRequest);

  /** List the batches the caller created in this workspace. */
  ListBatchesResponse listBatches(ListBatchesRequest listBatchesRequest);
}
