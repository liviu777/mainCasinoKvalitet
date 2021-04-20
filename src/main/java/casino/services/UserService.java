package casino.services;

import casino.entities.User;
import casino.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Optional;

@Service // declara clasa ca fiind un bean = obiect gestionbat de Spring
public class UserService {

    @Autowired //injecteaza bean-uri in clasa in care te afli
    //doar bean-urile pot fi injectate
    //bean-uri = obiecte gestionate de Spring
    // (gestionat = creaza instante de obiect, injecteaza instantele in clasele in care e folosit @Autowired)
    UserRepository userRepository;
    //UserRepository userRepository=new UserRepository()


    public List<User> findAll() {
        return userRepository.findAll();

    }

    public User findById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId); // Optional - obiect care impacheteaza obiectul Userr
        //ne protejeazqade valorile null returnate in cazul in care nu gaseste User cu id-ul specificat
        User user = optionalUser.get();
        return user;

    }

    public User save(User user) {
        return userRepository.save(user); //saves the user if it has no id or it updates its properties in db if the usera parameter has an id
    }

    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }

    public User findByUsername(String username) {
        List<User> userList = findAll();
        for (int i = 0; i < userList.size(); i++) {
            //userList.get(i) - user-ul curent (elementul curent din lista)
            //if (username == userList.get(i)) )
//            User user = userList.get(i);
//            if (username.equals(user.getUsername()) ){
//                return user;
//            }
            if (username.equals(userList.get(i).getUsername())) {
                return userList.get(i);
            }
        }
       return null;

    }
//    public void save(User user) {
//         userRepository.save(user);
//    }

    //int x = 3;
    //int z = sum(x, 2); // parametri actuali - direct valorile parametrilor de apel
    public int sum(int x, int y) { // parametri formali - delcaratai cutip si nume de variabila

        return x + y;
    }

}
