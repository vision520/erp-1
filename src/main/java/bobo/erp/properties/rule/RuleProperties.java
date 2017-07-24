package bobo.erp.properties.rule;

import bobo.erp.domain.rule.RuleFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 59814 on 2017/7/20.
 */
@Component
@ConfigurationProperties(prefix = "rule")
public class RuleProperties {

    private String ruleUploader;
    private String ruleAlterTime;
    private Integer ruleUserCount;

    private RuleFactory ruleFactory;

    public RuleProperties() {
    }

    public String getRuleUploader() {
        return ruleUploader;
    }

    public void setRuleUploader(String ruleUploader) {
        this.ruleUploader = ruleUploader;
    }

    public String getRuleAlterTime() {
        return ruleAlterTime;
    }

    public void setRuleAlterTime(String ruleAlterTime) {
        this.ruleAlterTime = ruleAlterTime;
    }

    public Integer getRuleUserCount() {
        return ruleUserCount;
    }

    public void setRuleUserCount(Integer ruleUserCount) {
        this.ruleUserCount = ruleUserCount;
    }

    public RuleFactory getRuleFactory() {
        return ruleFactory;
    }

    public void setRuleFactory(RuleFactory ruleFactory) {
        this.ruleFactory = ruleFactory;
    }
}
