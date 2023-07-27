package top.starshine.commons.converter;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import top.starshine.commons.entity.product.Attributes;
import top.starshine.commons.entity.product.AttributesDto;
import top.starshine.commons.entity.product.AttributesVo;
import top.starshine.commons.entity.product.Category;
import top.starshine.commons.entity.product.CategoryVo;
import top.starshine.commons.entity.product.Product;
import top.starshine.commons.entity.product.ProductVo;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-27T11:55:13+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_371 (Oracle Corporation)"
)
@Component
public class ProductConverterImpl implements ProductConverter {

    @Override
    public List<CategoryVo> categorysToCategoryVos(List<Category> source) {
        if ( source == null ) {
            return null;
        }

        List<CategoryVo> list = new ArrayList<CategoryVo>( source.size() );
        for ( Category category : source ) {
            list.add( categoryToCategoryVo( category ) );
        }

        return list;
    }

    @Override
    public CategoryVo categoryToCategoryVo(Category source) {
        if ( source == null ) {
            return null;
        }

        CategoryVo categoryVo = new CategoryVo();

        if ( source.getId() != null ) {
            categoryVo.setId( String.valueOf( source.getId() ) );
        }
        categoryVo.setType( source.getType() );
        categoryVo.setDescription( source.getDescription() );
        categoryVo.setName( source.getName() );

        return categoryVo;
    }

    @Override
    public List<ProductVo> productsToProductVos(List<Product> source) {
        if ( source == null ) {
            return null;
        }

        List<ProductVo> list = new ArrayList<ProductVo>( source.size() );
        for ( Product product : source ) {
            list.add( productToProductVo( product ) );
        }

        return list;
    }

    @Override
    public ProductVo productToProductVo(Product source) {
        if ( source == null ) {
            return null;
        }

        ProductVo productVo = new ProductVo();

        if ( source.getId() != null ) {
            productVo.setId( String.valueOf( source.getId() ) );
        }
        if ( source.getCategoryId() != null ) {
            productVo.setCategoryId( String.valueOf( source.getCategoryId() ) );
        }
        productVo.setName( source.getName() );
        productVo.setDescription( source.getDescription() );
        productVo.setImageDefUrl( source.getImageDefUrl() );
        productVo.setPrice( source.getPrice() );

        return productVo;
    }

    @Override
    public AttributesVo attributesToAttributesVo(Attributes source) {
        if ( source == null ) {
            return null;
        }

        AttributesVo attributesVo = new AttributesVo();

        if ( source.getId() != null ) {
            attributesVo.setId( String.valueOf( source.getId() ) );
        }
        attributesVo.setName( source.getName() );
        attributesVo.setValue( source.getValue() );
        attributesVo.setDefValueIndex( source.getDefValueIndex() );
        attributesVo.setDescription( source.getDescription() );

        return attributesVo;
    }

    @Override
    public List<AttributesVo> attributesDtosToAttributesVos(List<AttributesDto> source) {
        if ( source == null ) {
            return null;
        }

        List<AttributesVo> list = new ArrayList<AttributesVo>( source.size() );
        for ( AttributesDto attributesDto : source ) {
            list.add( attributesDtoToAttributesVo( attributesDto ) );
        }

        return list;
    }

    @Override
    public AttributesVo attributesDtoToAttributesVo(AttributesDto source) {
        if ( source == null ) {
            return null;
        }

        AttributesVo attributesVo = new AttributesVo();

        if ( source.getId() != null ) {
            attributesVo.setId( String.valueOf( source.getId() ) );
        }
        attributesVo.setName( source.getName() );
        attributesVo.setValue( source.getValue() );
        attributesVo.setDefValueIndex( source.getDefValueIndex() );
        attributesVo.setDescription( source.getDescription() );

        return attributesVo;
    }
}
