package shoppingplateform.User;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public String hashPassword(String password, String salt) {
//        Random rnd = new Random();
//        char c = (char) (rnd.nextInt(26) + 'a');
//        System.out.println(password+salt);
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        password=password.concat(salt);
        byte[] encodedhash = md.digest((password ).getBytes(StandardCharsets.UTF_8));
        StringBuffer sb = new StringBuffer();
        for (byte b1 : encodedhash) {
            String hex = Integer.toHexString(b1 & 0xff);
            if (hex.length() == 1)
                sb.append('0');
            sb.append(hex);
        }
//        System.out.println(sb.toString());
//        System.out.println();
        return sb.toString();
    }

    public Optional<User> login(User user1) {
        Optional<User> user = userRepository.findByUsernameOrEmail(user1.getUsername(), user1.getUsername());
        if (user.isPresent()) {
            String password = user1.getPassword();
            String salt = user.get().getSalt();
            String pass = hashPassword(password, salt);
            if (pass.equals(user.get().getPassword()))
                return user;
            else
                return null;
        } else
            return null;
    }

}
