/*
 * Gitea API
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.21.10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * BranchProtection represents a branch protection for a repository
 */
@Schema(description = "BranchProtection represents a branch protection for a repository")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class BranchProtection {
  @SerializedName("approvals_whitelist_teams")
  private List<String> approvalsWhitelistTeams = null;

  @SerializedName("approvals_whitelist_username")
  private List<String> approvalsWhitelistUsername = null;

  @SerializedName("block_on_official_review_requests")
  private Boolean blockOnOfficialReviewRequests = null;

  @SerializedName("block_on_outdated_branch")
  private Boolean blockOnOutdatedBranch = null;

  @SerializedName("block_on_rejected_reviews")
  private Boolean blockOnRejectedReviews = null;

  @SerializedName("branch_name")
  private String branchName = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("dismiss_stale_approvals")
  private Boolean dismissStaleApprovals = null;

  @SerializedName("enable_approvals_whitelist")
  private Boolean enableApprovalsWhitelist = null;

  @SerializedName("enable_merge_whitelist")
  private Boolean enableMergeWhitelist = null;

  @SerializedName("enable_push")
  private Boolean enablePush = null;

  @SerializedName("enable_push_whitelist")
  private Boolean enablePushWhitelist = null;

  @SerializedName("enable_status_check")
  private Boolean enableStatusCheck = null;

  @SerializedName("merge_whitelist_teams")
  private List<String> mergeWhitelistTeams = null;

  @SerializedName("merge_whitelist_usernames")
  private List<String> mergeWhitelistUsernames = null;

  @SerializedName("protected_file_patterns")
  private String protectedFilePatterns = null;

  @SerializedName("push_whitelist_deploy_keys")
  private Boolean pushWhitelistDeployKeys = null;

  @SerializedName("push_whitelist_teams")
  private List<String> pushWhitelistTeams = null;

  @SerializedName("push_whitelist_usernames")
  private List<String> pushWhitelistUsernames = null;

  @SerializedName("require_signed_commits")
  private Boolean requireSignedCommits = null;

  @SerializedName("required_approvals")
  private Long requiredApprovals = null;

  @SerializedName("rule_name")
  private String ruleName = null;

  @SerializedName("status_check_contexts")
  private List<String> statusCheckContexts = null;

  @SerializedName("unprotected_file_patterns")
  private String unprotectedFilePatterns = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public BranchProtection approvalsWhitelistTeams(List<String> approvalsWhitelistTeams) {
    this.approvalsWhitelistTeams = approvalsWhitelistTeams;
    return this;
  }

  public BranchProtection addApprovalsWhitelistTeamsItem(String approvalsWhitelistTeamsItem) {
    if (this.approvalsWhitelistTeams == null) {
      this.approvalsWhitelistTeams = new ArrayList<String>();
    }
    this.approvalsWhitelistTeams.add(approvalsWhitelistTeamsItem);
    return this;
  }

   /**
   * Get approvalsWhitelistTeams
   * @return approvalsWhitelistTeams
  **/
  @Schema(description = "")
  public List<String> getApprovalsWhitelistTeams() {
    return approvalsWhitelistTeams;
  }

  public void setApprovalsWhitelistTeams(List<String> approvalsWhitelistTeams) {
    this.approvalsWhitelistTeams = approvalsWhitelistTeams;
  }

  public BranchProtection approvalsWhitelistUsername(List<String> approvalsWhitelistUsername) {
    this.approvalsWhitelistUsername = approvalsWhitelistUsername;
    return this;
  }

  public BranchProtection addApprovalsWhitelistUsernameItem(String approvalsWhitelistUsernameItem) {
    if (this.approvalsWhitelistUsername == null) {
      this.approvalsWhitelistUsername = new ArrayList<String>();
    }
    this.approvalsWhitelistUsername.add(approvalsWhitelistUsernameItem);
    return this;
  }

   /**
   * Get approvalsWhitelistUsername
   * @return approvalsWhitelistUsername
  **/
  @Schema(description = "")
  public List<String> getApprovalsWhitelistUsername() {
    return approvalsWhitelistUsername;
  }

  public void setApprovalsWhitelistUsername(List<String> approvalsWhitelistUsername) {
    this.approvalsWhitelistUsername = approvalsWhitelistUsername;
  }

  public BranchProtection blockOnOfficialReviewRequests(Boolean blockOnOfficialReviewRequests) {
    this.blockOnOfficialReviewRequests = blockOnOfficialReviewRequests;
    return this;
  }

   /**
   * Get blockOnOfficialReviewRequests
   * @return blockOnOfficialReviewRequests
  **/
  @Schema(description = "")
  public Boolean isBlockOnOfficialReviewRequests() {
    return blockOnOfficialReviewRequests;
  }

  public void setBlockOnOfficialReviewRequests(Boolean blockOnOfficialReviewRequests) {
    this.blockOnOfficialReviewRequests = blockOnOfficialReviewRequests;
  }

  public BranchProtection blockOnOutdatedBranch(Boolean blockOnOutdatedBranch) {
    this.blockOnOutdatedBranch = blockOnOutdatedBranch;
    return this;
  }

   /**
   * Get blockOnOutdatedBranch
   * @return blockOnOutdatedBranch
  **/
  @Schema(description = "")
  public Boolean isBlockOnOutdatedBranch() {
    return blockOnOutdatedBranch;
  }

  public void setBlockOnOutdatedBranch(Boolean blockOnOutdatedBranch) {
    this.blockOnOutdatedBranch = blockOnOutdatedBranch;
  }

  public BranchProtection blockOnRejectedReviews(Boolean blockOnRejectedReviews) {
    this.blockOnRejectedReviews = blockOnRejectedReviews;
    return this;
  }

   /**
   * Get blockOnRejectedReviews
   * @return blockOnRejectedReviews
  **/
  @Schema(description = "")
  public Boolean isBlockOnRejectedReviews() {
    return blockOnRejectedReviews;
  }

  public void setBlockOnRejectedReviews(Boolean blockOnRejectedReviews) {
    this.blockOnRejectedReviews = blockOnRejectedReviews;
  }

  public BranchProtection branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

   /**
   * Deprecated: true
   * @return branchName
  **/
  @Schema(description = "Deprecated: true")
  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public BranchProtection createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public BranchProtection dismissStaleApprovals(Boolean dismissStaleApprovals) {
    this.dismissStaleApprovals = dismissStaleApprovals;
    return this;
  }

   /**
   * Get dismissStaleApprovals
   * @return dismissStaleApprovals
  **/
  @Schema(description = "")
  public Boolean isDismissStaleApprovals() {
    return dismissStaleApprovals;
  }

  public void setDismissStaleApprovals(Boolean dismissStaleApprovals) {
    this.dismissStaleApprovals = dismissStaleApprovals;
  }

  public BranchProtection enableApprovalsWhitelist(Boolean enableApprovalsWhitelist) {
    this.enableApprovalsWhitelist = enableApprovalsWhitelist;
    return this;
  }

   /**
   * Get enableApprovalsWhitelist
   * @return enableApprovalsWhitelist
  **/
  @Schema(description = "")
  public Boolean isEnableApprovalsWhitelist() {
    return enableApprovalsWhitelist;
  }

  public void setEnableApprovalsWhitelist(Boolean enableApprovalsWhitelist) {
    this.enableApprovalsWhitelist = enableApprovalsWhitelist;
  }

  public BranchProtection enableMergeWhitelist(Boolean enableMergeWhitelist) {
    this.enableMergeWhitelist = enableMergeWhitelist;
    return this;
  }

   /**
   * Get enableMergeWhitelist
   * @return enableMergeWhitelist
  **/
  @Schema(description = "")
  public Boolean isEnableMergeWhitelist() {
    return enableMergeWhitelist;
  }

  public void setEnableMergeWhitelist(Boolean enableMergeWhitelist) {
    this.enableMergeWhitelist = enableMergeWhitelist;
  }

  public BranchProtection enablePush(Boolean enablePush) {
    this.enablePush = enablePush;
    return this;
  }

   /**
   * Get enablePush
   * @return enablePush
  **/
  @Schema(description = "")
  public Boolean isEnablePush() {
    return enablePush;
  }

  public void setEnablePush(Boolean enablePush) {
    this.enablePush = enablePush;
  }

  public BranchProtection enablePushWhitelist(Boolean enablePushWhitelist) {
    this.enablePushWhitelist = enablePushWhitelist;
    return this;
  }

   /**
   * Get enablePushWhitelist
   * @return enablePushWhitelist
  **/
  @Schema(description = "")
  public Boolean isEnablePushWhitelist() {
    return enablePushWhitelist;
  }

  public void setEnablePushWhitelist(Boolean enablePushWhitelist) {
    this.enablePushWhitelist = enablePushWhitelist;
  }

  public BranchProtection enableStatusCheck(Boolean enableStatusCheck) {
    this.enableStatusCheck = enableStatusCheck;
    return this;
  }

   /**
   * Get enableStatusCheck
   * @return enableStatusCheck
  **/
  @Schema(description = "")
  public Boolean isEnableStatusCheck() {
    return enableStatusCheck;
  }

  public void setEnableStatusCheck(Boolean enableStatusCheck) {
    this.enableStatusCheck = enableStatusCheck;
  }

  public BranchProtection mergeWhitelistTeams(List<String> mergeWhitelistTeams) {
    this.mergeWhitelistTeams = mergeWhitelistTeams;
    return this;
  }

  public BranchProtection addMergeWhitelistTeamsItem(String mergeWhitelistTeamsItem) {
    if (this.mergeWhitelistTeams == null) {
      this.mergeWhitelistTeams = new ArrayList<String>();
    }
    this.mergeWhitelistTeams.add(mergeWhitelistTeamsItem);
    return this;
  }

   /**
   * Get mergeWhitelistTeams
   * @return mergeWhitelistTeams
  **/
  @Schema(description = "")
  public List<String> getMergeWhitelistTeams() {
    return mergeWhitelistTeams;
  }

  public void setMergeWhitelistTeams(List<String> mergeWhitelistTeams) {
    this.mergeWhitelistTeams = mergeWhitelistTeams;
  }

  public BranchProtection mergeWhitelistUsernames(List<String> mergeWhitelistUsernames) {
    this.mergeWhitelistUsernames = mergeWhitelistUsernames;
    return this;
  }

  public BranchProtection addMergeWhitelistUsernamesItem(String mergeWhitelistUsernamesItem) {
    if (this.mergeWhitelistUsernames == null) {
      this.mergeWhitelistUsernames = new ArrayList<String>();
    }
    this.mergeWhitelistUsernames.add(mergeWhitelistUsernamesItem);
    return this;
  }

   /**
   * Get mergeWhitelistUsernames
   * @return mergeWhitelistUsernames
  **/
  @Schema(description = "")
  public List<String> getMergeWhitelistUsernames() {
    return mergeWhitelistUsernames;
  }

  public void setMergeWhitelistUsernames(List<String> mergeWhitelistUsernames) {
    this.mergeWhitelistUsernames = mergeWhitelistUsernames;
  }

  public BranchProtection protectedFilePatterns(String protectedFilePatterns) {
    this.protectedFilePatterns = protectedFilePatterns;
    return this;
  }

   /**
   * Get protectedFilePatterns
   * @return protectedFilePatterns
  **/
  @Schema(description = "")
  public String getProtectedFilePatterns() {
    return protectedFilePatterns;
  }

  public void setProtectedFilePatterns(String protectedFilePatterns) {
    this.protectedFilePatterns = protectedFilePatterns;
  }

  public BranchProtection pushWhitelistDeployKeys(Boolean pushWhitelistDeployKeys) {
    this.pushWhitelistDeployKeys = pushWhitelistDeployKeys;
    return this;
  }

   /**
   * Get pushWhitelistDeployKeys
   * @return pushWhitelistDeployKeys
  **/
  @Schema(description = "")
  public Boolean isPushWhitelistDeployKeys() {
    return pushWhitelistDeployKeys;
  }

  public void setPushWhitelistDeployKeys(Boolean pushWhitelistDeployKeys) {
    this.pushWhitelistDeployKeys = pushWhitelistDeployKeys;
  }

  public BranchProtection pushWhitelistTeams(List<String> pushWhitelistTeams) {
    this.pushWhitelistTeams = pushWhitelistTeams;
    return this;
  }

  public BranchProtection addPushWhitelistTeamsItem(String pushWhitelistTeamsItem) {
    if (this.pushWhitelistTeams == null) {
      this.pushWhitelistTeams = new ArrayList<String>();
    }
    this.pushWhitelistTeams.add(pushWhitelistTeamsItem);
    return this;
  }

   /**
   * Get pushWhitelistTeams
   * @return pushWhitelistTeams
  **/
  @Schema(description = "")
  public List<String> getPushWhitelistTeams() {
    return pushWhitelistTeams;
  }

  public void setPushWhitelistTeams(List<String> pushWhitelistTeams) {
    this.pushWhitelistTeams = pushWhitelistTeams;
  }

  public BranchProtection pushWhitelistUsernames(List<String> pushWhitelistUsernames) {
    this.pushWhitelistUsernames = pushWhitelistUsernames;
    return this;
  }

  public BranchProtection addPushWhitelistUsernamesItem(String pushWhitelistUsernamesItem) {
    if (this.pushWhitelistUsernames == null) {
      this.pushWhitelistUsernames = new ArrayList<String>();
    }
    this.pushWhitelistUsernames.add(pushWhitelistUsernamesItem);
    return this;
  }

   /**
   * Get pushWhitelistUsernames
   * @return pushWhitelistUsernames
  **/
  @Schema(description = "")
  public List<String> getPushWhitelistUsernames() {
    return pushWhitelistUsernames;
  }

  public void setPushWhitelistUsernames(List<String> pushWhitelistUsernames) {
    this.pushWhitelistUsernames = pushWhitelistUsernames;
  }

  public BranchProtection requireSignedCommits(Boolean requireSignedCommits) {
    this.requireSignedCommits = requireSignedCommits;
    return this;
  }

   /**
   * Get requireSignedCommits
   * @return requireSignedCommits
  **/
  @Schema(description = "")
  public Boolean isRequireSignedCommits() {
    return requireSignedCommits;
  }

  public void setRequireSignedCommits(Boolean requireSignedCommits) {
    this.requireSignedCommits = requireSignedCommits;
  }

  public BranchProtection requiredApprovals(Long requiredApprovals) {
    this.requiredApprovals = requiredApprovals;
    return this;
  }

   /**
   * Get requiredApprovals
   * @return requiredApprovals
  **/
  @Schema(description = "")
  public Long getRequiredApprovals() {
    return requiredApprovals;
  }

  public void setRequiredApprovals(Long requiredApprovals) {
    this.requiredApprovals = requiredApprovals;
  }

  public BranchProtection ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Get ruleName
   * @return ruleName
  **/
  @Schema(description = "")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public BranchProtection statusCheckContexts(List<String> statusCheckContexts) {
    this.statusCheckContexts = statusCheckContexts;
    return this;
  }

  public BranchProtection addStatusCheckContextsItem(String statusCheckContextsItem) {
    if (this.statusCheckContexts == null) {
      this.statusCheckContexts = new ArrayList<String>();
    }
    this.statusCheckContexts.add(statusCheckContextsItem);
    return this;
  }

   /**
   * Get statusCheckContexts
   * @return statusCheckContexts
  **/
  @Schema(description = "")
  public List<String> getStatusCheckContexts() {
    return statusCheckContexts;
  }

  public void setStatusCheckContexts(List<String> statusCheckContexts) {
    this.statusCheckContexts = statusCheckContexts;
  }

  public BranchProtection unprotectedFilePatterns(String unprotectedFilePatterns) {
    this.unprotectedFilePatterns = unprotectedFilePatterns;
    return this;
  }

   /**
   * Get unprotectedFilePatterns
   * @return unprotectedFilePatterns
  **/
  @Schema(description = "")
  public String getUnprotectedFilePatterns() {
    return unprotectedFilePatterns;
  }

  public void setUnprotectedFilePatterns(String unprotectedFilePatterns) {
    this.unprotectedFilePatterns = unprotectedFilePatterns;
  }

  public BranchProtection updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchProtection branchProtection = (BranchProtection) o;
    return Objects.equals(this.approvalsWhitelistTeams, branchProtection.approvalsWhitelistTeams) &&
        Objects.equals(this.approvalsWhitelistUsername, branchProtection.approvalsWhitelistUsername) &&
        Objects.equals(this.blockOnOfficialReviewRequests, branchProtection.blockOnOfficialReviewRequests) &&
        Objects.equals(this.blockOnOutdatedBranch, branchProtection.blockOnOutdatedBranch) &&
        Objects.equals(this.blockOnRejectedReviews, branchProtection.blockOnRejectedReviews) &&
        Objects.equals(this.branchName, branchProtection.branchName) &&
        Objects.equals(this.createdAt, branchProtection.createdAt) &&
        Objects.equals(this.dismissStaleApprovals, branchProtection.dismissStaleApprovals) &&
        Objects.equals(this.enableApprovalsWhitelist, branchProtection.enableApprovalsWhitelist) &&
        Objects.equals(this.enableMergeWhitelist, branchProtection.enableMergeWhitelist) &&
        Objects.equals(this.enablePush, branchProtection.enablePush) &&
        Objects.equals(this.enablePushWhitelist, branchProtection.enablePushWhitelist) &&
        Objects.equals(this.enableStatusCheck, branchProtection.enableStatusCheck) &&
        Objects.equals(this.mergeWhitelistTeams, branchProtection.mergeWhitelistTeams) &&
        Objects.equals(this.mergeWhitelistUsernames, branchProtection.mergeWhitelistUsernames) &&
        Objects.equals(this.protectedFilePatterns, branchProtection.protectedFilePatterns) &&
        Objects.equals(this.pushWhitelistDeployKeys, branchProtection.pushWhitelistDeployKeys) &&
        Objects.equals(this.pushWhitelistTeams, branchProtection.pushWhitelistTeams) &&
        Objects.equals(this.pushWhitelistUsernames, branchProtection.pushWhitelistUsernames) &&
        Objects.equals(this.requireSignedCommits, branchProtection.requireSignedCommits) &&
        Objects.equals(this.requiredApprovals, branchProtection.requiredApprovals) &&
        Objects.equals(this.ruleName, branchProtection.ruleName) &&
        Objects.equals(this.statusCheckContexts, branchProtection.statusCheckContexts) &&
        Objects.equals(this.unprotectedFilePatterns, branchProtection.unprotectedFilePatterns) &&
        Objects.equals(this.updatedAt, branchProtection.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalsWhitelistTeams, approvalsWhitelistUsername, blockOnOfficialReviewRequests, blockOnOutdatedBranch, blockOnRejectedReviews, branchName, createdAt, dismissStaleApprovals, enableApprovalsWhitelist, enableMergeWhitelist, enablePush, enablePushWhitelist, enableStatusCheck, mergeWhitelistTeams, mergeWhitelistUsernames, protectedFilePatterns, pushWhitelistDeployKeys, pushWhitelistTeams, pushWhitelistUsernames, requireSignedCommits, requiredApprovals, ruleName, statusCheckContexts, unprotectedFilePatterns, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchProtection {\n");
    
    sb.append("    approvalsWhitelistTeams: ").append(toIndentedString(approvalsWhitelistTeams)).append("\n");
    sb.append("    approvalsWhitelistUsername: ").append(toIndentedString(approvalsWhitelistUsername)).append("\n");
    sb.append("    blockOnOfficialReviewRequests: ").append(toIndentedString(blockOnOfficialReviewRequests)).append("\n");
    sb.append("    blockOnOutdatedBranch: ").append(toIndentedString(blockOnOutdatedBranch)).append("\n");
    sb.append("    blockOnRejectedReviews: ").append(toIndentedString(blockOnRejectedReviews)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dismissStaleApprovals: ").append(toIndentedString(dismissStaleApprovals)).append("\n");
    sb.append("    enableApprovalsWhitelist: ").append(toIndentedString(enableApprovalsWhitelist)).append("\n");
    sb.append("    enableMergeWhitelist: ").append(toIndentedString(enableMergeWhitelist)).append("\n");
    sb.append("    enablePush: ").append(toIndentedString(enablePush)).append("\n");
    sb.append("    enablePushWhitelist: ").append(toIndentedString(enablePushWhitelist)).append("\n");
    sb.append("    enableStatusCheck: ").append(toIndentedString(enableStatusCheck)).append("\n");
    sb.append("    mergeWhitelistTeams: ").append(toIndentedString(mergeWhitelistTeams)).append("\n");
    sb.append("    mergeWhitelistUsernames: ").append(toIndentedString(mergeWhitelistUsernames)).append("\n");
    sb.append("    protectedFilePatterns: ").append(toIndentedString(protectedFilePatterns)).append("\n");
    sb.append("    pushWhitelistDeployKeys: ").append(toIndentedString(pushWhitelistDeployKeys)).append("\n");
    sb.append("    pushWhitelistTeams: ").append(toIndentedString(pushWhitelistTeams)).append("\n");
    sb.append("    pushWhitelistUsernames: ").append(toIndentedString(pushWhitelistUsernames)).append("\n");
    sb.append("    requireSignedCommits: ").append(toIndentedString(requireSignedCommits)).append("\n");
    sb.append("    requiredApprovals: ").append(toIndentedString(requiredApprovals)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    statusCheckContexts: ").append(toIndentedString(statusCheckContexts)).append("\n");
    sb.append("    unprotectedFilePatterns: ").append(toIndentedString(unprotectedFilePatterns)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
