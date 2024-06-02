package com.test;





/*
//Scanner类的测试，对每次输入数据进行判断，最后得到正整数
import java.util.Scanner;
public class Test {
    //Scanner类的测试，对每次输入数据进行判断，最后得到正整数
    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        int a=0; String s;
        while(true){
            System.out.println("请输入数据");
            //判定输入数据，输入数据为int型，则进入循环
            while(scanner.hasNextInt()){   
                a=scanner.nextInt();
                if(a>=1){
                    System.out.println("输入的正整数为"+a);
                }else{
                    System.out.println("请输入正整数");
                }
            }
            //反馈结果，输入的数据不是所需要的整数
            System.out.println("请输入整数，输入end以结束程序");
            //重新绑定数据流，若不重新绑定，则第16行 while(scanner.hasNextInt()){ 语句判定会为false。 5.21测试不用重新绑定好像也没有bug推测原因为之前项目未重新构建
//            scanner=new Scanner(System.in);
            s=scanner.next();
            System.out.println("输入的字符为"+s);
            if(s.equals("end"))
                break;
        }
        System.out.println("程序结束");
    }
}
*/











/*
//静态块执行顺序
class BBB {
    static {
        System.out.println("bbb中的静态块");
    }
}

public class AAA{
  static{
      System.out.println("最先被执行的静态块");
  }

    public static void main(String[] args) {
        new BBB();
        System.out.println("new关键字创建实体");
        BBB bbb;
        System.out.println("BBB类的声明");
        bbb=new BBB();
        System.out.println("BBB类字节码的加载");
    }
}*/










/*
//方法参数名和实例变量能相同，但是参数名会屏蔽实例变量。
class B{
    int x=100,y=200;
    public void setX(int x){
        x=x;
        System.out.println("方法中调用x"+x);
        //  this.x=x;
        // System.out.println("方法中调用被屏蔽的"+x);
    }
}
public class A {
    public static void main(String[] args) {
        B b=new B();
        b.setX(-100);
        System.out.println(b.x);
    }
}
*/










/*
//上转型对象访问的变量是父类的变量，如下例中的v，v.m访问的是父类AA中的m;若为静态变量访问的还是父类的静态变量
// 若子类有重写方法，则访问的是子类重写的方法;若没有重写，则继承过来的方法v.f()中使用的变量是父类变量
//若重写静态方法，则v.()访问的是父类方法，与静态变量类似
class AA{
    int m;
    private int u=111;
     void f(){
        m=20;
    }
    void t(){
        System.out.println(u);
    }
}

class BB extends AA{
   int m;
 void f(){
    m=200;
}
    BB(){m=222;
        System.out.println("m的值"+m);}
}

public class E {
    public static void main(String[] args) {
        AA a=new AA();
        BB b=new BB() ;
        AA v=new BB();
        System.out.println("AA"+a.m);
        System.out.println("BB"+b.m);
        a.f();
        System.out.println("AA"+a.m);
        System.out.println("BB"+b.m);
        b.f();
        System.out.println("AA"+a.m);
        System.out.println("BB"+b.m);
        v.f();
        v.t();
        System.out.println("AA"+a.m);
        System.out.println("BB"+b.m);
        System.out.println("v"+v.m);
        BB c=(BB)v;
        System.out.println("v"+c.m);
    }
}
*/













/*
//抛出异常练习，程序循环逻辑不如Scanner联系那个类，应该使用while（true）作为外层循环，若输入数据不为数字要么print要么跳异常
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SumNmuber number=new SumNmuber();
        try{number.sumNumber();}
        catch(NumberException e){
            e.warmess();
        }
    }
}

class NumberException extends Exception{
    double message;
    public NumberException(double a){
        message=a;
    }
    public void warmess(){
        System.out.printf("输入的值为%1.0f,不符合大于0小于100的要求",message);
    }
}

class SumNmuber{
    void sumNumber() throws NumberException{
        double a=0,sum=0,s;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入若干个数字，回车键确认。输入非数字计算平均值并结束程序");

        while(scanner.hasNextDouble()){
            s=scanner.nextDouble();
            if(s>100||s<0){
                assert false:"输入数字大于100或小于0";
                throw new NumberException(s);
            }
            sum+=s;
            a++;
        }

        System.out.println(sum/a);
    }
}*/












