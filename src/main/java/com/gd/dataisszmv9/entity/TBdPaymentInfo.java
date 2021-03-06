package com.gd.dataisszmv9.entity;

import java.math.BigDecimal;

public class TBdPaymentInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bd_payment_info.pay_way
     *
     * @mbggenerated
     */
    private String payWay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bd_payment_info.pay_flag
     *
     * @mbggenerated
     */
    private String payFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bd_payment_info.pay_name
     *
     * @mbggenerated
     */
    private String payName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bd_payment_info.rate
     *
     * @mbggenerated
     */
    private BigDecimal rate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bd_payment_info.default_amt
     *
     * @mbggenerated
     */
    private BigDecimal defaultAmt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bd_payment_info.acc_flag
     *
     * @mbggenerated
     */
    private String accFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bd_payment_info.jf_flag
     *
     * @mbggenerated
     */
    private String jfFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bd_payment_info.pay_memo
     *
     * @mbggenerated
     */
    private String payMemo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bd_payment_info.pay_way
     *
     * @return the value of t_bd_payment_info.pay_way
     *
     * @mbggenerated
     */
    public String getPayWay() {
        return payWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bd_payment_info.pay_way
     *
     * @param payWay the value for t_bd_payment_info.pay_way
     *
     * @mbggenerated
     */
    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bd_payment_info.pay_flag
     *
     * @return the value of t_bd_payment_info.pay_flag
     *
     * @mbggenerated
     */
    public String getPayFlag() {
        return payFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bd_payment_info.pay_flag
     *
     * @param payFlag the value for t_bd_payment_info.pay_flag
     *
     * @mbggenerated
     */
    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag == null ? null : payFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bd_payment_info.pay_name
     *
     * @return the value of t_bd_payment_info.pay_name
     *
     * @mbggenerated
     */
    public String getPayName() {
        return payName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bd_payment_info.pay_name
     *
     * @param payName the value for t_bd_payment_info.pay_name
     *
     * @mbggenerated
     */
    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bd_payment_info.rate
     *
     * @return the value of t_bd_payment_info.rate
     *
     * @mbggenerated
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bd_payment_info.rate
     *
     * @param rate the value for t_bd_payment_info.rate
     *
     * @mbggenerated
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bd_payment_info.default_amt
     *
     * @return the value of t_bd_payment_info.default_amt
     *
     * @mbggenerated
     */
    public BigDecimal getDefaultAmt() {
        return defaultAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bd_payment_info.default_amt
     *
     * @param defaultAmt the value for t_bd_payment_info.default_amt
     *
     * @mbggenerated
     */
    public void setDefaultAmt(BigDecimal defaultAmt) {
        this.defaultAmt = defaultAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bd_payment_info.acc_flag
     *
     * @return the value of t_bd_payment_info.acc_flag
     *
     * @mbggenerated
     */
    public String getAccFlag() {
        return accFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bd_payment_info.acc_flag
     *
     * @param accFlag the value for t_bd_payment_info.acc_flag
     *
     * @mbggenerated
     */
    public void setAccFlag(String accFlag) {
        this.accFlag = accFlag == null ? null : accFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bd_payment_info.jf_flag
     *
     * @return the value of t_bd_payment_info.jf_flag
     *
     * @mbggenerated
     */
    public String getJfFlag() {
        return jfFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bd_payment_info.jf_flag
     *
     * @param jfFlag the value for t_bd_payment_info.jf_flag
     *
     * @mbggenerated
     */
    public void setJfFlag(String jfFlag) {
        this.jfFlag = jfFlag == null ? null : jfFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bd_payment_info.pay_memo
     *
     * @return the value of t_bd_payment_info.pay_memo
     *
     * @mbggenerated
     */
    public String getPayMemo() {
        return payMemo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bd_payment_info.pay_memo
     *
     * @param payMemo the value for t_bd_payment_info.pay_memo
     *
     * @mbggenerated
     */
    public void setPayMemo(String payMemo) {
        this.payMemo = payMemo == null ? null : payMemo.trim();
    }
}