package coinRandom;
//运行代码得到一个随机为黑色或者白色的月亮脸来模拟抛硬币
public class CoinRandom {
    static boolean isBlack = true;
    static String[] emojis = {"🌝","🌝","🌖","🌗","🌘","🌑",
            "🌚","🌑","🌒","🌓","🌔","🌕"};
    public static void write() throws InterruptedException {
        int m = 0;//计数用来循环emojis列表
        int q = (isBlack)?30:36;
        //System.out.print("🌝");
        for(int i = 0;i <= q; i++) {
            if(m == 12){m = 0;}
            System.out.print("\b\b");
            System.out.print(emojis[m]);

            Thread.sleep(250);
            m++;
        }
        for(int i = 0;i < 40;i++){
            if(isBlack){
                System.out.print("🌚");
            }else {
                System.out.print("🌝");
            }
            Thread.sleep(80);
        }
    }
    public static void random(){
        //利用系统毫秒值的奇偶性生成一个随机的结果
        isBlack = System.currentTimeMillis() % 2 == 0;
    }
    public static void main(String[] args) throws InterruptedException {
        random();
        write();
    }
}