/*
//加密解密算法，比教材上多了一点点，当密码长度大于原文长度时，使多余的密码部分也可以用于加密。百度网盘好像就是这样，前几位对上就能进
public class EncryptAndDecrypt {
    //加密，左边原文右边密码
    public String Encrypt(String source,String password){
        char s[]=source.toCharArray();
        char p[]=password.toCharArray();
        //source.length简写sl命名
        int sl=source.length();
        int pl=password.length();
        //判断输入数据长度,加密密码password长度小于原文长度那么循环使用密码加密。
        if(password.length()<source.length()){
            for(int i=0;i<sl;i++){
                s[i]=(char)(s[i]+p[i%pl]);
            }
            return new String(s);
        }
        else{
         //加密密码password长度大于原文长度那么循环原文进行多次加密
        for(int i=0;i<pl;i++){
            s[i%sl]= (char) (s[i%sl]+p[i]);
        }
        return new String(s);
        }
    }
      //解密
    public String Decrypt(String source,String password){
        char s[]=source.toCharArray();
        char p[]=password.toCharArray();
        //source.length简写sl命名
        int sl=source.length();
        int pl=password.length();
              //判断输入数据长度,加密密码password长度小于原文长度那么循环使用密码解密。
        if(password.length()<source.length()){
            for(int i=0;i<sl;i++){
                s[i]=(char)(s[i]-p[i%pl]);
            }
            return new String(s);
        }
        else{//加密密码password长度大于原文长度那么循环原文进行多次解密
            for(int i=0;i<pl;i++){
                s[i%sl]= (char) (s[i%sl]-p[i]);
            }
            return new String(s);
        }
    }
}*/













/*  //String类测试

    // Byte数组中不同类型字符占位不一样，若使用utf-8，中文占三个字节，若使用gbk中文占两个字节
    public static void main(String[] args) {
        byte a[]="Java你好".getBytes();
        System.out.println("a的长度"+a.length);
        for (int i=0;i<a.length;i++){
            System.out.println("第"+i+"个字符是"+a[i]);
        }
    String s=new String(a,4,6);
        System.out.println(s);//打印String对象
        System.out.println(a);//打印String数组
        String k=new String(a,0,a.length);
        System.out.println(k);//打印String对象
    }*/











//抢红包-ControlRedEnvelope类
/*public class ControlRedEnvelope {
    public static void main(String[] args) {
        RedEnvelope redEnvelope;
        double money=0,minMoney=0.01;
        int people=0;
        System.out.println("请输入最小红包数");
        Scanner scanner=new Scanner(System.in);
        try{minMoney=scanner.nextDouble();}
        catch(InputMismatchException e){
            scanner.nextLine();
            System.out.println("请输入正确的最小红包数");
        }
        System.out.println("请输入红包总金额");
        try{money=scanner.nextDouble();}
        catch (InputMismatchException e){
            scanner.nextLine();
            System.out.println("输入值不是金额");
        }
        System.out.println("请输入抢红包人数");
        try{people=scanner.nextInt();
            if(money<people*minMoney){
                System.out.println("抢红包人数太多");
            }
        }
        catch (InputMismatchException e){
            scanner.nextLine();
            System.out.println("请输入正确的人数");
        }
        redEnvelope=new RandomRedEnvelope(money,minMoney,people);
        for(int i=1;i<=people;i++){
            System.out.println("第"+i+"个人抢的红包金额为"+redEnvelope.grabRedEnvelope());
        }
    }
}*/
//抢红包-RedEnvelope抽象类
/*public abstract class RedEnvelope{
    public double remainMoeny;
    public int remainPeople;
    public abstract double  grabRedEnvelope();
}*/

//抢红包-抽象类的实现类
/*public class RandomRedEnvelope extends RedEnvelope{

    double minMoney=0.01;

    public void setMinMoney(double a){
        minMoney=a;
    }

    RandomRedEnvelope(double money,double minMoney,int people){
        remainMoeny=money;
        remainPeople=people;
        this.minMoney=minMoney;
    }

    @Override
    public double grabRedEnvelope() {
        if(remainMoeny<minMoney){
            System.out.println("红包里没钱了！！！！！");
            System.exit(0);}
        else if(remainMoeny==minMoney){
            return minMoney;
        }
        else
        {if(remainPeople>1){
            Random random=new Random();
            double a=remainMoeny*random.nextDouble();
            if(a==0){
                remainPeople-=1; remainMoeny-=minMoney; return minMoney;}
            else if(a>=(remainMoeny-(remainPeople-1)*minMoney))
            {
                a=remainMoeny-(remainPeople-1)*minMoney;
                remainPeople-=1; remainMoeny-=a;return a;}
            else{
                remainPeople-=1; remainMoeny-=a; return a;}
        }
        else if(remainPeople==1){
            return remainMoeny;
        }
        else{
            System.out.println("人数为0或者小于0");
        }
        }
        return 0;
    }
}*/















