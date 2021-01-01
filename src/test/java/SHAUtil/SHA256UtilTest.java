package SHAUtil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SHA256UtilTest {
    @Test
    public void should_return_hashcode_when_given_a_string(){
        SHA256Util sha256Util = new SHA256Util();
        String hash = sha256Util.SHA("0");
        String h = "0";
        for (int i = 0;i<65537;i++){
            hash = sha256Util.SHA("111"+i);
            if (hash.substring(0,5).equals("00000")){
                System.out.println(i);
                System.out.println(i);
                return;
            }
            h=String.valueOf(i);
        }
        System.out.println(hash);

        assertEquals(hash, System.currentTimeMillis());
    }

}