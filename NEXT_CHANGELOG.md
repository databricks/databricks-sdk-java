# NEXT CHANGELOG

## Release v0.140.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `kinesisStreamConfig` field for `com.databricks.sdk.service.ml.StreamSourceConfig`.
* Add `mode` field for `com.databricks.sdk.service.pipelines.UpdateInfo`.
* [Breaking] Change `state` field for `com.databricks.sdk.service.bundledeployments.Operation` to type `String` class.
* [Breaking] Change `state` field for `com.databricks.sdk.service.bundledeployments.Resource` to type `String` class.
* [Breaking] Remove `awsAccessKeyId` and `awsSecretAccessKey` fields for `com.databricks.sdk.service.catalog.ModelProviderServiceConfigAmazonBedrockProviderDirectConfig`.
* [Breaking] Remove `clientId`, `clientSecret` and `tenantId` fields for `com.databricks.sdk.service.catalog.ModelProviderServiceConfigAzureOpenAiProviderDirectConfig`.
* [Breaking] Remove `clientId`, `clientSecret` and `tenantId` fields for `com.databricks.sdk.service.catalog.ModelProviderServiceConfigMicrosoftFoundryProviderDirectConfig`.