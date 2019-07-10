package com.gd.dataisszmv9.scheduled;

import com.alibaba.fastjson.JSONObject;
import com.gd.dataisszmv9.service.UpdateDateService;
import com.gd.dataisszmv9.utils.HttpTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: He Wenbo
 * @Date: 2019/6/26
 * @Description:
 */
@Component
public class ScheduledTasks {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UpdateDateService updateDateService;

    @Value("${actionToken}")
    private String token;

    private static final String updateCashierUrl = "http://39.96.78.91/gd-data-up/update/updateModeCashier";
    private static final String updateItemBrandUrl = "http://39.96.78.91/gd-data-up/update/updateModeItemBrand";
    private static final String updateIModeItemClsUrl = "http://39.96.78.91/gd-data-up/update/updateModeItemCls";
    private static final String updateSaleManUrl = "http://39.96.78.91/gd-data-up/update/updateModeSaleMan";
    private static final String updateSupcustInfoUrl = "http://39.96.78.91/gd-data-up/update/updateModeSupcustInfo";
    private static final String updateModePaymentInfoUrl = "http://39.96.78.91/gd-data-up/update/updateModePaymentInfo";
    private static final String updateModeRechargeRecordUrl = "http://39.96.78.91/gd-data-up/update/updateModeRechargeRecord";
    private static final String updateModeSaleFlowUrl = "http://39.96.78.91/gd-data-up/update/updateModeSaleFlow";
    private static final String updateModeCardPaylistUrl = "http://39.96.78.91/gd-data-up/update/updateModeCardPaylist";
    private static final String updateModeVipInfoUrl = "http://39.96.78.91/gd-data-up/update/updateModeVipInfo";
    private static final String updateModeItemInfoUrl = "http://39.96.78.91/gd-data-up/update/updateModeItemInfo";
    private static final String updateModeItemStockUrl = "http://39.96.78.91/gd-data-up/update/updateModeItemStock";
    private static final String updateModePayFlowUrl = "http://39.96.78.91/gd-data-up/update/updateModePayFlow";
    private static final String updateBranchInfoUrl = "http://39.96.78.91/gd-data-up/update/updateModeBranchInfo";

    private static final String getModeRechargeRecordIDUrl =  "http://39.96.78.91/gd-data-up/lastUpdate/getModeRechargeRecordLastFlowId";
    private static final String getModePayFlowDateUrl = "http://39.96.78.91/gd-data-up/lastUpdate/getModePayFlowLastOperDate";
    private static final String getModeSaleFlowDateUrl = "http://39.96.78.91/gd-data-up/lastUpdate/getModeSaleFlowLastOperDate";
    private static final String getModeCarPayDateUrl = "http://39.96.78.91/gd-data-up/lastUpdate/getModeCardPaylistLastTime";

    /**
     * Cashier
     */
    @Scheduled(initialDelay = 5000,fixedDelay = 180000)
    @Async
    public void updateModeCashier() {
        String cashierList = updateDateService.queryCashierList();
        logger.info("查询到Cashier结果:{}", JSONObject.toJSONString(cashierList));
        String result = HttpTools.sendPost(updateCashierUrl, cashierList, token);
        logger.info("发送Cashier post结果:{}", result);
    }

    @Scheduled(initialDelay = 7000,fixedDelay = 180000)
    @Async
    public void updateItemBrand() {
        String brands = updateDateService.queryBrandList();
        logger.info("查询到brands结果:{}", JSONObject.toJSONString(brands));
        String result = HttpTools.sendPost(updateItemBrandUrl, brands, token);
        logger.info("发送brands post结果:{}", result);
    }
    @Scheduled(initialDelay = 9000,fixedDelay = 180000)
    @Async
    public void updateIModeItemCls() {
        String itemCls = updateDateService.queryModeItemCls();
        logger.info("查询到ItemCls结果:{}", JSONObject.toJSONString(itemCls));
        String result = HttpTools.sendPost(updateIModeItemClsUrl, itemCls, token);
        logger.info("发送ItemCls post结果:{}", result);
    }

    @Scheduled(initialDelay = 9000,fixedDelay = 180000)
    @Async
    public void updateSaleMans() {
        String saleManList = updateDateService.queryModeSaleMan();
        logger.info("查询到saleManList结果:{}", JSONObject.toJSONString(saleManList));
        String result = HttpTools.sendPost(updateSaleManUrl, saleManList, token);
        logger.info("发送saleManList post结果:{}", result);
    }

    @Scheduled(initialDelay = 11000,fixedDelay = 180000)
    @Async
    public void updateSupcus() {
        String supcustInfo = updateDateService.querySupcustInfo();
        logger.info("查询到supcustInfo结果:{}", JSONObject.toJSONString(supcustInfo));
        String result = HttpTools.sendPost(updateSupcustInfoUrl, supcustInfo, token);
        logger.info("发送supcustInfo post结果:{}", result);
    }

    @Scheduled(initialDelay = 13000,fixedDelay = 180000)
    @Async
    public void updateModePaymentInfo() {
        String  paymentInfos= updateDateService.queryDataPayment();
        logger.info("查询到paymentInfos结果:{}", JSONObject.toJSONString(paymentInfos));
        String result = HttpTools.sendPost(updateModePaymentInfoUrl, paymentInfos, token);
        logger.info("发送paymentInfos post结果:{}", result);
    }

