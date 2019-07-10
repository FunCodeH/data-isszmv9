package com.gd.dataisszmv9.service;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: wenbo.he
 * @Date: 2019/6/25
 * @Description:
 */
public interface UpdateDateService {
    String  queryCashierList();

    String queryBrandList();

    String queryModeItemCls();

    String queryModeSaleMan();

    String querySupcustInfo();

    String queryDataPayment();

    String queryVisaFlow(BigDecimal flowId);

    String querySaleDetail(Date date);

    String queryCardPaylist(Date date);

    String queryVipInfo();

    String queryItemInfo();

    String queryItemStock();

    String queryOrderDetail(Date date);

    String queryBranchInfoList();
}
