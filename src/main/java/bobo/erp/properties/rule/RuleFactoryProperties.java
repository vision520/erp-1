package bobo.erp.properties.rule;

import bobo.erp.domain.rule.Rule;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 59814 on 2017/7/20.
 */
@Component
@ConfigurationProperties(prefix = "ruleFactory")
public class RuleFactoryProperties {
    public RuleFactoryProperties() {
    }
    private Rule rule;

    private String factory1Name;
    private Double factory1BuyPrice;
    private Double factory1RentPrice;
    private Double factory1SalePrice;
    private Integer factory1Volume;
    private Integer factory1Limit;
    private Integer factory1Score;

    private String factory2Name;
    private Double factory2BuyPrice;
    private Double factory2RentPrice;
    private Double factory2SalePrice;
    private Integer factory2Volume;
    private Integer factory2Limit;
    private Integer factory2Score;

    private String factory3Name;
    private Double factory3BuyPrice;
    private Double factory3RentPrice;
    private Double factory3SalePrice;
    private Integer factory3Volume;
    private Integer factory3Limit;
    private Integer factory3Score;

    private String factory4Name;
    private Double factory4BuyPrice;
    private Double factory4RentPrice;
    private Double factory4SalePrice;
    private Integer factory4Volume;
    private Integer factory4Limit;
    private Integer factory4Score;

    private String factory5Name;
    private Double factory5BuyPrice;
    private Double factory5RentPrice;
    private Double factory5SalePrice;
    private Integer factory5Volume;
    private Integer factory5Limit;
    private Integer factory5Score;

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public String getFactory1Name() {
        return factory1Name;
    }

    public void setFactory1Name(String factory1Name) {
        this.factory1Name = factory1Name;
    }

    public Double getFactory1BuyPrice() {
        return factory1BuyPrice;
    }

    public void setFactory1BuyPrice(Double factory1BuyPrice) {
        this.factory1BuyPrice = factory1BuyPrice;
    }

    public Double getFactory1RentPrice() {
        return factory1RentPrice;
    }

    public void setFactory1RentPrice(Double factory1RentPrice) {
        this.factory1RentPrice = factory1RentPrice;
    }

    public Double getFactory1SalePrice() {
        return factory1SalePrice;
    }

    public void setFactory1SalePrice(Double factory1SalePrice) {
        this.factory1SalePrice = factory1SalePrice;
    }

    public Integer getFactory1Volume() {
        return factory1Volume;
    }

    public void setFactory1Volume(Integer factory1Volume) {
        this.factory1Volume = factory1Volume;
    }

    public Integer getFactory1Limit() {
        return factory1Limit;
    }

    public void setFactory1Limit(Integer factory1Limit) {
        this.factory1Limit = factory1Limit;
    }

    public Integer getFactory1Score() {
        return factory1Score;
    }

    public void setFactory1Score(Integer factory1Score) {
        this.factory1Score = factory1Score;
    }

    public String getFactory2Name() {
        return factory2Name;
    }

    public void setFactory2Name(String factory2Name) {
        this.factory2Name = factory2Name;
    }

    public Double getFactory2BuyPrice() {
        return factory2BuyPrice;
    }

    public void setFactory2BuyPrice(Double factory2BuyPrice) {
        this.factory2BuyPrice = factory2BuyPrice;
    }

    public Double getFactory2RentPrice() {
        return factory2RentPrice;
    }

    public void setFactory2RentPrice(Double factory2RentPrice) {
        this.factory2RentPrice = factory2RentPrice;
    }

    public Double getFactory2SalePrice() {
        return factory2SalePrice;
    }

    public void setFactory2SalePrice(Double factory2SalePrice) {
        this.factory2SalePrice = factory2SalePrice;
    }

    public Integer getFactory2Volume() {
        return factory2Volume;
    }

    public void setFactory2Volume(Integer factory2Volume) {
        this.factory2Volume = factory2Volume;
    }

    public Integer getFactory2Limit() {
        return factory2Limit;
    }

    public void setFactory2Limit(Integer factory2Limit) {
        this.factory2Limit = factory2Limit;
    }

    public Integer getFactory2Score() {
        return factory2Score;
    }

