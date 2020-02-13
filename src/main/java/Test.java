import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable1 implements Runnable {

    private People people;
    public MyRunnable1(People people)
    {
        this.people = people;
    }
    @Override
    public void run() {
        WebDriver driver = new ChromeDriver();
        driver.get(people.getWebAdress());//测试网址
        List<WebElement> buttons = driver.findElements(By.tagName("input"));
        buttons.get(0).sendKeys(people.getName());
        buttons.get(1).sendKeys(people.getSfzh());
        buttons.get(2).sendKeys(people.getPhone());
        buttons.get(3).sendKeys(people.getYbkh());
        Select mySelect = new Select(driver.findElement(By.tagName("select")));
        mySelect.selectByVisibleText("越城区");
        buttons.get(4).sendKeys(people.getAddress());
        WebElement btn = driver.findElement(By.className("btn"));
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
        Date date2 = new Date();
        String s=dateFormat.format(date2).toString();
        String[] array = s.split(" ");
        String d=array[0];
        String ss=d+" "+"15:00:00";
        System.out.println(ss);
        Date date1 = new Date(ss);
        while (true){
            Date date = new Date();
            if(date.getTime()>=date1.getTime()){
                btn.click();
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class MyRunnable2 implements Runnable {
    private People people;
    public MyRunnable2(People people)
    {
        this.people = people;
    }
    @Override
    public void run() {
        WebDriver driver = new ChromeDriver();
        driver.get(people.getWebAdress());//测试网址
        List<WebElement> buttons = driver.findElements(By.tagName("input"));
        buttons.get(0).sendKeys(people.getName());
        buttons.get(1).sendKeys(people.getSfzh());
        buttons.get(2).sendKeys(people.getPhone());
        buttons.get(3).sendKeys(people.getYbkh());
        Select mySelect = new Select(driver.findElement(By.tagName("select")));
        mySelect.selectByVisibleText("越城区");
        buttons.get(4).sendKeys(people.getAddress());
        WebElement btn = driver.findElement(By.className("btn"));
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
        Date date2 = new Date();
        String s=dateFormat.format(date2).toString();
        String[] array = s.split(" ");
        String d=array[0];
        String ss=d+" "+"15:00:00";
        System.out.println(ss);
        Date date1 = new Date(ss);
        while (true){
            Date date = new Date();
            if(date.getTime()>=date1.getTime()){
                btn.click();
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class MyRunnable3 implements Runnable {
    private People people;
    public MyRunnable3(People people)
    {
        this.people = people;
    }
    @Override
    public void run() {
        WebDriver driver = new ChromeDriver();
        driver.get(people.getWebAdress());//测试网址
        List<WebElement> buttons = driver.findElements(By.tagName("input"));
        buttons.get(0).sendKeys(people.getName());
        buttons.get(1).sendKeys(people.getSfzh());
        buttons.get(2).sendKeys(people.getPhone());
        buttons.get(3).sendKeys(people.getYbkh());
        Select mySelect = new Select(driver.findElement(By.tagName("select")));
        mySelect.selectByVisibleText("越城区");
        buttons.get(4).sendKeys(people.getAddress());
        WebElement btn = driver.findElement(By.className("btn"));
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
        Date date2 = new Date();
        String s=dateFormat.format(date2).toString();
        String[] array = s.split(" ");
        String d=array[0];
        String ss=d+" "+"15:00:00";
        System.out.println(ss);
        Date date1 = new Date(ss);
        while (true){
            Date date = new Date();
            if(date.getTime()>=date1.getTime()){
                btn.click();
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class MyRunnable4 implements Runnable {
    private People people;
    public MyRunnable4(People people)
    {
        this.people = people;
    }
    @Override
    public void run() {
        WebDriver driver = new ChromeDriver();
        driver.get(people.getWebAdress());//测试网址
        List<WebElement> buttons = driver.findElements(By.tagName("input"));
        buttons.get(0).sendKeys(people.getName());
        buttons.get(1).sendKeys(people.getSfzh());
        buttons.get(2).sendKeys(people.getPhone());
        buttons.get(3).sendKeys(people.getYbkh());
        Select mySelect = new Select(driver.findElement(By.tagName("select")));
        mySelect.selectByVisibleText("越城区");
        buttons.get(4).sendKeys(people.getAddress());
        WebElement btn = driver.findElement(By.className("btn"));
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
        Date date2 = new Date();
        String s=dateFormat.format(date2).toString();
        String[] array = s.split(" ");
        String d=array[0];
        String ss=d+" "+"15:00:00";
        System.out.println(ss);
        Date date1 = new Date(ss);
        while (true){
            Date date = new Date();
            if(date.getTime()>=date1.getTime()){
                btn.click();
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class MyRunnable5 implements Runnable {
    private People people;
    public MyRunnable5(People people)
    {
        this.people = people;
    }
    @Override
    public void run() {
        WebDriver driver = new ChromeDriver();
        driver.get(people.getWebAdress());//测试网址
        List<WebElement> buttons = driver.findElements(By.tagName("input"));
        buttons.get(0).sendKeys(people.getName());
        buttons.get(1).sendKeys(people.getSfzh());
        buttons.get(2).sendKeys(people.getPhone());
        buttons.get(3).sendKeys(people.getYbkh());
        Select mySelect = new Select(driver.findElement(By.tagName("select")));
        mySelect.selectByVisibleText("越城区");
        buttons.get(4).sendKeys(people.getAddress());
        WebElement btn = driver.findElement(By.className("btn"));
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
        Date date2 = new Date();
        String s=dateFormat.format(date2).toString();
        String[] array = s.split(" ");
        String d=array[0];
        String ss=d+" "+"15:00:00";
        System.out.println(ss);
        Date date1 = new Date(ss);
        while (true){
            Date date = new Date();
            if(date.getTime()>=date1.getTime()){
                btn.click();
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class Test {
    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://220.191.224.121:9080/yypt/search/portlet.xhtml");//测试网址
//        List<WebElement> buttons = driver.findElements(By.tagName("input"));
//        buttons.get(0).sendKeys("张董浩");
//        buttons.get(1).sendKeys("330602201501132013");
//        buttons.get(2).sendKeys("15158716108");
//        buttons.get(3).sendKeys("A11065080");
//        Select mySelect = new Select(driver.findElement(By.tagName("select")));
//        mySelect.selectByVisibleText("越城区");
//        buttons.get(4).sendKeys("城南温馨花园25幢201");
//
//         创建一个线程池对象，控制要创建几个线程对象。

//        ExecutorService pool = Executors.newFixedThreadPool(5);
//        pool.submit(new MyRunnable1());
//        pool.submit(new MyRunnable2());
//        pool.submit(new MyRunnable3());
//        pool.submit(new MyRunnable4());
//        pool.submit(new MyRunnable5());
//        //结束线程池
//        pool.shutdown();

        javax.swing.JFrame jf = new javax.swing.JFrame();
        JPanel jp1, jp2, jp3,jp4, jp5, jp6,jp7;
        JLabel jlb1, jlb2,jlb3,jlb4,jlb5,jlb6,jlb7;
        JButton jb1, jb2;
        final JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6,jtf7;
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        jp4 = new JPanel();
        jp5 = new JPanel();
        jp6 = new JPanel();
        jp7 = new JPanel();

        jlb1 = new JLabel("姓名");
        jlb2 = new JLabel("身份证号");
        jlb3 = new JLabel("医保卡");
        jlb4 = new JLabel("区域");
        jlb5 = new JLabel("地址");
        jlb6=new JLabel("手机");
        jlb7=new JLabel("填信息的网址");

        jb1 = new JButton("购买");
        jtf1 = new JTextField(10);
        jtf2 = new JTextField(10);//
        jtf3 = new JTextField(10);
        jtf4 = new JTextField(10);//
        jtf5 = new JTextField(10);
        jtf6 = new JTextField(10);//
        jtf7 = new JTextField(10);//
        jf.setLayout(new GridLayout(5, 1));
        jp1.add(jlb1);
        jp1.add(jtf1);

        jp1.add(jlb2);
        jp1.add(jtf2);

        jp1.add(jlb3);
        jp1.add(jtf3);

        jp1.add(jlb4);
        jp1.add(jtf4);

        jp1.add(jlb5);
        jp1.add(jtf5);

        jp1.add(jlb6);
        jp1.add(jtf6);

        jp1.add(jlb7);
        jp1.add(jtf7);

        jp3.add(jb1);
        jf.add(jp1);
        jf.add(jp2);
        jf.add(jp3);
        jf.setSize(1000, 300);
        jf.setTitle("Mask off");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 对话框
                People people=new People();
                people.setName(jtf1.getText().toString());
                people.setSfzh(jtf2.getText().toString());
                people.setYbkh(jtf3.getText().toString());
                people.setQydm(jtf4.getText().toString());
                people.setAddress(jtf5.getText().toString());
                people.setPhone(jtf6.getText().toString());
                people.setWebAdress(jtf7.getText().toString());
                System.out.println(people.toString());
                ExecutorService pool = Executors.newFixedThreadPool(5);
                pool.submit(new MyRunnable1(people));
                pool.submit(new MyRunnable2(people));
                pool.submit(new MyRunnable3(people));
                pool.submit(new MyRunnable4(people));
                pool.submit(new MyRunnable5(people));
                pool.shutdown();
            }
        });


    }
}