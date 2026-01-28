package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.integration.framework.CollectionUtils;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.provisioning.Credential;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@DisabledIfEnvironmentVariable(named = "ARM_CLIENT_ID", matches = ".*")
// Skipping this test for GCP because this api is not enabled in GCP.
@DisabledIfEnvironmentVariable(named = "CLOUD_PROVIDER", matches = "GCP")
@ExtendWith(EnvTest.class)
public class CredentialsIT {
  @Test
  void lists(AccountClient a) {
    Iterable<Credential> list = a.credentials().list();

    java.util.List<Credential> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }
}
