package daminpl;

import dom.BaseDao;
import dom.dlDao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class dlDaoinpl extends BaseDao implements dlDao {

    @Override
    public int dl(String zh, String mm) {
        String sql="SELECT COUNT(*) FROM t94 WHERE name=? and pwd=?";
        Object[] ob={zh,mm};
        ResultSet rs=super.exceuteQuery(sql,ob);
            int id=0;
            try {
                while (rs.next()){
                    id =rs.getInt(1);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return id;

    }
}
