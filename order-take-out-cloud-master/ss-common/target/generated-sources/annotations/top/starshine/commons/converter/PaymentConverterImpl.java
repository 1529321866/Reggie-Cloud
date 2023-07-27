package top.starshine.commons.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import top.starshine.commons.entity.paymenty.AlipayNotifyVc;
import top.starshine.commons.entity.paymenty.PaymentRecord;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-27T11:55:13+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_371 (Oracle Corporation)"
)
@Component
public class PaymentConverterImpl implements PaymentConverter {

    @Override
    public PaymentRecord alipayNotifyVcToPaymentRecord(AlipayNotifyVc source) {
        if ( source == null ) {
            return null;
        }

        PaymentRecord paymentRecord = new PaymentRecord();

        if ( source.getTotal_amount() != null ) {
            paymentRecord.setTotalAmount( Double.parseDouble( source.getTotal_amount() ) );
        }
        if ( source.getReceipt_amount() != null ) {
            paymentRecord.setReceiptAmount( Double.parseDouble( source.getReceipt_amount() ) );
        }
        if ( source.getInvoice_amount() != null ) {
            paymentRecord.setInvoiceAmount( Double.parseDouble( source.getInvoice_amount() ) );
        }
        if ( source.getBuyer_pay_amount() != null ) {
            paymentRecord.setBuyerPayAmount( Double.parseDouble( source.getBuyer_pay_amount() ) );
        }
        if ( source.getPoint_amount() != null ) {
            paymentRecord.setPointAmount( Double.parseDouble( source.getPoint_amount() ) );
        }
        if ( source.getRefund_fee() != null ) {
            paymentRecord.setRefundFee( Double.parseDouble( source.getRefund_fee() ) );
        }
        paymentRecord.setCharset( source.getCharset() );
        paymentRecord.setMethod( source.getMethod() );
        paymentRecord.setSign( source.getSign() );
        paymentRecord.setAuthAppId( source.getAuth_app_id() );
        paymentRecord.setVersion( source.getVersion() );
        paymentRecord.setSignType( source.getSign_type() );
        paymentRecord.setTradeNo( source.getTrade_no() );
        paymentRecord.setAppId( source.getApp_id() );
        paymentRecord.setOutTradeNo( source.getOut_trade_no() );
        paymentRecord.setOutBizNo( source.getOut_biz_no() );
        paymentRecord.setBuyerId( source.getBuyer_id() );
        paymentRecord.setSellerId( source.getSeller_id() );
        paymentRecord.setTradeStatus( source.getTrade_status() );
        paymentRecord.setNotifyType( source.getNotify_type() );
        paymentRecord.setNotifyId( source.getNotify_id() );
        paymentRecord.setSubject( source.getSubject() );
        paymentRecord.setBody( source.getBody() );
        paymentRecord.setFundBillList( source.getFund_bill_list() );
        paymentRecord.setVocherDetailList( source.getVocher_detail_list() );
        paymentRecord.setPassbackParams( source.getPassback_params() );
        try {
            if ( source.getGmt_create() != null ) {
                paymentRecord.setGmtCreate( new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).parse( source.getGmt_create() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        try {
            if ( source.getGmt_payment() != null ) {
                paymentRecord.setGmtPayment( new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).parse( source.getGmt_payment() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        try {
            if ( source.getGmt_refund() != null ) {
                paymentRecord.setGmtRefund( new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).parse( source.getGmt_refund() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        try {
            if ( source.getGmt_close() != null ) {
                paymentRecord.setGmtClose( new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).parse( source.getGmt_close() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        try {
            if ( source.getTimestamp() != null ) {
                paymentRecord.setTimestamp( new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).parse( source.getTimestamp() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        try {
            if ( source.getNotify_time() != null ) {
                paymentRecord.setNotifyTime( new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).parse( source.getNotify_time() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }

        return paymentRecord;
    }
}
