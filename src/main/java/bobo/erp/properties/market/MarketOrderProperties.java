package bobo.erp.properties.market;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 59814 on 2017/7/23.
 */
@Component
@ConfigurationProperties(prefix = "marketOrder")
public class MarketOrderProperties {
    public MarketOrderProperties() {
    }
    private Integer marketSeriesId;     //市场系列id

    private Integer orderYear;          //年份
    private Integer orderArea;          //区域
    private Integer orderProduct;       //产品Id
    private Integer orderQuantity;      //数量
    private Double orderTotalPrice;    //总价
    private Integer orderDeliveryTime;  //交货期
    private Integer orderAccountPeriod; //账期
    private Integer orderQualificate;   //订单要求

    public Integer getMarketSeriesId() {
        return marketSeriesId;
    }

    public void setMarketSeriesId(Integer marketSeriesId) {
        this.marketSeriesId = marketSeriesId;
    }

    public Integer getOrderYear() {
        return orderYear;
    }

    public void setOrderYear(Integer orderYear) {
        this.orderYear = orderYear;
    }

    public Integer getOrderArea() {
        return orderArea;
    }

    public void setOrderArea(Integer orderArea) {
        this.orderArea = orderArea;
    }

    public Integer getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(Integer orderProduct) {
        this.orderProduct = orderProduct;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public Integer getOrderDeliveryTime() {
        return orderDeliveryTime;
    }

    public void setOrderDeliveryTime(Integer orderDeliveryTime) {
        this.orderDeliveryTime = orderDeliveryTime;
    }

    public Integer getOrderAccountPeriod() {
        return orderAccountPeriod;
    }

    public void setOrderAccountPeriod(Integer orderAccountPeriod) {
        this.orderAccountPeriod = orderAccountPeriod;
    }

    public Integer getOrderQualificate() {
        return orderQualificate;
    }

    public void setOrderQualificate(Integer orderQualificate) {
        this.orderQualificate = orderQualificate;
    }
}
