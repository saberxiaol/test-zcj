package project1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class gongsigonghuifawen {
	
	public static void main(String[] args) throws InterruptedException {
		
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
   
    Thread.sleep(5000);
    
    String projectUrl = "http://v3biz.js.cmcc:8080/OADocument/document/outgoing/draftDocument/gsghfw";

    driver.get(projectUrl);
   
    driver.findElement(By.id("applyTitle")).sendKeys("�Զ�������002");
    driver.findElement(By.id("applyTitle")).sendKeys(Keys.CONTROL,"a");
    driver.findElement(By.id("applyTitle")).sendKeys(Keys.CONTROL,"c");
	
	driver.findElement(By.id("mainSendDepts")).sendKeys("����1");
	driver.findElement(By.id("copySendDepts")).sendKeys("����2");

   // Thread.sleep(3000);
    
    driver.findElement(By.id("copySendDepts")).sendKeys(Keys.TAB);
    
    //Thread.sleep(4000);
    
    Actions action = new Actions(driver);
    action.keyDown(Keys.CONTROL).sendKeys("v").perform();
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
    //�ύ
    
    Thread.sleep(4000);
    
    
    WebElement frame = driver.findElement(By.cssSelector("body > div:nth-child(6) > iframe"));
    
    driver.switchTo().frame(frame);
    //���뵯������
    
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector("span#selectTree-group0-0_1_span")).click(); 
    //�������sgs2
    
    
    Thread.sleep(3000);

    
    driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
    //���ȷ��
    
    Thread.sleep(3000);
    
    driver.findElement(By.cssSelector("#dropdown > li:nth-child(3) > a")).click();
    //����˳���¼
    Thread.sleep(6000);
    //ǿ���̵߳ȴ�6����
    
    driver.findElement(By.id("userid")).clear();
    driver.findElement(By.id("userid")).sendKeys("hujiesgs2");
    driver.findElement(By.id("password")).sendKeys("password");
    //���ԭ���ݣ������˻�����
          
    Thread.sleep(5000);
    //ǿ���̵߳ȴ�10�����ֶ�������֤��    

    driver.findElement(By.id("goLogin")).click();
   
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=�Զ�������002]")).click();
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
    //�ύ
    
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-body > div > div.panel-body > div:nth-child(2) > textarea")).sendKeys("����123");
    //��д���
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-footer > button:nth-child(1)")).click();
    //ȷ�ϲ��ύ
    
    driver.switchTo().frame(frame);
    //���뵯������
    
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector("span#selectTree-group0-0_1_a")).click(); 
    //���������sgs
    
    
    Thread.sleep(3000);

    
    driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
    //���ȷ��
    
    Thread.sleep(3000);
    
    driver.findElement(By.cssSelector("#dropdown > li:nth-child(3) > a")).click();
    //����˳���¼
    
    Thread.sleep(6000);
    //ǿ���̵߳ȴ�6����
    
    driver.findElement(By.id("userid")).clear();
    driver.findElement(By.id("userid")).sendKeys("guoclsgs");
    driver.findElement(By.id("password")).sendKeys("password");
    //���ԭ���ݣ������˻�����
          
    Thread.sleep(5000);
    //ǿ���̵߳ȴ�10�����ֶ�������֤��    

    driver.findElement(By.id("goLogin")).click();
    //�����¼
    
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=�Զ�������002]")).click();
    //�㿪����
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
    //�ύ
    
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-body > div > div.panel-body > div:nth-child(2) > textarea")).sendKeys("����123");
    //��д���
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-footer > button:nth-child(1)")).click();
    //ȷ�ϲ��ύ
    
    driver.switchTo().frame(frame);
    //���뵯������
    
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("#list-group-item-group2")).click();
    //������ۺϲ�����˸�
    
    driver.findElement(By.cssSelector("span#selectTree-group2-0_2_span")).click(); 
    //����ջ�sgs
    
    
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
    //�����¼
    
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=�Զ�������002]")).click();
    //�㿪����
    
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
    //�����ܲ��
    
    
    Thread.sleep(3000);

    
    driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
    //���ȷ��
    
    Thread.sleep(3000);
    
    
    
    
    
    driver.findElement(By.cssSelector("#dropdown > li:nth-child(3) > a")).click();
    //����˳���¼
    
    Thread.sleep(6000);
    //ǿ���̵߳ȴ�6����
    
    driver.findElement(By.id("userid")).clear();
    driver.findElement(By.id("userid")).sendKeys("guanym");
    driver.findElement(By.id("password")).sendKeys("password");
    //���ԭ���ݣ������˻�����
          
    Thread.sleep(5000);
    //ǿ���̵߳ȴ�10�����ֶ�������֤��    

    driver.findElement(By.id("goLogin")).click();
    //�����¼
    
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=�Զ�������002]")).click();
    //�㿪����
    
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
    //�������sgs2
    
    
    Thread.sleep(3000);

    
    driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
    //���ȷ��
    
    Thread.sleep(3000);
    
    
    
    
    driver.findElement(By.cssSelector("#dropdown > li:nth-child(3) > a")).click();
    //����˳���¼
    
    Thread.sleep(6000);
    //ǿ���̵߳ȴ�6����
    
    driver.findElement(By.id("userid")).clear();
    driver.findElement(By.id("userid")).sendKeys("hujiesgs2");
    driver.findElement(By.id("password")).sendKeys("password");
    //���ԭ���ݣ������˻�����
          
    Thread.sleep(5000);
    //ǿ���̵߳ȴ�10�����ֶ�������֤��    

    driver.findElement(By.id("goLogin")).click();
   
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=�Զ�������002]")).click();
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
    //�ύ
    
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-body > div > div.panel-body > div:nth-child(2) > textarea")).sendKeys("����123");
    //��д���
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-footer > button:nth-child(1)")).click();
    //ȷ�ϲ��ύ
    
    driver.switchTo().frame(frame);
    //���뵯������
    
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector("span#selectTree-group0-0_3_span")).click(); 
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
    //�����¼
    
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=�Զ�������002]")).click();
    //�㿪����
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
    //�ύ
    
    
    driver.switchTo().frame(frame);
    //���뵯������
    
    Thread.sleep(2000);

    driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
    //���ȷ�� �ͽ���
        
   
    }

}
