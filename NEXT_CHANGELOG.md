# NEXT CHANGELOG

## Release v0.151.0

### New Features and Improvements

* Added group assumption through `group_id` / `DATABRICKS_GROUP_ID` for external-browser
  OAuth, OAuth M2M, and Databricks workload identity federation authentication.

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `updateDeployment()` method for `workspaceClient.bundleDeployments()` service.
* Add `genieCancelResponse()` method for `workspaceClient.genie()` service.
* Add `getExternalGroup()`, `getExternalServicePrincipal()` and `getExternalUser()` methods for `accountClient.accountIamV2()` service.
* Add `getExternalGroupProxy()`, `getExternalServicePrincipalProxy()` and `getExternalUserProxy()` methods for `workspaceClient.workspaceIamV2()` service.
* Add `createSnapshot()`, `deleteSnapshot()`, `getSnapshot()`, `getSnapshotSchedule()`, `listSnapshots()` and `updateSnapshotSchedule()` methods for `workspaceClient.postgres()` service.
* Add `assumeGroupId` field for `com.databricks.sdk.service.apps.Space`.
* Add `operations` field for `com.databricks.sdk.service.bundledeployments.Version`.
* Add `functionArgExpression` field for `com.databricks.sdk.service.catalog.FunctionArgument`.
* Add `awsContextId` field for `com.databricks.sdk.service.compute.NodeTypeFlexibility`.
* Add `parameters` field for `com.databricks.sdk.service.jobs.AlertTask`.
* Add `maintenanceWindow` field for `com.databricks.sdk.service.jobs.Continuous`.
* Add `maintenanceWindow` field for `com.databricks.sdk.service.jobs.ContinuousTriggerConfiguration`.
* Add `lateness` field for `com.databricks.sdk.service.ml.DataSource`.
* Add `delay` and `offset` fields for `com.databricks.sdk.service.ml.SlidingWindow`.
* Add `startTime` field for `com.databricks.sdk.service.ml.TimeWindow`.
* Add `delay` and `offset` fields for `com.databricks.sdk.service.ml.TumblingWindow`.
* Add `rabbitmqOptions` field for `com.databricks.sdk.service.pipelines.ConnectorOptions`.
* Add `sourceSnapshot` field for `com.databricks.sdk.service.postgres.BranchSpec`.
* Add `sourceSnapshot` field for `com.databricks.sdk.service.postgres.BranchStatus`.
* Add `DEPLOYMENT_RESOURCE_TYPE_VECTOR_SEARCH_ENDPOINT`, `DEPLOYMENT_RESOURCE_TYPE_VECTOR_SEARCH_INDEX`, `DEPLOYMENT_RESOURCE_TYPE_JOB_RUN`, `DEPLOYMENT_RESOURCE_TYPE_POSTGRES_CATALOG`, `DEPLOYMENT_RESOURCE_TYPE_POSTGRES_SYNCED_TABLE`, `DEPLOYMENT_RESOURCE_TYPE_GENIE_SPACE`, `DEPLOYMENT_RESOURCE_TYPE_INSTANCE_POOL`, `DEPLOYMENT_RESOURCE_TYPE_POSTGRES_DATABASE` and `DEPLOYMENT_RESOURCE_TYPE_POSTGRES_ROLE` enum values for `com.databricks.sdk.service.bundledeployments.DeploymentResourceType`.
* Add `OPERATION_STATUS_PENDING` enum value for `com.databricks.sdk.service.bundledeployments.OperationStatus`.
* Add `GPU_1X_H100` enum value for `com.databricks.sdk.service.compute.HardwareAcceleratorType`.
* Add `RABBITMQ` enum value for `com.databricks.sdk.service.pipelines.IngestionSourceType`.
* Change `sourceSchema` field for `com.databricks.sdk.service.pipelines.SchemaSpec` to no longer be required.
* [Breaking] Change `sourceSchema` field for `com.databricks.sdk.service.pipelines.SchemaSpec` to no longer be required.
* Change `sourceTable` field for `com.databricks.sdk.service.pipelines.TableSpec` to no longer be required.
* [Breaking] Change `sourceTable` field for `com.databricks.sdk.service.pipelines.TableSpec` to no longer be required.
* [Breaking] Remove `entityColumns` and `timeseriesColumn` fields for `com.databricks.sdk.service.ml.DeltaTableSource`.
* [Breaking] Remove `filterCondition`, `inputs` and `timeWindow` fields for `com.databricks.sdk.service.ml.Feature`.
* [Breaking] Remove `extraParameters` and `functionType` fields for `com.databricks.sdk.service.ml.Function`.
* [Breaking] Remove `entityColumnIdentifiers` and `timeseriesColumnIdentifier` fields for `com.databricks.sdk.service.ml.KafkaSource`.
* [Breaking] Remove `cronSchedule` field for `com.databricks.sdk.service.ml.MaterializedFeature`.
* [Breaking] Remove `continuous` field for `com.databricks.sdk.service.ml.TimeWindow`.