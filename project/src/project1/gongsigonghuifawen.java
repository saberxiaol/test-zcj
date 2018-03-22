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
    //声明一个WebDriver
    ChromeOptions options = new ChromeOptions();
    options.addArguments("disable-infobars");
    //消除“Chrome正受到自动测试软件的控制”提示
    options.addArguments
            ("--user-data-dir=C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
    //消除“不安全”提示，启用用户默认的数据目录
    driver =new ChromeDriver(options);
    driver.manage().window().maximize();
    //使浏览器窗口最大化
    driver.get(OAmainPage);
    //打开OA主页
    Thread.sleep(6000);
    //强制线程等待6秒钟
    
    driver.findElement(By.id("userid")).clear();
    driver.findElement(By.id("userid")).sendKeys("yexh");
    driver.findElement(By.id("password")).sendKeys("password");
    //清除原数据，输入账户密码
          
    Thread.sleep(5000);
    //强制线程等待10秒钟手动输入验证码    

    driver.findElement(By.id("goLogin")).click();
   
    Thread.sleep(5000);
    
    String projectUrl = "http://v3biz.js.cmcc:8080/OADocument/document/outgoing/draftDocument/gsghfw";

    driver.get(projectUrl);
   
    driver.findElement(By.id("applyTitle")).sendKeys("自动化测试002");
    driver.findElement(By.id("applyTitle")).sendKeys(Keys.CONTROL,"a");
    driver.findElement(By.id("applyTitle")).sendKeys(Keys.CONTROL,"c");
	
	driver.findElement(By.id("mainSendDepts")).sendKeys("测试1");
	driver.findElement(By.id("copySendDepts")).sendKeys("测试2");

   // Thread.sleep(3000);
    
    driver.findElement(By.id("copySendDepts")).sendKeys(Keys.TAB);
    
    //Thread.sleep(4000);
    
    Actions action = new Actions(driver);
    action.keyDown(Keys.CONTROL).sendKeys("v").perform();
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
    //提交
    
    Thread.sleep(4000);
    
    
    WebElement frame = driver.findElement(By.cssSelector("body > div:nth-child(6) > iframe"));
    
    driver.switchTo().frame(frame);
    //切入弹出窗口
    
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector("span#selectTree-group0-0_1_span")).click(); 
    //点击胡洁sgs2
    
    
    Thread.sleep(3000);

    
    driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
    //点击确定
    
    Thread.sleep(3000);
    
    driver.findElement(By.cssSelector("#dropdown > li:nth-child(3) > a")).click();
    //点击退出登录
    Thread.sleep(6000);
    //强制线程等待6秒钟
    
    driver.findElement(By.id("userid")).clear();
    driver.findElement(By.id("userid")).sendKeys("hujiesgs2");
    driver.findElement(By.id("password")).sendKeys("password");
    //清除原数据，输入账户密码
          
    Thread.sleep(5000);
    //强制线程等待10秒钟手动输入验证码    

    driver.findElement(By.id("goLogin")).click();
   
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=自动化测试002]")).click();
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
    //提交
    
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-body > div > div.panel-body > div:nth-child(2) > textarea")).sendKeys("测试123");
    //填写意见
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-footer > button:nth-child(1)")).click();
    //确认并提交
    
    driver.switchTo().frame(frame);
    //切入弹出窗口
    
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector("span#selectTree-group0-0_1_a")).click(); 
    //点击郭春玲sgs
    
    
    Thread.sleep(3000);

    
    driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
    //点击确定
    
    Thread.sleep(3000);
    
    driver.findElement(By.cssSelector("#dropdown > li:nth-child(3) > a")).click();
    //点击退出登录
    
    Thread.sleep(6000);
    //强制线程等待6秒钟
    
    driver.findElement(By.id("userid")).clear();
    driver.findElement(By.id("userid")).sendKeys("guoclsgs");
    driver.findElement(By.id("password")).sendKeys("password");
    //清除原数据，输入账户密码
          
    Thread.sleep(5000);
    //强制线程等待10秒钟手动输入验证码    

    driver.findElement(By.id("goLogin")).click();
    //点击登录
    
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=自动化测试002]")).click();
    //点开待办
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
    //提交
    
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-body > div > div.panel-body > div:nth-child(2) > textarea")).sendKeys("测试123");
    //填写意见
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-footer > button:nth-child(1)")).click();
    //确认并提交
    
    driver.switchTo().frame(frame);
    //切入弹出窗口
    
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("#list-group-item-group2")).click();
    //点击送综合部秘书核稿
    
    driver.findElement(By.cssSelector("span#selectTree-group2-0_2_span")).click(); 
    //点击苏惠sgs
    
    
    Thread.sleep(3000);

    
    driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
    //点击确定
    
    Thread.sleep(3000);
    
    
    
    
    driver.findElement(By.cssSelector("#dropdown > li:nth-child(3) > a")).click();
    //点击退出登录
    
    Thread.sleep(6000);
    //强制线程等待6秒钟
    
    driver.findElement(By.id("userid")).clear();
    driver.findElement(By.id("userid")).sendKeys("suhuisgs");
    driver.findElement(By.id("password")).sendKeys("password");
    //清除原数据，输入账户密码
          
    Thread.sleep(5000);
    //强制线程等待10秒钟手动输入验证码    

    driver.findElement(By.id("goLogin")).click();
    //点击登录
    
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=自动化测试002]")).click();
    //点开待办
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
    //提交
    
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-body > div > div.panel-body > div:nth-child(2) > textarea")).sendKeys("测试123");
    //填写意见
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-footer > button:nth-child(1)")).click();
    //确认并提交
    
    driver.switchTo().frame(frame);
    //切入弹出窗口
    
    Thread.sleep(2000);

    
    driver.findElement(By.cssSelector("span#selectTree-group0-0_1_span")).click(); 
    //点击关懿珉
    
    
    Thread.sleep(3000);

    
    driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
    //点击确定
    
    Thread.sleep(3000);
    
    
    
    
    
    driver.findElement(By.cssSelector("#dropdown > li:nth-child(3) > a")).click();
    //点击退出登录
    
    Thread.sleep(6000);
    //强制线程等待6秒钟
    
    driver.findElement(By.id("userid")).clear();
    driver.findElement(By.id("userid")).sendKeys("guanym");
    driver.findElement(By.id("password")).sendKeys("password");
    //清除原数据，输入账户密码
          
    Thread.sleep(5000);
    //强制线程等待10秒钟手动输入验证码    

    driver.findElement(By.id("goLogin")).click();
    //点击登录
    
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=自动化测试002]")).click();
    //点开待办
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
    //提交
    
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-body > div > div.panel-body > div:nth-child(2) > textarea")).sendKeys("测试123");
    //填写意见
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-footer > button:nth-child(1)")).click();
    //确认并提交
    
    driver.switchTo().frame(frame);
    //切入弹出窗口
    
    Thread.sleep(2000);

    
    driver.findElement(By.cssSelector("span#selectTree-group0-0_1_span")).click(); 
    //点击胡洁sgs2
    
    
    Thread.sleep(3000);

    
    driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
    //点击确定
    
    Thread.sleep(3000);
    
    
    
    
    driver.findElement(By.cssSelector("#dropdown > li:nth-child(3) > a")).click();
    //点击退出登录
    
    Thread.sleep(6000);
    //强制线程等待6秒钟
    
    driver.findElement(By.id("userid")).clear();
    driver.findElement(By.id("userid")).sendKeys("hujiesgs2");
    driver.findElement(By.id("password")).sendKeys("password");
    //清除原数据，输入账户密码
          
    Thread.sleep(5000);
    //强制线程等待10秒钟手动输入验证码    

    driver.findElement(By.id("goLogin")).click();
   
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=自动化测试002]")).click();
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
    //提交
    
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-body > div > div.panel-body > div:nth-child(2) > textarea")).sendKeys("测试123");
    //填写意见
    driver.findElement(By.cssSelector("body > div.modal.fade.bootstrap-dialog.type-primary.opinionmodal.in > div > div > div.modal-footer > button:nth-child(1)")).click();
    //确认并提交
    
    driver.switchTo().frame(frame);
    //切入弹出窗口
    
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector("span#selectTree-group0-0_3_span")).click(); 
    //点击苏惠SGS
    
    Thread.sleep(3000);
    
    driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
    //点击确定
    
    Thread.sleep(3000);
    
    
    
    
    driver.findElement(By.cssSelector("#dropdown > li:nth-child(3) > a")).click();
    //点击退出登录
    
    Thread.sleep(6000);
    //强制线程等待6秒钟
    
    driver.findElement(By.id("userid")).clear();
    driver.findElement(By.id("userid")).sendKeys("suhuisgs");
    driver.findElement(By.id("password")).sendKeys("password");
    //清除原数据，输入账户密码
          
    Thread.sleep(5000);
    //强制线程等待10秒钟手动输入验证码    

    driver.findElement(By.id("goLogin")).click();
    //点击登录
    
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("#xtable > tbody > tr.redtitleNew.flagpiid\3a 78fadfef-34fb-4ed0-b6bf-86fa2ece988f > td > [title~=自动化测试002]")).click();
    //点开待办
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/button[2]")).click();
    //提交
    
    
    driver.switchTo().frame(frame);
    //切入弹出窗口
    
    Thread.sleep(2000);

    driver.findElement(By.cssSelector("html > body > table#candidatesShowContainer > tbody > tr:nth-child(3) > td > div.button_area > button:nth-child(1)")).click();
    //点击确定 送结束
        
   
    }

}
