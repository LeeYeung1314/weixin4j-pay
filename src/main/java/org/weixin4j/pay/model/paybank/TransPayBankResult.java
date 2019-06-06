package org.weixin4j.pay.model.paybank;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 企业付款到银行卡结果
 *
 * @author yangqisheng
 */
@XmlRootElement(name = "xml")
public class TransPayBankResult {

    /**
     * 返回状态码
     */
    private String return_code;
    /**
     * 返回信息
     */
    private String return_msg;
    //以下字段在return_code为SUCCESS的时候有返回
    /**
     * 业务结果
     */
    private String result_code;
    /**
     * 错误代码
     */
    private String err_code;
    /**
     * 错误代码描述
     */
    private String err_code_des;
    /**
     * 商户号
     */
    private String mch_id;
    /**
     * 商户企业付款单号
     */
    private String partner_trade_no;
    /**
     * 随机字符串
     */
    private String nonce_str;
    /**
     * 签名
     */
    private String sign;
    //以下字段在return_code 和result_code都为SUCCESS的时候有返回
    /**
     * 微信企业付款单号
     */
    private String payment_no;
    /**
     * 手续费金额
     */
    private String cmms_amt;

    public String getReturn_code() {
        return return_code;
    }

    @XmlElement(name = "return_code")
    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    @XmlElement(name = "return_msg")
    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }

    public String getResult_code() {
        return result_code;
    }

    @XmlElement(name = "result_code")
    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getErr_code() {
        return err_code;
    }

    @XmlElement(name = "err_code")
    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getErr_code_des() {
        return err_code_des;
    }

    @XmlElement(name = "err_code_des")
    public void setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
    }

    public String getMch_id() {
        return mch_id;
    }

    @XmlElement(name = "mch_id")
    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getPartner_trade_no() {
        return partner_trade_no;
    }

    @XmlElement(name = "partner_trade_no")
    public void setPartner_trade_no(String partner_trade_no) {
        this.partner_trade_no = partner_trade_no;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    @XmlElement(name = "nonce_str")
    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    @XmlElement(name = "sign")
    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getPayment_no() {
        return payment_no;
    }

    @XmlElement(name = "payment_no")
    public void setPayment_no(String payment_no) {
        this.payment_no = payment_no;
    }

    public String getCmms_amt() {
        return cmms_amt;
    }

    @XmlElement(name = "cmms_amt")
    public void setCmms_amt(String cmms_amt) {
        this.cmms_amt = cmms_amt;
    }
}
