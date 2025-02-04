package lotto.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WinningTest {

    @DisplayName("당첨 번호의 개수가 6개가 넘어가면 예외가 발생한다")
    @Test
    void 당첨_번호의_개수가_6개가_넘어가면_예외가_발생한다() {
        assertThatThrownBy(() -> new Winning(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("당첨 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void 당첨_번호에_중복된_숫자가_있으면_예외가_발생한다() {
        assertThatThrownBy(() -> new Winning(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("당첨 번호에 범위에 맞지않는 숫자가 있으면 예외가 발생한다.")
    @Test
    void 당첨_번호에_범위에_맞지않는_숫자가_있으면_예외가_발생한다() {
        assertThatThrownBy(() -> new Winning(List.of(1, 2, 3, 4, 5, 90)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("당첨 번호에 음수가 있으면 예외가 발생한다.")
    @Test
    void 당첨_번호에_음수가_있으면_예외가_발생한다() {
        assertThatThrownBy(() -> new Winning(List.of(1, 2, 3, 4, 5, -9)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("당첨 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void 보너스_번호에_중복된_숫자가_있으면_예외가_발생한다() {
        assertThatThrownBy(() -> new Winning(List.of(1, 2, 3, 4, 5, 6)).validateBonusNumber(1))
                .isInstanceOf(IllegalArgumentException.class);
    }

}