    public void setFactory2Score(Integer factory2Score) {
        this.factory2Score = factory2Score;
    }

    public String getFactory3Name() {
        return factory3Name;
    }

    public void setFactory3Name(String factory3Name) {
        this.factory3Name = factory3Name;
    }

    public Double getFactory3BuyPrice() {
        return factory3BuyPrice;
    }

    public void setFactory3BuyPrice(Double factory3BuyPrice) {
        this.factory3BuyPrice = factory3BuyPrice;
    }

    public Double getFactory3RentPrice() {
        return factory3RentPrice;
    }

    public void setFactory3RentPrice(Double factory3RentPrice) {
        this.factory3RentPrice = factory3RentPrice;
    }

    public Double getFactory3SalePrice() {
        return factory3SalePrice;
    }

    public void setFactory3SalePrice(Double factory3SalePrice) {
        this.factory3SalePrice = factory3SalePrice;
    }

    public Integer getFactory3Volume() {
        return factory3Volume;
    }

    public void setFactory3Volume(Integer factory3Volume) {
        this.factory3Volume = factory3Volume;
    }

    public Integer getFactory3Limit() {
        return factory3Limit;
    }

    public void setFactory3Limit(Integer factory3Limit) {
        this.factory3Limit = factory3Limit;
    }

    public Integer getFactory3Score() {
        return factory3Score;
    }

    public void setFactory3Score(Integer factory3Score) {
        this.factory3Score = factory3Score;
    }

    public String getFactory4Name() {
        return factory4Name;
    }

    public void setFactory4Name(String factory4Name) {
        this.factory4Name = factory4Name;
    }

    public Double getFactory4BuyPrice() {
        return factory4BuyPrice;
    }

    public void setFactory4BuyPrice(Double factory4BuyPrice) {
        this.factory4BuyPrice = factory4BuyPrice;
    }

    public Double getFactory4RentPrice() {
        return factory4RentPrice;
    }

    public void setFactory4RentPrice(Double factory4RentPrice) {
        this.factory4RentPrice = factory4RentPrice;
    }

    public Double getFactory4SalePrice() {
        return factory4SalePrice;
    }

    public void setFactory4SalePrice(Double factory4SalePrice) {
        this.factory4SalePrice = factory4SalePrice;
    }

    public Integer getFactory4Volume() {
        return factory4Volume;
    }

    public void setFactory4Volume(Integer factory4Volume) {
        this.factory4Volume = factory4Volume;
    }

    public Integer getFactory4Limit() {
        return factory4Limit;
    }

    public void setFactory4Limit(Integer factory4Limit) {
        this.factory4Limit = factory4Limit;
    }

    public Integer getFactory4Score() {
        return factory4Score;
    }

    public void setFactory4Score(Integer factory4Score) {
        this.factory4Score = factory4Score;
    }

    public String getFactory5Name() {
        return factory5Name;
    }

    public void setFactory5Name(String factory5Name) {
        this.factory5Name = factory5Name;
    }

    public Double getFactory5BuyPrice() {
        return factory5BuyPrice;
    }

    public void setFactory5BuyPrice(Double factory5BuyPrice) {
        this.factory5BuyPrice = factory5BuyPrice;
    }

    public Double getFactory5RentPrice() {
        return factory5RentPrice;
    }

    public void setFactory5RentPrice(Double factory5RentPrice) {
        this.factory5RentPrice = factory5RentPrice;
    }

    public Double getFactory5SalePrice() {
        return factory5SalePrice;
    }

    public void setFactory5SalePrice(Double factory5SalePrice) {
        this.factory5SalePrice = factory5SalePrice;
    }

    public Integer getFactory5Volume() {
        return factory5Volume;
    }

    public void setFactory5Volume(Integer factory5Volume) {
        this.factory5Volume = factory5Volume;
    }

    public Integer getFactory5Limit() {
        return factory5Limit;
    }

    public void setFactory5Limit(Integer factory5Limit) {
        this.factory5Limit = factory5Limit;
    }

    public Integer getFactory5Score() {
        return factory5Score;
    }

    public void setFactory5Score(Integer factory5Score) {
        this.factory5Score = factory5Score;
    }
}
