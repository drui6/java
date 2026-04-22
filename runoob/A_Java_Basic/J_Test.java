import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;

public class J_Test {
    public static void main(String[] args){
        // 基本类型转换
        Integer x = 5;
        x =  x + 10;
        System.out.println(x); 

        Number num = 1234.56; // 实际是Double类型

        System.out.println(num.intValue());    // 1234 (截断小数)
        System.out.println(num.longValue());   // 1234
        System.out.println(num.floatValue());  // 1234.56
        System.out.println(num.doubleValue()); // 1234.56

        // 数值比较
        Integer x1 = 10;
        Double y = 10.0;

        // 正确比较方式：转换为同一类型后比较
        System.out.println(x1.doubleValue() == y.doubleValue()); // true

        BigInteger bigInt = new BigInteger("12345678901234567890");
        BigDecimal bigDec = new BigDecimal("1234567890.1234567890");

        // 大数运算
        BigInteger sum = bigInt.add(new BigInteger("1"));
        BigDecimal product = bigDec.multiply(new BigDecimal("2"));

        // 数值格式化
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);

        System.out.println(nf.format(1234.5678)); // "1,234.57"
    }
}
