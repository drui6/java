public class JA_Test {
    public static void main (String []args){  
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));  
        System.out.println("0度的余弦值：" + Math.cos(0));  
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));  
        System.out.println("1的反正切值： " + Math.atan(1));  
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));  
        System.out.println(Math.PI);  

        // 指数对数运算
        Math.exp(1);    // e^1 ≈ 2.718
        Math.log(Math.E); // ln(e) = 1
        Math.log10(100); // log10(100) = 2

        // 随机数生成
        // 生成[0.0, 1.0)之间的随机数
        double random = Math.random(); 

        // 生成[1, 100]的随机整数
        int randomInt = (int)(Math.random() * 100) + 1;


        double pi = Math.PI;    // π ≈ 3.141592653589793
        double e = Math.E;     // 自然对数底数e ≈ 2.718281828459045
    }
}
