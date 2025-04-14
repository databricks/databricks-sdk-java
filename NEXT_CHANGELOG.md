# NEXT CHANGELOG

## Release v0.45.0

### New Features and Improvements

### Bug Fixes

### Documentation

### Internal Changes

### API Changes
* Added `workspaceClient.enableExportNotebook()` service, `workspaceClient.enableNotebookTableClipboard()` service and `workspaceClient.enableResultsDownloading()` service.
* Added `getCredentialsForTraceDataDownload()` and `getCredentialsForTraceDataUpload()` methods for `workspaceClient.experiments()` service.
* Added `getDownloadFullQueryResult()` method for `workspaceClient.genie()` service.
* Added `getPublishedDashboardTokenInfo()` method for `workspaceClient.lakeviewEmbedded()` service.
* Added `bindingWorkspaceIds` field for `com.databricks.sdk.service.billing.BudgetPolicy`.
* Added `downloadId` field for `com.databricks.sdk.service.dashboards.GenieGenerateDownloadFullQueryResultResponse`.
* Added `dashboardOutput` field for `com.databricks.sdk.service.jobs.RunOutput`.
* Added `dashboardTask` and `powerBiTask` fields for `com.databricks.sdk.service.jobs.RunTask`.
* Added `dashboardTask` and `powerBiTask` fields for `com.databricks.sdk.service.jobs.SubmitTask`.
* Added `dashboardTask` and `powerBiTask` fields for `com.databricks.sdk.service.jobs.Task`.
* Added `includeFeatures` field for `com.databricks.sdk.service.ml.CreateForecastingExperimentRequest`.
* Added `models` field for `com.databricks.sdk.service.ml.LogInputs`.
* Added `datasetDigest`, `datasetName` and `modelId` fields for `com.databricks.sdk.service.ml.LogMetric`.
* Added `datasetDigest`, `datasetName`, `modelId` and `runId` fields for `com.databricks.sdk.service.ml.Metric`.
* Added `modelInputs` field for `com.databricks.sdk.service.ml.RunInputs`.
* Added `clientApplication` field for `com.databricks.sdk.service.sql.QueryInfo`.
* Added `GEOGRAPHY` and `GEOMETRY` enum values for `com.databricks.sdk.service.catalog.ColumnTypeName`.
* Added `ALLOCATION_TIMEOUT_NO_HEALTHY_AND_WARMED_UP_CLUSTERS`, `DOCKER_CONTAINER_CREATION_EXCEPTION`, `DOCKER_IMAGE_TOO_LARGE_FOR_INSTANCE_EXCEPTION` and `DOCKER_INVALID_OS_EXCEPTION` enum values for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* Added `STANDARD` enum value for `com.databricks.sdk.service.jobs.PerformanceTarget`.
* Added `CAN_VIEW` enum value for `com.databricks.sdk.service.sql.WarehousePermissionLevel`.
* [Breaking] Changed `generateDownloadFullQueryResult()` method for `workspaceClient.genie()` service . Method path has changed.
* [Breaking] Changed waiter for `workspaceClient.commandExecution().create()` method.
* [Breaking] Changed waiter for `workspaceClient.commandExecution().execute()` method.
* [Breaking] Removed `error`, `status` and `transientStatementId` fields for `com.databricks.sdk.service.dashboards.GenieGenerateDownloadFullQueryResultResponse`.
* [Breaking] Removed `BALANCED` and `COST_OPTIMIZED` enum values for `com.databricks.sdk.service.jobs.PerformanceTarget`.
* [Breaking] Removed waiter for `workspaceClient.clusters().get()` method.
* [Breaking] Removed waiter for `workspaceClient.jobs().getRun()` method.
* [Breaking] Removed waiter for `workspaceClient.pipelines().get()` method.
* [Breaking] Removed waiter for `workspaceClient.warehouses().get()` method.
