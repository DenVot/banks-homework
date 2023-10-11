public class Currency {
    private final String currencyTag;

    // Сколько стоит в валюте по умолчанию данная
    private final int convertionalCoefficient;

    public Currency(String currencyTag, int convertionalCoefficient) {
        this.currencyTag = currencyTag;
        this.convertionalCoefficient = convertionalCoefficient;
    }

    public String getCurrencyTag() {
        return currencyTag;
    }

    public double convertToCommon(double value) {
        return convertionalCoefficient * value;
    }

    public double convertFromCommon(double value) {
        return value / convertionalCoefficient;
    }

    public static Currency getCommonCurrency() {
        return new Currency("COM", 1);
    }
}