/*
//日期向后滚动
public class RollDayInMonth {
    public static void main(String[] args) {
        int year=0,month=0,day=0;
        String regex="\\d{4}\\s+[01]?\\d\\s+[012]\\d";//匹配日期的正则表达式
        Scanner scanner=new Scanner(System.in);
        String a=String.valueOf(scanner.nextLine());
        a.matches(regex);
        System.out.println("日期序列匹配"+a.matches(regex));
        String []q=a.split("\\s+");
       if(a.matches(regex)){
           year=Integer.parseInt(q[0]);
           month=Integer.parseInt(q[1])-1;
           day=Integer.parseInt(q[2]);
       }
        Calendar calendar=Calendar.getInstance();
        calendar.set(year,month,day);//使用指定时间设置日历对象
       //使用当前系统时间初始化日历对象 calendar.setTime(new Date());
        String s=String.format("%tF(%<tA)",calendar);
        System.out.println(s);
        System.out.println("日期向后滚动的天数");
        int n= scanner.nextInt();
        System.out.println("月内向后滚动"+n+"天");
        calendar.roll(calendar.DAY_OF_MONTH,n);
        s=String.format("%tF(%<tA)",calendar);
        System.out.println(s);
        System.out.println("年内向后滚动"+n+"天");
        calendar.roll(calendar.DAY_OF_YEAR,n);
        s=String.format("%tF(%<tA)",calendar);
        System.out.println(s);
        }
    }

*/















//runtime类
/*    public static void main(String[] args) {
  Runtime run=Runtime.getRuntime();
        System.out.println("JVM最大内存量"+run.maxMemory());
        System.out.println("JVM占用内存量"+run.totalMemory());
        System.out.println("Jvm空闲内存量"+run.freeMemory());
        String str="hello world!!!";
        System.out.println(str);
        for(int i=0;i<10000;i++){
            str+=i;
        }
        System.out.println("空闲内存"+run.freeMemory());
        run.gc();
        System.out.println("空闲内存"+run.freeMemory());
    }*/












//使用main传递参数，计算两个日期之间的时间间隔，未完成
   /*public static void main(String[] args) {
        String regex = "\\d{4}[01]\\d[012]\\d";
        Calendar calendar= Calendar.getInstance();
        long time1=0,time2=0;
        for (String s:args) {
            if(s.matches(regex))
            {int year=Integer.parseInt(s.substring(0,4));
            int month=Integer.parseInt(s.substring(4,6));
            int day=Integer.parseInt(s.substring(6,8));
            if(time1==0){
                calendar.set(year,month,day);
                time1= calendar.getTimeInMillis();
            }
            else{
                calendar.set(year,month,day);
                time2= calendar.getTimeInMillis();
            }
            }
        }
        long a=(time2-time1)/(1000*60*60*24);
        System.out.println("两者相距"+a+"天");
    }*/





/*菜单，菜单条，菜单练习，图片大小不合适不会修改大小，未完成
public class WindowsMenu extends JFrame{
    JMenuBar menubar;
    JMenu menu,subMenu;
    JMenuItem item1,item2;
    public WindowsMenu(){};
    public WindowsMenu(String s,int x,int y, int w, int h){
        init(s);
        setLocation(x,y);
        setSize(w,h);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    void init(String s){
        setTitle(s);
        menubar=new JMenuBar();
        menu=new JMenu("软件项目");
        subMenu=new JMenu("菜单");
        item1=new JMenuItem("Java话题",new ImageIcon("05.jpg"));
        item2=new JMenuItem("动画话题",new ImageIcon("06.jpg"));
        item1.setAccelerator(KeyStroke.getKeyStroke('A'));
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        menu.add(item1);
        menu.addSeparator();
        menu.add(item2);
        menu.add(subMenu);
        subMenu.add(new JMenuItem("软件项目",new ImageIcon("03.jpg")));
        subMenu.add(new JMenuItem("软件项目",new ImageIcon("02.jpg")));
        menubar.add(menu);
        setJMenuBar(menubar);
    }
}*/
