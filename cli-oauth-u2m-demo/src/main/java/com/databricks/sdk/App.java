package com.databricks.sdk;

import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.commons.CommonsHttpClient;
import com.databricks.sdk.client.http.HttpClient;
import com.databricks.sdk.client.oauth.Consent;
import com.databricks.sdk.client.oauth.OAuthClient;
import com.databricks.sdk.client.oauth.RefreshableCredentials;
import com.databricks.sdk.service.clusters.ClusterInfo;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Make sure the DATABRICKS_HOST and DATABRICKS_CLIENT_ID environment variables are set in your run configuration.
 */
public class App {
    public static void main( String[] args ) throws IOException, URISyntaxException {
        DatabricksConfig config = new DatabricksConfig();
        config.resolve();
        OAuthClient client = new OAuthClient(config);
        Consent consent = client.initiateConsent();
        RefreshableCredentials creds = consent.launchExternalBrowser();
        config.setCredentialsProvider(creds);
        DatabricksWorkspace workspace = new DatabricksWorkspace(config);
        for (ClusterInfo c : workspace.clusters().list(new com.databricks.sdk.service.clusters.List())) {
            System.out.println(c.getClusterName());
        }
    }
}
