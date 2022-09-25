package top.starshine.commons.converter;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import top.starshine.commons.entity.product.Product;
import top.starshine.commons.entity.shoppingcar.ShoppingCartBo;
import top.starshine.commons.entity.shoppingcar.ShoppingCartVo;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-18T19:03:54+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_172 (Oracle Corporation)"
)
@Component
public class ShoppingCartConverterImpl implements ShoppingCartConverter {

    @Override
    public List<ShoppingCartVo> shoppingCartBosToShoppingCartVos(List<ShoppingCartBo> source) {
        if ( source == null ) {
            return null;
        }

        List<ShoppingCartVo> list = new ArrayList<ShoppingCartVo>( source.size() );
        for ( ShoppingCartBo shoppingCartBo : source ) {
            list.add( shoppingCartBoToShoppingCartVo( shoppingCartBo ) );
        }

        return list;
    }

    @Override
    public ShoppingCartVo shoppingCartBoToShoppingCartVo(ShoppingCartBo source) {
        if ( source == null ) {
            return null;
        }

        ShoppingCartVo shoppingCartVo = new ShoppingCartVo();

        if ( source.getId() != null ) {
            shoppingCartVo.setId( String.valueOf( source.getId() ) );
        }
        shoppingCartVo.setValue( source.getValue() );
        shoppingCartVo.setAmount( source.getAmount() );

        return shoppingCartVo;
    }

    @Override
    public void copyProductToShoppingCartVo(Product source, ShoppingCartVo target) {
        if ( source == null ) {
            return;
        }

        if ( source.getCategoryId() != null ) {
            target.setCategoryId( String.valueOf( source.getCategoryId() ) );
        }
        else {
            target.setCategoryId( null );
        }
        target.setName( source.getName() );
        target.setImageDefUrl( source.getImageDefUrl() );
        target.setPrice( source.getPrice() );
    }
}
