package com.databricks.sdk.integration.framework;

import com.databricks.sdk.mixin.SecretsExt;
import com.databricks.sdk.service.catalog.CreateSchema;
import com.databricks.sdk.service.catalog.CreateVolumeRequestContent;
import com.databricks.sdk.service.catalog.SchemasAPI;
import com.databricks.sdk.service.catalog.VolumeType;
import com.databricks.sdk.service.catalog.VolumesAPI;
import com.databricks.sdk.service.workspace.CreateScope;
import com.databricks.sdk.service.workspace.DeleteSecret;
import com.databricks.sdk.service.workspace.PutSecret;

public class ResourceWithCleanup implements AutoCloseable {
  private final Runnable cleanup;

  public ResourceWithCleanup(Runnable cleanup) {
    this.cleanup = cleanup;
  }

  public static ResourceWithCleanup makeSecret(
      SecretsExt secretsExt, String scope, String key, String value) {
    secretsExt.putSecret(new PutSecret().setScope(scope).setKey(key).setStringValue(value));
    return new ResourceWithCleanup(
        () -> secretsExt.deleteSecret(new DeleteSecret().setScope(scope).setKey(key)));
  }

  public static ResourceWithCleanup makeScope(SecretsExt secretsExt, String scope) {
    secretsExt.createScope(new CreateScope().setScope(scope));
    return new ResourceWithCleanup(() -> secretsExt.deleteScope(scope));
  }

  public static ResourceWithCleanup makeSchema(
      SchemasAPI schemasAPI, String catalogName, String schemaName) {
    schemasAPI.create(new CreateSchema().setName(schemaName).setCatalogName(catalogName));
    return new ResourceWithCleanup(() -> schemasAPI.delete(catalogName + "." + schemaName));
  }

  public static ResourceWithCleanup makeVolume(
      VolumesAPI volumesAPI, String catalogName, String schemaName, String volumeName) {
    volumesAPI.create(
        new CreateVolumeRequestContent()
            .setCatalogName(catalogName)
            .setSchemaName(schemaName)
            .setName(volumeName)
            .setVolumeType(VolumeType.MANAGED));
    return new ResourceWithCleanup(
        () -> volumesAPI.delete(catalogName + "." + schemaName + "." + volumeName));
  }

  @Override
  public void close() {
    cleanup.run();
  }
}
