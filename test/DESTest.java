

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.dxsit.base.util.DESEncryptUtil;

@Component
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/core/spring-core.xml" })
public class DESTest {

	@Autowired
	private DESEncryptUtil desEncryptUtil;
	
	
	@Test
	public void testEncrypt() throws Exception {
		for (int i = 0; i <1000; i++) {
			String result=desEncryptUtil.encrypt(i+"");
			int decrypt = Integer.parseInt(desEncryptUtil.decrypt(result));
			System.out.print(result);
			System.out.println("                                         "+decrypt);
			if(i!=decrypt){
break;			}
//			Assert.assertTrue(i==decrypt);
		}
	}
	
	
	@Test
	public void testDecrypt() throws Exception {
		String result=desEncryptUtil.decrypt("5cVZfuhuHwU=Nz UsRq2zhk=");
		System.out.println(result);
	}



}
