package lotto.exception;

public class EnterLottoMoneyZeroException extends IllegalArgumentException {

  private static final String ERROR_MESSAGE = "[ERROR] 로또 구입 금액은 0원 이상이어야 합니다";

  public EnterLottoMoneyZeroException() {
    super(ERROR_MESSAGE);
  }
}