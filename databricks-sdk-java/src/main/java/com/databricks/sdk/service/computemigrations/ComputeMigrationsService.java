// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;

/**
 * Manage migrations of Classic compute workloads to Serverless.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ComputeMigrationsService {
  /**
   * Approves migration execution at the MIGRATION_REVIEW gate, advancing to execution.
   *
   * <p>Valid only when the migration is in MIGRATION_REVIEW. If supplied, the `etag` must match the
   * current server value.
   *
   * <p>Returns NOT_FOUND if the migration does not exist. Returns FAILED_PRECONDITION if the
   * migration is not in MIGRATION_REVIEW. Returns ABORTED if the etag does not match the current
   * resource version.
   */
  Migration approveMigrationExecution(
      ApproveMigrationExecutionRequest approveMigrationExecutionRequest);

  /**
   * Approves the working copy at the TRANSLATION_READY gate. If the migration was created with
   * `run_validation`, the working copy is then run to verify it executes successfully before the
   * migration is presented for execution review; otherwise it advances straight to
   * MIGRATION_REVIEW.
   *
   * <p>Valid only when the migration is in TRANSLATION_READY. If supplied, the `etag` must match
   * the current server value.
   *
   * <p>Returns NOT_FOUND if the migration does not exist. Returns FAILED_PRECONDITION if the
   * migration is not in TRANSLATION_READY. Returns ABORTED if the etag does not match the current
   * resource version.
   */
  Migration approveMigrationTranslation(
      ApproveMigrationTranslationRequest approveMigrationTranslationRequest);

  /**
   * Cancels the migration, transitioning it to CANCELLED.
   *
   * <p>Valid from any non-terminal state, unlike the review-gate transitions, which each require a
   * specific state. Any in-flight agent work is abandoned and the migration stops advancing. The
   * resource is retained for auditability.
   *
   * <p>Returns NOT_FOUND if the migration does not exist. Returns FAILED_PRECONDITION if the
   * migration is already in a terminal state. Returns ABORTED if the etag does not match the
   * current resource version.
   */
  Migration cancelMigration(CancelMigrationRequest cancelMigrationRequest);

  /**
   * Creates a new migration for a Classic compute asset.
   *
   * <p>The migration is created in PLANNING_PENDING and advances through the state machine as
   * planning work is scheduled. The caller must have appropriate permissions: workspace admin for
   * infrastructure-scoped migrations, job owner/admin for individual workload migrations.
   *
   * <p>At most one migration may hold an asset. Returns ALREADY_EXISTS if the asset has a migration
   * in flight, or one that already migrated it successfully; a migration that ended without
   * succeeding, or was deleted, releases the asset so it can be migrated again. Returns
   * INVALID_PARAMETER_VALUE if the asset is not eligible for migration.
   */
  Migration create(CreateMigrationRequest createMigrationRequest);

  /**
   * Deletes a migration (soft-delete).
   *
   * <p>Allowed from any state. Deleting a migration marks the record deleted only — it does not
   * roll back a migration that already ran, and resources created during the migration are not
   * cleaned up. The migration resource is retained for auditability. To stop an in-flight migration
   * (agent teardown, transition to CANCELLED), use CancelMigration instead.
   *
   * <p>Returns NOT_FOUND if the migration does not exist, or was already deleted: a deleted
   * migration is hidden from every method (Get, Update, List, and Delete), so it cannot be deleted
   * again. Returns ABORTED if a supplied nonempty request etag does not match the resource version.
   */
  Migration delete(DeleteMigrationRequest deleteMigrationRequest);

  /**
   * Retrieves a migration by its ID.
   *
   * <p>Returns the current state, configuration, and output artifacts of the migration. Use this to
   * poll migration progress or inspect artifacts after state transitions. Returns NOT_FOUND if the
   * migration does not exist in the caller's workspace.
   */
  Migration get(GetMigrationRequest getMigrationRequest);

  /**
   * Lists migrations in the caller's workspace, ordered by migration ID, with cursor-based
   * pagination and filtering by asset type and state.
   *
   * <p>Eventually consistent: results are read from a cache, and pagination is not a point-in-time
   * snapshot, so a migration created during a List may not appear until a subsequent one.
   */
  ListMigrationsResponse list(ListMigrationsRequest listMigrationsRequest);

  /**
   * Rejects migration execution at the MIGRATION_REVIEW gate, sending the migration to
   * REVISION_PENDING to loop back for re-planning.
   *
   * <p>Valid only when the migration is in MIGRATION_REVIEW. If supplied, the `etag` must match the
   * current server value.
   *
   * <p>Returns NOT_FOUND if the migration does not exist. Returns FAILED_PRECONDITION if the
   * migration is not in MIGRATION_REVIEW. Returns ABORTED if the etag does not match the current
   * resource version.
   */
  Migration rejectMigrationExecution(
      RejectMigrationExecutionRequest rejectMigrationExecutionRequest);

  /**
   * Rejects the working copy at the TRANSLATION_READY gate, sending the migration to
   * REVISION_PENDING to loop back for re-planning.
   *
   * <p>Valid only when the migration is in TRANSLATION_READY. If supplied, the `etag` must match
   * the current server value.
   *
   * <p>Returns NOT_FOUND if the migration does not exist. Returns FAILED_PRECONDITION if the
   * migration is not in TRANSLATION_READY. Returns ABORTED if the etag does not match the current
   * resource version.
   */
  Migration rejectMigrationTranslation(
      RejectMigrationTranslationRequest rejectMigrationTranslationRequest);
}
