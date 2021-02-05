import org.junit.Test;
import util.QRCodeUtils;

public class erwmTest {

    @Test
    public void test01() {
        // 为每个用户生成一个唯一的二维码
        String qrCodePath = "E://user" + System.currentTimeMillis() + "qrcode.png";
        // muxin_qrcode:[username]
        QRCodeUtils.createQRCode(qrCodePath, "muxin_qrcode:" + qrCodePath);
    }
}
