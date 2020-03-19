import daminpl.dlDaoinpl;
import dom.dlDao;

public class test {
    public static void main(String[] args) {
        dlDao w=new dlDaoinpl();
        int id=w.dl("吴峰","123");
        System.out.println(id);
    }
}
