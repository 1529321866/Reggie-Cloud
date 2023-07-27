package top.starshine.commons.converter;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import top.starshine.commons.entity.order.ChildOrderDetail;
import top.starshine.commons.entity.order.ChildOrderDetailVo;
import top.starshine.commons.entity.order.OrderDetail;
import top.starshine.commons.entity.order.OrderDetailVo;
import top.starshine.commons.entity.order.RefundRecord;
import top.starshine.commons.entity.order.TradeRefundApplicationVc;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-27T11:55:13+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_371 (Oracle Corporation)"
)
@Component
public class OrderConverterImpl implements OrderConverter {

    @Override
    public OrderDetailVo orderDetailToOrderDetailVo(OrderDetail source) {
        if ( source == null ) {
            return null;
        }

        OrderDetailVo orderDetailVo = new OrderDetailVo();

        if ( source.getId() != null ) {
            orderDetailVo.setId( String.valueOf( source.getId() ) );
        }
        orderDetailVo.setStatus( source.getStatus() );
        orderDetailVo.setOriginalPrice( source.getOriginalPrice() );
        orderDetailVo.setFreightPrice( source.getFreightPrice() );
        orderDetailVo.setCouponPrice( source.getCouponPrice() );
        orderDetailVo.setProductTotalNumber( source.getProductTotalNumber() );
        orderDetailVo.setBillPrice( source.getBillPrice() );
        orderDetailVo.setOutTradeNo( source.getOutTradeNo() );
        orderDetailVo.setRemark( source.getRemark() );
        orderDetailVo.setPhoneNumber( source.getPhoneNumber() );
        orderDetailVo.setConsigneeName( source.getConsigneeName() );
        orderDetailVo.setDetail( source.getDetail() );
        orderDetailVo.setSex( source.getSex() );
        orderDetailVo.setLabel( source.getLabel() );

        return orderDetailVo;
    }

    @Override
    public ChildOrderDetailVo childOrderDetailToChildOrderDetailVo(ChildOrderDetail source) {
        if ( source == null ) {
            return null;
        }

        ChildOrderDetailVo childOrderDetailVo = new ChildOrderDetailVo();

        childOrderDetailVo.setName( source.getName() );
        childOrderDetailVo.setValue( source.getValue() );
        childOrderDetailVo.setImageDefUrl( source.getImageDefUrl() );
        childOrderDetailVo.setPrice( source.getPrice() );
        childOrderDetailVo.setAmount( source.getAmount() );

        return childOrderDetailVo;
    }

    @Override
    public RefundRecord tradeRefundApplicationVcToTradeRefund(TradeRefundApplicationVc source) {
        if ( source == null ) {
            return null;
        }

        RefundRecord refundRecord = new RefundRecord();

        refundRecord.setOrderId( source.getOrderId() );
        refundRecord.setBuyerName( source.getBuyerName() );
        refundRecord.setBuyerPhoneNumber( source.getBuyerPhoneNumber() );
        refundRecord.setBuyerReason( source.getBuyerReason() );

        return refundRecord;
    }
}
