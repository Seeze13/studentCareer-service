package demo.repository;

import demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// 相当于UserDao
// 将UserRepository继承JpaRepository就可以有对应的增删改查方法
public interface UserRepository extends JpaRepository<User,Integer>{
}
