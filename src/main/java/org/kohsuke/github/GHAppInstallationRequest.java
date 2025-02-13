package org.kohsuke.github;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.io.IOException;
import java.net.URL;

/**
 * A Github App Installation Request.
 *
 * @author Anuj Hydrabadi
 * @see GHApp#listInstallationRequests() GHApp#listInstallationRequests()
 */
public class GHAppInstallationRequest extends GHObject {
    /**
     * Create default GHAppInstallationRequest instance
     */
    public GHAppInstallationRequest() {
    }

    private GHOrganization account;

    private GHUser requester;

    private String htmlUrl;

    /**
     * Gets the organization where the app was requested to be installed.
     *
     * @return the organization where the app was requested to be installed.
     */
    @SuppressFBWarnings(value = { "EI_EXPOSE_REP", "UWF_UNWRITTEN_FIELD" }, justification = "Expected behavior")
    public GHOrganization getAccount() {
        return account;
    }

    /**
     * Gets the user who requested the installation.
     *
     * @return the user who requested the installation.
     */
    @SuppressFBWarnings(value = { "EI_EXPOSE_REP", "UWF_UNWRITTEN_FIELD" }, justification = "Expected behavior")
    public GHUser getRequester() {
        return requester;
    }

    @Override
    public URL getHtmlUrl() throws IOException {
        return GitHubClient.parseURL(htmlUrl);
    }

}
