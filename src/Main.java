
public class Main {
    public static void main(String[] args) {
        // 引数なし
       /* Hero h = new Hero();//同じ名前
        System.out.println(h.name + "のHPは" + h.hp + "です");
        // 引数あり String
        Hero h1 = new Hero("ミナト");//同じ名前
        System.out.println(h1.name + "のHPは" + h1.hp + "です");
        // 引数あり int
        Hero h2 = new Hero(999);//同じ名前
        System.out.println(h2.name + "のHPは" + h2.hp + "です");
        // 引数2つ
        Hero h3 = new Hero(999, "ミナト");//同じ名前
        System.out.println(h3.name + "のHPは" + h3.hp + "です");*/

        SuperHero sh = new SuperHero();
        sh.fly();
        sh.run();

        Weapon w = new Weapon();
    }
}