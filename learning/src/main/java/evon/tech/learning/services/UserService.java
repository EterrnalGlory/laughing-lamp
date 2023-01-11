package evon.tech.learning.services;

import java.util.List;

import evon.tech.learning.dtos.UserDto;

public interface UserService {
    //create

   UserDto createUser( UserDto userDto);
    // update

    UserDto updateUser( UserDto userDto, String userId);
    
    //delete

    void deleteUser(String userId);


    //getall user

    List<UserDto> getAllUSer();

    //get single user by id


    UserDto getUserId(String userId);

    //get single by email

    UserDto getUserBy(String email);


    //search user

    List<UserDto> searchUser(String keyword);

    //other user specific details
}
