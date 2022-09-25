package top.starshine.commons.converter;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import top.starshine.commons.entity.coupon.Coupon;
import top.starshine.commons.entity.coupon.CouponBatchDetail;
import top.starshine.commons.entity.coupon.CouponVo;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-18T19:03:54+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_172 (Oracle Corporation)"
)
@Component
public class CouponConverterImpl implements CouponConverter {

    @Override
    public List<CouponVo> couponBatchDetailsToCouponVos(List<CouponBatchDetail> source) {
        if ( source == null ) {
            return null;
        }

        List<CouponVo> list = new ArrayList<CouponVo>( source.size() );
        for ( CouponBatchDetail couponBatchDetail : source ) {
            list.add( couponBatchDetailToCouponVo( couponBatchDetail ) );
        }

        return list;
    }

    @Override
    public CouponVo couponBatchDetailToCouponVo(CouponBatchDetail source) {
        if ( source == null ) {
            return null;
        }

        CouponVo couponVo = new CouponVo();

        if ( source.getId() != null ) {
            couponVo.setBatchId( String.valueOf( source.getId() ) );
        }
        couponVo.setPrice( source.getPrice() );
        couponVo.setThreshold( source.getThreshold() );
        couponVo.setCouponName( source.getCouponName() );
        couponVo.setDescription( source.getDescription() );
        couponVo.setStartTime( source.getStartTime() );
        couponVo.setEndTime( source.getEndTime() );

        return couponVo;
    }

    @Override
    public List<CouponVo> couponsToCouponVos(List<Coupon> source) {
        if ( source == null ) {
            return null;
        }

        List<CouponVo> list = new ArrayList<CouponVo>( source.size() );
        for ( Coupon coupon : source ) {
            list.add( couponToCouponVo( coupon ) );
        }

        return list;
    }

    @Override
    public CouponVo couponToCouponVo(Coupon source) {
        if ( source == null ) {
            return null;
        }

        CouponVo couponVo = new CouponVo();

        if ( source.getId() != null ) {
            couponVo.setId( String.valueOf( source.getId() ) );
        }
        if ( source.getBatchId() != null ) {
            couponVo.setBatchId( String.valueOf( source.getBatchId() ) );
        }
        couponVo.setPrice( source.getPrice() );
        couponVo.setThreshold( source.getThreshold() );
        couponVo.setCouponName( source.getCouponName() );
        couponVo.setDescription( source.getDescription() );
        couponVo.setStartTime( source.getStartTime() );
        couponVo.setEndTime( source.getEndTime() );

        return couponVo;
    }
}
