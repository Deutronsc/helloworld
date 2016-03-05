package helloworld;

import javax.swing.JOptionPane;

public class helloworld {
    public static void main(String args[]){
        Reader r = new Reader();
        r.Scan();
        r.i = count(r.i);
        r.k = count(r.k);
        r.Scan(r.i,r.k);
    }
    
    private static int count(int x){
        x = x + 1;
        return x;
    }
}
class Reader {
    int k, i;
    String n1, n2;
    
    public void Scan(){
        JOptionPane.showMessageDialog(null,"Привет мир! ");
        n1 = JOptionPane.showInputDialog("введите первое число");
        n2 = JOptionPane.showInputDialog("введите второе число");
        i = Integer.parseInt(n1);
        k = Integer.parseInt(n2);
    }
    
    public void Scan(int a, int b){
        System.out.println(a+"lol");
        JOptionPane.showMessageDialog(null,"Теперь ваше первое число = "+a);
        JOptionPane.showMessageDialog(null,"Теперь ваше второе число = "+b);
    }
    public void brotan(int a){
        System.out.println(a+"lol");
    }
}