    @Scheduled(initialDelay = 13000,fixedDelay = 180000)
    @Async
    public void updateModeRechargeRecord() {
        String str = HttpTools.sendGet(getModeRechargeRecordIDUrl , token);
        logger.info("查询最新的充值flowid结果:{}", str);
        JSONObject jsonObject = JSONObject.parseObject(str);
        String flowId = jsonObject.getString("data");
        String rechargeRecords= updateDateService.queryVisaFlow(flowId.equals("-1")? null: new BigDecimal(flowId));
        logger.info("查询到rechargeRecords结果:{}", JSONObject.toJSONString(rechargeRecords));
        if(rechargeRecords.length() > 2) {
            String result = HttpTools.sendPost(updateModeRechargeRecordUrl, rechargeRecords, token);
            logger.info("发送rechargeRecords post结果:{}", result);
        }
    }
    @Scheduled(initialDelay = 15000,fixedDelay = 180000)
    @Async
    public void updateModeSaleFlow() {
        String str = HttpTools.sendGet(getModeSaleFlowDateUrl , token);
        JSONObject jsonObject = JSONObject.parseObject(str);
        Date date;
        if(jsonObject.getString("data").equals("-1")){
            date = null;
        }else {
            date = jsonObject.getDate("data");
        }
        logger.info("查询最新销售流水时间date结果:{},{}", str, JSONObject.toJSONString(date));
        String  updateModeSales= updateDateService.querySaleDetail(date);
        logger.info("查询到updateModeSales结果:{}", JSONObject.toJSONString(updateModeSales));
        if(updateModeSales.length() > 2) {
            String result = HttpTools.sendPost(updateModeSaleFlowUrl, updateModeSales, token);
            logger.info("发送updateModeSales post结果:{}", result);
        }
    }

    @Scheduled(initialDelay = 17000,fixedDelay = 180000)
    @Async
    public void updateModeCardPaylist() {
        String str = HttpTools.sendGet(getModeCarPayDateUrl , token);
        JSONObject jsonObject = JSONObject.parseObject(str);
        Date date;
        if(jsonObject.getString("data").equals("-1")){
            date = null;
        }else {
            date = jsonObject.getDate("data");
        }
        logger.info("查询最新会员卡支付流水时间date结果:{},{}", str, JSONObject.toJSONString(date));
        String  modeCardPaylist= updateDateService.queryCardPaylist(date);
        logger.info("查询到updateModeCardPaylist结果:{}", JSONObject.toJSONString(modeCardPaylist));
        if(modeCardPaylist.length() > 2) {
            String result = HttpTools.sendPost(updateModeCardPaylistUrl, modeCardPaylist, token);
            logger.info("发送updateModeCardPaylist post结果:{}", result);
        }
    }

    @Scheduled(initialDelay = 19000,fixedDelay = 180000)
    @Async
    public void updateModeVipInfo() {
        String  vipInfos= updateDateService.queryVipInfo();
        logger.info("查询到vipInfos结果:{}", JSONObject.toJSONString(vipInfos));
        String result = HttpTools.sendPost(updateModeVipInfoUrl, vipInfos, token);
        logger.info("发送vipInfoss post结果:{}", result);
    }

    @Scheduled(initialDelay = 21000,fixedDelay = 180000)
    @Async
    public void updateModeItemInfo() {
        String  itemInfo= updateDateService.queryItemInfo();
        logger.info("查询到itemInfo结果:{}", JSONObject.toJSONString(itemInfo));
        if(itemInfo.length() > 2) {
            String result = HttpTools.sendPost(updateModeItemInfoUrl, itemInfo, token);
            logger.info("发送itemInfo post结果:{}", result);
        }
    }

    @Scheduled(initialDelay = 21000,fixedDelay = 180000)
    @Async
    public void updateModeItemStock() {
        String  itemStocks= updateDateService.queryItemStock();
        logger.info("查询到itemStocks结果:{}", JSONObject.toJSONString(itemStocks));
        String result = HttpTools.sendPost(updateModeItemStockUrl, itemStocks, token);
        logger.info("发送itemStocks post结果:{}", result);
    }

    @Scheduled(initialDelay = 21000,fixedDelay = 180000)
    @Async
    public void updateModePayFlow() {
        String str = HttpTools.sendGet(getModePayFlowDateUrl , token);
        JSONObject jsonObject = JSONObject.parseObject(str);
        Date date;
        if(jsonObject.getString("data").equals("-1")){
            date = null;
        }else {
            date = jsonObject.getDate("data");
        }
        logger.info("查询最新支付时间date结果:{},{}", str, JSONObject.toJSONString(date));
        String  orderDetail= updateDateService.queryOrderDetail(date);
        logger.info("查询到orderDetail结果:{}", JSONObject.toJSONString(orderDetail));
        if(orderDetail.length() > 2) {
            String result = HttpTools.sendPost(updateModePayFlowUrl, orderDetail, token);
            logger.info("发送orderDetail post结果:{}", result);
        }
    }

    @Scheduled(initialDelay = 23000,fixedDelay = 180000)
    @Async
    public void updateBranchInfo() {
        String  branchInfoList= updateDateService.queryBranchInfoList();
        logger.info("查询到BranchInfo结果:{}", JSONObject.toJSONString(branchInfoList));
        if(branchInfoList.length() > 2) {
            String result = HttpTools.sendPost(updateBranchInfoUrl, branchInfoList, token);
            logger.info("发送BranchInfo post结果:{}", result);
        }
    }

}
