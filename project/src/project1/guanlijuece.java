package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;







public class guanlijuece {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        String OAmainPage;
        OAmainPage = "http://wctest.js.cmcc:7777/login/";
  
        WebDriver driver;
        //����һ��WebDriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        //������Chrome���ܵ��Զ���������Ŀ��ơ���ʾ
        options.addArguments
                ("--user-data-dir=C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
        //����������ȫ����ʾ�������û�Ĭ�ϵ�����Ŀ¼
        driver =new ChromeDriver(options);
        driver.manage().window().maximize();
        //ʹ������������
        driver.get(OAmainPage);
        //��OA��ҳ
        Thread.sleep(6000);
        //ǿ���̵߳ȴ�6����
        
        driver.findElement(By.id("userid")).clear();
        driver.findElement(By.id("userid")).sendKeys("yexh");
        driver.findElement(By.id("password")).sendKeys("password");
        //���ԭ���ݣ������˻�����
              
        Thread.sleep(5000);
        //ǿ���̵߳ȴ�10�����ֶ�������֤��    

        driver.findElement(By.id("goLogin")).click();
        //��¼�˺�
       
        Thread.sleep(5000);
        
        Actions action = new Actions(driver);
        
        action.keyDown(Keys.CONTROL).sendKeys("t").perform();
        //���µı�ǩҳ
        
        String handle = driver.getWindowHandle();
        
        for(String handles : driver.getWindowHandles()){
        	if(handles.equals(handle))continue;
        	driver.switchTo().window(handles);
        	
        }
        //��λ���´���
        
        
        String projectUrl = "http://v3biz.js.cmcc:8080/v3WorkSheet/manageDecision/draft";

        driver.get(projectUrl);
       
        driver.findElement(By.id("applyTitle")).sendKeys("�Զ�������001");
        driver.findElement(By.id("applyTitle")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.id("applyTitle")).sendKeys(Keys.CONTROL,"c");


       // Thread.sleep(3000);
        
        driver.findElement(By.id("secret")).sendKeys(Keys.TAB);
        
        //Thread.sleep(4000);
                
        action.keyDown(Keys.CONTROL).sendKeys("v").perform();
        
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
        //�ύ
        
        Thread.sleep(4000);
        
        
        WebElement frame = driver.findElement(By.cssSelector("body > div:nth-child(6) > iframe"));
        
        driver.switchTo().frame(frame);
        //���뵯������
    
        driver.findElement(By.cssSelector("li#selectTree-group0-0_2")).click(); 
        //����ۺ�������
        
        Thread.sleep(2000);
  
        driver.findElement(By.cssSelector("span#selectTree-group0-0_5_check")).click(); 
        //���������SGS
        
        
        Thread.sleep(3000);

        
        driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
        //���ȷ��
        
        Thread.sleep(3000);
        
        
        

        driver.findElement(By.cssSelector("#dropdown > li:nth-child(3) > a")).click();
        //����˳���¼
        Thread.sleep(6000);
        //ǿ���̵߳ȴ�6����
        
        driver.findElement(By.id("userid")).clear();
        driver.findElement(By.id("userid")).sendKeys("wanglidesgs");
        driver.findElement(By.id("password")).sendKeys("password");
        //���ԭ���ݣ������˻�����
              
        Thread.sleep(5000);
        //ǿ���̵߳ȴ�10�����ֶ�������֤��    

        driver.findElement(By.id("goLogin")).click();
       
        Thread.sleep(5000);
        
        driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=�Զ�������001]")).click();
        
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
        //�ύ
        
        driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-body > div > div.panel-body > div:nth-child(2) > textarea")).sendKeys("����123");
        //��д���
        driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-footer > button:nth-child(1)")).click();
        //ȷ�ϲ��ύ
        
        driver.switchTo().frame(frame);
        //���뵯������
        
        Thread.sleep(2000);
        
        driver.findElement(By.cssSelector("span#spanselectTree-group0-0_5_span")).click(); 
        //������
        
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
        //���ȷ��
        
        Thread.sleep(3000);
        
        
        
        driver.findElement(By.cssSelector("#dropdown > li:nth-child(3) > a")).click();
        //����˳���¼
        
        Thread.sleep(6000);
        //ǿ���̵߳ȴ�6����
        driver.findElement(By.id("userid")).clear();
        driver.findElement(By.id("userid")).sendKeys("xubing");
        driver.findElement(By.id("password")).sendKeys("password");
        //���ԭ���ݣ������˻�����
              
        Thread.sleep(5000);
        //ǿ���̵߳ȴ�10�����ֶ�������֤��    

        driver.findElement(By.id("goLogin")).click();
       
        Thread.sleep(5000);
        
        driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=�Զ�������001]")).click();
        
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
        //�ύ
        
        driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-body > div > div.panel-body > div:nth-child(2) > textarea")).sendKeys("����123");
        //��д���
        driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-footer > button:nth-child(1)")).click();
        //ȷ�ϲ��ύ
        
        driver.switchTo().frame(frame);
        //���뵯������
        
        Thread.sleep(2000);
        
        driver.findElement(By.cssSelector("span#selectTree-group0-0_1_span")).click(); 
        //����ջ�SGS
        
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
        //���ȷ��
        
        Thread.sleep(3000);
        
        
        
        
        driver.findElement(By.cssSelector("#dropdown > li:nth-child(3) > a")).click();
        //����˳���¼
        
        Thread.sleep(6000);
        //ǿ���̵߳ȴ�6����
        driver.findElement(By.id("userid")).clear();
        driver.findElement(By.id("userid")).sendKeys("suhuisgs");
        driver.findElement(By.id("password")).sendKeys("password");
        //���ԭ���ݣ������˻�����
              
        Thread.sleep(5000);
        //ǿ���̵߳ȴ�10�����ֶ�������֤��    

        driver.findElement(By.id("goLogin")).click();
       
        Thread.sleep(5000);
        
        driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=�Զ�������001]")).click();
        
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
        //�ύ
        
        driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-body > div > div.panel-body > div:nth-child(2) > textarea")).sendKeys("����123");
        //��д���
        driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-footer > button:nth-child(1)")).click();
        //ȷ�ϲ��ύ
        
        driver.switchTo().frame(frame);
        //���뵯������
        
        Thread.sleep(2000);
        
        driver.findElement(By.cssSelector("#list-group-item-group1")).click();
        //��������ĵ�����
                
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
        //���ȷ��
        
    
    }

}
