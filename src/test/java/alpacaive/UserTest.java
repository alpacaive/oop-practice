package alpacaive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드 초기화한다.")
    @Test
    void passwordTest() {
        // given
        User user = new User();

        // when
//        user.initPassword(new CorrectFixedPasswordGenerator());
        user.initPassword(() -> "abcdefgh"); // FunctionalInterface 를 구현한 구현체이기 때문에 가능

        // then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test
    void passwordTest2() {
        // given
        User user = new User();

        // when
//        user.initPassword(new WrongFixedPasswordGenerator());
        user.initPassword(() -> "ab"); // FunctionalInterface 를 구현한 구현체이기 때문에 가능

        // then
        assertThat(user.getPassword()).isNull();
    }
}