package store.account;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountModel, String>  {

    // derived query: WHERE email = ? AND password_sha256 = ?
    Optional<AccountModel> findByEmailAndPasswordSha256(
        String email,
        String passwordSha256
    );

}
