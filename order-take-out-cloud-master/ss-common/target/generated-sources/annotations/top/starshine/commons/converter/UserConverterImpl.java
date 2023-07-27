package top.starshine.commons.converter;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import top.starshine.commons.entity.user.User;
import top.starshine.commons.entity.user.UserAddressBook;
import top.starshine.commons.entity.user.UserAddressBookUpdateVc;
import top.starshine.commons.entity.user.UserAddressBookVc;
import top.starshine.commons.entity.user.UserAddressBookVo;
import top.starshine.commons.entity.user.UserVo;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-27T11:55:13+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_371 (Oracle Corporation)"
)
@Component
public class UserConverterImpl implements UserConverter {

    @Override
    public UserVo userToUserVo(User source) {
        if ( source == null ) {
            return null;
        }

        UserVo userVo = new UserVo();

        if ( source.getId() != null ) {
            userVo.setId( String.valueOf( source.getId() ) );
        }
        userVo.setAvatar( source.getAvatar() );
        userVo.setNickname( source.getNickname() );
        userVo.setPhoneNumber( source.getPhoneNumber() );
        userVo.setDescription( source.getDescription() );
        userVo.setEmail( source.getEmail() );
        userVo.setSex( source.getSex() );

        return userVo;
    }

    @Override
    public List<UserAddressBookVo> userAddressBooksToUserAddressBookVos(List<UserAddressBook> source) {
        if ( source == null ) {
            return null;
        }

        List<UserAddressBookVo> list = new ArrayList<UserAddressBookVo>( source.size() );
        for ( UserAddressBook userAddressBook : source ) {
            list.add( userAddressBookToUserAddressBookVo( userAddressBook ) );
        }

        return list;
    }

    @Override
    public UserAddressBookVo userAddressBookToUserAddressBookVo(UserAddressBook source) {
        if ( source == null ) {
            return null;
        }

        UserAddressBookVo userAddressBookVo = new UserAddressBookVo();

        if ( source.getId() != null ) {
            userAddressBookVo.setId( String.valueOf( source.getId() ) );
        }
        userAddressBookVo.setConsigneeName( source.getConsigneeName() );
        userAddressBookVo.setPhoneNumber( source.getPhoneNumber() );
        userAddressBookVo.setSex( source.getSex() );
        userAddressBookVo.setDetail( source.getDetail() );
        userAddressBookVo.setLabel( source.getLabel() );
        userAddressBookVo.setIsDefault( source.getIsDefault() );

        return userAddressBookVo;
    }

    @Override
    public UserAddressBook userAddressBookVcToUserAddressBook(UserAddressBookVc source) {
        if ( source == null ) {
            return null;
        }

        UserAddressBook userAddressBook = new UserAddressBook();

        userAddressBook.setConsigneeName( source.getConsigneeName() );
        userAddressBook.setPhoneNumber( source.getPhoneNumber() );
        userAddressBook.setSex( source.getSex() );
        userAddressBook.setDetail( source.getDetail() );
        userAddressBook.setLabel( source.getLabel() );
        userAddressBook.setIsDefault( source.getIsDefault() );

        return userAddressBook;
    }

    @Override
    public UserAddressBook userAddressBookUpdateVcToUserAddressBook(UserAddressBookUpdateVc source) {
        if ( source == null ) {
            return null;
        }

        UserAddressBook userAddressBook = new UserAddressBook();

        userAddressBook.setId( source.getId() );
        userAddressBook.setConsigneeName( source.getConsigneeName() );
        userAddressBook.setPhoneNumber( source.getPhoneNumber() );
        userAddressBook.setSex( source.getSex() );
        userAddressBook.setDetail( source.getDetail() );
        userAddressBook.setLabel( source.getLabel() );
        userAddressBook.setIsDefault( source.getIsDefault() );

        return userAddressBook;
    }
}
