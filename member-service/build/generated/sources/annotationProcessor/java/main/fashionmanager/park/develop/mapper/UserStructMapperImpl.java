package fashionmanager.park.develop.mapper;

import fashionmanager.park.develop.menu.DTO.BadgeDTO;
import fashionmanager.park.develop.menu.DTO.UserDTO;
import fashionmanager.park.develop.menu.Entity.Badge;
import fashionmanager.park.develop.menu.Entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-14T10:25:47+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 17.0.3 (ojdkbuild)"
)
@Component
public class UserStructMapperImpl implements UserStructMapper {

    @Override
    public UserDTO toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setUserNum( user.getUserNum() );
        userDTO.setUserId( user.getUserId() );
        userDTO.setUserPwd( user.getUserPwd() );
        userDTO.setUserEmail( user.getUserEmail() );
        userDTO.setUserName( user.getUserName() );
        userDTO.setUserAge( user.getUserAge() );
        userDTO.setUserGender( user.getUserGender() );
        userDTO.setUserMessageAllow( user.getUserMessageAllow() );
        userDTO.setReportCount( user.getReportCount() );
        userDTO.setDailyReportCount( user.getDailyReportCount() );
        userDTO.setBadges( badgeListToBadgeDTOList( user.getBadges() ) );

        return userDTO;
    }

    @Override
    public BadgeDTO toDto(Badge badge) {
        if ( badge == null ) {
            return null;
        }

        BadgeDTO badgeDTO = new BadgeDTO();

        badgeDTO.setBadgeNum( badge.getBadgeNum() );
        badgeDTO.setBadgeName( badge.getBadgeName() );

        return badgeDTO;
    }

    protected List<BadgeDTO> badgeListToBadgeDTOList(List<Badge> list) {
        if ( list == null ) {
            return null;
        }

        List<BadgeDTO> list1 = new ArrayList<BadgeDTO>( list.size() );
        for ( Badge badge : list ) {
            list1.add( toDto( badge ) );
        }

        return list1;
    }
}
